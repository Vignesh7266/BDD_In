Feature: Login feature


  Scenario Outline: Validate User is able to login with username and password
    Given I launch application
    When I enter userID <ID> and password <Password>
    And I click on login button
    Then I see homepage
    Examples:
      | ID       | Password |
      | 'SADMIN' | '123'    |