package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class LoginPage extends BasePage {

	/*
	 * Retrieve Web element 
	 */
	@FindBy(how = How.CSS, using = ".ico-login")
	private static WebElement loginBarMenu;
	
	@FindBy(how = How.XPATH, using = "//input[@id='Email']")
	private static WebElement emailField;
	
	@FindBy(how = How.XPATH, using = "//input[@id='Password']")
	private static WebElement passwordField;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Log in']")
	private static WebElement loginButton;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='ziedhannachi0@gmail.com']")
	private static WebElement homePage;
	
	
	public LoginPage() {
		super(Setup.getDriver());
	}
	
	public static WebElement getLoginBarMenu() {
		return loginBarMenu;
	}

	public static WebElement getEmailField() {
		return emailField;
	}
	
	public static WebElement getPasswordField() {
		return passwordField;
	}
	
	public static WebElement getLoginButton() {
		return loginButton;
	}
	
	public static WebElement getHomePage() {
		return homePage;
	}
	

	

}
