Feature: As a merchant I am doing sale transaction using NFC

  Scenario: Merchant doing sale transaction for below 6000 using NFC
    Given Merchant click sale button
    When Merchant Enter "Amount" and click next
    And Merchant adding "tip" and click next
    And Merchant keeping card for transaction and waiting to complete transaction
    Then Merchant verifying transaction success message in screen
    Then Merchant printing the merchant copy
    And Merchant printing the customer copy
    Then Merchant click done to get back to home screen



