/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.util;

import br.gov.es.cb.sdro.model.Unidade;
import br.gov.es.cb.sdro.model.Viatura;
import java.util.List;
import javax.persistence.EntityExistsException;

/**
 *
 * @author Heitor
 */
public class ViaturaDAO extends AbstractDAO<Viatura> {

    Viatura viatura;
    List<Viatura> listaViaturas;

    public Viatura buscaViaturaPorNome(String nome) {
        busca = "Viatura.findByNome";
        parametro = "nome";
        viatura = buscaPorString(nome);
        return viatura;
    }

    public List<Viatura> buscaViaturas() {
        busca = "Viatura.findAll";
        listaViaturas = (List<Viatura>) buscaListaSemParametro();
        return listaViaturas;
    }

    public List<Viatura> buscaViaturasDisponiveisUnidade(Unidade unidade) {
        Unidade un = new Unidade();
        busca = "Viatura.findAllDisponiveis";
        parametro = "idUnidade";
        query = em.createNamedQuery(busca);
        query.setParameter(parametro, unidade);
        List<Viatura> listaViaturas = query.getResultList();;
        return listaViaturas;
    }

    public Viatura buscaViaturaPorID(int id) {
        busca = "Viatura.findByIdviatura";
        parametro = "idviatura";
        return buscaPorInteger(id);
    }

    public boolean update(Viatura obj) {
        try {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        }
        return false;
    }

    @Override
    public boolean remove(Viatura obj) {
        try {
            em.getTransaction().begin();
            obj = em.find(obj.getClass(), obj.getIdviatura());
            em.remove(obj);
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        }
        return false;
    }

    public boolean updateIsAlocado(Viatura obj) {
        try {
            em.getTransaction().begin();
//                       obj = em.find(obj.getClass(), obj.getIdviatura());
            busca = "Viatura.UpdateIsAlocado";
            query = em.createNamedQuery(busca);
            parametro = "idviatura";
            query.setParameter(parametro, obj.getIdviatura());
            query.executeUpdate();
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        }
        return false;
    }

    public List<Viatura> buscaViaturasAlocadas(Unidade unidade) {
        busca = "Viatura.findAllAlocadas";
        parametro = "idUnidade";
        query = em.createNamedQuery(busca);
        query.setParameter(parametro, unidade);
        List<Viatura> listaViaturas = query.getResultList();;
        return listaViaturas;
    }

    public boolean liberaViatura(Viatura obj) {

        try {
            em.getTransaction().begin();
            busca = "Viatura.liberaViatura";
            query = em.createNamedQuery(busca);
            parametro = "idviatura";
            query.setParameter(parametro, obj.getIdviatura());
            query.executeUpdate();
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
        return false;
    }
}
