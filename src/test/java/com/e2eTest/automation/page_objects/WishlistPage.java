package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class WishlistPage extends BasePage {

	/*
	 * Retrieve Web element 
	 */
	@FindBy(how = How.CSS, using = "a[class='ico-wishlist'] span[class='cart-label']")
	private static WebElement wishListBarMenuButton;
	
	@FindBy(how = How.XPATH, using = "div[class='page-title'] h1")
	private static WebElement wishListPage;
	
	public WishlistPage() {
		super(Setup.getDriver());
		// TODO Auto-generated constructor stub
	}

	public static WebElement getWishListBarMenuButton() {
		return wishListBarMenuButton;
	}

	public static WebElement getWishListPage() {
		return wishListPage;
	}
	

}
