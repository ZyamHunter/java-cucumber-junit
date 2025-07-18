# Projeto Java com Cucumber e JUnit

Este projeto demonstra o uso de **JUnit 4** em conjunto com **Cucumber** para testes de aceitação (BDD) e testes unitários em Java.

## 🛠️ Tecnologias Utilizadas

- **Java 11**
- **Maven** - Gerenciamento de dependências e build
- **JUnit 4.13.2** - Framework de testes unitários
- **Cucumber 7.18.0** - Framework para testes BDD (Behavior Driven Development)

## 📁 Estrutura do Projeto

```
demo/
├── src/
│   ├── main/java/com/example/utils/
│   │   ├── CalculatorUtils.java    # Utilitários matemáticos
│   │   └── StringUtils.java        # Utilitários para strings
│   └── test/
│       ├── java/com/example/
│       │   ├── runners/
│       │   │   └── RunCucumberTest.java    # Runner do Cucumber
│       │   ├── steps/                      # Step definitions do Cucumber
│       │   │   ├── ArraySteps.java
│       │   │   ├── DicionarioSteps.java
│       │   │   ├── HomeSteps.java
│       │   │   ├── NumeroSteps.java
│       │   │   └── StringSteps.java
│       │   └── utils/                      # Testes unitários JUnit
│       │       ├── CalculatorUtilsTest.java
│       │       └── StringUtilsTest.java
│       └── resources/features/             # Arquivos .feature do Cucumber
│           ├── array.feature
│           ├── dicionario.feature
│           ├── home.feature
│           ├── numero.feature
│           └── string.feature
├── target/                                 # Diretório de build
└── pom.xml                                # Configuração Maven
```

## 🚀 Como Executar

### Pré-requisitos

- Java 11 ou superior
- Maven 3.6+

### Executando os Testes

#### Todos os testes (Cucumber + JUnit):
```bash
mvn test
```

#### Apenas testes JUnit unitários:
```bash
mvn test -Dtest=*Test
```

#### Apenas testes Cucumber:
```bash
mvn test -Dtest=RunCucumberTest
```

### Executando testes específicos:

#### Teste específico do JUnit:
```bash
mvn test -Dtest=CalculatorUtilsTest
mvn test -Dtest=StringUtilsTest
```

#### Cucumber com feature específica:
```bash
mvn test -Dtest=RunCucumberTest -Dcucumber.options="src/test/resources/features/numero.feature"
```

## 📊 Relatórios de Teste

Após executar os testes, os relatórios serão gerados em:

- **Cucumber HTML**: `target/cucumber-report.html`
- **Cucumber JSON**: `target/cucumber-report.json`
- **Cucumber XML**: `target/cucumber-report.xml`
- **Surefire Reports**: `target/surefire-reports/`

## 🧪 Tipos de Teste

### 1. Testes Unitários (JUnit)

Testes focados em testar unidades individuais de código:

- **CalculatorUtilsTest**: Testa operações matemáticas (fatorial, números primos, potências)
- **StringUtilsTest**: Testa operações com strings (palíndromos, contagem de palavras, capitalização)

### 2. Testes BDD (Cucumber)

Testes orientados por comportamento usando linguagem natural:

- **home.feature**: Testa navegação na página principal
- **numero.feature**: Testa operações matemáticas
- **string.feature**: Testa manipulação de strings
- **array.feature**: Testa operações com arrays
- **dicionario.feature**: Testa operações com dicionários

## 🔧 Configuração do JUnit

O projeto utiliza JUnit 4 com as seguintes configurações:

### Anotações Principais:
- `@Test`: Marca um método como teste
- `@Before`: Executado antes de cada teste
- `@After`: Executado após cada teste
- `@Test(expected = Exception.class)`: Testa se uma exceção é lançada

### Assertions Comuns:
- `assertEquals()`: Verifica igualdade
- `assertTrue()` / `assertFalse()`: Verifica valores booleanos
- `assertNull()` / `assertNotNull()`: Verifica valores nulos

## 🥒 Configuração do Cucumber

### Runner Configuration:
```java
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com.example.steps",
    plugin = {
        "pretty", 
        "html:target/cucumber-report.html",
        "json:target/cucumber-report.json",
        "junit:target/cucumber-report.xml"
    },
    monochrome = true,
    publish = true
)
```

### Step Definitions:
- Usam anotações como `@Given`, `@When`, `@Then`
- Integram com assertions do JUnit para verificações

## 📈 Melhores Práticas

1. **Separação de Responsabilidades**: Testes unitários para lógica, Cucumber para comportamento
2. **Nomenclatura Clara**: Nomes de testes descritivos
3. **Setup e Teardown**: Use `@Before` e `@After` para preparação e limpeza
4. **Assertions Específicas**: Use a assertion mais apropriada para cada caso
5. **Testes Independentes**: Cada teste deve ser executável isoladamente

## 🤝 Contribuindo

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -am 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.
