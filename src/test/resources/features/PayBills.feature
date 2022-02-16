@payBills
Feature: Pay Bills Page

  Scenario:Pay Bills title
    Given The user Logged in
    When the user navigates to "Pay Bills" Page
    Then The user should see title "Zero - Pay Bills"

  Scenario Outline:Pay operation
    Given The user Logged in
    When the user navigates to "Pay Bills" Page
    And The user select option "<Payee>"
    And The user select option"<Account>"
    And The user completes "<Amount>"
    And The user completes"<Date>"
    And The user completes "<Description>"
    And The user clicks Pay button
    Then The user should see the message "<Message>"
    Examples:
      | Payee           | Account     | Amount    | Date       | Description           | Message                                 |
      | Bank of America | Savings     | 100       | 2022-02-14 | credit card term debt | The payment was successfully submitted. |
      | Bank of America | Credit Card |           | 2022-02-14 | credit card term debt | The payment was successfully submitted. |
      | Bank of America | Credit Card | 100       |            | credit card term debt | Please fill out this field message!     |
      | Bank of America | Credit Card | not*# pay | 2022-02-14 | credit card term debt | The payment was successfully submitted. |
      | Bank of America | Credit Card | 100       | money      | credit card term debt | The payment was successfully submitted. |