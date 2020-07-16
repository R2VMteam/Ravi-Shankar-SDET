Feature: Automation Practice


#without Examples Keyword
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "naveenk" and "test@123"
#Then user clicks on login button
#Then user is on home page


#with Examples Keyword
  Scenario Outline:  Automation Practice Login Scenario

    Given user is already on Login Page
    When title of login page is My Store
    Then Close the browser

    Examples:
      | username | password |
      | rahul6000@hotmail.com  | test123 |

