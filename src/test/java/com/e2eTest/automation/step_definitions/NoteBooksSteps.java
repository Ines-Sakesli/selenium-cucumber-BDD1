package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.page_objects.NoteBooksPage;
import com.e2eTest.automation.utils.ConfigFileReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NoteBooksSteps {

	LoginPage loginPage = new LoginPage();
	ConfigFileReader configFileReader = new ConfigFileReader();
	NoteBooksPage noteBooksPage = new NoteBooksPage();

	
	@When("Je click sur le boutton computers")
	public void jeClickSurLeBouttonComputers() {
	    
	}
	
	
	@When("Je vois la liste des computers sous formes une list")
	public void jeVoisLaListeDesComputersSousFormesUneList() {
	     
	}
	
	
	@When("Je clique sur le boutton Notebooks")
	public void jeCliqueSurLeBouttonNotebooks() {
	    NoteBooksPage.getNoteBooksBarMenuButton().click();
	}
	
	
	@Then("Je me redirige vers la page des Notebooks")
	public void jeMeRedirigeVersLaPageDesNotebooks() {
		NoteBooksPage.getNoteBooksPage();
	}




}
