/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.util;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class AbstractDAO<T> implements DAO<T> {

    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.gov.es.cb_sdro-desk_jar_1.0-SNAPSHOTPU");
    protected EntityManager em = emf.createEntityManager();
    protected Query query;
    protected String busca;
    protected String parametro;

    @Override
    public boolean save(T objeto){
        try {
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw ex;
        }
    }

    @Override
    public T buscaPorString(String palavraChave) {
        query = em.createNamedQuery(busca);
        query.setParameter(parametro, palavraChave);
        return (T) query.getSingleResult();
    }

    public T buscaPorInteger(Integer integer) {
        query = em.createNamedQuery(busca);
        query.setParameter(parametro, integer);
        return (T) query.getSingleResult();
    }

    @Override
    public List buscaListaSemParametro() {
        query = em.createNamedQuery(busca);
        return query.getResultList();
    }

    @Override
    public List buscaListaComParametro(Object objeto) {
        query = em.createNamedQuery(busca);
        query.setParameter(parametro, objeto);
        return query.getResultList();
    }

    @Override
    public void remove(T objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
