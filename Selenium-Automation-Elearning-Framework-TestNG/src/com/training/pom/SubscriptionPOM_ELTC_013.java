package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscriptionPOM_ELTC_013 {
	private WebDriver driver;

	public SubscriptionPOM_ELTC_013(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Element for SignUp
	@FindBy(xpath = "//a[contains(text(),'Sign up!')]")
	private WebElement signUp;

	//Element for First name
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")
	private WebElement firstName;

	//Element for Last Name
	@FindBy(id = "registration_lastname")
	private WebElement lastName;

	//Element for Enter Mail Id
	@FindBy(id = "registration_email")
	private WebElement eMail;

	//Element for enter User Name 
	@FindBy(xpath = "//input[@id='username']")
	private WebElement userName;

	//Element for Enter Password
	@FindBy(id = "pass1")
	private WebElement pass;

	//Element for Confirm Password
	@FindBy(id = "pass2")
	private WebElement confirmPassword;

	//Element for Student Radio Button
	@FindBy(xpath="//input[@value='5']")
	private WebElement student;
	
	//Element for register Button
	@FindBy(id = "registration_submit")
	private WebElement registerBtn;

	//Element for HomePage
	@FindBy(xpath = "//a[@title='Homepage']")
	private WebElement homePage;

	//Element for Course Catalog
	@FindBy(linkText = "Course catalog")
	private WebElement courseCatalog;

	//Element for Enter Text
	@FindBy(xpath = "//input[@name='search_term']")
	private WebElement enterText;

	//Element for Search
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement search;

	//Element for Subscribe Button
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/a[1]")
	private WebElement subscribeBtn;

	//Method for Sign Up
	public void clickSignUp() {
		this.signUp.click();
	}

	//Method for enter first name
	public void sendFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	//Method for Last Name
	public void sendLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	//Method for send Mail
	public void sendEmail(String eMail) {
		this.eMail.sendKeys(eMail);
	}

	//Method for enter User name 
	public void sendUserName(String userName) {
		this.userName.sendKeys(userName);
	}

	//Method for enter Password
	public void sendPass(String pass) {
		this.pass.sendKeys(pass);
	}

	//Method for enter Confirm Password
	public void sendConfirmPassword(String confirmPassword) {
		this.confirmPassword.sendKeys(confirmPassword);
	}

	//Method for student Radio button
	public void clickStudent() {
		this.student.click();
	}
	
	//Method for Register Button
	public void clickRegisterBtn() {
		this.registerBtn.click();
	}

	//Method for Homepage
	public void clickHomePage() {
		this.homePage.click();
	}
	
	//Method for Course Catalog
	public void clickCourseCatalog() {
		this.courseCatalog.click();
	}

	//Method for enter search criteria
	public void enterText(String enter) {
		this.enterText.sendKeys(enter);
	}

	//Method for Search
	public void clickSearch() {
		this.search.click();
	}

	//Method for subsribe Button
	public void clickSubscribeBtn() {
		this.subscribeBtn.click();
	}

	public String getTextSubscribe() {
		return "You have been registered to course: 1Selenium11";
	}
}
