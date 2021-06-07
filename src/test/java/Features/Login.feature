#Language:en
#Author:Victor Hugo
#Encoding:UTF-8
Feature: Realizar o login na pagina principal
  Scenario: CT001 - Fazer Login na pagina principal
    Given Preencha os campos de usuario e senha
    When  Clico no botão login
    Then  Valido que estou na proxima pagina