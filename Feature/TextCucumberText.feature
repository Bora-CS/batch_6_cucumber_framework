Feature: Cucumber Tags Feature
		
		@group1 @smokeTest
		Scenario: Scenario One
		Given This is step on
		When this is step two
		Then this is step three
		
		
		@group2
		Scenario: Scenario 	Two
		Given This is step on
		When this is step two
		Then this is step three
		
		@group1
		Scenario: Scenario Three
		Given This is step on
		When this is step two
		Then this is step three
		
		@group2 @smokeTest
		Scenario: Scenario Four
		Given This is step on
		When this is step two
		Then this is step three