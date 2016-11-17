/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.control;

import br.gov.es.cb.sdro.model.Categoria;
import br.gov.es.cb.sdro.model.Status;
import br.gov.es.cb.sdro.model.Tipocombustivel;
import br.gov.es.cb.sdro.model.Tipoviatura;
import br.gov.es.cb.sdro.model.Unidade;
import br.gov.es.cb.sdro.model.Viatura;
import br.gov.es.cb.sdro.util.Sessao;
import br.gov.es.cb.sdro.util.ViaturaDAO;

/**
 *
 * @author ricardo
 */
public class ViaturaControler {
    
    private Sessao sessao;
    private Tipoviatura tipoViatura;
    private Status status;
    private Categoria categoria;
    private Tipocombustivel tipoCombustivel;
    private Unidade unidade;
    
    private ViaturaDAO viaturaDAO;
    
    public ViaturaControler() {
        viaturaDAO = new ViaturaDAO();
        sessao = Sessao.getInstancia();
        unidade = new Unidade();
        tipoViatura = new Tipoviatura();
        status = new Status();
        categoria = new Categoria();
        tipoCombustivel = new Tipocombustivel();
   
    }
    
    
    public void salvarViaturaNoBancoDeDados(int idViatura,int idTipoViatura,int idStatus,int idCategoria, int idTipoCombustivel, String prefixo,
            String placa, String marca, String ano, String modelo, String capPessoas, String capAgua){
        
        Viatura viatura = new Viatura();
        tipoViatura.setIdtipoviatura(idTipoViatura);
        status.setIdstatus(idStatus);
        categoria.setIdcategoria(idCategoria);
        tipoCombustivel.setIdtipocombustivel(idTipoCombustivel);
        unidade.setIdunidade(sessao.getUnidade().getIdunidade());
       
        viatura.setIdunidade(unidade);
        viatura.setIsalocado(false);
        viatura.setIscbmes(false);
        viatura.setPrefixo(prefixo);
        viatura.setPlaca(placa);
        viatura.setMarca(marca);
        viatura.setAno(Integer.parseInt(ano));
        viatura.setModelo(modelo);
        viatura.setCappessoas(Integer.parseInt(capPessoas));
        viatura.setCapagua(Integer.parseInt(capAgua));
        viatura.setIdtipoviatura(tipoViatura);
        viatura.setIdstatus(status);
        viatura.setIdcategoria(categoria);
        viatura.setIdtipocombustivel(tipoCombustivel);
        if(idViatura == 0){
            viaturaDAO.save(viatura); 
        }
        else{
            viatura.setIdviatura(idViatura);
            viaturaDAO.update(viatura);
        }
    }
}
