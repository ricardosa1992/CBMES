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
    
    public List<Militar> listaMilitaresDisponiveisUnidade(Unidade unidade){
        return militarDAO.buscaMilitaresDisponiveisUnidade(unidade);
        
    }
    
    public List<Militar> listaMilitaresDisponiveis(){
        return militarDAO.buscaMilitaresDisponiveis();
        
    }
    
    public List<Militar> listaMilitaresAlocados(Unidade unidade){
        return militarDAO.buscaMilitaresAlocadosUnidade(unidade);
    }
    
    public boolean alocarMilitar(Militar obj){
        return militarDAO.alocarMilitarUnidade(obj);
    }
    
    public boolean liberarMilitar(Militar obj){
        return militarDAO.liberarMilitarUnidade(obj);
    }
    
    public List<Militar> listaMilitaresAlocadosEquipe(Equipe obj){
        return militarDAO.listaMilitaresAlocadosEquipe(obj);
    }
    
    public void removeMiltarEquipe(int id){
        Militar militar = new Militar();
        militar.setIdmilitar(id);
        militarDAO.removeMiltarEquipe(militar);
    }
    
    public void alocarMiltarEquipe(Militar obj){
        militarDAO.alocarMiltarEquipe(obj);
    }
    
    
    
    
}
