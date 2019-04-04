package com.training.bean;

public class LoginBean {
	private String userName;
	private String password;
	private String categoryCode;
	private String categoryname;
	private String title;
	private String code;
	private String category;
	private String language;

	public LoginBean() {
	}

	public LoginBean(String userName, String password, String categoryCode, String categoryname, String title, String code, String category, String language) {
		super();
		this.userName = userName;
		this.password = password;
		this.categoryCode = categoryCode;
		this.categoryname = categoryname;
		this.title = title;
		this.code = code;
		this.category = category;
		this.language = language;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getCategoryCode() {
		return categoryCode;
	}
	
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	
	public String getCategoryName() {
		return categoryname;
	}
	
	public void setCategoryname(String categoryName) {
		this.categoryname = categoryName;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	@Override
	public String toString() {
		return "LoginBean [userName=" + userName + ", password=" + password + ", categoryCode=" + categoryCode + ", categoryname=" + categoryname + ", title=" + title + ", code=" + code +", category=" + category + ", language=" + language + "]";
	}

}
