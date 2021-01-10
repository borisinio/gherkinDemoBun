#Auto generated Octane revision tag
@BSPID1002REV0.2.0
Feature: middle
@TSCID1006
	Scenario: s1
		Given 1
		When 2
		Then 2

@TSCID1007
	Scenario Outline: s2
		Given <param1> 
		When  <param2>  
		Then 2

	Examples:
		| param1 | param2 |
		| 1      | 1      |
		| 2    | 2      |

@TSCID1008
	Scenario Outline: s3
		Given <param1> 
		When  <param2>  
		Then 3

	Examples:
		| param1 | param2 |
		| 1     | 1      |
		| 2     | 2      |

@TSCID1009
	Scenario: s4
		Given 1
		When 2
		Then 3


