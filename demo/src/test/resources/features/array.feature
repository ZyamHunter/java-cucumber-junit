Feature: Manipulação de Arrays

  Scenario: Somar todos os elementos de um array
    Given um array aleatório de tamanho 5
    When eu somo todos os elementos
    Then exibo o resultado da soma

  Scenario: Encontrar o maior elemento de um array
    Given um array aleatório de tamanho 4
    When eu busco o maior elemento
    Then exibo o maior elemento

  Scenario: Encontrar o menor elemento de um array
    Given um array aleatório de tamanho 4
    When eu busco o menor elemento
    Then exibo o menor elemento

  Scenario: Calcular a média dos elementos de um array
    Given um array aleatório de tamanho 4
    When eu calculo a média dos elementos
    Then exibo a média dos elementos

  Scenario: Verificar se o array contém um valor
    Given um array aleatório de tamanho 4
    When eu verifico se o array contém o valor 12
    Then o resultado do array deve ser verdadeiro

  Scenario: Contar a quantidade de elementos do array
    Given um array aleatório de tamanho 3
    When eu conto a quantidade de elementos
    Then o resultado deve ser igual ao tamanho do array

  Scenario: Inverter os elementos de um array
    Given um array aleatório de tamanho 6
    When eu inverto os elementos do array
    Then exibo o array invertido

  Scenario: Ordenar os elementos de um array
    Given um array aleatório de tamanho 5
    When eu ordeno os elementos do array
    Then exibo o array ordenado

  Scenario: Remover elementos duplicados de um array
    Given um array aleatório de tamanho 8
    And duplico o array
    When eu removo os elementos duplicados
    Then exibo o array sem duplicados