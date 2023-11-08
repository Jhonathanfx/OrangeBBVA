Feature: yo como usuario quiero validar todas las opciones del modulo

  @Regresion
    @HU003
  Scenario Outline: Consulta de usuario
    Given abrir el navegador
    And the user fill out user <userName> and password <password>
    And the user reaches to admin
    When el usuario esta buscando users <typeRole>

    Examples:
      | userName | password | typeRole |
      | Admin    | admin123 | ESS      |