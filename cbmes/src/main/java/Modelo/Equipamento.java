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
public class Equipamento {
    private int id;
    private String nome;
    private String marca;
    private boolean isAlocado;
    private Status status;
    private ArrayList<ManutencaoEquipamento> listManutencao;

    public ArrayList<ManutencaoEquipamento> getListManutencao() {
        return listManutencao;
    }

    public void setListManutencao(ArrayList<ManutencaoEquipamento> listManutencao) {
        this.listManutencao = listManutencao;
    }
    
    
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isIsAlocado() {
        return isAlocado;
    }

    public void setIsAlocado(boolean isAlocado) {
        this.isAlocado = isAlocado;
    }
}
