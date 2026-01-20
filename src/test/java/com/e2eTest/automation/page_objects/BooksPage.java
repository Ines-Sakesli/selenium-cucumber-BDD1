package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class BooksPage extends BasePage {

	/*
	 * Retrieve Web element 
	 */
	@FindBy(how = How.XPATH, using = "//ul[@class='top-menu']//a[normalize-space()='Books']")
	private static WebElement booksBarMenu;
	
	@FindBy(how = How.CSS, using = "div[class='page-title'] h1")
	private static WebElement booksTitle;
	
	@FindBy(how = How.XPATH, using = "//div[@class='master-wrapper-content']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")
	private static WebElement addToCartButton;
	
	@FindBy(how = How.CSS, using = ".content")
	private static WebElement messageConfirmation;
	
	@FindBy(how = How.CSS, using = "p[class='content'] a")
	private static WebElement shopCartButton;
	
	@FindBy(how = How.CSS, using = "div[class='page-title'] h1")
	private static WebElement cartTitle;
	
	@FindBy(how = How.CSS, using = "div[id='terms-of-service-warning-box'] p")
	private static WebElement alertMessage;
	
	@FindBy(how = How.CSS, using = ".ui-button-icon-primary.ui-icon.ui-icon-closethick")
	private static WebElement closeButtonAlert;
	
	@FindBy(how = How.CSS, using = "#termsofservice")
	private static WebElement termsOfServiceCheckbox;
	
	@FindBy(how = How.CSS, using = "#checkout")
	private static WebElement checkoutButton;
	
	@FindBy(how = How.CSS, using = "div[class='page-title'] h1 ")
	private static WebElement loginPageRedirection;
	
	public BooksPage() {
		super(Setup.getDriver());
	}
	
	public static WebElement getBooksBarMenu() {
		return booksBarMenu;
	}

	public static WebElement getBooksTitle() {
		return booksTitle;
	}
	
	public static WebElement getAddToCartButton() {
		return addToCartButton;
	}
	
	public static WebElement getMessageConfirmation() {
		return messageConfirmation;
	}
	
	public static WebElement getShopCartButton() {
		return shopCartButton;
	}
	
	public static WebElement getCartTitle() {
		return cartTitle;
	}
			
	public static WebElement getAlertMessage() {
		return alertMessage;
	}
	
	public static WebElement getCloseButtonAlert() {
		return closeButtonAlert;
	}
	public static WebElement getTermsOfServiceCheckbox() {
		return termsOfServiceCheckbox;
	}
	
	public static WebElement getCheckoutButton() {
		return checkoutButton;
	}
			
	public static WebElement getLoginPageRedirection() {
		return loginPageRedirection;
	}
	
}
