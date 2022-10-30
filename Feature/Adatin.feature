Feature: Hotel Booking in Adatin Application.
Scenario Outline: Login Functionality.
Given user Launch the Application.
When user Enter the "<username>" In username Field.
And  and user Enter the "<password>" In Password Field.
Then user click on the Login Button and it Navigates To Search Hotel.
And  user will Select the Location to book hotel.
And  user will choose the hotel.
And  user will select Room Type by clicking Drop Down Button.
And  user will select the Number Of Rooms for the Stay.
And  user will input the Check In Date 
And  user will input the Check Out Date
And  user will select the Adults Per Room
And  user will select the Child Per Room
Then user will click the Search Button it Navigates to Select Hotel Page
And  user will click the Radio Button
And  user will click the Continue Button it Navigates to Book a Hotel Page
And  user will Enter Firstname in the firstname field
And  user will Enter Lastname in lastname field
And  user will Enter Billing Address in the address field
And  user will Enter Credit Card Number in the Credit Card Number field
And  user will Select Credit Card Type from the dropdown button
And  user will Select Month of Validity of the CreditCard 
And  user will Select Year of Validity of the Credit Card
And  user will Enter CVV Number in the CVV Number field
Then user will click the Book Now Button it Navigates to Booking confirmation 
And  user will click the My Itinery Button
Then user will click the Logout Button it will Navigate to Home Page
Examples:
|username|password|
|Ramalingam300|Java@123|