/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.util;

import br.gov.es.cb.sdro.model.Unidade;

/**
 *
 * @author ricardo
 */
public class Sessao {
  private int tipoLogin;
  private Unidade unidade;
  private static Sessao sessao = null;
  public static Sessao getInstancia() {
        if (sessao == null) {
            sessao = new Sessao();
        }
        return sessao;
    }
     public Sessao() {
        unidade  = new Unidade();
    }
    public int getTipoLogin() {
        return tipoLogin;
    }

    public Unidade getUnidade() {
        return unidade;
    }

   

    public void setTipoLogin(int tipoLogin) {
        this.tipoLogin = tipoLogin;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }
   
  
}
