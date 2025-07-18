package com.example.utils;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Testes unitários para CalculatorUtils usando JUnit 4
 */
public class CalculatorUtilsTest {
    
    @Before
    public void setUp() {
        // Configuração antes de cada teste
        System.out.println("Executando teste de CalculatorUtils...");
    }
    
    @After
    public void tearDown() {
        // Limpeza após cada teste
        System.out.println("Teste concluído.");
    }
    
    @Test
    public void testFactorialOfZero() {
        assertEquals("Fatorial de 0 deve ser 1", 1, CalculatorUtils.factorial(0));
    }
    
    @Test
    public void testFactorialOfOne() {
        assertEquals("Fatorial de 1 deve ser 1", 1, CalculatorUtils.factorial(1));
    }
    
    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals("Fatorial de 5 deve ser 120", 120, CalculatorUtils.factorial(5));
        assertEquals("Fatorial de 4 deve ser 24", 24, CalculatorUtils.factorial(4));
        assertEquals("Fatorial de 3 deve ser 6", 6, CalculatorUtils.factorial(3));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        CalculatorUtils.factorial(-1);
    }
    
    @Test
    public void testIsPrimeForSmallNumbers() {
        assertFalse("1 não é primo", CalculatorUtils.isPrime(1));
        assertTrue("2 é primo", CalculatorUtils.isPrime(2));
        assertTrue("3 é primo", CalculatorUtils.isPrime(3));
        assertFalse("4 não é primo", CalculatorUtils.isPrime(4));
        assertTrue("5 é primo", CalculatorUtils.isPrime(5));
    }
    
    @Test
    public void testIsPrimeForLargerNumbers() {
        assertTrue("17 é primo", CalculatorUtils.isPrime(17));
        assertTrue("19 é primo", CalculatorUtils.isPrime(19));
        assertFalse("20 não é primo", CalculatorUtils.isPrime(20));
        assertFalse("21 não é primo", CalculatorUtils.isPrime(21));
    }
    
    @Test
    public void testPowerWithPositiveExponent() {
        assertEquals("2^3 deve ser 8", 8.0, CalculatorUtils.power(2, 3), 0.001);
        assertEquals("3^2 deve ser 9", 9.0, CalculatorUtils.power(3, 2), 0.001);
        assertEquals("5^0 deve ser 1", 1.0, CalculatorUtils.power(5, 0), 0.001);
    }
    
    @Test
    public void testPowerWithNegativeExponent() {
        assertEquals("2^-2 deve ser 0.25", 0.25, CalculatorUtils.power(2, -2), 0.001);
        assertEquals("4^-1 deve ser 0.25", 0.25, CalculatorUtils.power(4, -1), 0.001);
    }
    
    @Test
    public void testPowerWithZeroBase() {
        assertEquals("0^5 deve ser 0", 0.0, CalculatorUtils.power(0, 5), 0.001);
        assertEquals("0^0 deve ser 1", 1.0, CalculatorUtils.power(0, 0), 0.001);
    }
}
