Feature: Login

  @single
  Scenario: Successful Login to the page
    Given I open app
    Then Title should be
   	Then I verify elements are
    When  I tap on EN button
    And I Verify HomePage displaye
  
	
  @multiple
  Scenario Outline: Successful Login to the page
    Given Given I open app
   Then  I tap on ChromeLogo
   Then I verify Title should be
    And I Enter name
   

    Examples:
      | name| 
      | abc | 