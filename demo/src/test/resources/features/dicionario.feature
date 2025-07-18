Feature: Manipulação de Dicionários

  Scenario: Adicionar um par chave-valor
    Given um dicionário vazio
    When adiciono a chave "nome" com valor "João"
    Then o dicionário deve conter 1 elemento

  Scenario: Remover uma chave
    Given um dicionário com a chave "idade" e valor "30"
    When removo a chave "idade"
    Then o dicionário deve estar vazio

  Scenario: Verificar se o dicionário contém uma chave
    Given um dicionário com a chave "cidade" e valor "SP"
    When verifico se contém a chave "cidade"
    Then o resultado do dicionário deve ser verdadeiro

  Scenario: Obter o valor de uma chave
    Given um dicionário com a chave "cor" e valor "azul"
    When obtenho o valor da chave "cor"
    Then o resultado do dicionário deve ser "azul"

  Scenario: Atualizar o valor de uma chave
    Given um dicionário com a chave "cor" e valor "azul"
    When atualizo a chave "cor" para o valor "verde"
    Then o valor da chave "cor" deve ser "verde"

  Scenario: Listar todas as chaves
    Given um dicionário com as chaves "a", "b", "c" e valores "1", "2", "3"
    When listo as chaves
    Then o resultado do dicionário deve ser "a,b,c"

  Scenario: Listar todos os valores
    Given um dicionário com as chaves "a", "b", "c" e valores "1", "2", "3"
    When listo os valores
    Then o resultado do dicionário deve ser "1,2,3"

  Scenario: Verificar se o dicionário está vazio
    Given um dicionário vazio
    Then o dicionário deve estar vazio

  Scenario: Obter o tamanho do dicionário
    Given um dicionário com as chaves "x", "y" e valores "10", "20"
    When obtenho o tamanho do dicionário
    Then o resultado do dicionário deve ser 2

  Scenario: Limpar o dicionário
    Given um dicionário com a chave "z" e valor "100"
    When limpo o dicionário
    Then o dicionário deve estar vazio
