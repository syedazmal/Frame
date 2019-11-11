@Newtour @Regression 
Feature: Users ability to create account 

Scenario Outline: User should able to create account using Register 

	Given Browse to Newtours homepage 
	When Navigate to Register page 
	And Fill form with some basic information 
	And Complete creating account with "<UserName>" 
	Then Verify account created successfully 
	
	Examples: 
		|UserName |
		|Sam 	  |