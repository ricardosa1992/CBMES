/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.util;

import br.gov.es.cb.sdro.model.Categoria;
import java.util.List;

/**
 *
 * @author Heitor
 */
public class CategoriaDAO extends AbstractDAO<Categoria>{
    Categoria categoria;
    List<Categoria> listaCategorias;
    
    public Categoria buscaCategoriaPorNome(String nome) {
        busca = "Categoria.findByNome";
        parametro = "nome";
        categoria = buscaPorString(nome);
        return categoria;
    }
    
    public List<Categoria> buscaCategorias(){
        busca = "Categoria.findAll";
        listaCategorias = (List<Categoria>) buscaListaSemParametro();
        return listaCategorias;
    }
    
     public Categoria buscaCategoriaPorID(int id){
        busca =  "Categoria.findByIdcategoria";
        parametro = "idcategoria";
        return buscaPorInteger(id);
    }
}
