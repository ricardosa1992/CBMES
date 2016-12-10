/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.util;

import br.gov.es.cb.sdro.model.Equipe;
import br.gov.es.cb.sdro.model.Militar;
import br.gov.es.cb.sdro.model.Unidade;
import java.util.List;

/**
 *
 * @author Heitor
 */
public class MilitarDAO extends AbstractDAO<Militar> {

    Militar militar;
    private List<Militar> listaMilitars;
    String parametroId;

    public MilitarDAO() {
        parametroId = "idmilitar";
    
    }
    
    
    public Militar buscaMilitarPorNome(String nome) {
        busca = "Militar.findByNome";
        parametro = "nome";
        militar = buscaPorString(nome);
        return militar;
    }

    public List<Militar> buscaMilitars() {
        busca = "Militar.findAll";
        listaMilitars = (List<Militar>) buscaListaSemParametro();
        return listaMilitars;
    }
     public List<Militar> buscaMilitaresDisponiveisUnidade(Unidade unidade) {
        busca = "Militar.disponiveisUnidade";
        parametro = "idunidade";
        query = em.createNamedQuery(busca);
        query.setParameter(parametro, unidade);
        return query.getResultList();
    }
     
      public List<Militar> buscaMilitaresDisponiveis() {
        busca = "Militar.disponiveis";
        query = em.createNamedQuery(busca);
        return query.getResultList();
    }
    
    public List<Militar> buscaMilitarsPorGraducao(String nome) {
        busca = "Militar.findByPostoGraducao";
        parametro = "idgraducao";
        listaMilitars = (List<Militar>) buscaListaComParametro(nome);
        return listaMilitars;
    }

    public Militar buscaMilitarPorId(Integer id){
        try{
        busca = "Militar.findByIdmilitar";
        parametro = "idmilitar";
        militar = buscaPorInteger(id);
        return militar;
        }
        catch(Exception e){
            return null;
        }
    }

    public List<Militar> buscaMilitaresAlocadosUnidade(Unidade unidade) {
        busca = "Militar.alocadosUnidade";
        parametro = "idunidade";
        query = em.createNamedQuery(busca);
        query.setParameter(parametro, unidade);
        return query.getResultList();
    }

    public boolean alocarMilitarUnidade(Militar obj) {
        
        try {
            em.getTransaction().begin();
            busca = "Militar.alocarMilitar";
            query = em.createNamedQuery(busca);
            parametro = parametroId;
            query.setParameter(parametro, obj.getIdmilitar());
            query.executeUpdate();
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw ex;
        }
    }

    public boolean liberarMilitarUnidade(Militar obj) {
       try {
            em.getTransaction().begin();
            busca = "Militar.liberarMilitar";
            query = em.createNamedQuery(busca);
            parametro = parametroId;
            query.setParameter(parametro, obj.getIdmilitar());
            query.executeUpdate();
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw ex;
        }
    }

    public List<Militar> listaMilitaresAlocadosEquipe(Equipe obj) {
        busca = "Militar.alocadosEquipe";
        parametro = "idequipe";
        query = em.createNamedQuery(busca);
        query.setParameter(parametro, obj);
        return query.getResultList();
    }
    
    

    public void removeMiltarEquipe(Militar obj) {
         try {
            em.getTransaction().begin();
            busca = "Militar.liberarMilitarEquipe";
            query = em.createNamedQuery(busca);
            parametro = parametroId;
            query.setParameter(parametro, obj.getIdmilitar());
            query.executeUpdate();
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw ex;
        }
    }

    public void alocarMiltarEquipe(Militar obj) {
        try {
            em.getTransaction().begin();
            busca = "Militar.alocarMilitarEquipe";
            query = em.createNamedQuery(busca);
            String parametro1 = "idequipe";
            String parametro2 = "idmilitar";
            query.setParameter(parametro1, obj.getIdequipe());
            query.setParameter(parametro2, obj.getIdmilitar());
            query.executeUpdate();
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw ex;
        }
    }
    
}
