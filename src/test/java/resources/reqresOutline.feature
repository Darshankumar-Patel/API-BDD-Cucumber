Feature: API Scenario Outline Testing

  As a API Tester
  I want to test Scenario Outline
  So that I can test multiple APIs

  Scenario Outline:
    Given I am on reqres\.in
    When I type "<endpoints>"
    Then I shoud get "<response>"

    Examples: |endpoints|response|
    |https://reqres.in/api/users?page=2|page:2|
    |https://reqres.in/api/users/2     |data.id:2|
    |https://reqres.in/api/users/23    |{}|
    |https://reqres.in/api/unknown     |page:1|
    |https://reqres.in/api/unknown/2   |data.id:2|
    |https://reqres.in/api/unknown/23  |{}|
    |https://reqres.in/api/users?delay=3|page:1|

