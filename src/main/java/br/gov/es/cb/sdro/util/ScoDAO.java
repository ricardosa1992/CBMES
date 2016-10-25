/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.util;

import br.gov.es.cb.sdro.model.Sco;
import java.util.List;

/**
 *
 * @author Heitor
 */
public class ScoDAO extends AbstractDAO<Sco>{
    Sco sco;
    List<Sco> listaScos;
    
    public Sco buscaScoPorNome(String nome) {
        busca = "Sco.findByNome";
        parametro = "nome";
        sco = buscaPorString(nome);
        return sco;
    }
    
    public List<Sco> buscaScos(){
        busca = "Sco.findAll";
        listaScos = (List<Sco>) buscaListaSemParametro();
        return listaScos;
    }
}
