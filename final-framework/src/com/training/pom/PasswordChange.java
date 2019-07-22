package com.training.pom;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PasswordChange {
	private WebDriver driver; 	
	public PasswordChange(WebDriver driver) {
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
	
	@FindBy(xpath="//a[text()='Change your password']")
	private WebElement pwdChange;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement firstPwd;
	
	@FindBy(xpath="//input[@name='confirm']")
	private WebElement confirmPwd;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitBtn;
	
	public void clickLogin() {
		this.loginOption.click();
	}
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickPwdChange() {
		this.pwdChange.click();
	}
	
	public void sendFirstPwd(String firstPwd) {
		this.firstPwd.sendKeys("mehadi");
	}
	
	public void sendConfirmPwd(String confirmPwd) {
		this.confirmPwd.sendKeys("mehadi");
	}
	
	public void clickSubmit() {
		this.submitBtn.click();
	}
}
