package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LostPassPOM_ELTC_012;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LostPassTests_ELTC_012 {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
	private LostPassPOM_ELTC_012 lostPassPOM_ELTC_012;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); //wait time
		lostPassPOM_ELTC_012 = new LostPassPOM_ELTC_012(driver);
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

	//Call the methods
	@Test
	public void lostPassTest() throws Exception {
		lostPassPOM_ELTC_012.clickSignUp();
		lostPassPOM_ELTC_012.sendFirstName("ujjwal");
		lostPassPOM_ELTC_012.sendLastName("kumari");
		lostPassPOM_ELTC_012.sendEmail("kumariujjwal55@gmail.com");
		lostPassPOM_ELTC_012.sendUserName("ujjwal_71");
		lostPassPOM_ELTC_012.sendPass("uk1234");
		lostPassPOM_ELTC_012.sendConfirmPassword("uk1234");
		lostPassPOM_ELTC_012.selectLanguageDropDown("English");
		lostPassPOM_ELTC_012.clickTeacher();
		lostPassPOM_ELTC_012.clickRegisterBtn();
		lostPassPOM_ELTC_012.clickILostMyPassword();
		lostPassPOM_ELTC_012.sendUserNameText("ujjwal_71");
		lostPassPOM_ELTC_012.clickSendMessage();
		String expectedResult = "This platform was unable to send the email. Please contact Site Admin for more information.";
		String actualResult = lostPassPOM_ELTC_012.getTextForILostMyPassword();
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("The message is :This platform was unable to send the email. Please contact Site Admin for more information.");
		screenShot.captureScreenShot("lostPass");
	}
}
