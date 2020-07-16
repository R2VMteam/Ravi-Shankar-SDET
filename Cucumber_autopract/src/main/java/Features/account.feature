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

    Given user is already on Account Page
    When title of login page is My Store
    Then user enters "<username>" and "<password>"
    Then user is on My Account page
    Then user clicks on Your personal information link
    Then user clicks radio button titled Mr
    Then user clicks on First name input box and enters first name and user enters "<first_name>"
    Then user clicks on Second Name input box and enters second name "<second_name>"
    Then user clicks on Email and enters email address
    Then user enters Date of birth using drop down
    Then Close the browser1

    Examples:
      | username | password | first_name | second_name |
      | ravishankarpatro@gmail.com | r2vmauto@123 | ravi | shankar |