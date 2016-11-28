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
public class EquipeDAO extends AbstractDAO<Equipe> {

    Equipe equipe;
    private List<Equipe> listaEquipes;

    public Equipe buscaEquipePorNome(String nome) {
        busca = "Equipe.findByNome";
        parametro = "nome";
        equipe = buscaPorString(nome);
        return equipe;
    }
    
     public Equipe buscaEquipePorID(int id) {
        busca = "Equipe.findByIdequipe";
        parametro = "idequipe";
        return buscaPorInteger(id);
    }

    public List<Equipe> buscaEquipes() {
        busca = "Equipe.findAll";
        return (List<Equipe>) buscaListaSemParametro();
    }

    public List<Equipe> buscaListaComParametro(int id) {
        busca = "Equipe.findByIdsco";
        query = em.createNamedQuery(busca);
        query.setParameter(parametro, id);
        return query.getResultList();
    }
    
    
    public boolean update(Equipe obj) {
        try {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw ex;
        }
    }

}
