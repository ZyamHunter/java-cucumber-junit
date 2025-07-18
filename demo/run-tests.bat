@echo off
echo Executando projeto Java com Cucumber e JUnit
echo ============================================

echo.
echo 1. Limpando e compilando o projeto...
call mvn clean compile

echo.
echo 2. Compilando testes...
call mvn test-compile

echo.
echo 3. Executando todos os testes...
call mvn test

echo.
echo 4. Executando apenas testes JUnit unitários...
call mvn test -Dtest=*Test

echo.
echo 5. Executando apenas testes Cucumber...
call mvn test -Dtest=RunCucumberTest

echo.
echo ============================================
echo Execução concluída!
echo Verifique os relatórios em target/
pause
