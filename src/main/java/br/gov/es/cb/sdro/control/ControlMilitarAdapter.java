/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.control;

import br.gov.es.cb.sdro.model.MilitarAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Heitor
 */
public class ControlMilitarAdapter implements Serializable {

    protected transient EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.gov.es.cb_sdro-desk_jar_1.0-SNAPSHOTPU");
    protected transient EntityManager em = emf.createEntityManager();
    protected transient Query query;
    protected transient String busca;
    protected transient String parametro;
    
    
    private List<MilitarAdapter> listTodosMilitar;
    MilitarAdapter militarAdaptado;

    public ControlMilitarAdapter() {
        militarAdaptado = new MilitarAdapter();
        this.listTodosMilitar = militarAdaptado.getAllMilitarAdapter();
    }

    public List<MilitarAdapter> getMilitarByPostoGraduacao(Integer idpostograduacao) {
        List<MilitarAdapter> listMilitarAux = new ArrayList<>();
        for (MilitarAdapter mil : listTodosMilitar) {
            if (mil.getPostoGraduacao().equals(idpostograduacao)) {
                listMilitarAux.add(mil);
            }

        }
        return listMilitarAux;
    }

    public MilitarAdapter getMilitarbyId(Integer idMilitar) {
        for (MilitarAdapter mil : listTodosMilitar) {
            if (mil.getIdmilitar().equals(idMilitar)) {
                return mil;
            }
        }
        return null;
    }
    

}
