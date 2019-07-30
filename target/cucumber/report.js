$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/SampleFeature.feature");
formatter.feature({
  "line": 1,
  "name": "BAT Testing",
  "description": "",
  "id": "bat-testing",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3101940100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the broken links on the documentation page.",
  "description": "",
  "id": "bat-testing;verify-the-broken-links-on-the-documentation-page.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user navigates to the documentation page.",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "find all the links in the page except header and footer",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "verify the response is correct and no broken links",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.user_navigates_to_the_documentation_page()"
});
formatter.result({
  "duration": 19039044200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.find_all_the_links_in_the_page_except_header_and_footer()"
});
formatter.result({
  "duration": 3421540800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.verify_the_response_is_correct_and_no_broken_links()"
});
formatter.result({
  "duration": 42954994700,
  "status": "passed"
});
formatter.before({
  "duration": 493660500,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify the page is loaded correctly",
  "description": "",
  "id": "bat-testing;verify-the-page-is-loaded-correctly",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user navigates to the documentation page.",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "click on each link identified and verify the page is loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_navigates_to_the_documentation_page()"
});
formatter.result({
  "duration": 9796789800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.click_on_each_link_identified_and_verify_the_page_is_loaded()"
});
formatter.result({
  "duration": 138110093900,
  "status": "passed"
});
});