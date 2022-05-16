@Grid
Feature: Navigate to page DemoQA

  Background: As a user I want to Navigate to page DemoQA
    Given I am on the DemoQA Page
    And maximizo la pagina

    @Test
  Scenario: As a user I want to Navigate to page DemoQA
    Given hago clic sobre el boton elemento
    And hago clic sobre el boton WebTable
    And obtengo algun valor de la tabla

  @Test1
  Scenario: As a user I want to Navigate to page DemoQA Alerts
    And hago clic sobre el boton Alerta Principal
    And hago clic sobre el boton Alerta Lateral
    And hago clic sobre el boton de la alerta
    And acepto la alerta

  Scenario Outline: As a user I want to Navigate to page DemoQA Widgets
    Given hago clic en el boton Widgets
    And hago clic en el boton Select Menu
    #And selecciono un valor de style
    #And selecciono el valor "<Style>"
    And hago clic sobre el boton de Select One
    And selecciono una opcion "<Select>"


    Examples:

      |Style  | Select|
      | Aqua  | Ms.   |
