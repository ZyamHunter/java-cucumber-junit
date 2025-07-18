Feature: Página Principal

  Scenario: Usuário acessa a página principal
    Given o usuário está na página principal
    When a página é carregada
    Then o usuário vê a mensagem "Bem-vindo"