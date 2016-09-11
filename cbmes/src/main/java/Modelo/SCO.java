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
public class SCO {
    private int id;
    private String nome;
    private Date dataInicio;
    private Date dataFim;

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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public ArrayList<Viatura> getListViaturas() {
        return listViaturas;
    }

    public void setListViaturas(ArrayList<Viatura> listViaturas) {
        this.listViaturas = listViaturas;
    }

    public ArrayList<Militar> getListMilitares() {
        return listMilitares;
    }

    public void setListMilitares(ArrayList<Militar> listMilitares) {
        this.listMilitares = listMilitares;
    }

    public ArrayList<Civil> getListCivis() {
        return listCivis;
    }

    public void setListCivis(ArrayList<Civil> listCivis) {
        this.listCivis = listCivis;
    }

    public ArrayList<Equipamento> getListEquipamentos() {
        return listEquipamentos;
    }

    public void setListEquipamentos(ArrayList<Equipamento> listEquipamentos) {
        this.listEquipamentos = listEquipamentos;
    }

    public ArrayList<RecursoOperacional> getListRecursoOperacional() {
        return listRecursoOperacional;
    }

    public void setListRecursoOperacional(ArrayList<RecursoOperacional> listRecursoOperacional) {
        this.listRecursoOperacional = listRecursoOperacional;
    }

    public Militar getComando() {
        return comando;
    }

    public void setComando(Militar comando) {
        this.comando = comando;
    }

    public Militar getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(Militar operacoes) {
        this.operacoes = operacoes;
    }

    public Militar getPlanejamento() {
        return planejamento;
    }

    public void setPlanejamento(Militar planejamento) {
        this.planejamento = planejamento;
    }

    public Militar getLogistica() {
        return logistica;
    }

    public void setLogistica(Militar logistica) {
        this.logistica = logistica;
    }

    public Militar getAdministracao() {
        return administracao;
    }

    public void setAdministracao(Militar administracao) {
        this.administracao = administracao;
    }
    private String local;
    private ArrayList<Viatura> listViaturas;
    private ArrayList<Militar> listMilitares;
    private ArrayList<Civil> listCivis;
    private ArrayList<Equipamento> listEquipamentos;
    private ArrayList<RecursoOperacional> listRecursoOperacional;
    private Militar comando;
    private Militar operacoes;
    private Militar planejamento;
    private Militar logistica;
    private Militar administracao;
}
