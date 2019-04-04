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
import com.training.pom.ELTC_071POM;
import com.training.pom.ELTC_072POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_071Test {
	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
	private ELTC_071POM eLTC_071POM;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		eLTC_071POM = new ELTC_071POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		// driver.quit();
	}

	@Test(dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String courseName, String testName, String question, String t1) {
		eLTC_071POM.sendUserName("kujjwal_110");
		eLTC_071POM.sendPassword("uk1234");
		eLTC_071POM.clickLoginBtn();
		eLTC_071POM.clickCreateACourse();
		eLTC_071POM.sendCourseName(courseName);
		eLTC_071POM.clickCreateThisCourse();
		eLTC_071POM.clickTests();
		eLTC_071POM.clickCreateANewCourse();
		eLTC_071POM.sendTestName(testName);
		eLTC_071POM.clickProceedToQuestions();
		eLTC_071POM.clickMultipleChoice();
		eLTC_071POM.sendQuestion(question);
		eLTC_071POM.sendIFrame1(t1);
	}

}
