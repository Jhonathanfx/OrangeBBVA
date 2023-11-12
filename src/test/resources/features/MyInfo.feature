Feature: yo como usuario quiero validar MyInfo opcion Contacts

  #@Regresion
  @HU004
  Scenario Outline: ingresar informacion de contacto
    Given abrir el navegador
    And the user fill out user <userName> and password <password>
    And the user reaches to MyInfo
    And the user fill out Street1 <Street1> City <City> State <State>
    When el usuario esta buscando Country <typeCountry>

    Examples:
      | userName | password | Street1       | City   | State        | typeCountry |
      | Admin    | admin123 | Cll Falsa 123 | Bogota | Cundinamarca | Colombia    |