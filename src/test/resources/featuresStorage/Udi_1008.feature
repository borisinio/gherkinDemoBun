
#Auto generated Octane revision tag

Feature:FED

Scenario: S11
Given A
When B
Then C1

Scenario Outline: S22
Given <param1>
When  <param2>
Then <param3>
Examples:
| param1 | param2 | param3 |
| B      | C      | C     |
| A     | B     | C    |

Scenario: S1
Given A
When B
Then C