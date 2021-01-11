#Auto generated Octane revision tag
@BSPID1001REV0.2.0
Feature: many
	@TSCID1001
	Scenario Outline: wish
		Given <param1>
		When  <param2>
		Then  <param2>

		Examples:
			| param1 | param2 |
			| 1    | 1      |
			| 1     | 2      |

	@TSCID1002
	Scenario: wish1
		Given 1
		When 2
		Then 3
