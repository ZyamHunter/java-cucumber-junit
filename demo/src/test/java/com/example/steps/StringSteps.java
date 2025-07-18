package com.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class StringSteps {
    private String str;
    private String outraStr;
    private String resultadoStr;
    private boolean resultadoBool;
    private int resultadoInt;

    @When("verifico se a string está vazia")
    public void verifico_se_a_string_esta_vazia() {
        resultadoBool = str.isEmpty();
    }

    @Given("a string vazia")
    public void a_string_vazia() {
        str = "";
    }

    @Given("a string {string}")
    public void a_string(String valor) {
        str = valor;
    }

    @Given("outra string {string}")
    public void outra_string(String valor) {
        outraStr = valor;
    }

    @When("concateno as strings")
    public void concateno_as_strings() {
        resultadoStr = str + outraStr;
    }

    @When("obtenho o comprimento")
    public void obtenho_o_comprimento() {
        resultadoInt = str.length();
    }

    @When("converto para maiúsculas")
    public void converto_para_maiusculas() {
        resultadoStr = str.toUpperCase();
    }

    @When("converto para minúsculas")
    public void converto_para_minusculas() {
        resultadoStr = str.toLowerCase();
    }

    @When("substituo {string} por {string}")
    public void substituo_por(String alvo, String novo) {
        resultadoStr = str.replace(alvo, novo);
    }

    @When("verifico se contém {string}")
    public void verifico_se_contem(String texto) {
        resultadoBool = str.contains(texto);
    }

    @When("removo os espaços")
    public void removo_os_espacos() {
        resultadoStr = str.replaceAll("\\s", "");
    }

    @When("inverto a string")
    public void inverto_a_string() {
        resultadoStr = new StringBuilder(str).reverse().toString();
    }

    @Then("o resultado deve ser verdadeiro")
    public void o_resultado_deve_ser_verdadeiro() {
        assertTrue(resultadoBool);
    }

    @Then("o resultado deve ser falso")
    public void o_resultado_deve_ser_falso() {
        assertFalse(resultadoBool);
    }

    @Then("o resultado deve ser {string}")
    public void o_resultado_deve_ser(String esperado) {
        assertEquals(esperado, resultadoStr);
    }

    @Then("o resultado deve ser {int}")
    public void o_resultado_deve_ser(Integer esperado) {
        assertEquals(esperado.intValue(), resultadoInt);
    }
}
