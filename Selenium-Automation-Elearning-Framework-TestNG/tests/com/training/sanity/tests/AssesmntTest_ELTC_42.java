package com.training.sanity.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.training.generics.ScreenShot;
import com.training.pom.AssesmntPOM_ELTC_42;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AssesmntTest_ELTC_42 {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
	private AssesmntPOM_ELTC_42 assesmntPOM_ELTC_42;



	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		assesmntPOM_ELTC_42 = new AssesmntPOM_ELTC_42(driver); 
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
	public void AssessmentTest() throws Exception {
		assesmntPOM_ELTC_42.sendLoginId("kujjwal_0");
		assesmntPOM_ELTC_42.sendPassword("uk1234");
		assesmntPOM_ELTC_42.clickLoginBtn();
		assesmntPOM_ELTC_42.clickCourseCatalog();
		assesmntPOM_ELTC_42.sendEnterText("selenium3");
		assesmntPOM_ELTC_42.clickSearch();
		assesmntPOM_ELTC_42.clickSubscribeBtn();
		String expectedResult2 = "You have been registered to course: selenium3";
		String actualResult2 = assesmntPOM_ELTC_42.getTextForsubscription();
		Assert.assertEquals(actualResult2, expectedResult2);
		System.out.println("You have been registered to course: selenium3");
		assesmntPOM_ELTC_42.clickSelenium();
		assesmntPOM_ELTC_42.clickAssessments();
		assesmntPOM_ELTC_42.clickSampleTest();
		assesmntPOM_ELTC_42.clickStartTest();
		assesmntPOM_ELTC_42.clickTests();
		//assesmntPOM_ELTC_42.clickChkBox1();
		//assesmntPOM_ELTC_42.clickChkBox2();
		assesmntPOM_ELTC_42.clicksaveNContinue();
		assesmntPOM_ELTC_42.clickEndTest();
		screenShot.captureScreenShot("AssessmentTest");
	}
}
