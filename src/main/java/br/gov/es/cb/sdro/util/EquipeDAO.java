/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.util;

import br.gov.es.cb.sdro.model.Equipe;
import java.util.List;

/**
 *
 * @author Heitor
 */
public class EquipeDAO extends AbstractDAO<Equipe>{
    Equipe equipe;
    List<Equipe> listaEquipes;
    
    public Equipe buscaEquipePorNome(String nome) {
        busca = "Equipe.findByNome";
        parametro = "nome";
        equipe = buscaPorString(nome);
        return equipe;
    }
    
    public List<Equipe> buscaEquipes(){
        busca = "Equipe.findAll";
        listaEquipes = (List<Equipe>) buscaListaSemParametro();
        return listaEquipes;
    }
    
    
}
