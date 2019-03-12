package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LostPassPOM_ELTC_012 {
	WebDriver driver1;
	public LostPassPOM_ELTC_012(WebDriver driver) {
		driver1 = driver;
		PageFactory.initElements(driver, this);
	}

	//Element for signUp
	@FindBy(xpath = "//a[contains(text(),'Sign up!')]")
	private WebElement signUp;

	//Element for First Name
	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")
	private WebElement firstName;

	//Element for Last Name
	@FindBy(id = "registration_lastname")
	private WebElement lastName;

	//Element for email
	@FindBy(id = "registration_email")
	private WebElement eMail;

	//Element for User Name
	@FindBy(xpath = "//input[@id='username']")
	private WebElement userName;

	//Element for Password
	@FindBy(id = "pass1")
	private WebElement pass;

	//Element for confirm password
	@FindBy(id = "pass2")
	private WebElement confirmPassword;
	
	//Element for language dropdown
	@FindBy(id = "registration_language")
	private WebElement language;
	
	//Element for Teacher Radiobutton
	@FindBy(xpath="/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[12]/div[1]/div[1]/label[1]")
	private WebElement teacher;
	
	//Element for Register Button
	@FindBy(id = "registration_submit")
	private WebElement registerBtn;
	
	//Element for already registered user
	@FindBy(xpath="//div[@class='alert alert-warning']")
	private WebElement alreadyRegistered;
	
	//Element for Homepage
	@FindBy(xpath="//a[@title='Homepage']")
	private WebElement homePage;
	
	//Element for logout dropdown
	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	private WebElement dropdown;

	//Element for logout
	@FindBy(id = "logout_button")
	private WebElement logoutBtn;
	
	//Element for I Lost My Password
	@FindBy(partialLinkText="I lost my passwo")
	private WebElement iLostMyPassword;
	
	//Element for Username Text
	@FindBy(xpath="//input[@id='lost_password_user']")
	private WebElement userNameText;
	
	//Element for Send Message
	@FindBy(xpath="//button[@id='lost_password_submit']")
	private WebElement sendMessage;
	
	//Method for SignUp
	public void clickSignUp() {
		this.signUp.click();
	}

	//method for First Name
	public void sendFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	//method for Last Name
	public void sendLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	//Method for email
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

	//Method for Confirm Password
	public void sendConfirmPassword(String confirmPassword) throws Exception {
		this.confirmPassword.sendKeys(confirmPassword);
		Thread.sleep(3000);
	}

	//Method for Language dropdown
	public void selectLanguageDropDown(String string) throws Exception {
		Select drop = new Select(language);
		drop.selectByVisibleText(string);
	}
	
	//Method for teacher
	public void clickTeacher() {
		this.teacher.click();
	}

	//method for register Button
		public void clickRegisterBtn() throws Exception {
		this.registerBtn.click();
		//String alreadyRegisteredMessage= this.alreadyRegistered.getText();
		//if(alreadyRegisteredMessage.equalsIgnoreCase("This login is already in use")) {
		try {
		if(this.alreadyRegistered.isDisplayed()) {
			System.out.println(this.alreadyRegistered.getText());
			System.out.println(driver1.getTitle());
			System.out.println("Check");
			this.homePage.click();
		}
		else {
			this.dropdown.click();
			Thread.sleep(3000);
			this.logoutBtn.click();
		}
		} catch (org.openqa.selenium.NoSuchElementException e) {
			this.dropdown.click();
			Thread.sleep(3000);
			this.logoutBtn.click();
		    }
	}

	public void clickdropdown() throws Exception   {
		this.dropdown.click();
		Thread.sleep(3000);
	}

	public void clickLogoutBtn() {
		this.logoutBtn.click();
	}

	//method for I lost My Password
	public void clickILostMyPassword() {
		this.iLostMyPassword.click();
	}
	
	//Method for User name text
	public void sendUserNameText(String userNameText) {
		this.userNameText.sendKeys(userNameText);
	}
	
	//method for Send message
	public void clickSendMessage() {
		this.sendMessage.click();
	}

	//method for display message
	public String getTextForILostMyPassword() {
		return "This platform was unable to send the email. Please contact Site Admin for more information.";
	}

}
