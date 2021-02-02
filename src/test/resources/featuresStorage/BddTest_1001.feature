@exclude
#Auto generated Octane revision tag
@BSPID1001REV0.2.0
Feature:FE1Ver

@TSCID1002
Scenario: S111
Given A
When B
Then C1

@TSCID1003
Scenario Outline: S222
Given <param1>
When  <param2>
Then <param3>
Examples:
| param1 | param2 | param3 |
| B      | C      | C     |
| A     | B     | C    |

@TSCID1004
Scenario: S333
Given A
When B
Then C