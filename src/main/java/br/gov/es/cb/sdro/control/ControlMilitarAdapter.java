/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.control;

import br.gov.es.cb.sdro.model.MilitarAdapter;
import br.gov.es.cb.sdro.model.SafoFuncionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Heitor
 */
public class ControlMilitarAdapter {

    private List<MilitarAdapter> listTodosMilitar;
    private List<MilitarAdapter> listMilitarPostoGraduacao;
    private List<MilitarAdapter> listMilitarAux;
    private MilitarAdapter militarAux;
    private MilitarAdapter militarAdaptado;

    public ControlMilitarAdapter() {
        militarAdaptado = new MilitarAdapter();
        this.listTodosMilitar = militarAdaptado.getAllMilitarAdapter();
    }

    public List<MilitarAdapter> getMilitarByPostoGraduacao(Integer idpostograduacao) {
        listMilitarAux = new ArrayList<>();
        for (MilitarAdapter mil : listTodosMilitar) {
            if (mil.getPosto_graduacao().equals(idpostograduacao)) {
                listMilitarAux.add(mil);
            }

        }
        return listMilitarAux;
    }

    public MilitarAdapter getMilitarbyId(Integer idMilitar) {
        militarAux = new MilitarAdapter();
        for (MilitarAdapter mil : listTodosMilitar) {
            if (mil.getIdmilitar().equals(idMilitar)) {
                return militarAux = mil;
            }
        }
        return null;
    }
    
    

}
