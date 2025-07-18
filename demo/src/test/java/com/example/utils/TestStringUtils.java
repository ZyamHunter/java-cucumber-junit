package com.example.utils;

public class TestStringUtils {
    public static void main(String[] args) {
        System.out.println("Testando StringUtils...");
        
        // Teste básico
        String result1 = StringUtils.capitalizeWords("hello world");
        System.out.println("'hello world' -> '" + result1 + "' (esperado: 'Hello World')");
        
        // Teste com múltiplos espaços
        String result2 = StringUtils.capitalizeWords("hello  world");
        System.out.println("'hello  world' -> '" + result2 + "' (esperado: 'Hello  World')");
        
        // Teste com apenas espaços
        String result3 = StringUtils.capitalizeWords("   ");
        System.out.println("'   ' -> '" + result3 + "' (esperado: '   ')");
        
        // Teste palíndromo
        boolean result4 = StringUtils.isPalindrome("aba");
        System.out.println("'aba' é palíndromo? " + result4 + " (esperado: true)");
        
        System.out.println("Testes concluídos!");
    }
}
