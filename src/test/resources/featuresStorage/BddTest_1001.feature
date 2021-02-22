
Feature:FE1Ver


Scenario: S111
Given A
When B
Then C1


Scenario Outline: S222
Given <param1>
When  <param2>
Then <param3>
Examples:
| param1 | param2 | param3 |
| B      | C      | C     |
| A     | B     | C    |


Scenario:A1
Given A
When B
Then C