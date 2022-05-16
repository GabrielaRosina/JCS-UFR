@Smoke
Feature: Navigate to page List

    Scenario Outline: As a user I want to Navigate to page List
      Given I am on the List Page
      And maximizo la pagina
      And ingreso el "<state>"
      And puedo encontrar la "<city>" en la lista

      Examples:

      |state       |  city              |
      | Washington | Seattle, Washington|
      |  Chicago   | Chicago, Illinois  |
      |  New York   | New York, New York |