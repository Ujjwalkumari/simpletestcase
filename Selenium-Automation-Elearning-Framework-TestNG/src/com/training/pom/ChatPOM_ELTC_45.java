package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ChatPOM_ELTC_45 {
	private WebDriver driver;

	public ChatPOM_ELTC_45(WebDriver driver) {
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

	// Element for eselenium
	@FindBy(xpath = "//*[@id='cm-content']/div/div[1]/a")
	private WebElement selenium;

	// Element for groups
	@FindBy(linkText = "Groups")
	private WebElement groups;

	// Element for grp0001
	@FindBy(linkText = "Group 0001")
	private WebElement grp;

	// Element for uploadMyAssignment
	@FindBy(xpath = "//img[@title='Chat']")
	private WebElement chat;

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

	// Method for groups
	public void clickGroups() {
		this.groups.click();
	}

	// method for grp0001
	public void clickGrp() {
		this.grp.click();
	}

	public void clickChat() {
		this.chat.click();
	}
}