Feature: Login functionality for leaftap application

Scenario Outline: Login with positive credential


#Given Load the application url <url>
And Enter the username <username>
And Enter the password <password>
When Click on Login button
Then Homepage should be displayed

Examples:
|url|username|password|
|'http://leaftaps.com/opentaps'|'Demosalesmanager'|'crmsfa'|
|'http://leaftaps.com/opentaps'|'DemoCSR'|'crmsfa'|
