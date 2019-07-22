package com.training.pom;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EditInfo {
	private WebDriver driver; 	
	public EditInfo(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='fa fa-user-o']")
	private WebElement loginOption;
	
	@FindBy(name="email")
	private WebElement userName; 
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//a[text()='Ambaarish']")
	private WebElement profileBtn; 
	
	@FindBy(xpath="//a[text()='Edit your account information']")
	private WebElement acctInfo;
	
	@FindBy(name="firstname")
	private WebElement firstName;
	
	@FindBy(name="lastname")
	private WebElement lastName;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="telephone")
	private WebElement telephone;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement continueBtn;
	
	public void clickLogin() {
		this.loginOption.click();
	}
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys("ambaarishs@gmail.com");
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys("Champions"); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickAcctInfo() {
		this.acctInfo.click();
	}
	
	public void sendFirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys("manzoor");
	}
	
	public void sendLastName(String lastName) {
		this.lastName.clear();
		this.lastName.sendKeys("mehadi");
	}
	
	public void sendEmail(String email) {
		this.email.clear();
		this.email.sendKeys("manzoor@gmail.com");
	}
	
	public void sendtelephone(String telephone) {
		this.telephone.clear();
		this.telephone.sendKeys("9876543210");
	}
	
	public void clickContinueBtn() {
		this.continueBtn.click();
	}
}
