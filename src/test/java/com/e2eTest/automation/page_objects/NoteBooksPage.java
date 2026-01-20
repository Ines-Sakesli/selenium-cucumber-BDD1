package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class NoteBooksPage extends BasePage {

	/*
	 * Retrieve Web element 
	 */
	@FindBy(how = How.XPATH, using = "//ul[@class='top-menu']//a[normalize-space()='Notebooks']")
	private static WebElement noteBooksBarMenuButton;
	
	@FindBy(how = How.CSS, using = "div[class='page-title'] h1")
	private static WebElement noteBooksPage;
	
	public NoteBooksPage() {
		super(Setup.getDriver());
		// TODO Auto-generated constructor stub
	}

	public static WebElement getNoteBooksBarMenuButton() {
		return noteBooksBarMenuButton;
	}

	public static WebElement getNoteBooksPage() {
		return noteBooksPage;
	}
	

}
