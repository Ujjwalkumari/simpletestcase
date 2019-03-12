package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPOM_ELTC_015 {
	private WebDriver driver;

	public LogoutPOM_ELTC_015(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//element for SignUp
	@FindBy(xpath = "//a[contains(text(),'Sign up!')]")
	private WebElement signUp;

	//element for First name
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")
	private WebElement firstName;

	//Element for Last Name
	@FindBy(id = "registration_lastname")
	private WebElement lastName;

	//Element for email Id
	@FindBy(id = "registration_email")
	private WebElement eMail;

	//Element for User name
	@FindBy(xpath = "//input[@id='username']")
	private WebElement userName;

	//Element for Password
	@FindBy(id = "pass1")
	private WebElement pass;

	//element for Confirm Password
	@FindBy(id = "pass2")
	private WebElement confirmPassword;
	
	//Element for student radio button
	@FindBy(xpath="//input[@value='5']")
	private WebElement student;
	
	//Element for register Button	
	@FindBy(id = "registration_submit")
	private WebElement registerBtn;

	//Element for Homepage
	@FindBy(xpath = "//a[@title='Homepage']")
	private WebElement homePage;

	//Element for login Id
	@FindBy(id = "login")
	private WebElement id;

	//Element for password
	@FindBy(id = "password")
	private WebElement password;

	//Element for Login Button
	@FindBy(id = "formLogin_submitAuth")
	private WebElement loginBtn;

	//Element for Dropdown
	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	private WebElement dropdown;

	//Element for Logout Button
	@FindBy(id = "logout_button")
	private WebElement logoutBtn;

	//Method for Sign Up
	public void clickSignUp() {
		this.signUp.click();
	}

	//Method for First name
	public void sendFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	//Method for Last name
	public void sendLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	//Method for Email
	public void sendEmail(String eMail) {
		this.eMail.sendKeys(eMail);
	}

	//Method for user name
	public void sendUserName(String userName) {
		this.userName.sendKeys(userName);
	}

	//Method for Password
	public void sendPass(String pass) {
		this.pass.sendKeys(pass);
	}

	//Method for confirm password
	public void sendConfirmPassword(String confirmPassword) {
		this.confirmPassword.sendKeys(confirmPassword);
	}

	//Method for student radio button
	public void clickStudent() {
		this.student.click();
	}
	
	//Method for Register button
	public void clickRegisterBtn() {
		this.registerBtn.click();
	}

	//Method for Homepage
	public void clickHomePage() {
		this.homePage.click();
	}

	//Method for login id
	public void sendId(String id) {
		this.id.clear();
		this.id.sendKeys(id);
	}

	//Method for Password
	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	//method for Login Button
	public void clickLoginBtn() {
		this.loginBtn.click();
	}

	//Method for Dropdown
	public void clickdropdown() throws Exception   {
		this.dropdown.click();
		Thread.sleep(2000);
	}

	//Method for Logout
	public void clickLogoutBtn() {
		this.logoutBtn.click();
	}

}
