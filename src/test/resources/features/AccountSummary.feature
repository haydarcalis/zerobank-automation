@accountSummary
Feature:Account Summary Page

  Scenario: Account Summary Page title
    Given The user is on the login page
    When The user enters valid username and password and click login button
    Then The user should see title "Zero - Account Summary"


  Scenario:Account Summary Page account types
    Given The user Logged in
    Then The user should see following account types

      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

  Scenario: Credit Accounts table columns
    Given The user Logged in
    Then The user should see following coloumns on the Credit Accounts table

      | Account     |
      | Credit Card |
      | Balance     |