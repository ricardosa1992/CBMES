/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.teste;
import br.gov.es.cb.sdro.view.TelaEquipamento;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
/**
 *
 * @author Patrícia
 */
public class CbmsTeste {
    private int valor1 = 0;
    private int valor2 = 0;
    private int resultado = 0;
    TelaEquipamento telaEquipamento;

    public CbmsTeste() throws Exception {
        telaEquipamento =  new TelaEquipamento();
    }

    
    @Given("^eu tenho o numero (\\d+) e (\\d+)$")
    public void euTenhoONumeroE(int arg1, int arg2) throws Throwable {

        valor1 = arg1;
        valor2 = arg2;
    }
    
      @When("^eu quero somar$")
    public void euQueroSomar() throws Throwable {
         //Write code here that turns the phrase above into concrete actions
        this.resultado = telaEquipamento.somar(valor1,valor2);
    }
    
     @Then("^Eu quero como resultado o numero (\\d+)$")
    public void euQueroComoResultadoONumero(int resultadoEXperado) throws Throwable {

        assertThat(resultado, is(resultadoEXperado));

    }
}
