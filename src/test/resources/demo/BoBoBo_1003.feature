#Auto generated Octane revision tag

Feature: bobo1

	Scenario Outline: scenario <param2>
		Given user <param1> exist
		When  round <param2>  
		Then the OK

	Examples:
		| param1 | param2 |
		| a      | 1      |
		| b      | 2      |
