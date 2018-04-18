Feature: CucumberBDD Create Contacts 
  
Scenario Outline: CucumberBDD Create a contacts scenario
 
 Given User is already in login page 
 When title of the login page is Free CRM
 Then user enter "<username>" and "<password>" 
 And user cleck on login button
 And user is in the home page 
 Then user moves to the contact page
 Then user enters "<firstname>" and "<lastname>" and "<position>"
 Then user close the browser
 
 Examples:
 			| username | password |firstname |lastname    | position|
 			| naveenk  | test@123 |Tomi			 |Hill        | manager |
 			| naveenk  | test@123 |Dev  		 |King				| Director |
 			
