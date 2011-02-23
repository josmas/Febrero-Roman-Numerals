Feature: Roman and arabic numeral equivalences
  In order to know the equivalences of numbers in arabic and roman
  As a developer
  I want to automate the conversion

  Scenario: Convert from Roman to Arabic
    Given a number in arabic such as 1999
    When I run the arabic converter
    Then I should get the value MCMXCIX

  Scenario: Convert from Arabic to Roman 
    Given a number in roman such as "MCMXCIX"
    When I run the roman converter
    Then I should get the value 1999