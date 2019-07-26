Feature: BAT Testing

Scenario: Verify the broken links on the documentation page.
    Given user navigates to the documentation page.
   Then find all the links in the page except header and footer
   And verify the response is correct and no broken links
   
   Scenario: Verify the page is loaded correctly
   Given user navigates to the documentation page.
   Then click on each link identified and verify the page is loaded
   