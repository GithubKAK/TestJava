$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Dolon/eclipse-workspace/CucumberBDDFramwork/src/main/java/Features/contacts.feature");
formatter.feature({
  "line": 1,
  "name": "CucumberBDD Create Contacts",
  "description": "",
  "id": "cucumberbdd-create-contacts",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "CucumberBDD Create a contacts scenario",
  "description": "",
  "id": "cucumberbdd-create-contacts;cucumberbdd-create-a-contacts-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is already in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user cleck on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is in the home page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user moves to the contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003cposition\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "cucumberbdd-create-contacts;cucumberbdd-create-a-contacts-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "firstname",
        "lastname",
        "position"
      ],
      "line": 15,
      "id": "cucumberbdd-create-contacts;cucumberbdd-create-a-contacts-scenario;;1"
    },
    {
      "cells": [
        "naveenk",
        "test@123",
        "Tomi",
        "Hill",
        "manager"
      ],
      "line": 16,
      "id": "cucumberbdd-create-contacts;cucumberbdd-create-a-contacts-scenario;;2"
    },
    {
      "cells": [
        "naveenk",
        "test@123",
        "Dev",
        "King",
        "Director"
      ],
      "line": 17,
      "id": "cucumberbdd-create-contacts;cucumberbdd-create-a-contacts-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "CucumberBDD Create a contacts scenario",
  "description": "",
  "id": "cucumberbdd-create-contacts;cucumberbdd-create-a-contacts-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is already in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter \"naveenk\" and \"test@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user cleck on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is in the home page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user moves to the contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters \"Tomi\" and \"Hill\" and \"manager\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.User_is_already_in_login_page()"
});
formatter.result({
  "duration": 6104682788,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_the_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 83555484,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveenk",
      "offset": 12
    },
    {
      "val": "test@123",
      "offset": 26
    }
  ],
  "location": "LoginStepDefinition.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 401549637,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_cleck_on_login_button()"
});
formatter.result({
  "duration": 1357225417,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_in_the_home_page()"
});
formatter.result({
  "duration": 8609523,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_moves_to_the_contact_page()"
});
formatter.result({
  "duration": 471447393,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tomi",
      "offset": 13
    },
    {
      "val": "Hill",
      "offset": 24
    },
    {
      "val": "manager",
      "offset": 35
    }
  ],
  "location": "LoginStepDefinition.user_enters_contact_details(String,String,String)"
});
formatter.result({
  "duration": 1683758356,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 668957791,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "CucumberBDD Create a contacts scenario",
  "description": "",
  "id": "cucumberbdd-create-contacts;cucumberbdd-create-a-contacts-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is already in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter \"naveenk\" and \"test@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user cleck on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is in the home page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user moves to the contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters \"Dev\" and \"King\" and \"Director\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.User_is_already_in_login_page()"
});
formatter.result({
  "duration": 4386866966,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_the_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 84018393,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveenk",
      "offset": 12
    },
    {
      "val": "test@123",
      "offset": 26
    }
  ],
  "location": "LoginStepDefinition.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 349468088,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_cleck_on_login_button()"
});
formatter.result({
  "duration": 1455369259,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_in_the_home_page()"
});
formatter.result({
  "duration": 8493073,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_moves_to_the_contact_page()"
});
formatter.result({
  "duration": 428685128,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dev",
      "offset": 13
    },
    {
      "val": "King",
      "offset": 23
    },
    {
      "val": "Director",
      "offset": 34
    }
  ],
  "location": "LoginStepDefinition.user_enters_contact_details(String,String,String)"
});
formatter.result({
  "duration": 1740539726,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 659434482,
  "status": "passed"
});
});