/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.control;

import br.gov.es.cb.sdro.model.Militar;
import br.gov.es.cb.sdro.model.Unidade;
import br.gov.es.cb.sdro.util.MilitarDAO;
import java.util.List;

/**
 *
 * @author ricardo
 */
public class MilitarControler {
    MilitarDAO militarDAO;

    public MilitarControler() {
        militarDAO = new MilitarDAO();
    
    }
    
    public List<Militar> listaMilitaresDisponiveis(Unidade unidade){
        return militarDAO.buscaMilitaresDisponiveisUnidade(unidade);
        
    }
    
    
}
