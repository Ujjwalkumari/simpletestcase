package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfilePOM_ELTC_011 {
	private WebDriver driver; 
	
	public EditProfilePOM_ELTC_011(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//Element for userid
	@FindBy(id = "login")
	private WebElement id;

	//Element for password
	@FindBy(id = "password")
	private WebElement password;

	//Element for login Button
	@FindBy(id = "formLogin_submitAuth")
	private WebElement loginBtn;
	
	//Element for Edit Profile
	@FindBy(xpath="/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
	private WebElement editProfile; 
	
	//Element for enter old Password
	@FindBy(xpath="//input[@id='profile_password0']")
	private WebElement pass; 
	
	//Element for new Password
	@FindBy(xpath="//input[@id='password1']")
	private WebElement newPassword; 
	
	//Element for Confirm Password
	@FindBy(xpath="//input[@id='profile_password2']")
	private WebElement confirmPassword; 
	
	//Element for Save Settings
	@FindBy(id="profile_apply_change")
	private WebElement saveSettingsBtn; 
	
	//Method for User Id
	public void sendId(String id) {
		this.id.clear();
		this.id.sendKeys(id);
	}

	//Method for Password
	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	//Method for Login Button
	public void clickLoginBtn() {
		this.loginBtn.click();
	}
	
	//Element for Edit Profile
	public void clickEditProfile() {
		this.editProfile.click(); 
	}
	
	//Element for enter Old password
	public void sendPass(String pass) {
		this.pass.sendKeys(pass); 
	}
	
	//Element for enter new Password
	public void sendNewPassword(String newPassword) {
		this.newPassword.sendKeys(newPassword); 
	}
	
	//Element for Confirm password
	public void sendConfirmPassword(String confirmPassword) {
		this.confirmPassword.sendKeys(confirmPassword); 
	}
	
	//Element for Save Settings
	public void saveSettingsBtn() {
		this.saveSettingsBtn.click();
	}

	public String getTextForSaveSettings() {
		return "Your new profile has been saved";
	}
}
