Feature: Purchase Dress from Automation Practice Site.
Scenario Outline: Login Functionality.
Given user Launch the Application
When user will click the Signin Button it Navigates to Login page
And  user will Enter the "<username>" in the Username field
And  user will Enter the "<password>" in the Password field
And  user will click the Login Button it will Navigates to Products Page
And  user will Perform a Action by Mouseover on Dresses
And  user will click the Evening Dress
And  user will click the Printed Dress
And  after user click the Printed Dress it will open as Frame
And  user will click the Quantity for the Dress
And  user will choose size of the Dress
And  user will select the Color of the Dress
And  user will finally click Add to Cart Button
And  user will click the Proceed to Checkout button
And  user will click the Proceed to Checkout 
And  user will check the address and click the Proceed to Checkout Button
And  user will tick the Check Box 
And  user will click the Proceed to Checkout Button
And  user will click the Bankwire for Payment mode
And  user will click the I Confirm My Order Button
And  user will click the Back to Orders 
Then user will click the Signout Button
Examples:
|username|password|
|k.ramu196@gmail.com|Java@123|


