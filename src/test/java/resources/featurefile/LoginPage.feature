Feature: Orange HRM

@smoke
  Scenario: verify User should login successfully
    When I enter username
    And  I enter password
    And  I click on login button
    And  I can see panel

@smoke
    Scenario: verify that logo displayed on home page
    When I enter username
    And  I enter password
    And  I click on login button
    And  I can see logo

  @smoke,@sanity
    Scenario: verify user should logout successfully
      When I enter username
      And  I enter password
      And  I click on login button
      And I click on welcome
      And I click on logout button