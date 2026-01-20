package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.page_objects.WishlistPage;
import com.e2eTest.automation.utils.ConfigFileReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishlistSteps {

	LoginPage loginPage = new LoginPage();
	ConfigFileReader configFileReader = new ConfigFileReader();
	WishlistPage whishlistPage = new WishlistPage();

	@When("Je click sur le boutton wishlist")
	public void jeClickSurLeBouttonWishlist() {
		WishlistPage.getWishListBarMenuButton().click();
	}

	@Then("Je vois la liste des produits qui sont dans la wishlist")
	public void jeVoisLaListeDesProduitsQuiSontDansLaWishlist() {
		WishlistPage.getWishListPage();
	}

}
