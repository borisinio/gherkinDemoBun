#Auto generated Octane revision tag
@BSPID1001REV0.2.0
Feature: bbb
@TSCID1003
	Scenario Outline: b1
		Given <param1> 
		When  <param2>  
		Then 2

	Examples:
		| param1 | param2 |
		| 1      | 1      |
		| 1     | 2      |

@TSCID1004
	Scenario: b2
		Given 1
		When 2
		Then 3
