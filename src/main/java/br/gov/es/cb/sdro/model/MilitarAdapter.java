/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.model;

import br.gov.es.cb.sdro.util.MilitarDAO;
import br.gov.es.cb.sdro.util.SafoFuncionarioDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Heitor
 */
public class MilitarAdapter {

    private MilitarDAO militarDAO;
    private SafoFuncionarioDAO safoFuncionarioDAO;

    private Integer idmilitar;
    private Boolean isalocado;
    private Equipe idequipe;
    private Unidade idUnidade;
    private String celular;
    private String categoriacnh;
    private String nome;
    private String nome_guerra;
    private String numero_funcional;
    private Integer posto_graduacao;

    public MilitarAdapter() {
        this.militarDAO = new MilitarDAO();
        this.safoFuncionarioDAO = new SafoFuncionarioDAO();
    }

    public MilitarAdapter getMilitarById(Integer id) {
        MilitarAdapter militarAdaptado = new MilitarAdapter();

        Militar militarConsult = militarDAO.buscaMilitarPorId(id);
        if (militarConsult != null) {
            SafoFuncionario safofuncionarioConsult = safoFuncionarioDAO.buscaSafoFuncionarioPorId(id);
            if (safoFuncionarioDAO != null) {
                //seta dados do banco de militar
                militarAdaptado.setIsalocado(militarConsult.getIsalocado());
                militarAdaptado.setIdmilitar(militarConsult.getIdmilitar());
                militarAdaptado.setIdUnidade(militarConsult.getIdunidade());
                militarAdaptado.setIdequipe(militarConsult.getIdequipe());

                //seta dados do banco de safo_funcionario
                militarAdaptado.setCategoriacnh(safofuncionarioConsult.getCategoriacnh());
                militarAdaptado.setCelular(safofuncionarioConsult.getFone());
                militarAdaptado.setNome(safofuncionarioConsult.getNome());
                militarAdaptado.setNome_guerra(safofuncionarioConsult.getNomeGuerra());
                militarAdaptado.setNumero_funcional(safofuncionarioConsult.getNumeroFuncional());
                militarAdaptado.setPosto_graduacao(safofuncionarioConsult.getIdpostograducao().getIdpostograducao());

                return militarAdaptado;
            }
        }
        return null;
    }

    public List<MilitarAdapter> getListMilitarByIdPostoGraduacao(Integer id) {
        MilitarAdapter militarAux = new MilitarAdapter();
        int contador = 1;
        List<MilitarAdapter> listaReturn = new ArrayList<>();

        while (getMilitarById(contador) != null) {
            if (getMilitarById(contador).getPosto_graduacao().equals(id)) {
                listaReturn.add(getMilitarById(contador));
            }
            contador++;
        }
        //System.out.println("\n");
        return listaReturn;
    }

    public List<MilitarAdapter> getAllMilitarAdapter() {
        int contador = 1;
        List<MilitarAdapter> listaReturn = new ArrayList<>();
        while (getMilitarById(contador) != null) {
        
        /*
        ########################################
        ########################################
        ############   REMOVER   ###############
        ########################################
        ########################################
        
        
        */
        
        //reduz consulta militar pra 100 pela demora de consulta
        //while (contador < 300) {
            //System.out.println(contador);
            listaReturn.add(getMilitarById(contador));
            contador++;
        }
        //System.out.println("\n");
        return listaReturn;
    }

    /*
     public List<MilitarAdapter> getMilitarAdapterbyPostoGraduacao() {
     int contador = 1;
     List<MilitarAdapter> listaReturn = new ArrayList<>();
     while (getMilitarById(contador) != null) {
     System.out.println(contador);
     listaReturn.add(getMilitarById(contador));
     contador++;
     }
     System.out.println("\n");
     return listaReturn;
     }
     */
    @Override
    public String toString() {
        return "MilitarAdapter{" + "idmilitar=" + idmilitar + ", isalocado=" + isalocado + ", idequipe=" + idequipe + ", idUnidade=" + idUnidade + ", celular=" + celular + ", categoriacnh=" + categoriacnh + ", nome=" + nome + ", nome_guerra=" + nome_guerra + ", numero_funcional=" + numero_funcional + ", posto_graduacao=" + posto_graduacao + '}';
    }

    //Getters e setters
    public MilitarDAO getMilitarDAO() {
        return militarDAO;
    }

    public void setMilitarDAO(MilitarDAO militarDAO) {
        this.militarDAO = militarDAO;
    }

    public SafoFuncionarioDAO getSafoFuncionarioDAO() {
        return safoFuncionarioDAO;
    }

    public void setSafoFuncionarioDAO(SafoFuncionarioDAO safoFuncionarioDAO) {
        this.safoFuncionarioDAO = safoFuncionarioDAO;
    }

    public Integer getIdmilitar() {
        return idmilitar;
    }

    public void setIdmilitar(Integer idmilitar) {
        this.idmilitar = idmilitar;
    }

    public Boolean getIsalocado() {
        return isalocado;
    }

    public void setIsalocado(Boolean isalocado) {
        this.isalocado = isalocado;
    }

    public Equipe getIdequipe() {
        return idequipe;
    }

    public void setIdequipe(Equipe idequipe) {
        this.idequipe = idequipe;
    }

    public Unidade getIdUnidade() {
        return idUnidade;
    }

    public void setIdUnidade(Unidade idUnidade) {
        this.idUnidade = idUnidade;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCategoriacnh() {
        return categoriacnh;
    }

    public void setCategoriacnh(String categoriacnh) {
        this.categoriacnh = categoriacnh;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_guerra() {
        return nome_guerra;
    }

    public void setNome_guerra(String nome_guerra) {
        this.nome_guerra = nome_guerra;
    }

    public String getNumero_funcional() {
        return numero_funcional;
    }

    public void setNumero_funcional(String numero_funcional) {
        this.numero_funcional = numero_funcional;
    }

    public Integer getPosto_graduacao() {
        return posto_graduacao;
    }

    public void setPosto_graduacao(Integer posto_graduacao) {
        this.posto_graduacao = posto_graduacao;
    }
}
