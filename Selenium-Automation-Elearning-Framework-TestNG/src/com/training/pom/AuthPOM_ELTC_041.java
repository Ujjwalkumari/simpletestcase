package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AuthPOM_ELTC_041 {
	private WebDriver driver;

	public AuthPOM_ELTC_041(WebDriver driver) {
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

	// Element for click on Add a user
	@FindBy(xpath = "//a[contains(text(),'Add a user')]")
	private WebElement addAUser;

	// Element for FirstName
	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement firstName;

	// Element for Last Name
	@FindBy(id = "lastname")
	private WebElement lastName;

	// Element for email Id
	@FindBy(id = "email")
	private WebElement eMail;

	// Element for login
	@FindBy(id = "username")
	private WebElement login;

	// Element for Password Radiobutton
	@FindBy(name = "password[password_auto]")
	private WebElement passwordRd;

	// Element for enterPassword
	@FindBy(id = "password")
	private WebElement enterPassword;

	// Element for profileDd
	@FindBy(id = "status_select")
	private WebElement profile;

	// Element for language dropdown
	@FindBy(name = "category_code")
	private WebElement language;

	// Element for Add
	@FindBy(name = "submit")
	private WebElement add;

	// Element for Dropdown
	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	private WebElement dropdown;

	// Element for Logout Button
	@FindBy(id = "logout_button")
	private WebElement logoutBtn;

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

	// Element for selenium
	@FindBy(xpath = "//*[@id='cm-content']/div/div[1]/a")
	private WebElement selenium;

	// Element for tests
	@FindBy(id = "istooldesc_6")
	private WebElement tests;

	// Element for startTest
	@FindBy(linkText = "Start test")
	private WebElement startTest;

	// Element for tests1
	@FindBy(xpath = "//a[contains(text(),'Test 1')]")
	private WebElement tests1;

	// Element for seleniumWebdriver rdbtn
	@FindBy(id = "choice-4-1")
	private WebElement seleniumWebdriver;

	// Element for nextQuestion
	@FindBy(name = "save_now")
	private WebElement nextQuestion;

	// Element for nextGeneration
	@FindBy(id = "choice-5-1")
	private WebElement nextGeneration;

	// Element for endTest Button
	@FindBy(name = "save_now")
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

	// Method for Add a user
	public void clickAddAUser() {
		this.addAUser.click();
	}

	// Method for First name
	public void sendFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	// Method for Last name
	public void sendLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	// Method for Email
	public void sendEmail(String eMail) {
		this.eMail.sendKeys(eMail);
	}

	// Method for login
	public void sendlogin(String login) {
		this.login.sendKeys(login);
	}

	// Method for password radioButton
	public void clickPassword() {
		this.passwordRd.click();
	}

	// Method for passwordText
	public void sendPasswordText(String password) {
		this.enterPassword.sendKeys(password);
	}

	// Method for Profile dropDown
	public void selectProfileDropDown(String string) throws Exception {
		Select drop = new Select(profile);
		drop.selectByVisibleText(string);
	}

	// Method for Language dropdown
	public void selectLanguageDropDown(String string) throws Exception {
		Select drop = new Select(language);
		drop.selectByVisibleText(string);
	}

	// Method for Add
	public void clickAdd() {
		this.add.click();
	}

	// Method for getTextForAdd
	public String getTextForAdd() {
		return "The user has been added: ujjwal kumari";
	}

	// Method for Dropdown
	public void clickDropdown() throws Exception {
		this.dropdown.click();
		Thread.sleep(2000);
	}

	// Method for Logout
	public void clickLogoutBtn() {
		this.logoutBtn.click();
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
		return "You have been registered to course: Selenium WebDriver";
	}

	// Method for selenium
	public void clickSelenium() {
		this.selenium.click();
	}

	// Method for tests
	public void clickTests() {
		this.tests.click();
	}

	// Method for tests1
	public void clicktests1() {
		this.tests1.click();
	}

	// Method for startTest
	public void clickStartTest() {
		this.startTest.click();
	}

	// Method for seleniumWebdriver
	public void clickSeleniumWebdriver() {
		this.seleniumWebdriver.click();
	}

	// Method for nextQuestion
	public void clickNextQuestion() {
		this.nextQuestion.click();
	}

	// Method for nextGeneration
	public void clickNextGeneration() {
		this.nextGeneration.click();
	}

	// Method for endTest
	public void clickEndTest() {
		this.endTest.click();
	}
}