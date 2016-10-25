/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.util;

import br.gov.es.cb.sdro.model.SafoPostoGraducao;
import java.util.List;

/**
 *
 * @author Heitor
 */
public class SafoPostoGraduacaoDAO extends AbstractDAO<SafoPostoGraducao>{
    SafoPostoGraducao safopostograduacao;
    List<SafoPostoGraducao> listaSafoPostoGraducaos;
    
    public SafoPostoGraducao buscaSafoPostoGraducaoPorNome(String nome) {
        busca = "SafoPostoGraducao.findByNome";
        parametro = "nome";
        safopostograduacao = buscaPorString(nome);
        return safopostograduacao;
    }
    
    public List<SafoPostoGraducao> buscaSafoPostoGraducaos(){
        busca = "SafoPostoGraducao.findAll";
        listaSafoPostoGraducaos = (List<SafoPostoGraducao>) buscaListaSemParametro();
        return listaSafoPostoGraducaos;
    }
}
