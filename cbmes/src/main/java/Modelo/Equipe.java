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
class Equipe {
    private int id;
    private Date data;
    private ArrayList<Militar> listMilitares;

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

    public ArrayList<Militar> getListMilitares() {
        return listMilitares;
    }

    public void setListMilitares(ArrayList<Militar> listMilitares) {
        this.listMilitares = listMilitares;
    }
}
