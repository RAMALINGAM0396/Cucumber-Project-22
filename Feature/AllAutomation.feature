Feature: Shopping

Background:

When user enter the username in the username field
And user enter the password in the password field
Then user click the login button it Navigates to details page

@CasualDress
Scenario: Casual Dress

When user click the CasualDress Text It Navigates to the CasualDress Page
And user Choose the product and click he quickview
And user select the Quantity and change size and add the product to cart
And user click the proceed to checkout button and navigates to Order page
And user click the proceed to checkout in order page and navigates to order verify page
And user confirm that click proceed to checkout button in Address
And user select the Terms and conditions and click proceed to checkout button
And user choose the Payment Method
Then user confirm the order

@EveningDress
Scenario: Evening Dress

When user click the EveningDress Text It Navigates to the EveningDress Page
And user Choose the product and click he quickview of Evening Dress
And user select the Quantity and color and change size and add the product to cart
And user click the proceed to atu checkout button and navigates to Order page
And user click the proceed to checkout la in order page and navigates to order verify page
And user confirm that click ae proceed to checkout button in Address
And user select the TaCTerms and conditions and click proceed to checkout button
And user choose the Payment Method in Evening Dress
Then user confirm the order in Evening Dress
