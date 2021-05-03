#Auto generated Octane revision tag
@BSPID1003REV0.2.0
Feature: bobo1
@TSCID1069
	Scenario Outline: scenario <param2>
		Given user <param1> exist
		When  round <param2>  
		Then the OK

	Examples:
		| param1 | param2 |
		| a      | 1      |
		| b      | 2      |
