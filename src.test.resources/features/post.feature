
Feature: Get posts details
  

  #@tag1
  Scenario: get all post in post backend
    Given I want to get a post "/posts"
   	Then I should see all posts
    Then I validate the outcomes
    And check more outcomes

  #@tag2
  Scenario: get one particular post
     Given I want to get a post as "/post/7"
   	Then I should see particular post details
    Then I validate the outcomes
    And check more outcomes
    
    #@tag2
  Scenario: get one particular post with a parameter
     Given I want to get a post as "/posts?id=5"
   	Then I should see this particular post details
    Then I validate the outcomes
    And check more outcomes

  
