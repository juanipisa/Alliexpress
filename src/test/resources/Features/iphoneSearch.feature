@Alliexpress
Feature: Iphone Search
    
  @case_01
  Scenario: Second ad from the second results page when searching for "Iphone" has at least 1 item to be bought. 
      Given I go to the webpage alliexpress
      When 	I search for iphone in the search Bar
      And 	I click on the next result page
      And 	I click on the 2 ad of the product
      Then 	the ad has at least 1 item to be bought