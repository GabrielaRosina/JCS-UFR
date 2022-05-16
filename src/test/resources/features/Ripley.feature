Feature: Navigate to page ripley

  Scenario Outline: As a user I want to Navigate to page Ripley
    Given I am on the Ripley Page
    And maximizo la pagina
    And obtengo el titulo de la pagina
    And obtengo la url de la pagina
    And hago clic sobre close de publicidad
    And ingreso "<criteria>"
    And hago clic sobre el boton de busqueda




 Examples:

      |criteria|
      |rostro  |




