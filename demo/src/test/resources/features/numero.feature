Feature: Manipulação de Números

  Scenario: Verificar se um número é par
    Given o número 8
    When verifico se é par
    Then o resultado do número deve ser verdadeiro

  Scenario: Verificar se um número é ímpar
    Given o número 7
    When verifico se é ímpar
    Then o resultado do número deve ser verdadeiro

  Scenario: Calcular o fatorial de um número
    Given o número 5
    When calculo o fatorial
    Then o resultado do número deve ser 120

  Scenario: Calcular a raiz quadrada de um número
    Given o número 16
    When calculo a raiz quadrada
    Then o resultado do número deve ser 4

  Scenario: Calcular o quadrado de um número
    Given o número 6
    When calculo o quadrado
    Then o resultado do número deve ser 36

  Scenario: Calcular o cubo de um número
    Given o número 3
    When calculo o cubo
    Then o resultado do número deve ser 27

  Scenario: Verificar se um número é primo
    Given o número 13
    When verifico se é primo
    Then o resultado do número deve ser verdadeiro

  Scenario: Calcular o valor absoluto de um número
    Given o número -10
    When calculo o valor absoluto
    Then o resultado do número deve ser 10

  Scenario: Calcular o máximo entre dois números
    Given os números 8 e 15
    When calculo o máximo
    Then o resultado do número deve ser 15

  Scenario: Calcular o mínimo entre dois números
    Given os números 8 e 15
    When calculo o mínimo
    Then o resultado do número deve ser 8
