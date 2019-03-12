package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseDescriptionPOM_ELTC_014 {
	private WebDriver driver;

	public CourseDescriptionPOM_ELTC_014(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Element for User id
	@FindBy(id = "login")
	private WebElement id;

	// element for Password
	@FindBy(id = "password")
	private WebElement password;

	// Element for Login Button
	@FindBy(id = "formLogin_submitAuth")
	private WebElement loginBtn;

	// element for My course
	@FindBy(xpath = "//a[@title='My courses']")
	private WebElement myCourse;

	// Element for Selenium11
	@FindBy(partialLinkText = "1Selenium")
	private WebElement selenium11;

	// element for Course Description
	@FindBy(xpath = "//img[@id='toolimage_3213']")
	private WebElement courseDescriptionIcon;

	//Method for User Id
	public void sendId(String id) {
		this.id.clear();
		this.id.sendKeys(id);
	}

	//method for Password
	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	//Method for Login Button
	public void clickLoginBtn() {
		this.loginBtn.click();
	}

	//Method for My course
	public void clickMyCourse() {
		this.myCourse.click();
	}

	//method for Selenium11
	public void clickSelenium11() {
		this.selenium11.click();
	}

	//Method for Course Description
	public void clickCourseDescriptionIcon() {
		this.courseDescriptionIcon.click();
	}
}
