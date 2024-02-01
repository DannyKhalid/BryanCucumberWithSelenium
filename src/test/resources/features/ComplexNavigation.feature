Feature: Complex Navigation

  Scenario: Navigating to Test site
    Given I have a browser open to "https://www.thetestroom.com/webapp/index.html"
    When Find the element by id "adoption_link"
    Then I see the test "Adoption" page
    Then I close the complex browser


  Scenario: Navigating to Bills site
    Given I have a browser open to "https://www.fairfieldco.com/"
    When Find the element by id "DrpDwnMn16label"
    Then I see the test "About" page
    Then I close the complex browser

