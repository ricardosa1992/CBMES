/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.util;

import br.gov.es.cb.sdro.model.Status;
import java.util.List;

/**
 *
 * @author Heitor
 */
public class StatusDAO extends AbstractDAO<Status>{
    Status status;
    List<Status> listaStatuss;
    
    public Status buscaStatusPorNome(String nome) {
        busca = "Status.findByNome";
        parametro = "nome";
        status = buscaPorString(nome);
        return status;
    }
    
    public List<Status> buscaStatuss(){
        busca = "Status.findAll";
        listaStatuss = (List<Status>) buscaListaSemParametro();
        return listaStatuss;
    }
    
    public Status buscaStatusPorID(int id){
        busca =  "Status.findByIdstatus";
        query = em.createNamedQuery(busca);
        query.setParameter("idstatus", id);
        Status obj = (Status) query.getSingleResult();
        return obj;
    }
}
