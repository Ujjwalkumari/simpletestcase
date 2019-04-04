package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.ELTC_072POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_072Test {
		private WebDriver driver;
		private String baseUrl;
		private static Properties properties;
		private ScreenShot screenShot;
		private ELTC_072POM eLTC_072POM;

		@BeforeClass
		public static void setUpBeforeClass() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
		}

		@BeforeMethod
		public void setUp() throws Exception {
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			eLTC_072POM = new ELTC_072POM(driver);
			baseUrl = properties.getProperty("baseURL");
			screenShot = new ScreenShot(driver);
			// open the browser
			driver.get(baseUrl);
		}

		@AfterMethod
		public void tearDown() throws Exception {
			//driver.quit();
		}

		@Test(dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
		public void loginDBTest(String userName, String password, String firstName, String lastName, String eMail, String phoneNumber, String login, String enterPassword, String profile) {
			eLTC_072POM.sendUserName(userName);
			eLTC_072POM.sendPassword(password);
			eLTC_072POM.clickLoginBtn();
			eLTC_072POM.clickAddAUser();
			eLTC_072POM.sendFirstName(firstName);
			eLTC_072POM.sendLastName(lastName);
			eLTC_072POM.sendEMail(eMail);
			eLTC_072POM.sendPhoneNumber(phoneNumber);
			eLTC_072POM.sendLogin(login);
			eLTC_072POM.clickPasswordRd();
			eLTC_072POM.sendEnterPassword(enterPassword);
			eLTC_072POM.selectProfileDropDown(profile);
			eLTC_072POM.clickAdd();
		}

	}
