Feature: yo como usuario quiero validar MyInfo opcion Contacts

  #@Regresion
  @HU004
  Scenario Outline: ingresar informacion de contacto
    Given abrir el navegador
    And the user fill out user <userName> and password <password>
    And the user reaches to MyInfo
    And the user fill out Street1 <Street1>

    Examples:
      | userName | password | Street1       | City   | State        |
      | Admin    | admin123 | Cll Falsa 123 | Bogota | Cundinamarca |