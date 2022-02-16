@accountActivity
Feature: Account Activity Page

  Background:
    Given The user Logged in
    When the user navigates to "Account Activity" Page

  Scenario:Account Activity title

    Then The user should see title "Zero - Account Activity"

  Scenario: Account drop down default option

    Then The user should see default option "Savings"

  Scenario: Transactions table columns

    Then The user should see following options

      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |

  Scenario: Transactions table columns

    Then The user should see the columns on the Transactions table

      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |