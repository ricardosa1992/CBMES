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
public class Pessoa {
    private String nome;
    private int matricula;
    private boolean isAlocado;
    private ArrayList<Telefone> listTelefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean isIsAlocado() {
        return isAlocado;
    }

    public void setIsAlocado(boolean isAlocado) {
        this.isAlocado = isAlocado;
    }

    public ArrayList<Telefone> getListTelefone() {
        return listTelefone;
    }

    public void setListTelefone(ArrayList<Telefone> listTelefone) {
        this.listTelefone = listTelefone;
    }
}
