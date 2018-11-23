Feature: Login funcionality for a tours page

  Background:
    Given the user is on landing page
    When he click on register

  @Simple-SignUp
  Scenario: Sign up a new user

    And he provides the first name as Cristhian
    And he provides the last name as Carrillo
    And he provides the phone as 9991849940
    And he provides the email as cristhian.carrillo@4thsource.com
    And he provides the address as Street 43
    And he provides the city as Merida
    And he provides the state as Yucatan
    And he provides the postal code as 97203
    And he selects the country
    And he provides the username as Antonio
    And he provides the password as secret
    And he provides the confirm password as secret
    And he click on submit
    Then he should be register into the application

  @DataDriving-SignUp
  Scenario Outline: Sign up a new user using data driving
    And he provides the first name as <firstName>
    And he provides the last name as <lastName>
    And he provides the phone as <phone>
    And he provides the email as <email>
    And he provides the address as <address>
    And he provides the city as <city>
    And he provides the state as <state>
    And he provides the postal code as <postalCode>
    And he selects the country
    And he provides the username as <userName>
    And he provides the password as <password>
    And he provides the confirm password as <confirmPassword>
    And he click on submit
    Then he should be register into the application

    Examples:

      | firstName | lastName | phone      | email                         | address   | city   | state   | postalCode | userName  | password | confirmPassword |
      | Antonio   | Carrillo | 9991849940 | cristhiancarrillo07@gmail.com | Street 43 | Merida | Yucatan | 97203      | Cristhian | 1234     | 1234            |
      | Eduardo   | Rivera   | 9991723773 | eduardoriver@gmail.com        | Street 53 | Merida | Yucatan | 97203      | Eduardo   | pass     | pass            |
      | Carlos    | Matus    | 9991493912 | cabmalo@gmail.com             | Street 12 | Merida | Yucatan | 97201      | Matus     | abcd     | abcd            |

  @DataTables-SignUp
  Scenario: Sign up a new user using data tables
    And he provides his details as follows:
      | firstName | lastName | phone      | email                         | address   | city   | state   | postalCode | userName  | password | confirmPassword |
      | Paulet    | Cabrera  | 9999342312 | paurivera@gmail.com           | Street 55 | Merida | Yucatan | 97202      | Pau       | mypass   | mypass          |
    And he click on submit
    Then he should be register into the application