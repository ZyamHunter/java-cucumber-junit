Feature: Manipulação de Strings

  Scenario: Verificar se a string está vazia
    Given a string vazia
    When verifico se a string está vazia
    Then o resultado deve ser verdadeiro

  Scenario: Verificar se a string não está vazia
    Given a string "abc"
    Then o resultado deve ser falso

  Scenario: Concatenar duas strings
    Given a string "foo"
    And outra string "bar"
    When concateno as strings
    Then o resultado deve ser "foobar"

  Scenario: Obter o comprimento da string
    Given a string "cucumber"
    When obtenho o comprimento
    Then o resultado deve ser 8

  Scenario: Converter a string para maiúsculas
    Given a string "java"
    When converto para maiúsculas
    Then o resultado deve ser "JAVA"

  Scenario: Converter a string para minúsculas
    Given a string "TESTE"
    When converto para minúsculas
    Then o resultado deve ser "teste"

  Scenario: Substituir parte da string
    Given a string "banana"
    When substituo "na" por "ma"
    Then o resultado deve ser "bamama"

  Scenario: Verificar se a string contém um texto
    Given a string "abcdef"
    When verifico se contém "cd"
    Then o resultado deve ser verdadeiro

  Scenario: Remover espaços em branco
    Given a string "  hello world  "
    When removo os espaços
    Then o resultado deve ser "helloworld"

  Scenario: Inverter a string
    Given a string "casa"
    When inverto a string
    Then o resultado deve ser "asac"
