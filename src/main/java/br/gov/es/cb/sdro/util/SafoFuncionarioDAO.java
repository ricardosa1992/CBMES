/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.util;

import br.gov.es.cb.sdro.model.SafoFuncionario;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author Heitor
 */
public class SafoFuncionarioDAO extends AbstractDAO<SafoFuncionario> {

    SafoFuncionario safofuncionario;
    List<SafoFuncionario> listaSafoFuncionarios;

    public SafoFuncionario buscaSafoFuncionarioPorNome(String nome) {
        busca = "SafoFuncionario.findByNome";
        parametro = "nome";
        safofuncionario = buscaPorString(nome);
        return safofuncionario;
    }

    public List<SafoFuncionario> buscaSafoFuncionarios() {
        busca = "SafoFuncionario.findAll";
        listaSafoFuncionarios = (List<SafoFuncionario>) buscaListaSemParametro();
        return listaSafoFuncionarios;
    }

    public List<SafoFuncionario> buscaSafoFuncionariosPorGraducao(String nome) {
        busca = "SafoFuncionario.findByPostoGraducao";
        parametro = "idgraducao";
        listaSafoFuncionarios = (List<SafoFuncionario>) buscaListaComParametro(nome);
        return listaSafoFuncionarios;
    }

    public SafoFuncionario buscaSafoFuncionarioPorId(Integer id) {
        try {
            busca = "SafoFuncionario.findByIdfuncionario";
            parametro = "idfuncionario";
            safofuncionario = buscaPorInteger(id);
            return safofuncionario;
        } catch (NoResultException e) {
            throw e;
        }
    }
}
