package com.example.steps;

import io.cucumber.java.pt.*;
import static org.junit.Assert.*;
import java.util.*;

public class DicionarioSteps {
    private Map<String, String> dicionario;
    private Object resultado;

    @Dado("um dicionário vazio")
    public void um_dicionario_vazio() {
        dicionario = new HashMap<>();
    }

    @Dado("um dicionário com a chave {string} e valor {string}")
    public void um_dicionario_com_chave_valor(String chave, String valor) {
        dicionario = new HashMap<>();
        dicionario.put(chave, valor);
    }

    @Dado("um dicionário com as chaves {string}, {string}, {string} e valores {string}, {string}, {string}")
    public void um_dicionario_com_varias_chaves_valores(String c1, String c2, String c3, String v1, String v2, String v3) {
        dicionario = new HashMap<>();
        dicionario.put(c1, v1);
        dicionario.put(c2, v2);
        dicionario.put(c3, v3);
    }

    @Dado("um dicionário com as chaves {string}, {string} e valores {string}, {string}")
    public void um_dicionario_com_duas_chaves_valores(String c1, String c2, String v1, String v2) {
        dicionario = new HashMap<>();
        dicionario.put(c1, v1);
        dicionario.put(c2, v2);
    }

    @Quando("adiciono a chave {string} com valor {string}")
    public void adiciono_chave_valor(String chave, String valor) {
        dicionario.put(chave, valor);
    }

    @Quando("removo a chave {string}")
    public void removo_chave(String chave) {
        dicionario.remove(chave);
    }

    @Quando("verifico se contém a chave {string}")
    public void verifico_se_contem_chave(String chave) {
        resultado = dicionario.containsKey(chave);
    }

    @Quando("obtenho o valor da chave {string}")
    public void obtenho_valor_chave(String chave) {
        resultado = dicionario.get(chave);
    }

    @Quando("atualizo a chave {string} para o valor {string}")
    public void atualizo_chave_valor(String chave, String valor) {
        dicionario.put(chave, valor);
    }

    @Quando("listo as chaves")
    public void listo_as_chaves() {
        List<String> chaves = new ArrayList<>(dicionario.keySet());
        Collections.sort(chaves);
        resultado = String.join(",", chaves);
    }

    @Quando("listo os valores")
    public void listo_os_valores() {
        List<String> valores = new ArrayList<>(dicionario.values());
        Collections.sort(valores);
        resultado = String.join(",", valores);
    }

    @Quando("obtenho o tamanho do dicionário")
    public void obtenho_tamanho_dicionario() {
        resultado = dicionario.size();
    }

    @Quando("limpo o dicionário")
    public void limpo_o_dicionario() {
        dicionario.clear();
    }

    @Entao("o dicionário deve conter {int} elemento(s)")
    public void dicionario_deve_conter_elementos(int n) {
        assertEquals(n, dicionario.size());
    }

    @Entao("o dicionário deve estar vazio")
    public void dicionario_deve_estar_vazio() {
        assertTrue(dicionario.isEmpty());
    }

    @Entao("o resultado do dicionário deve ser verdadeiro")
    public void resultado_deve_ser_verdadeiro() {
        assertTrue(Boolean.TRUE.equals(resultado));
    }

    @Entao("o resultado do dicionário deve ser {string}")
    public void resultado_deve_ser_string(String esperado) {
        assertEquals(esperado, resultado);
    }

    @Entao("o valor da chave {string} deve ser {string}")
    public void valor_chave_deve_ser(String chave, String esperado) {
        assertEquals(esperado, dicionario.get(chave));
    }

    @Entao("o resultado do dicionário deve ser {int}")
    public void resultado_deve_ser_int(int esperado) {
        assertEquals(esperado, resultado);
    }
}
