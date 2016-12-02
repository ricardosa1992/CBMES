/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.teste;

import br.gov.es.cb.sdro.model.Equipamento;
import br.gov.es.cb.sdro.util.AbstractDAO;
import br.gov.es.cb.sdro.util.EquipamentoDAO;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author tiago
 */
public class AlocarEquipamentoDAOTeste extends AbstractDAO<Equipamento>{
    private boolean resultado;
    EquipamentoDAO equipamentoDAO;
    Equipamento obj;

    public AlocarEquipamentoDAOTeste() throws Exception {
        equipamentoDAO =  new EquipamentoDAO();
    }
    
    @Given("^eu tenho o objeto para alocar equipamento (\\d+)$")
    public void euTenhoOObjeto() throws Throwable {
        obj = new Equipamento();
    }
    
    @When("^eu quero realocar equipamento$")
    public void euQueroRealocar() throws Throwable {
        this.resultado = equipamentoDAO.updateIsAlocado(obj);
    }
    
    @Then("^eu quero validar alocar aquipamento com o resultado boolean (\\d+)$")
    public void euQueroComoResultadoOBoolean(boolean resultadoEXperado) throws Throwable {
        assertThat(resultado, is(resultadoEXperado));
    }
}