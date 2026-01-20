package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Validations;
import com.e2eTest.automation.utils.ActionsUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	LoginPage loginPage = new LoginPage();
	ConfigFileReader configFileReader = new ConfigFileReader();
	ActionsUtils actionsUtils = new ActionsUtils();
	Validations validations = new Validations();

	@Given("Je me connecte sur le site Web Demo Shop")
	public void jeMeConnecteSurLeSiteWebDemoShop() {
		actionsUtils.get(configFileReader.getProperty("home.url"));
	}

	@When("Je clique sur le bouton Log in")
	public void jeCliqueSurLeBoutonLogIn() {
		actionsUtils.click(LoginPage.getLoginBarMenu());
	}

	@When("Je saisis une adresse mail")
	public void jeSaisisUneAdresseMail() {
		actionsUtils.writeText(LoginPage.getEmailField(), configFileReader.getProperty("home.email"));
	}

	@When("Je saisis un mot de passe")
	public void jeSaisisUnMotDePasse() {
		actionsUtils.writeText(LoginPage.getPasswordField(), configFileReader.getProperty("home.password"));
	}

	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		actionsUtils.click(LoginPage.getLoginButton());
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String email) {
		validations.assertEquals(LoginPage.getHomePage(), email);
	}

}
