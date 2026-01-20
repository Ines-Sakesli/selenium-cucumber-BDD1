#language: en
@newsletter @tr 
Feature: Je Souhaite Tester La Boutton Subscribe de l'application Web Demo Shop

Background:
Given Je me connecte sur le site Web Demo Shop

@newsletter_valid
Scenario: Je Souhaite Tester le Boutton Subscribe 

When Je me redirige vers la rubrique newsletter
And Je saisis une adresse mail valide
And Je clique sur le bouton subscribe
Then Je vois un msg de confirmation "Thank you for signing up! A verification email has been sent. We appreciate your interest."