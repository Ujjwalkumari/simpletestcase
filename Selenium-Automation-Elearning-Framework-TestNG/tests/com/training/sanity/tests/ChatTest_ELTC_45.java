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
import com.training.pom.ChatPOM_ELTC_45;
import com.training.pom.ForumPOM_ELTC_44;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ChatTest_ELTC_45 {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
	private ChatPOM_ELTC_45 chatPOM_ELTC_45;




	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		chatPOM_ELTC_45 = new ChatPOM_ELTC_45(driver); 
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
		chatPOM_ELTC_45.sendLoginId("kujjwal_3");
		chatPOM_ELTC_45.sendPassword("uk1234");
		chatPOM_ELTC_45.clickLoginBtn();
		chatPOM_ELTC_45.clickCourseCatalog();
		chatPOM_ELTC_45.sendEnterText("eselenium");
		chatPOM_ELTC_45.clickSearch();
		chatPOM_ELTC_45.clickSubscribeBtn();
		String expectedResult = "You have been registered to course: eselenium";
		String actualResult = chatPOM_ELTC_45.getTextForsubscription();
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("You have been registered to course: eselenium");
		chatPOM_ELTC_45.clickSelenium();
		chatPOM_ELTC_45.clickGroups();
		chatPOM_ELTC_45.clickGrp();
		chatPOM_ELTC_45.clickChat();
		screenShot.captureScreenShot("chatTest");
	}
}
