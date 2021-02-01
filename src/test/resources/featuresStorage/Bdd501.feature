@BSPID1003REV0.3.0
Feature: a
  @TSCID2222
  Scenario: s1
    Given A
    When B
    Then C1

  @TSCID1019
  Scenario Outline: S2
    Given <param1>
    When  <param2>
    Then <param3>
    Examples:
      | param1 | param2 | param3 |
      | B      | C      | C     |
      | A     | B     | C    |

  @TSCID1020
  Scenario: S3
    Given A
    When B
    Then C