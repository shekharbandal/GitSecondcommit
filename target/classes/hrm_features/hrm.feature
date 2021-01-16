Feature: Orange HRM application Test
 
    
Scenario: Validate Orange HRm application test

Given user navigates to browser
And user enters username and password
 And user clicks on Performance link

Scenario: Validate clicking on Directory link using shift key
 Given user navigates to browser
And user enters username and password
And user clicks on Directory link using shift key

@smoke_test
Scenario: Validate user able to click on Popup 
Given user navigates to browser
And user enters username and password
And user clicks on Marketplace link
And click on Install button of Integration with Toggle
And click on Ok button of alert box