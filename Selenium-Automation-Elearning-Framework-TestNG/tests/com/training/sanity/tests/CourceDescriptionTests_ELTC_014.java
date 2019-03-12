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
import com.training.pom.CourseDescriptionPOM_ELTC_014;
import com.training.pom.SubscriptionPOM_ELTC_013;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CourceDescriptionTests_ELTC_014 {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
	private CourseDescriptionPOM_ELTC_014 courseDescriptionPOM_ELTC_014;


	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		courseDescriptionPOM_ELTC_014 = new CourseDescriptionPOM_ELTC_014(driver); 
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
	
	//Call the methods
	@Test
	public void courseDescriptionTest() {
		courseDescriptionPOM_ELTC_014.sendId("ujwal08");
		courseDescriptionPOM_ELTC_014.sendPassword("uk1234");
		courseDescriptionPOM_ELTC_014.clickLoginBtn(); 
		courseDescriptionPOM_ELTC_014.clickMyCourse();
		courseDescriptionPOM_ELTC_014.clickSelenium11();
		courseDescriptionPOM_ELTC_014.clickCourseDescriptionIcon();
		System.out.println("My course is opened");
		screenShot.captureScreenShot("coursedescription");
	}
}
