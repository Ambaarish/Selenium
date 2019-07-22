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
import com.training.pom.EditInfo;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class InfoEdit {


	private WebDriver driver; 
	private String baseUrl; 
	private EditInfo editInfo; 
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
		EditInfo editInfo = new EditInfo(driver); 
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
		editInfo.sendUserName("ambaarishs@gmail.com");
		editInfo.sendUserName("Champions");
		editInfo.clickLoginBtn(); 
			screenShot.captureScreenShot("First");
		editInfo.clickAcctInfo();
		editInfo.sendFirstName("manzoor");
		editInfo.sendLastName("mehadi");
		editInfo.sendEmail("manzoor@gmail.com");
		editInfo.sendtelephone("9876543210");
		editInfo.clickContinueBtn();	
	}
	
	
}
