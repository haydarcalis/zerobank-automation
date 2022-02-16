Feature: Authorized users should be able to login

  @positive
  Scenario: Login the bank app with valid credentials,
    Given The user is on the login page
    When  The user enters valid username and password and click login button
    Then  The user should be able to login

  @negative
  Scenario Outline:Login the bank app with invalid credentials
    Given The user is on the login page
    When The user logs in wrong or empty "<invalidUsername>","<invalidPassword>"
    Then The user should see the error message "Login and/or password are wrong."
    Examples:
      | invalidUsername | invalidPassword |
      | wrongusername   | password        |
      | username        | wrongpassword   |
      | username        |                 |
      |                 | password        |
      |                 |                 |



