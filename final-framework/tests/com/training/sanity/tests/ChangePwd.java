package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.PasswordChange;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ChangePwd {


	private WebDriver driver; 
	private String baseUrl; 
	private PasswordChange passwordChange; 
	private static Properties properties; 
	private ScreenShot screenShot; 
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		passwordChange = new PasswordChange(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void infoEdit() {
		passwordChange.clickLogin();
		passwordChange.sendUserName("ambaarishs@gmail.com");
		passwordChange.sendPassword("Champions");
		passwordChange.clickLoginBtn(); 
			screenShot.captureScreenShot("First");
		passwordChange.clickPwdChange();
		passwordChange.sendFirstPwd("mehadi");
		passwordChange.sendConfirmPwd("mehadi");
		passwordChange.clickSubmit();
	}
	
	
}
