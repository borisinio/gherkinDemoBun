#Auto generated Octane revision tag
@BSPID1008REV0.2.0
Feature:FED

@TSCID1024
Scenario: S11
Given A
When B
Then C1

@TSCID1025
Scenario Outline: S22
Given <param1>
When  <param2>
Then <param3>
Examples:
| param1 | param2 | param3 |
| B      | C      | C     |
| A     | B     | C    |

@TSCID1026
Scenario: S33
Given A
When B
Then C