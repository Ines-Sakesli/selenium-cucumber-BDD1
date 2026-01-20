#language: en
@apparelshoes @tr 
Feature: Je Souhaite Tester La Boutton Subscribe de l'application Web Demo Shop

@apparelshoes_valid
Scenario: Je Souhaite Tester le Boutton Subscribe un email Valides

Given Je me connecte sur le site Web Demo Shop 
When Je click sur le boutton apparel&shoes 
And Je vois la liste des produits 
And Je clique sur un produit pour voir ces details
And Je me redirige vers la page du produit
Then Je vois un msg de confirmation "Thank you for signing up! A verification email has been sent. We appreciate your interest."