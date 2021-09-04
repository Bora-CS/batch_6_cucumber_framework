Feature: Create Profile Feature
new User should be able to create profile

Scenario: create user profile
		Given User is on Home Page
    And User click on Login button
    Then User Navigate to Login Page
    When User Enter Username and Password
    | johntest123@gmail.com | Test123 | 
    Then User Navigate to Profile Page
    When User Click on Create Profile Link
    Then User Navigate to Create Your Profile Page
    When User Enters "<status>" "<company>" "<website>" "<location>" "<skills>" "<github>" and Click Submit
    Then Verify Profile Created Message displayed
    When User Click Delete Account
    And User accept the alert
    Then Account is Deleted
    Then Browser is Quited
    Examples: 
    | status | company | website | location  | skills                      | github   | 
    | SDET   |Bora		 | bora.com| VA        | Java, Cucumber, Selenium ...|boragit   |
    
    