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
import com.training.pom.AssignmntPOM_ELTC_43;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AssignmntTest_ELTC_43 {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
	private AssignmntPOM_ELTC_43 assignmntPOM_ELTC_43;



	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		assignmntPOM_ELTC_43 = new AssignmntPOM_ELTC_43(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();//close the browser
	}
	
	//Call the Methods
	@Test
	public void AssignmentTest() throws Exception {
		assignmntPOM_ELTC_43.sendLoginId("kujjwal_1");
		assignmntPOM_ELTC_43.sendPassword("uk1234");
		assignmntPOM_ELTC_43.clickLoginBtn();
		assignmntPOM_ELTC_43.clickCourseCatalog();
		assignmntPOM_ELTC_43.sendEnterText("eselenium");
		assignmntPOM_ELTC_43.clickSearch();
		assignmntPOM_ELTC_43.clickSubscribeBtn();
		String expectedResult = "You have been registered to course: eselenium";
		String actualResult = assignmntPOM_ELTC_43.getTextForsubscription();
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("You have been registered to course: eselenium");
		assignmntPOM_ELTC_43.clickSelenium();
		assignmntPOM_ELTC_43.clickAssignments();
		assignmntPOM_ELTC_43.clickTest();
		assignmntPOM_ELTC_43.clickUploadMyAssignment();
		assignmntPOM_ELTC_43.clickUploadSimple();
		assignmntPOM_ELTC_43.sendTitle("test");
		assignmntPOM_ELTC_43.clickuploadFile();
		screenShot.captureScreenShot("AssignmentTest");
	}
}
