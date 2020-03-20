Feature: Services Rest
  The User wants to make a request for a rest service
  and validate the expected response

  Scenario: Services Rest
    Given the user is on the page
    When search the user with data
      | name | lastName |
      | Guido | Gleichner  |
    Then the user validates the response with the following data
      | name | lastName | gender | email                |
      | Guido | Gleichner  | male | uvonrueden@example.org |

