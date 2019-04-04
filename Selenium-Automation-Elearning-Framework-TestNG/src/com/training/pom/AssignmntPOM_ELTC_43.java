package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AssignmntPOM_ELTC_43 {
	private WebDriver driver;

	public AssignmntPOM_ELTC_43(WebDriver driver) {
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

	// Element for assignments
	@FindBy(linkText = "Assignments")
	private WebElement assignments;
	
	//Element for test
	@FindBy(linkText="test")
	private WebElement test;
	
	//Element for uploadMyAssignment
	@FindBy(linkText="Upload my assignment")
	private WebElement uploadMyAssignment;

	@FindBy(linkText="Upload (Simple)")
	private WebElement uploadSimple;
	
	//Element for title
	@FindBy(id="file_upload")
	private WebElement title;
	
	//Element for uploadFile
	@FindBy(id="form-work_file")
	private WebElement uploadFile;
	
	//Element for endTest Button
	@FindBy(name="validate_all")
	private WebElement endTest;

	/*//Element for dragArea
	@FindBy(xpath="//div[@class='button-load']")
	private WebElement dragArea;*/
	
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
		return "You have been registered to course: eselenium";
	}

	// Method for selenium
	public void clickSelenium() {
		this.selenium.click();
	}
	

	//Method for assignment
	public void clickAssignments() {
		this.assignments.click();
	}
	
	//method for sampleTest
	public void clickTest() {
		this.test.click();
	}
	
	public void clickUploadMyAssignment() {
		this.uploadMyAssignment.click();
	}
	
	//Method for uploadSimple
	public void clickUploadSimple() {
		this.uploadSimple.click();
	}
	
	//Method for title
	public void sendTitle(String title) {
		this.title.sendKeys(title);
	}
	
	//Method for uploadFile
	public void clickuploadFile() {
		this.uploadFile.click();
	}
	
	//Method for endTest
	public void clickEndTest() {
		this.endTest.click();
	}
	
	/*//Method for dragArea
	public void sendDragArea(String path) {
		this.dragArea.sendKeys(path);
	}*/
}