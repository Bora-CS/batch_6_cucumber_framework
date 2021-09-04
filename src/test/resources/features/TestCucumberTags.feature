Feature: Cucumber Tags Feature

	@group1 @smokeTest
	Scenario: Scenario One
		Given this is step one
		When this is step two
		Then this is step three
	
	@group2
	Scenario: Scenario Two
		Given this is step one
		When this is step two
		Then this is step three
		
	@group1
	Scenario: Scenario Three
		Given this is step one
		When this is step two
		Then this is step three
	
	@group2	@smokeTest
	Scenario: Scenario Four
		Given this is step one
		When this is step two
		Then this is step three