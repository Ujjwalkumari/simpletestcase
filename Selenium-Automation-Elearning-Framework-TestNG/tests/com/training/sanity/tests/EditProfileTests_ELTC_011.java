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
import com.training.pom.EditProfilePOM_ELTC_011;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class EditProfileTests_ELTC_011 {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
	private EditProfilePOM_ELTC_011 editProfilePOM_ELTC_011;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		editProfilePOM_ELTC_011 = new EditProfilePOM_ELTC_011(driver); 
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
	public void editProfileTest() {
		editProfilePOM_ELTC_011.sendId("ujwal07");
		editProfilePOM_ELTC_011.sendPassword("uk12345");
		editProfilePOM_ELTC_011.clickLoginBtn(); 
		editProfilePOM_ELTC_011.clickEditProfile();
		System.out.println("Profile page is displayed.");
		editProfilePOM_ELTC_011.sendPass("uk12345");
		System.out.println("uk12345");
		editProfilePOM_ELTC_011.sendNewPassword("uk1234");
		System.out.println("uk1234");
		editProfilePOM_ELTC_011.sendConfirmPassword("uk1234");
		System.out.println("uk1234");
		editProfilePOM_ELTC_011.saveSettingsBtn();
		String expectedResult = "Your new profile has been saved";
		String actualResult = editProfilePOM_ELTC_011.getTextForSaveSettings();
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("The message is :Your new profile has been saved");
		screenShot.captureScreenShot("editProfile");
	}
}
