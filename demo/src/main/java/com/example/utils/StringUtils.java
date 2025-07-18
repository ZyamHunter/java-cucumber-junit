package com.example.utils;

/**
 * Classe utilitária para operações com strings
 */
public class StringUtils {
    
    /**
     * Verifica se uma string é um palíndromo
     */
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
    
    /**
     * Conta o número de palavras em uma string
     */
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        return str.trim().split("\\s+").length;
    }
    
    /**
     * Capitaliza a primeira letra de cada palavra
     */
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        
        // Verifica se a string contém apenas espaços
        if (str.trim().isEmpty()) {
            return str;
        }
        
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if (Character.isWhitespace(c)) {
                result.append(c);
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(Character.toLowerCase(c));
                }
            }
        }
        
        return result.toString();
    }
    
    /**
     * Remove caracteres duplicados consecutivos
     */
    public static String removeDuplicateChars(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        
        StringBuilder result = new StringBuilder();
        char prev = str.charAt(0);
        result.append(prev);
        
        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current != prev) {
                result.append(current);
                prev = current;
            }
        }
        
        return result.toString();
    }
}
