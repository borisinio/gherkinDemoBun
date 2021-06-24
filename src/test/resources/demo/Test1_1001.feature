#Auto generated Octane revision tag
@BSPID1001REV0.6.0
Feature: Testing

@some
@TSCID1004
	@1 @2
	Scenario: test1
		Given 1
		When 2
		Then 3

	@23
@TSCID1002
@yo
	@1
	Scenario: test2
		Given 1
		When 2
		Then 3


@TSCID1005
	@a @b @c @d
	@a @1
	Scenario Outline: test3
		Given <param1> 
		When  <param2>  
		Then 3

	Examples:
		| param1 | param2 |
		| a      | 1      |
		| b      | 2      |
