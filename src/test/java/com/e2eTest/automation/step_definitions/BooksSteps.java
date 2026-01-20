package com.e2eTest.automation.step_definitions;

import org.junit.jupiter.api.Assertions;

import com.e2eTest.automation.page_objects.BooksPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BooksSteps {

	BooksPage booksPage = new BooksPage();
	ConfigFileReader configFileReader = new ConfigFileReader();

	@When("Je clique sur le boutton Books")
	public void jeCliqueSurLeBouttonBooks() {
		BooksPage.getBooksBarMenu().click();
	}

	@Then("Je vois l'affichage des cahiers dans l'application")
	public void jeVoisLAffichageDesCahiersDansLApplication() {
		BooksPage.getBooksTitle();
	}

	// books add to cart
	@When("Je click sur le boutton add to cart")
	public void jeClickSurLeBouttonAddToCart() {
		BooksPage.getAddToCartButton().click();
	}

	@When("je vois le message que le produit est ajoutee sur le panier {string}")
	public void jeVoisLeMessageQueLeProduitEstAjouteeSurLePanier(String message) {
//		String confirmationMessage = WaitUtils.waitForVisibility(BooksPage.getMessageConfirmation()).getText();
//
//		Assertions.assertEquals(confirmationMessage, message);
	}

	@When("je click sur le boutton shopping cart")
	public void jeClickSurLeBouttonShoppingCart() {
		BooksPage.getShopCartButton().click();
	}

	@Then("je vois la page du shopping cart")
	public void jeVoisLaPageDuShoppingCart() {
		BooksPage.getCartTitle();
	}
	
	//checkoutpage

	@When("Je clique sur le boutton shopping cart")
	public void jeCliqueSurLeBouttonShoppingCart() {
		BooksPage.getShopCartButton().click();
	}



	@When("Je clique sur le boutton checkout")
	public void jeCliqueSurLeBouttonCheckout() {
		BooksPage.getCheckoutButton().click();

	}

	@Then("Je vois le message d'alerte qu'il faut accepter les terms of use {string}")
	public void jeVoisLeMessageDAlerteQuIlFautAccepterLesTermsOfUse(String message) {
		String alertMessage =BooksPage.getAlertMessage().getText();

		Assertions.assertEquals(message, alertMessage);
		}

	@When("Je ferme l'alerte terms of use") public void jeFermeLAlerteTermsOfUse() { 
	      BooksPage.getCloseButtonAlert().click();
	  }

	@Then("Je coche sur la case accept terms of use")
	public void jeCocheSurLaCaseAcceptTermsOfUse()throws InterruptedException {
		if (!BooksPage.getTermsOfServiceCheckbox().isSelected()) {
	        BooksPage.getTermsOfServiceCheckbox().click();
	    }
	}
	
	@When("je click sur le boutton checkout")
	public void jeClickSurLeBouttonCheckout() {
		BooksPage.getCheckoutButton().click();
	}
	
	@Then("Je me redirige vers la page d'authentification")
	public void jeMeRedirigeVersLaPageDAuthentification() throws InterruptedException {
		Thread.sleep(10);

		BooksPage.getLoginPageRedirection().click();
		
		Thread.sleep(10);

	}

}
