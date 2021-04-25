$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Successful Login to the page",
  "description": "",
  "id": "login;successful-login-to-the-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@single"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to login.html page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I provide username as hi and password as hi",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I wait for 10 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "hi should be name",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iOpenChromeBrowser()"
});
formatter.result({
  "duration": 4355216200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iNavigateToLoginHtmlPage()"
});
formatter.result({
  "duration": 149680900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iProvideUsernameAsHiAndPasswordAsHi()"
});
formatter.result({
  "duration": 220623600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 163931300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 11
    }
  ],
  "location": "LoginSteps.i_wait_for_seconds(int)"
});
formatter.result({
  "duration": 1004128800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.hiShouldBeName()"
});
formatter.result({
  "duration": 787540200,
  "status": "passed"
});
});