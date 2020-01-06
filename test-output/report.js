$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/D:/Gourav/Personal/Automation/DemoProject/src/test/resources/Feature%20File/Login.feature");
formatter.feature({
  "name": "Login to supporttst1",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test case",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user opens the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "provide credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.cred()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he will be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.loggedin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he does nothing",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});