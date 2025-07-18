package com.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.util.*;
import static org.junit.Assert.*;
import java.util.Random;

public class ArraySteps {
    private List<Integer> array;
    private int resultado;
    private boolean resultadoBooleano;
    private List<Integer> arrayInvertido;
    private List<Integer> arrayOrdenado;
    private List<Integer> arraySemDuplicados;
    @When("eu inverto os elementos do array")
    public void eu_inverto_os_elementos_do_array() {
        arrayInvertido = new ArrayList<>(array);
        Collections.reverse(arrayInvertido);
    }

    @Then("exibo o array invertido")
    public void exibo_o_array_invertido() {
        System.out.println("Array invertido: " + arrayInvertido);
    }

    @When("eu ordeno os elementos do array")
    public void eu_ordeno_os_elementos_do_array() {
        arrayOrdenado = new ArrayList<>(array);
        Collections.sort(arrayOrdenado);
    }

    @Then("exibo o array ordenado")
    public void exibo_o_array_ordenado() {
        System.out.println("Array ordenado: " + arrayOrdenado);
    }

    @When("eu removo os elementos duplicados")
    public void eu_removo_os_elementos_duplicados() {
        arraySemDuplicados = new ArrayList<>(new LinkedHashSet<>(array));
    }

    @Then("exibo o array sem duplicados")
    public void exibo_o_array_sem_duplicados() {
        System.out.println("Array sem duplicados: " + arraySemDuplicados);
    }

    @Given("duplico o array")
    public void duplico_o_array() {
        array.addAll(new ArrayList<>(array));
    }
    @Given("um array aleatório de tamanho {int}")
    public void um_array_aleatorio_de_tamanho(Integer tamanho) {
        array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < tamanho - 1; i++) {
            array.add(random.nextInt(10) + 1); // números de 1 a 10
        }
        // Para o cenário de busca, sempre adiciona o valor 12 no final se o tamanho for maior que 0
        if (tamanho > 0) {
            array.add(12);
        }
        System.out.println("Array gerado: " + array);
    }


    @When("eu somo todos os elementos")
    public void eu_somo_todos_os_elementos() {
        resultado = array.stream().mapToInt(Integer::intValue).sum();
    }


    @When("eu busco o menor elemento")
    public void eu_busco_o_menor_elemento() {
        resultado = array.stream().mapToInt(Integer::intValue).min().orElse(0);
    }

    @When("eu calculo a média dos elementos")
    public void eu_calculo_a_media_dos_elementos() {
        resultado = (int) Math.round(array.stream().mapToInt(Integer::intValue).average().orElse(0));
    }

    @When("eu verifico se o array contém o valor {int}")
    public void eu_verifico_se_o_array_contem_o_valor(Integer valor) {
        resultadoBooleano = array.contains(valor);
    }

    @When("eu conto a quantidade de elementos")
    public void eu_conto_a_quantidade_de_elementos() {
        resultado = array.size();
    }

    @When("eu busco o maior elemento")
    public void eu_busco_o_maior_elemento() {
        resultado = array.stream().mapToInt(Integer::intValue).max().orElse(0);
    }


    @Then("exibo o resultado da soma")
    public void exibo_o_resultado_da_soma() {
        System.out.println("Soma dos elementos: " + resultado);
    }

    @Then("exibo o maior elemento")
    public void exibo_o_maior_elemento() {
        System.out.println("Maior elemento: " + resultado);
    }

    @Then("exibo o menor elemento")
    public void exibo_o_menor_elemento() {
        System.out.println("Menor elemento: " + resultado);
    }

    @Then("exibo a média dos elementos")
    public void exibo_a_media_dos_elementos() {
        System.out.println("Média dos elementos: " + resultado);
    }

    @Then("o resultado do array deve ser verdadeiro")
    public void o_resultado_do_array_deve_ser_verdadeiro() {
        assertTrue(resultadoBooleano);
    }

    @Then("o resultado deve ser igual ao tamanho do array")
    public void o_resultado_deve_ser_igual_ao_tamanho_do_array() {
        assertEquals(array.size(), resultado);
    }

}
