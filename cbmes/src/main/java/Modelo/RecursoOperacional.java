/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Patrícia
 */
public class RecursoOperacional {
    private int id;
    private Date dataInicio;
    private Date dataFim;
    private ArrayList<Equipe> listEquipe;
    private ArrayList<Equipamento> listEquipamentos;
    private ArrayList<Viatura> listViaturas;
    private ArrayList<Empenho> listEmpenho;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public ArrayList<Equipe> getListEquipe() {
        return listEquipe;
    }

    public void setListEquipe(ArrayList<Equipe> listEquipe) {
        this.listEquipe = listEquipe;
    }

    public ArrayList<Equipamento> getListEquipamentos() {
        return listEquipamentos;
    }

    public void setListEquipamentos(ArrayList<Equipamento> listEquipamentos) {
        this.listEquipamentos = listEquipamentos;
    }

    public ArrayList<Viatura> getListViaturas() {
        return listViaturas;
    }

    public void setListViaturas(ArrayList<Viatura> listViaturas) {
        this.listViaturas = listViaturas;
    }

    public ArrayList<Empenho> getListEmpenho() {
        return listEmpenho;
    }

    public void setListEmpenho(ArrayList<Empenho> listEmpenho) {
        this.listEmpenho = listEmpenho;
    }
}
