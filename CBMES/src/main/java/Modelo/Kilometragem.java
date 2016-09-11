/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Patrícia
 */
public class Kilometragem {
    private int id;
    private int kmInicial;
    private int kmFinal;
    private Date dataInicio;
    private Date dataFinal;
    private int idPessoa;
    private String destino;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(int kmInicial) {
        this.kmInicial = kmInicial;
    }

    public int getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(int kmFinal) {
        this.kmFinal = kmFinal;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    
}
