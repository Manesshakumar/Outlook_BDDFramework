Feature: Outlook Automation Feature 
	Description: The purpose of this feature is to test the Below Scenarios
 
Background: User is Logged In 
	Given User navigate to the login page 
	When  User submit emailId and password 
	Then  User should be logged in 
	
Scenario: Create an Event in outlook Calendar 
	When The User click Calendar button 
	Then User Creates an Event 
	
Scenario: Compose an email in outlook 
	When The User click email button 
	Then User compose an email 
	
Scenario: Create a contact in outlook 
	When The User click Contact button 
	Then User creates a contact 
	| FirstName   | LastName |
    | Nikin       | Francis |
		
		
		
	