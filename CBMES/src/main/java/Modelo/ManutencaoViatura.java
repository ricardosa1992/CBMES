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
public class ManutencaoViatura {
   private int id;
   private Date data;
   private String motivo;
   private String numeroOS;
   private String itensOS;
   private String observacoes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getNumeroOS() {
        return numeroOS;
    }

    public void setNumeroOS(String numeroOS) {
        this.numeroOS = numeroOS;
    }

    public String getItensOS() {
        return itensOS;
    }

    public void setItensOS(String itensOS) {
        this.itensOS = itensOS;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
