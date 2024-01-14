Feature: User Creates account, buys product and deletes his account

  Scenario: User creates successfully an account
    Given The user enters the site, clicks on Signup
    When The user provides valid information
    Then The user's account is successfully created

  Scenario: User adds buys a product
    Given The user logins into the system
    When The user buys a product
    Then The user successfully has bought a product

  Scenario: User deletes his account
    Given The user logins into the system
    When The user click on Delete account
    Then The user no longer can login with his account