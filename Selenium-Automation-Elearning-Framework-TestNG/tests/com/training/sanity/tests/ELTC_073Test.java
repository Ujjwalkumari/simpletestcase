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

public class ELTC_073Test {
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

		@Test(dataProvider = "db-inputs", dataProviderClass = LoginDataProviders.class)
		public void loginDBTest(String userName, String password, String categoryCode, String categoryName, String title, String code, String category, String language) throws Exception {
			eLTC_073POM.sendUserName(userName);//enter username
			eLTC_073POM.sendPassword(password);//enter password
			eLTC_073POM.clickLoginBtn();//clicking on login button
			eLTC_073POM.clickCourseCategory();//clicking on course category
			eLTC_073POM.clickAddCategory();// clicking on add category
			eLTC_073POM.sendCategoryCode(categoryCode);//enter category code
			eLTC_073POM.sendCategoryName(categoryName);//enter category name
			eLTC_073POM.clickAllowCoursesRdBtn();//clicking on allow course button
			eLTC_073POM.clickAddCategoryBtn();//clicking on add category button
			eLTC_073POM.clickAdministration();//clicking on administration
			eLTC_073POM.clickCreateACourse();//clicking on create a course
			eLTC_073POM.sendTitle(title);//enter a title
			eLTC_073POM.sendCode(code);//enter code
			eLTC_073POM.selectCategoryDropDown(category);//select category from dd
			eLTC_073POM.selectlanguageDropDown(language);//select language from dd
			eLTC_073POM.clickCreateACourseBtn();//clicking on create a course button
		}

	}
