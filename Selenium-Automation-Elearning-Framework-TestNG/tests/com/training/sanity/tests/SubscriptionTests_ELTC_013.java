package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.SubscriptionPOM_ELTC_013;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SubscriptionTests_ELTC_013 {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
	private SubscriptionPOM_ELTC_013 subscriptionPOM_ELTC_013;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	//open the Url
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		subscriptionPOM_ELTC_013 = new SubscriptionPOM_ELTC_013(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();//Close the browser
	}
	
	//Call the Methods
	@Test
	public void subscriptionTest() {
		subscriptionPOM_ELTC_013.clickSignUp();
		subscriptionPOM_ELTC_013.sendFirstName("ujwal");
		subscriptionPOM_ELTC_013.sendLastName("kumari");
		subscriptionPOM_ELTC_013.sendEmail("kumariujjwal55@gmail.com");
		subscriptionPOM_ELTC_013.sendUserName("ujwal_74");
		subscriptionPOM_ELTC_013.sendPass("uk1234"); 
		subscriptionPOM_ELTC_013.sendConfirmPassword("uk1234");
		subscriptionPOM_ELTC_013.clickStudent();
		subscriptionPOM_ELTC_013.clickRegisterBtn();
		subscriptionPOM_ELTC_013.clickHomePage();
		subscriptionPOM_ELTC_013.clickCourseCatalog();
		subscriptionPOM_ELTC_013.enterText("selenium11");
		subscriptionPOM_ELTC_013.clickSearch();
		subscriptionPOM_ELTC_013.clickSubscribeBtn(); 
		String expectedResult = "You have been registered to course: 1Selenium11";
		String actualResult = subscriptionPOM_ELTC_013.getTextSubscribe();
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("The message is :You have been registered to course: 1Selenium11");
		screenShot.captureScreenShot("subscription");
	}
}
