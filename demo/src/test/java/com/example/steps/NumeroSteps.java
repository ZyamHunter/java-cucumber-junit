package com.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class NumeroSteps {
    private int numero;
    private int outroNumero;
    private int resultadoInt;
    private boolean resultadoBool;

    @Given("o número {int}")
    public void o_numero(Integer n) {
        numero = n;
    }

    @Given("os números {int} e {int}")
    public void os_numeros(Integer n1, Integer n2) {
        numero = n1;
        outroNumero = n2;
    }

    @When("verifico se é par")
    public void verifico_se_e_par() {
        resultadoBool = (numero % 2 == 0);
    }

    @When("verifico se é ímpar")
    public void verifico_se_e_impar() {
        resultadoBool = (numero % 2 != 0);
    }

    @When("calculo o fatorial")
    public void calculo_o_fatorial() {
        resultadoInt = 1;
        for (int i = 2; i <= numero; i++) {
            resultadoInt *= i;
        }
    }

    @When("calculo a raiz quadrada")
    public void calculo_a_raiz_quadrada() {
        resultadoInt = (int) Math.sqrt(numero);
    }

    @When("calculo o quadrado")
    public void calculo_o_quadrado() {
        resultadoInt = numero * numero;
    }

    @When("calculo o cubo")
    public void calculo_o_cubo() {
        resultadoInt = numero * numero * numero;
    }

    @When("verifico se é primo")
    public void verifico_se_e_primo() {
        if (numero <= 1) {
            resultadoBool = false;
            return;
        }
        resultadoBool = true;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                resultadoBool = false;
                break;
            }
        }
    }

    @When("calculo o valor absoluto")
    public void calculo_o_valor_absoluto() {
        resultadoInt = Math.abs(numero);
    }

    @When("calculo o máximo")
    public void calculo_o_maximo() {
        resultadoInt = Math.max(numero, outroNumero);
    }

    @When("calculo o mínimo")
    public void calculo_o_minimo() {
        resultadoInt = Math.min(numero, outroNumero);
    }

    @Then("o resultado do número deve ser verdadeiro")
    public void o_resultado_deve_ser_verdadeiro() {
        assertTrue(resultadoBool);
    }

    @Then("o resultado do número deve ser {int}")
    public void o_resultado_deve_ser(Integer esperado) {
        assertEquals(esperado.intValue(), resultadoInt);
    }
}
