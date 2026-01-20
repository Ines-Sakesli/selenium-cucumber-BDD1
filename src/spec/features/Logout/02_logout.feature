#language: en
@logout @tr 
Feature: Je Souhaite Tester La Page Logout de l'application Web Demo Shop

Background:
Given Je me connecte sur le site Web Demo Shop
When Je clique sur le bouton Log in
And Je saisis une adresse mail 
And Je saisis un mot de passe
And Je clique sur le bouton Login

@logout
Scenario: Je Souhaite Tester la Page Logout pour un utilisateur connecte 

And Je clique sur le bouton Logout
Then Je me redirige vers la page home login "Log in"
