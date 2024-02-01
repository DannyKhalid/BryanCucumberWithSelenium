Feature: Complex Navigation

#  Scenario: Navigating to Test site
#    Given I have a browser open to "https://www.thetestroom.com/webapp/index.html"
#    When Find the element by id "adoption_link"
#    Then I see the test "Adoption" page
#    Then I close the complex browser
#
#
#  Scenario: Navigating to Bills site
#    Given I have a browser open to "https://www.fairfieldco.com/"
#    When Find the element by id "DrpDwnMn16label"
#    Then I see the test "About" page
#    Then I close the complex browser

    Scenario Outline: Navigating to Test site
      Given I have a browser open to "https://www.thetestroom.com/webapp/index.html"
      When I find the element by id <element_id>
     Then I see the test <page_title> page
      Then I close the complex browser

      Examples:
      | element_id      | page_title  |
      | "adoption_link" | "Adoption"  |
      | "about_link"    | "Zoo Adoption" |
      | "contact_link"   | "Contact"   |