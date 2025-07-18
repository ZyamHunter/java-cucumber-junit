package com.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;



public class HomeSteps {
    private String mensagem;

    @Given("o usuário está na página principal")
    public void o_usuario_esta_na_pagina_principal() {
        // Simula o acesso à página principal
        mensagem = null;
    }

    @When("a página é carregada")
    public void a_pagina_e_carregada() {
        // Simula o carregamento da página
        mensagem = "Bem-vindo";
    }

    @Then("o usuário vê a mensagem {string}")
    public void o_usuario_ve_a_mensagem(String mensagemEsperada) {
        assertEquals(mensagemEsperada, mensagem);
    }
}
