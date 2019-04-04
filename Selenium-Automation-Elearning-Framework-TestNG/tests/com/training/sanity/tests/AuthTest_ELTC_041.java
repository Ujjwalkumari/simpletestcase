package com.training.sanity.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AuthPOM_ELTC_041;
import com.training.pom.LoginPOM;
import com.training.pom.LogoutPOM_ELTC_015;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AuthTest_ELTC_041 {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
	private AuthPOM_ELTC_041 authPOM_ELTC_041;


	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		authPOM_ELTC_041 = new AuthPOM_ELTC_041(driver); 
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
	public void AuthoredTest() throws Exception {
		authPOM_ELTC_041.sendLoginId("admin");
		authPOM_ELTC_041.sendPassword("admin@123");
		authPOM_ELTC_041.clickLoginBtn();
		authPOM_ELTC_041.clickAddAUser();
		authPOM_ELTC_041.sendFirstName("Ujjwal");
		authPOM_ELTC_041.sendLastName("Kumari"); 
		authPOM_ELTC_041.sendEmail("kumariujjwal55@gmail.com");
		authPOM_ELTC_041.sendlogin("ujjwal_12");
		authPOM_ELTC_041.clickPassword();
		authPOM_ELTC_041.sendPasswordText("uk1234");
		authPOM_ELTC_041.selectProfileDropDown("Learner");
		authPOM_ELTC_041.selectLanguageDropDown("English");
		authPOM_ELTC_041.clickAdd(); 
		String expectedResult = "The user has been added: ujjwal kumari";
		String actualResult = authPOM_ELTC_041.getTextForAdd();
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("The user has been added: ujjwal kumari");
		System.out.println("Login successful. Go to http://elearning.upskills.in/user_portal.php");
		authPOM_ELTC_041.clickDropdown();
		authPOM_ELTC_041.clickLogoutBtn();
		authPOM_ELTC_041.sendLoginId("ujjwal_12");
		authPOM_ELTC_041.sendPassword("uk1234");
		authPOM_ELTC_041.clickLoginBtn();
		authPOM_ELTC_041.clickCourseCatalog();
		authPOM_ELTC_041.sendEnterText("selenium webdriver");
		authPOM_ELTC_041.clickSearch();
		authPOM_ELTC_041.clickSubscribeBtn();
		String expectedResult2 = "You have been registered to course: Selenium WebDriver";
		String actualResult2 = authPOM_ELTC_041.getTextForsubscription();
		Assert.assertEquals(actualResult2, expectedResult2);
		System.out.println("You have been registered to course: Selenium WebDriver");
		authPOM_ELTC_041.clickSelenium();
		authPOM_ELTC_041.clickTests();
		authPOM_ELTC_041.clicktests1();
		authPOM_ELTC_041.clickStartTest();
		authPOM_ELTC_041.clickSeleniumWebdriver();
		authPOM_ELTC_041.clickNextQuestion();
		authPOM_ELTC_041.clickNextGeneration();
		authPOM_ELTC_041.clickEndTest();
		screenShot.captureScreenShot("AuthoredTest");
	}
}
