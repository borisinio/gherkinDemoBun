#Auto generated Octane revision tag
@BSPID1103REV0.2.0
@anunu @important @sss
Feature: Reflect Gherkin Tags

@ido @alon @naor @chen
@TSCID4069
	Scenario: Bdd scenario1
		Given 4
		When 2
		Then 6

@geni @naor @moshe @chen
@TSCID4070
	Scenario: Bdd scenario2
		Given 1
		When 3
		Then 5

@niv @omer @amit @chen
@TSCID4071
	Scenario Outline: 
		Given <param1> 
		When  <param2>  
		Then 5

	Examples:
		| param1 | param2 |
		| a      | 1      |
		| b      | 2      |
