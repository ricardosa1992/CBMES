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
public class Viatura {
    private boolean isAlocado;
    private boolean isCBMS;
    private String prefixo;
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private int capAgua;
    private int capPessoas;
    private boolean isCBMES;
    private Categoria categoria;
    private TipoViatura tipoViatura;
    private TipoCombustivel tipoCombustivel;
    private Status status;
    private ArrayList<Kilometragem> listKM;
    private ArrayList<ManutencaoViatura> listManutencao;
}
