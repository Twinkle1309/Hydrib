$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Register.feature");
formatter.feature({
  "line": 1,
  "name": "NopCommerce Registration",
  "description": "",
  "id": "nopcommerce-registration",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5185115600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "NopCommerce Valid Registration Test",
  "description": "",
  "id": "nopcommerce-registration;nopcommerce-valid-registration-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Register"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User on register page and verify register page title",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enter registration details",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.user_Click_on_register_link()"
});
formatter.result({
  "duration": 1132523100,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_on_register_page_and_verify_register_page_title()"
});
formatter.result({
  "duration": 67021700,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_enter_and_and_and_and_and()"
});
formatter.result({
  "duration": 1254782900,
  "status": "passed"
});
formatter.after({
  "duration": 367223300,
  "status": "passed"
});
});