Feature: Hotel Booking

Background:

When user enter the username in the username field
And user enter the password in the password field
Then user click the login button it Navigates to details page

@HotelCornice
Scenario: Hotel Booking For Hotel Cornice

When user Select the location and the Hotel for Stay
And user Select the Roomtype and Number of Rooms fits to them.
And user Enters the CheckIn and CheckOut Date .
And user also choose the Rooms for both Adult and Children click Search.
And user check the Radio button and proceed with next page.
And user finds the availability and gives his details to Book the Hotel
And user confirming the Booking and finalize the order 

@HotelHervey
Scenario: Hotel Booking for Hotel Hervey

When user Select the Location and the Hotel to enjoy the trip
And user Select the Roomtype and Number of rooms for the Morning rise View
And user Enters the Checkin and Checkout Date accordingly.
And user also choose the Adult rooms and Children rooms for the Trip
And user check the Radio Button and proceed to continue.
And user finds the available rooms and gives the details to book the hotel
And user confirming the Booking and wait for the keys and moves to order page






