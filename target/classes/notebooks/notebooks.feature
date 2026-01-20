#language: en
@notebooks @tr 
Feature: Je Souhaite Tester La Page Notebooks de l'application Web Demo Shop

@notebooks
Scenario: Je Souhaite Tester La Page Notebooks de l'application

Given Je me connecte sur le site Web Demo Shop 
When Je click sur le boutton computers 
And Je vois la liste des computers sous formes une list
And Je clique sur le boutton Notebooks
Then Je me redirige vers la page des Notebooks
