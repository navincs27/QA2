Feature: Goibibo  Hotel Booking

Scenario: To click login and signup
Given user launch the url "https://www.goibibo.com/"
And user click login 
And user enter mobile number 
And user click continue 
And user enter the name 
And user enter the mailid
Then user click let's go

Scenario: To select the hotel
Given user click hotels option
And user select india option
And user enter the hotel name 
And user select the check in date 
And user select the check out date
And User click search 

Scenario: To select the room
Given user click view room options
And user click selected room

Scenario: To enter the guest details 
Given user enter the first name 
And user enter the last name
And user enter the mobile number
And user enter the mailid
And user enter the billing address 
And user enter the pincode 
And user click proceed to payment options

Scenario: To make the payment 
Given user click UPI options
And User eneter the UPI Id
And click send payment request


