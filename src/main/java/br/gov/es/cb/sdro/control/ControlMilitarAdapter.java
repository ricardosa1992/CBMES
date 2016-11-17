/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.control;

import br.gov.es.cb.sdro.model.MilitarAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Heitor
 */
public class ControlMilitarAdapter {

    List<MilitarAdapter> listTodosMilitar;
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
