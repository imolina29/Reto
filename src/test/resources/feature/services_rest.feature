Feature: Services Rest
  The User wants to make a request for a rest service
  and validate the expected response

  Scenario: Services Rest
    Given the user is on the page
    When search the user with data
      | name | lastName |
      | Cara | Gaylord  |
    Then the user validates the response with the following data
      | name | lastName | gender | email                |
      | Cara | Gaylord  | female | vfriesen@example.net |

