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
import com.training.pom.LogoutPOM_ELTC_015;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LogoutTests_ELTC_015 {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
	private LogoutPOM_ELTC_015 logoutPOM_ELTC_015;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		logoutPOM_ELTC_015 = new LogoutPOM_ELTC_015(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();//close the browser
	}
	
	//Call the Methods
	@Test
	public void logoutTest() throws Exception {
		logoutPOM_ELTC_015.clickSignUp();
		logoutPOM_ELTC_015.sendFirstName("ujjwal");
		logoutPOM_ELTC_015.sendLastName("kumari");
		logoutPOM_ELTC_015.sendEmail("kumariujjwal55@gmail.com");
		logoutPOM_ELTC_015.sendUserName("ujjwal_21");
		logoutPOM_ELTC_015.sendPass("uk1234"); 
		logoutPOM_ELTC_015.sendConfirmPassword("uk1234");
		logoutPOM_ELTC_015.clickStudent();
		logoutPOM_ELTC_015.clickRegisterBtn();
		logoutPOM_ELTC_015.clickHomePage();
		logoutPOM_ELTC_015.sendId("ujjwal_21");
		logoutPOM_ELTC_015.sendPassword("uk1234");
		logoutPOM_ELTC_015.clickLoginBtn(); 
		logoutPOM_ELTC_015.clickdropdown();
		logoutPOM_ELTC_015.clickLogoutBtn();
		System.out.println("Homepage is Displayed");
		screenShot.captureScreenShot("logout");
	}
}
