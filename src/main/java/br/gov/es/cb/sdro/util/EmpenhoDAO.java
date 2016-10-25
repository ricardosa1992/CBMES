/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.util;

import br.gov.es.cb.sdro.model.Empenho;
import java.util.List;

/**
 *
 * @author Heitor
 */
public class EmpenhoDAO  extends AbstractDAO<Empenho>{
    Empenho empenho;
    List<Empenho> listaEmpenhos;
    
    public Empenho buscaEmpenhoPorNome(String nome) {
        busca = "Empenho.findByNome";
        parametro = "nome";
        empenho = buscaPorString(nome);
        return empenho;
    }
    
    public List<Empenho> buscaEmpenhos(){
        busca = "Empenho.findAll";
        listaEmpenhos = (List<Empenho>) buscaListaSemParametro();
        return listaEmpenhos;
    }
}
