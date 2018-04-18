
Feature: CucumberBDD Login Feature


  
  Scenario Outline: CucumberBDD Login Test Scenario
 
 Given User is already in login page 
 When title of the login page is Free CRM
 Then user enter "<username>" and "<password>" 
 And user cleck on login button
 And user is in the home page 
 Then user close the browser
 
 Examples:
 			| username | password |
 			| naveenk  | test@123 |
 			| tom      | test456  |
 
 
 
 
 
 

 
