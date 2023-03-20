Feature: Validating the facebook page

  Background: 
    Given user should be in the facebook login page

  Scenario Outline: Validating facebook login page with invalid credential username
    When User should enter the invalid "<username>"
    And user should enter the valid "<password>"
    Then user should clik the login button

    Examples: 
      | username | password |
      | arun   |   123456 |

  Scenario Outline: Validating facebook login page with invalid credential username
    When User should enter the invalid "<username>"
    And user should enter the valid "<password>"
    Then user should clik the login button

    Examples: 
      | username | password |
      | kumaar   |   123456 |

  Scenario Outline: Validating facebook login page with invalid credential username
    When User should enter the invalid "<username>"
    And user should enter the valid "<password>"
    Then user should clik the login button

    Examples: 
      | username | password |
      | subash   |   123456 |

  Scenario Outline: Validating facebook login page with invalid credential username
    When User should enter the invalid "<username>"
    And user should enter the valid "<password>"
    Then user should clik the login button

    Examples: 
      | username | password |
      | eninwen   |   123456 |
