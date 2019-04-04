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
import com.training.pom.ELTC_073POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_074Test {
		private WebDriver driver;
		private String baseUrl;
		private static Properties properties;
		private ScreenShot screenShot;
		private ELTC_073POM eLTC_073POM;


		@BeforeClass
		public static void setUpBeforeClass() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
		}

		@BeforeMethod
		public void setUp() throws Exception {
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			eLTC_073POM = new ELTC_073POM(driver);
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
		public void loginDBTest(String categoryCode, String categoryName, String title, String code, String category, String language) throws Exception {
			eLTC_073POM.sendUserName("admin");
			eLTC_073POM.sendPassword("admin@123");
			eLTC_073POM.clickLoginBtn();
			eLTC_073POM.clickCourseCategory();
			eLTC_073POM.clickAddCategory();
			eLTC_073POM.sendCategoryCode(categoryCode);
			eLTC_073POM.sendCategoryName(categoryName);
			eLTC_073POM.clickAllowCoursesRdBtn();
			eLTC_073POM.clickAddCategoryBtn();
			eLTC_073POM.clickAdministration();
			eLTC_073POM.clickCreateACourse();
			eLTC_073POM.sendTitle(title);
			eLTC_073POM.sendCode(code);
			eLTC_073POM.selectCategoryDropDown(category);
			//eLTC_073POM.sendTeacher("ujjwal kumari (uk_122)");
			eLTC_073POM.selectlanguageDropDown(language);
			eLTC_073POM.clickCreateACourseBtn();
		}

	}
