package com.training.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestLoginRetail {
	private WebDriver driver; 
	
	public TestLoginRetail(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	private WebElement userName; 
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//a[text()='Ambaarish']")
	private WebElement profileBtn;
	
	@FindBy(xpath="//a[text()='View your order history']")
	private WebElement orderHistoryBtn;
	
	@FindBy(xpath="(//a[@class='btn btn-default tb_no_text'])[1]")
	private WebElement viewIcon;
	
	
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
	
	public void clickProfileBtn() {
		this.profileBtn.click();
	}
	
	public void clickOrderHistoryBtn() {
		this.orderHistoryBtn.click();
	}
	
	public void clickViewIcon() {
		this.viewIcon.click();
	}
}

