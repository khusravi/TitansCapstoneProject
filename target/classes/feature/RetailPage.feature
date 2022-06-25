Feature: Rtail page

  Background: 
    Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter username 'ahmada@gmail.com' and password '1234567890'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on ‘Register for an Affiliate Account’ link
    And User fill affiliate form with below information
      | company | website      | taxID  | paymentMethod | chequePayeeName |
      | TEK     | tekschool.us | 123456 | Cheque        | TEK User        |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  @edit
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | Kabul    |        01 |      0123 | Saving      |    1234567890 |
    And User click on Continue button
    Then User should see a success message
