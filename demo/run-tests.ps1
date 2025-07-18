# Script PowerShell para executar testes Java com Cucumber e JUnit

Write-Host "Executando projeto Java com Cucumber e JUnit" -ForegroundColor Green
Write-Host "============================================" -ForegroundColor Green

Write-Host ""
Write-Host "1. Compilando o projeto..." -ForegroundColor Yellow
mvn clean compile

Write-Host ""
Write-Host "2. Compilando testes..." -ForegroundColor Yellow
mvn test-compile

Write-Host ""
Write-Host "3. Executando todos os testes..." -ForegroundColor Yellow
mvn test

Write-Host ""
Write-Host "4. Executando apenas testes JUnit unitários..." -ForegroundColor Yellow
mvn test -Dtest=*Test

Write-Host ""
Write-Host "5. Executando apenas testes Cucumber..." -ForegroundColor Yellow
mvn test -Dtest=RunCucumberTest

Write-Host ""
Write-Host "============================================" -ForegroundColor Green
Write-Host "Execução concluída!" -ForegroundColor Green
Write-Host "Verifique os relatórios em target/" -ForegroundColor Cyan

Read-Host "Pressione Enter para continuar"
