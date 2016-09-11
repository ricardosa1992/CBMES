/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Patrícia
 */
public class Unidade {
    private int id;
    private String nome;
    private Militar comandate;
    private Militar subComandante;
    private ArrayList<RecursoOperacional> listRecursoOperacional;
    private ArrayList<Equipamento> listEquipamentos;
    private ArrayList<Militar> listMilitar;
    private ArrayList<Civil> listCivil;
    private ArrayList<Viatura> listViaturas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Militar getComandate() {
        return comandate;
    }

    public void setComandate(Militar comandate) {
        this.comandate = comandate;
    }

    public Militar getSubComandante() {
        return subComandante;
    }

    public void setSubComandante(Militar subComandante) {
        this.subComandante = subComandante;
    }

    public ArrayList<RecursoOperacional> getListRecursoOperacional() {
        return listRecursoOperacional;
    }

    public void setListRecursoOperacional(ArrayList<RecursoOperacional> listRecursoOperacional) {
        this.listRecursoOperacional = listRecursoOperacional;
    }

    public ArrayList<Equipamento> getListEquipamentos() {
        return listEquipamentos;
    }

    public void setListEquipamentos(ArrayList<Equipamento> listEquipamentos) {
        this.listEquipamentos = listEquipamentos;
    }

    public ArrayList<Militar> getListMilitar() {
        return listMilitar;
    }

    public void setListMilitar(ArrayList<Militar> listMilitar) {
        this.listMilitar = listMilitar;
    }

    public ArrayList<Civil> getListCivil() {
        return listCivil;
    }

    public void setListCivil(ArrayList<Civil> listCivil) {
        this.listCivil = listCivil;
    }

    public ArrayList<Viatura> getListViaturas() {
        return listViaturas;
    }

    public void setListViaturas(ArrayList<Viatura> listViaturas) {
        this.listViaturas = listViaturas;
    }
}
