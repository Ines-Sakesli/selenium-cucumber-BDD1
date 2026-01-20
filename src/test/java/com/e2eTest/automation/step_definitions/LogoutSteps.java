package com.e2eTest.automation.step_definitions;

import org.junit.jupiter.api.Assertions;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.page_objects.LogoutPage;
import com.e2eTest.automation.utils.ConfigFileReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {

	LoginPage loginPage = new LoginPage();
	LogoutPage logoutPage = new LogoutPage();
	ConfigFileReader configFileReader = new ConfigFileReader();


	@When("Je clique sur le bouton Logout")
	public void jeCliqueSurLeBoutonLogout() {
		LogoutPage.getLogoutButton().click();
	}
	
	@Then("Je me redirige vers la page home login {string}")
	public void jeMeRedirigeVersLaPageHomeLogin(String login) {
		String loginPage = LogoutPage.getLoginPage().getText();
		Assertions.assertEquals(loginPage, login);
	}

}
