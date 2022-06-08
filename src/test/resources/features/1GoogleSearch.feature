Feature: Test Google search Functionality

  Scenario: Validate Google search is working
    
    Given user is on google search page
    When userr enters a text in search box
    And hits enter
    Then user is navigated to search results
