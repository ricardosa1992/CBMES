/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.control;

import br.gov.es.cb.sdro.model.Equipe;
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
    
    public List<Militar> listaMilitaresAlocados(Unidade unidade){
        return militarDAO.buscaMilitaresAlocadosUnidade(unidade);
    }
    
    public void alocarMilitar(Militar obj){
        militarDAO.alocarMilitarUnidade(obj);
    }
    
    public void liberarMilitar(Militar obj){
        militarDAO.liberarMilitarUnidade(obj);
    }
    
    public List<Militar> listaMilitaresAlocadosEquipe(Equipe obj){
        return militarDAO.listaMilitaresAlocadosEquipe(obj);
    }
    
    public void removeMiltarEquipe(int id){
        Militar militar = new Militar();
        militar.setIdmilitar(id);
        militarDAO.removeMiltarEquipe(militar);
    }
    
    
}
