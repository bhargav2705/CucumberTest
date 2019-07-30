# CucumberTest
  This project contains the code for the assessment given to verify the links and response for the site https://developer.here.com/documentation
  We have followed a Cucumber/BDD style framework for this implementation.
  The source contains all the maven dependencies required for running this.
  I have divided the logic into different functions and reused the same in step definition file where it would call these functions and verify if the link is returning the correct response or not. It will collate all the links which are valid into one List object and the same will be used to navigate to individual pages and verify whether the page is getting loaded properly or not and the status is captured here.

7/30
Updated the code to verify Angular is getting loaded or not
