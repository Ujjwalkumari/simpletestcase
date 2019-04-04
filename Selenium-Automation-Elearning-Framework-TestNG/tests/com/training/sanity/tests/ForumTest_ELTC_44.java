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
import com.training.pom.ForumPOM_ELTC_44;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ForumTest_ELTC_44 {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
	private ForumPOM_ELTC_44 forumPOM_ELTC_44;




	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		forumPOM_ELTC_44 = new ForumPOM_ELTC_44(driver); 
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
		forumPOM_ELTC_44.sendLoginId("kujjwal_2");
		forumPOM_ELTC_44.sendPassword("uk1234");
		forumPOM_ELTC_44.clickLoginBtn();
		forumPOM_ELTC_44.clickCourseCatalog();
		forumPOM_ELTC_44.sendEnterText("eselenium");
		forumPOM_ELTC_44.clickSearch();
		forumPOM_ELTC_44.clickSubscribeBtn();
		String expectedResult = "You have been registered to course: eselenium";
		String actualResult = forumPOM_ELTC_44.getTextForsubscription();
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("You have been registered to course: eselenium");
		forumPOM_ELTC_44.clickSelenium();
		forumPOM_ELTC_44.clickForums();
		forumPOM_ELTC_44.clickGrp();
		forumPOM_ELTC_44.clickCreateThread();
		forumPOM_ELTC_44.sendTitleTextBox("test");
		screenShot.captureScreenShot("forumTest");
	}
}
