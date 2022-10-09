$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Calculator.feature");
formatter.feature({
  "name": "This feature would be creating a calculator for Add and Subtract",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Add two numbers",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@addition"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CalculatorStepDefs.i_have_a_calculator()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add below numbers",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.CalculatorStepDefs.i_add_below_number(java.util.List\u003cjava.lang.Integer\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get the result as 6",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.CalculatorStepDefs.i_should_get_the_result_as(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});