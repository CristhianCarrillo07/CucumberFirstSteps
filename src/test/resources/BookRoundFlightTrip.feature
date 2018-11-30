@Booking
Feature: Booking a round flight trip

  Scenario: Succesful round flight trip
    Given the user is on landing page
    When he enters his username mercury
    And he enters his password mercury
    And he clicks on log in
    Then he shold be in flightfinder page
    When he selects all the flightdetails
    And he selects all the preferences
    And he clicks on continue
    Then he should be in select flight page
    When he selects the depart flight
    And he selects the return flight
    And he click on continue
    Then shold be in bookflight page
    When he enters his firstname Cristhian
    And he enters his lastname Carrillo
    And he enters his number credit card number 5253521252535212
    And he click on purchase
    Then he should have already booked a flight
