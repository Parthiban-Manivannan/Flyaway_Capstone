#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tagRegister
Feature: Registration
  This would contain scenarios for search items

  @tag1
  Scenario: User Registration
    Given user has opened Application 
    When user opens Home page
    Then user should be navigated to home page
    When user has opened login page
    And user opts to register
    And user enters details required
    And user enter sign up button
    Then user sign up successfully
   
   


