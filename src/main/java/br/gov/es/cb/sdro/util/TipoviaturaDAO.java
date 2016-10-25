/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.util;

import br.gov.es.cb.sdro.model.Tipoviatura;
import java.util.List;

/**
 *
 * @author Heitor
 */
public class TipoviaturaDAO extends AbstractDAO<Tipoviatura>{
    Tipoviatura tipoviatura;
    List<Tipoviatura> listaTipoviaturas;
    
    public Tipoviatura buscaTipoviaturaPorNome(String nome) {
        busca = "Tipoviatura.findByNome";
        parametro = "nome";
        tipoviatura = buscaPorString(nome);
        return tipoviatura;
    }
    
    public List<Tipoviatura> buscaTipoviaturas(){
        busca = "Tipoviatura.findAll";
        listaTipoviaturas = (List<Tipoviatura>) buscaListaSemParametro();
        return listaTipoviaturas;
    }
      public Tipoviatura buscaTipoViaturaPorID(int id){
        busca =  "Tipoviatura.findByIdtipoviatura";
        parametro = "idtipoviatura";
        return buscaPorInteger(id);
    }
    
}
