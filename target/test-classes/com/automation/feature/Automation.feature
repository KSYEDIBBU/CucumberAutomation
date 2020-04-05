Feature: login function on automation test application

Scenario: check the login function using valid username and valid password
Given user search the application
When user enter the valid username in username field
And user enter the valid password in password field
And user click login field
Then user conform go to homepage

Scenario: user to select the tshirt for book order
Given user navigates to shirt in women option
When user click on tshirt image to book
And user choose the quality of the tshirt
And user choose the addchart to hold the booking
And user to procceed to checkout
Then user verifies selection of tshirt is done

Scenario: user proceed the ayment page to place the order
Given user navigates to summary page
When user checks for delivery order on billing address
And user confirm to book on agree  terms and conditions
And user to proceed for payment
And user confirm the order
Then user order place succesfully
