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


  Feature: ALandingPage

Scenario Outline: Sign with Wrong details
Given Initialize the browser with chrome
And Navigate to "https://www.savaari.com/" Site
And Click on login link in home page to land on sign in page
When User enters <username> and <password> and logs in
Then display error message
And Close browsers

Examples:
|username			              |password	|
|tamannathakur@gmail.com    |123456		|
#|tanu@gmail.co              |123456		|


Scenario: OutStation car booking TestCase
Given Initialize the browser and open site
When Select the Round Trip checkBox
Then User enters From City <fromCity> and tocity <toCity>
Then User select the time for travel and click to summit button
And Display the title of the selected car and select the summit button
And Close browsers1


Examples:
|fromCity      |toCity         |
|New Delhi     |Patiala,Punjab |



Scenario: OutStation car booking One way TestCase
Given initialize the browser and open site1
Then User enters From City <fromCity> & tocity <toCity>
Then User select the time for travel and click on summit button
And Display the title of the selected car and select the summit
And Close browsers2


Examples:
|fromCity      |toCity         |
|New Delhi     |Patiala,Punjab |


Scenario: Click on TravelAgent
Given initialize the browser and open site2
Then click on Loginbutton
Then User enters <username> and <password> and login1
And Display error1 message
And Close browsers3


Examples:
|username                  |password |
|tamannathakur@gmail.com   |5678908 |


Scenario: Click on Airport
Given initialize the browser and open site3
Given User enters city <city>
Then select trip
Then user enters address <address>
Then select time 
And user click on car and select car
And Validate the text
And Close browsers4


Examples:
|city         |address              |
|New Delhi    |Delhi railway station|



Scenario: Aboutus Page
Given Click on Aboutus
Given initialize the browser and open site4
And print CEO name 
And Close browsers5


Scenario: Local Page
Given initialize the browser and open site5
Given click on localTab
Then select city <city>
Then select Time
And user select car
And display car name
And Close browsers6


Examples:
|city      |
|New Delhi|


Scenario: Download App
Given initialize the browser and open sitee
Given click on download
And diplay text and Validate 
And Close Browsers



Scenario: Feature
Given initialize the browser and open Sitee
Given click on IndianExpress
And diplay text and Validate1
And close Browsers


Scenario: CarBooking
Given initialize the Browser1 and Open Site
Given click on Booking
And diplay text1 and Validate
And close Browsers11