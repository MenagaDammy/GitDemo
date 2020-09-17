Feature: Login into facebook

Scenario: Home page default login

Given User is on landing page
When User login by giving username "menaga" and password "1234"
Then Home page is "displayed"


Scenario: Home page default login

Given User is on landing page
When User login by giving username "dammy" and password "7890"
Then Home page is "not displayed"