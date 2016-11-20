/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.util;

import br.gov.es.cb.sdro.model.Equipamento;
import br.gov.es.cb.sdro.model.Unidade;
import br.gov.es.cb.sdro.model.Viatura;
import java.util.List;

/**
 *
 * @author Heitor
 */
public class EquipamentoDAO extends AbstractDAO<Equipamento> {

    Equipamento equipamento;
    private List<Equipamento> listaEquipamentos;
    String paramentroIdEquipamento;

    public EquipamentoDAO() {
        paramentroIdEquipamento = "idequipamento";
    }
    
    

    public Equipamento buscaEquipamentoPorNome(String nome) {
        busca = "Equipamento.findByNome";
        parametro = "nome";
        equipamento = buscaPorString(nome);
        return equipamento;
    }

    public List<Equipamento> buscaEquipamentos() {
        busca = "Equipamento.findAll";
        listaEquipamentos = (List<Equipamento>) buscaListaSemParametro();
        return listaEquipamentos;
    }

    public List<Equipamento> buscaEquipamentosDisponiveis() {
        busca = "Equipamento.findAllDisponiveis";
        listaEquipamentos = (List<Equipamento>) buscaListaSemParametro();
        return listaEquipamentos;
    }

    @Override
    public void remove(Equipamento equipamentoRemover) {
        try {
            em.getTransaction().begin();
            Equipamento obj = em.find(equipamentoRemover.getClass(), equipamentoRemover.getIdequipamento());
            em.remove(obj);

            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw ex;
        }

    }

    public boolean update(Equipamento obj) {
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

    public Equipamento buscaEquipamentoPorID(int id) {
        busca = "Equipamento.findByIdequipamento";
        parametro = paramentroIdEquipamento;
        return buscaPorInteger(id);
    }

    public boolean updateIsAlocado(Equipamento obj) {
        try {
            em.getTransaction().begin();
            busca = "Equipamento.UpdateEstadoEquipamento";
            query = em.createNamedQuery(busca);
            String parametro1 = "idviatura";
            String parametro2 = paramentroIdEquipamento;
            query.setParameter(parametro1, obj.getIdviatura());
            query.setParameter(parametro2, obj.getIdequipamento());
            query.executeUpdate();
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw ex;
        }
    }

    public boolean liberaEquipamento(Equipamento obj) {
        try {
            em.getTransaction().begin();
            busca = "Equipamento.liberaEquipamento";
            query = em.createNamedQuery(busca);
            String parametro2 = paramentroIdEquipamento;
            query.setParameter(parametro2, obj.getIdequipamento());
            query.executeUpdate();
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw ex;
        }
    }

    public List<Equipamento> buscaEquipamentosAlocadosViatura(Viatura viatura) {
        busca = "Equipamento.findAllAlocadosViatura";
        parametro = "idViatura";
        query = em.createNamedQuery(busca);
        query.setParameter(parametro, viatura);
        return query.getResultList();
    }

    @SuppressWarnings("empty-statement")
    public List<Equipamento> buscaEquipamentosDisponiveisUnidade(Unidade unidade) {
        busca = "Equipamento.findAllDisponiveisUnidade";
        parametro = "idUnidade";
        query = em.createNamedQuery(busca);
        query.setParameter(parametro, unidade);
        return query.getResultList();
    }

}
