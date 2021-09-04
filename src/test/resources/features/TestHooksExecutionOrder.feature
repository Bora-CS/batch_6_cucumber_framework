Feature: Test Hooks Execution Order

Scenario: First Scenario
		Given first execution order step
		When second execution order step
		Then third execution order step
		
Scenario: Second Scenario
		Given first execution order step
		When second execution order step
		Then third execution order step