package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class LogoutPage extends BasePage {

	/*
	 * Retrieve Web element 
	 */

	
	@FindBy(how = How.CSS, using = ".ico-logout")
	private static WebElement logoutButton;

	
	@FindBy(how = How.CSS, using = ".ico-login")
	private static WebElement loginPage;
	

	
	public LogoutPage() {
		super(Setup.getDriver());
	}
	

	public static WebElement getLogoutButton() {
		return logoutButton;
	}
	
	public static WebElement getLoginPage() {
		return loginPage;
	}
	

}
