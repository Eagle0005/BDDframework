Feature: User log in to Retail Website

Background:
	Given User is on Retail Website
	
@login
Scenario: Retail Website login test
When User Click On Myaccount
And User Click on Login Option
And User Enter Username 'test@yahoo.com' and Password 'test'
And User Click On Login Button
Then User Should Be Login To Myaccount Dashboard


Scenario Outline: Retail Website login test with multiple accounts
When User Click On Myaccount
And User Click on Login Option
And User Enter Username '<username>' and Password '<password>'
And User Click On Login Button
Then User Should Be Login To Myaccount Dashboard


Examples:
|username|password|
|test@yahoo.com|test|
|account2|abdsd|
|account3|abd123|