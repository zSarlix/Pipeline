Feature: register on utest

  Scenario: open the page utest and register
    Given that the 'user' accesses the Utest page
    When the user performs the registration process
    Then registration is successfully asserted with the Complete setup button.

