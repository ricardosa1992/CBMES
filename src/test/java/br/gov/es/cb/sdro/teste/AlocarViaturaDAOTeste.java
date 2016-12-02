/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.teste;

import br.gov.es.cb.sdro.model.Viatura;
import br.gov.es.cb.sdro.util.AbstractDAO;
import br.gov.es.cb.sdro.util.ViaturaDAO;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author tiagoassun
 */
public class AlocarViaturaDAOTeste extends AbstractDAO<Viatura> {
    private boolean resultado;
    ViaturaDAO viaturaDAO;
    Viatura obj;

    public AlocarViaturaDAOTeste() throws Exception {
        viaturaDAO =  new ViaturaDAO();
    }
    
    @Given("^eu tenho o objeto para alocar viatura (\\d+)$")
    public void euTenhoOObjeto() throws Throwable {
        obj = new Viatura();
    }
    
    @When("^eu quero realocar viatura$")
    public void euQueroRealocar() throws Throwable {
        this.resultado = viaturaDAO.updateIsAlocado(obj);
    }
    
    @Then("^eu quero validar alocar viatura com o resultado boolean (\\d+)$")
    public void euQueroComoResultadoOBoolean(boolean resultadoEXperado) throws Throwable {
        assertThat(resultado, is(resultadoEXperado));
    }
}
