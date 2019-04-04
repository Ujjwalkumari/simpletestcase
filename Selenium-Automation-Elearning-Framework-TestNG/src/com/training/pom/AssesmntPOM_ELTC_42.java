package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AssesmntPOM_ELTC_42 {
	private WebDriver driver;

	public AssesmntPOM_ELTC_42(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Element for login Id
	@FindBy(id = "login")
	private WebElement loginId;

	// Element for password
	@FindBy(id = "password")
	private WebElement password;

	// Element for Login Button
	@FindBy(name = "submitAuth")
	private WebElement loginBtn;

	// Element for courseCatalog
	@FindBy(linkText = "Course catalog")
	private WebElement courseCatalog;

	// Element for Enter Text
	@FindBy(xpath = "//input[@name='search_term']")
	private WebElement enterText;

	// Element for Search
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement search;

	// Element for Subscribe Button
	@FindBy(xpath = "//a[@title='Subscribe']")
	private WebElement subscribeBtn;

	// Element for selenium3
	@FindBy(xpath = "//*[@id='cm-content']/div/div[1]/a")
	private WebElement selenium;

	// Element for assessments
	@FindBy(linkText = "Assessments")
	private WebElement assessments;
	
	//Element for sampleTest
	@FindBy(xpath="//tr[4]//td[2]//a[1]")
	private WebElement sampleTest;
	
	//Element for startTest
	@FindBy(linkText="Start test")
	private WebElement startTest;

	//Element for chkBox1
	@FindBy(xpath="//input[@id='choice-8-3']")
	private WebElement chkbox1;
	
	//Element for chkBox2
	@FindBy(xpath="//input[@id='choice-8-4']")
	private WebElement chkbox2;
	
	//Element for save&Continue
	@FindBy(name="save_now")
	private WebElement saveNContinue;
	
	//Element for endTest Button
	@FindBy(name="validate_all")
	private WebElement endTest;
	
	// Method for login id
	public void sendLoginId(String loginId) {
		this.loginId.sendKeys(loginId);
	}

	// Method for Password
	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	// method for Login Button
	public void clickLoginBtn() {
		this.loginBtn.click();
	}

	// Method for courseCatalog
	public void clickCourseCatalog() {
		this.courseCatalog.click();
	}

	// Method for enterText
	public void sendEnterText(String enter) {
		this.enterText.sendKeys(enter);
	}

	// Method for search
	public void clickSearch() {
		this.search.click();
	}

	// method for subscribe
	public void clickSubscribeBtn() {
		this.subscribeBtn.click();
	}

	// Method for get text for subscription
	public String getTextForsubscription() {
		return "You have been registered to course: selenium3";
	}

	// Method for selenium
	public void clickSelenium() {
		this.selenium.click();
	}
	
	//Method for assessment
	public void clickAssessments() {
		this.assessments.click();
	}
	
	//method for sampleTest
	public void clickSampleTest() {
		this.sampleTest.click();
	}
	
	public void clickStartTest() {
		this.startTest.click();
	}
	
	//Method for assessment
	public void clickTests() throws Exception {
		this.assessments.click();
		Thread.sleep(3000);
	}
	
	//Method for chkbox1
	public void clickChkBox1() throws Exception {
		this.chkbox1.click();
		Thread.sleep(3000);
	}
	
	//Method for chkbox2
	public void clickChkBox2() {
		this.chkbox2.click();
	}
	
	//Method for saveNContinue
	public void clicksaveNContinue() {
		this.saveNContinue.click();
	}
	
	//Method for endTest
	public void clickEndTest() {
		this.endTest.click();
	}
}