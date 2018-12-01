Feature: Group Creation

  Scenario: Create new group
    Given user is on Home Page
    Given user logon as admin
    When user go to group page
    When user click on create group button
    When user create group with name "name_1", header "header_1", footer "footer_1"
