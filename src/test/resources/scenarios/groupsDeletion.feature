Feature: for test 1
  some test 1

  Scenario: Delete random group
    Given user is on Home Page
    Given user logon as admin
    When user go to group page
    When user ensure groups exist and if not create it
    When user delete random group

  Scenario: Delete all groups
    Given user is on Home Page
    Given user logon as admin
    When user go to group page
    When user ensure groups exist and if not create it
    When user delete all group if it exist
