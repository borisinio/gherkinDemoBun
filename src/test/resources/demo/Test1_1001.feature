#Auto generated Octane revision tag
Feature: Testing

@some

	@1 @2
	Scenario: test1
		Given 1
		When 2
		Then 3

@yo
	Scenario: test2
		Given 1
		When 2
		Then 3



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
