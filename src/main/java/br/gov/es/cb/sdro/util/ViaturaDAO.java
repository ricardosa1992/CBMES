/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.util;

import br.gov.es.cb.sdro.model.Unidade;
import br.gov.es.cb.sdro.model.Viatura;
import java.util.List;

/**
 *
 * @author Heitor
 */
public class ViaturaDAO extends AbstractDAO<Viatura> {

    Viatura viatura;
    String parametroId;

    public ViaturaDAO() {
        parametroId = "idviatura";
    }
    
    

    public Viatura buscaViaturaPorNome(String nome) {
        busca = "Viatura.findByNome";
        parametro = "nome";
        viatura = buscaPorString(nome);
        return viatura;
    }

    public List<Viatura> buscaViaturas() {
        busca = "Viatura.findAll";
        return (List<Viatura>) buscaListaSemParametro();
    }
    
    public List<Viatura> buscaViaturasDisponiveis() {
        busca = "Viatura.todasDisponiveis";
        return (List<Viatura>) buscaListaSemParametro();
    }

    public List<Viatura> buscaViaturasDisponiveisUnidade(Unidade unidade) {
        busca = "Viatura.findAllDisponiveis";
        parametro = "idUnidade";
        query = em.createNamedQuery(busca);
        query.setParameter(parametro, unidade);
        return query.getResultList();
    }

    public Viatura buscaViaturaPorID(int id) {
        busca = "Viatura.findByIdviatura";
        parametro = parametroId;
        return buscaPorInteger(id);
    }

    public boolean update(Viatura obj) {
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

    @Override
    public void remove(Viatura obj) {
        try {
            em.getTransaction().begin();
            Viatura viaturaResult = em.find(obj.getClass(), obj.getIdviatura());
            em.remove(viaturaResult);
            em.getTransaction().commit();
           
        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw ex;
        }
       
    }

    public boolean updateIsAlocado(Viatura obj) {
        try {
            em.getTransaction().begin();
            busca = "Viatura.UpdateIsAlocado";
            query = em.createNamedQuery(busca);
            parametro = parametroId;
            query.setParameter(parametro, obj.getIdviatura());
            query.executeUpdate();
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw ex;
        }
    }
    
     public boolean alocaViaturaSCO(Viatura obj) {
        try {
            em.getTransaction().begin();
            busca = "Viatura.AlocarViaturaSCO";
            query = em.createNamedQuery(busca);
            parametro = parametroId;
            String parametro2 = "idsco";
            query.setParameter(parametro, obj.getIdviatura());
            query.setParameter(parametro2, obj.getIdsco());
            query.executeUpdate();
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw ex;
        }
    }

    public List<Viatura> buscaViaturasAlocadas(Unidade unidade) {
        busca = "Viatura.findAllAlocadas";
        parametro = "idUnidade";
        query = em.createNamedQuery(busca);
        query.setParameter(parametro, unidade);
        return query.getResultList();
    }

    public boolean liberaViatura(Viatura obj) {

        try {
            em.getTransaction().begin();
            busca = "Viatura.liberaViatura";
            query = em.createNamedQuery(busca);
            parametro = parametroId;
            query.setParameter(parametro, obj.getIdviatura());
            query.executeUpdate();
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw ex;
        }
    }
}
