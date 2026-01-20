#language: en
@books @tr
Feature: Je Souhaite Tester L'affichage des books de l'application Web Demo Shop

@books_validScenario
Scenario: Je Souhaite Tester l'affichage des books

Given Je me connecte sur le site Web Demo Shop
When Je clique sur le boutton Books
Then Je vois l'affichage des cahiers dans l'application

@books_addToCart
Scenario: Je Souhaite Tester l'ajout des books sur le panier

Given Je me connecte sur le site Web Demo Shop
When Je clique sur le boutton Books
And Je vois l'affichage des cahiers dans l'application
And Je click sur le boutton add to cart
And je vois le message que le produit est ajoutee sur le panier "The product has been added to your shopping cart"
When je click sur le boutton shopping cart
Then je vois la page du shopping cart

@books_checkoutPage
Scenario: Je Souhaite Tester l'ajout des books sur le panier et faire checkout

Given Je me connecte sur le site Web Demo Shop
When Je clique sur le boutton Books
And Je vois l'affichage des cahiers dans l'application
And Je click sur le boutton add to cart
And je vois le message que le produit est ajoutee sur le panier "The product has been added to your shopping cart"

# 1) Click checkout → déclenche l’alerte
And Je clique sur le boutton shopping cart
And je vois la page du shopping cart
When je click sur le boutton checkout
Then Je vois le message d'alerte qu'il faut accepter les terms of use "Please accept the terms of service before the next step."

# 2) Fermer l’alerte + cocher terms
And Je ferme l'alerte terms of use
And Je coche sur la case accept terms of use

# 3) Re-click checkout → continuer le flow
And Je clique sur le boutton checkout
Then Je me redirige vers la page d'authentification