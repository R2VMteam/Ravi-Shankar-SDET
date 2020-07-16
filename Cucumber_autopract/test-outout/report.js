$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/SUNITA/Desktop/ICT Testing/Cucumber_autopract/src/main/java/Features/account.feature");
formatter.feature({
  "line": 1,
  "name": "Automation Practice",
  "description": "",
  "id": "automation-practice",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#without Examples Keyword"
    },
    {
      "line": 4,
      "value": "#Scenario: Free CRM Login Test Scenario"
    },
    {
      "line": 5,
      "value": "#"
    },
    {
      "line": 6,
      "value": "#Given user is already on Login Page"
    },
    {
      "line": 7,
      "value": "#When title of login page is Free CRM"
    },
    {
      "line": 8,
      "value": "#Then user enters \"naveenk\" and \"test@123\""
    },
    {
      "line": 9,
      "value": "#Then user clicks on login button"
    },
    {
      "line": 10,
      "value": "#Then user is on home page"
    },
    {
      "line": 13,
      "value": "#with Examples Keyword"
    }
  ],
  "line": 14,
  "name": "Automation Practice Login Scenario",
  "description": "",
  "id": "automation-practice;automation-practice-login-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "user is already on Account Page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "title of login page is My Store",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user is on My Account page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user clicks on Your personal information link",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user clicks radio button titled Mr",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user clicks on First name input box and enters first name and user enters \"\u003cfirst_name\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user clicks on Second Name input box and enters second name \"\u003csecond_name\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user clicks on Email and enters email address",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user enters Date of birth using drop down",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Close the browser1",
  "keyword": "Then "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "automation-practice;automation-practice-login-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "first_name",
        "second_name"
      ],
      "line": 29,
      "id": "automation-practice;automation-practice-login-scenario;;1"
    },
    {
      "cells": [
        "ravishankarpatro@gmail.com",
        "r2vmauto@123",
        "ravi",
        "shankar"
      ],
      "line": 30,
      "id": "automation-practice;automation-practice-login-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 30,
  "name": "Automation Practice Login Scenario",
  "description": "",
  "id": "automation-practice;automation-practice-login-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "user is already on Account Page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "title of login page is My Store",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user enters \"ravishankarpatro@gmail.com\" and \"r2vmauto@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user is on My Account page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user clicks on Your personal information link",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user clicks radio button titled Mr",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user clicks on First name input box and enters first name and user enters \"ravi\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user clicks on Second Name input box and enters second name \"shankar\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user clicks on Email and enters email address",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user enters Date of birth using drop down",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Close the browser1",
  "keyword": "Then "
});
formatter.match({
  "location": "accountStepDefinition.userIsAlreadyOnAccountPage()"
});
formatter.result({
  "duration": 20320968600,
  "status": "passed"
});
formatter.match({
  "location": "accountStepDefinition.titleOfLoginPageIsMyStore()"
});
formatter.result({
  "duration": 38225500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ravishankarpatro@gmail.com",
      "offset": 13
    },
    {
      "val": "r2vmauto@123",
      "offset": 46
    }
  ],
  "location": "accountStepDefinition.userEntersAnd(String,String)"
});
formatter.result({
  "duration": 6671279000,
  "status": "passed"
});
formatter.match({
  "location": "accountStepDefinition.userIsOnMyAccountPage()"
});
formatter.result({
  "duration": 24613700,
  "status": "passed"
});
formatter.match({
  "location": "accountStepDefinition.userClicksOnYourPersonalInformationLink()"
});
formatter.result({
  "duration": 1546011100,
  "status": "passed"
});
formatter.match({
  "location": "accountStepDefinition.userClicksRadioButtonTitledMr()"
});
formatter.result({
  "duration": 183891500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ravi",
      "offset": 75
    }
  ],
  "location": "accountStepDefinition.userClicksOnFirstNameInputBoxAndEntersFirstName(String)"
});
formatter.result({
  "duration": 444380000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shankar",
      "offset": 61
    }
  ],
  "location": "accountStepDefinition.userClicksOnSecondNameInputBoxAndEntersSecondName(String)"
});
formatter.result({
  "duration": 364326400,
  "status": "passed"
});
formatter.match({
  "location": "accountStepDefinition.userClicksOnEmailAndEntersEmailAddress()"
});
formatter.result({
  "duration": 483267900,
  "status": "passed"
});
formatter.match({
  "location": "accountStepDefinition.userEntersDateOfBirthUsingDropDown()"
});
formatter.result({
  "duration": 28886200,
  "status": "passed"
});
formatter.match({
  "location": "accountStepDefinition.Close_the_browser1()"
});
formatter.result({
  "duration": 1470032900,
  "status": "passed"
});
});