
Feature: get users opeartions
  
  
   #@tag1
  Scenario: get all users in accounts backend
    Given I want to get all users "/users"
   	Then I should see all users
    Then I validate the outcomes
    And check more outcomes
    
     #@tag2
  Scenario: get one particular user
     Given I want to Get a user as "/users/"
     And I Get a user id as "2"
   	Then I should see a particular user "Ervin Howell"
    Then I validate the outcomes
    And check more outcomes

   #@tag2
  Scenario: get one particular user with a parameter
     Given I want to get a user using "/users?id=3"
   	Then I should see this particular user details
    Then I validate the outcomes
    And check more outcomes

    