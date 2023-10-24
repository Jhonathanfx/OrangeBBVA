#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
Feature: yo como usuario quiero loguearme OrangeHrm

  @HU001
  Scenario Outline: login succes
    Given abrir el navegador
    When the user fill out user <userName> and password <password>

    Examples:
      | userName | password |
      | Admin    | admin123 |