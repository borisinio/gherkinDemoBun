
#Auto generated Octane revision tag

Feature: last

	Scenario: yo
		Given C1
		When B
		Then A
		And B
		When A
		Then B

	Scenario: yo2
		Given 1
		When B
		Then A
		And B
		When A
		Then 3

	Scenario Outline: yo3
		Given <param1>
		When  <param2>
		Then <param3>
		Examples:
			| param1 | param2 | param3 |
			| B      | C      | A     |
			| C1    | B     | C    |