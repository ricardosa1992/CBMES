/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.util;

import java.util.List;

/**
 *
 * @author Heitor
 * @param <T>
 */

public interface DAO<T> {
    public boolean save(T objeto);

   
    public boolean remove(T objeto);
    public T buscaPorString(String palavraChave);
    public List buscaListaSemParametro();
    public List buscaListaComParametro(Object objeto);
}