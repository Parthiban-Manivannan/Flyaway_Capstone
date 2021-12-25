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
@tagBooking
Feature: Booking
  I want to use this template for my feature file

  @tag1
  Scenario: Booking
    Given User is on dashboard
    When user clicks home
    And user selects bangalore as from place
    And user selects hyderabad as to place
    And user clicks submit button
    And user clicks Book flight button
    And user clicks complete bookings button
    And user clicks see your bookings button
    Then user see the flyaway bookings
  

  

   