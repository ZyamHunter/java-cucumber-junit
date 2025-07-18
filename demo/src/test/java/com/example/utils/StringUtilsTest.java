package com.example.utils;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Testes unitários para StringUtils usando JUnit 4
 */
public class StringUtilsTest {
    
    @Before
    public void setUp() {
        System.out.println("Executando teste de StringUtils...");
    }
    
    @After
    public void tearDown() {
        System.out.println("Teste concluído.");
    }
    
    @Test
    public void testIsPalindromeWithValidPalindromes() {
        assertTrue("'aba' é palíndromo", StringUtils.isPalindrome("aba"));
        assertTrue("'A man a plan a canal Panama' é palíndromo", 
                   StringUtils.isPalindrome("A man a plan a canal Panama"));
        assertTrue("'racecar' é palíndromo", StringUtils.isPalindrome("racecar"));
        assertTrue("'Was it a car or a cat I saw' é palíndromo", 
                   StringUtils.isPalindrome("Was it a car or a cat I saw"));
    }
    
    @Test
    public void testIsPalindromeWithNonPalindromes() {
        assertFalse("'hello' não é palíndromo", StringUtils.isPalindrome("hello"));
        assertFalse("'java' não é palíndromo", StringUtils.isPalindrome("java"));
        assertFalse("'programming' não é palíndromo", StringUtils.isPalindrome("programming"));
    }
    
    @Test
    public void testIsPalindromeWithNullAndEmpty() {
        assertFalse("null não é palíndromo", StringUtils.isPalindrome(null));
        assertTrue("string vazia é palíndromo", StringUtils.isPalindrome(""));
        assertTrue("espaço é palíndromo", StringUtils.isPalindrome(" "));
    }
    
    @Test
    public void testCountWordsWithValidStrings() {
        assertEquals("'hello world' tem 2 palavras", 2, StringUtils.countWords("hello world"));
        assertEquals("'Java is awesome' tem 3 palavras", 3, StringUtils.countWords("Java is awesome"));
        assertEquals("'word' tem 1 palavra", 1, StringUtils.countWords("word"));
        assertEquals("'  multiple   spaces  ' tem 2 palavras", 2, StringUtils.countWords("  multiple   spaces  "));
    }
    
    @Test
    public void testCountWordsWithEmptyAndNull() {
        assertEquals("string vazia tem 0 palavras", 0, StringUtils.countWords(""));
        assertEquals("string com espaços tem 0 palavras", 0, StringUtils.countWords("   "));
        assertEquals("null tem 0 palavras", 0, StringUtils.countWords(null));
    }
    
    @Test
    public void testCapitalizeWords() {
        assertEquals("Capitalização básica", "Hello World", StringUtils.capitalizeWords("hello world"));
        assertEquals("Capitalização mista", "Java Is Awesome", StringUtils.capitalizeWords("jAvA iS aWeSoMe"));
        assertEquals("Uma palavra", "Programming", StringUtils.capitalizeWords("programming"));
        assertEquals("Múltiplos espaços", "Hello  World", StringUtils.capitalizeWords("hello  world"));
    }
    
    @Test
    public void testCapitalizeWordsEdgeCases() {
        assertEquals("String vazia", "", StringUtils.capitalizeWords(""));
        assertEquals("Null", null, StringUtils.capitalizeWords(null));
        assertEquals("Apenas espaços", "   ", StringUtils.capitalizeWords("   "));
    }
    
    @Test
    public void testRemoveDuplicateChars() {
        assertEquals("Remove duplicatas básicas", "helo", StringUtils.removeDuplicateChars("hello"));
        assertEquals("Remove múltiplas duplicatas", "abcd", StringUtils.removeDuplicateChars("aabbccdd"));
        assertEquals("Sem duplicatas", "abc", StringUtils.removeDuplicateChars("abc"));
        assertEquals("Duplicatas no meio", "abcde", StringUtils.removeDuplicateChars("abbcccdddde"));
    }
    
    @Test
    public void testRemoveDuplicateCharsEdgeCases() {
        assertEquals("String vazia", "", StringUtils.removeDuplicateChars(""));
        assertEquals("Null", null, StringUtils.removeDuplicateChars(null));
        assertEquals("Um caractere", "a", StringUtils.removeDuplicateChars("a"));
        assertEquals("Caracteres iguais", "a", StringUtils.removeDuplicateChars("aaaa"));
    }
}
