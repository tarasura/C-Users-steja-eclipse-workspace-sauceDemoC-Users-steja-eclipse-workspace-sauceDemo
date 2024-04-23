Feature: 
  @smoke 
  Scenario: Check login is successful
    Given User is on login page
    When User enters valid username and valid password
    And User clicks on login button
    Then User is navigated to home page
    And close the browser

 @dataDriven 
  Scenario Outline: Check login is successful with valid credns
    Given User is on login page
    When User enters valid "<username>" and valid "<password>"
    And User clicks on login button
    Then User is navigated to home page
    And close the browser

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
