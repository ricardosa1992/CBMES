
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
    private String nomeGuerra;
    private String numeroFuncional;
    private Integer postoGraduacao;

    public MilitarAdapter() {
        this.militarDAO = new MilitarDAO();
        this.safoFuncionarioDAO = new SafoFuncionarioDAO();
    }

    public MilitarAdapter getMilitarById(Integer id) {
        MilitarAdapter militarAdaptado = new MilitarAdapter();

        Militar militarConsult = militarDAO.buscaMilitarPorId(id);
        if (militarConsult != null) {
            SafoFuncionario safofuncionarioConsult = safoFuncionarioDAO.buscaSafoFuncionarioPorId(id);
            if (safofuncionarioConsult != null) {
                //seta dados do banco de militar
                militarAdaptado.setIsalocado(militarConsult.getIsalocado());
                militarAdaptado.setIdmilitar(militarConsult.getIdmilitar());
                militarAdaptado.setIdUnidade(militarConsult.getIdunidade());
                militarAdaptado.setIdequipe(militarConsult.getIdequipe());

                //seta dados do banco de safo_funcionario
                militarAdaptado.setCategoriacnh(safofuncionarioConsult.getCategoriacnh());
                militarAdaptado.setCelular(safofuncionarioConsult.getFone());
                militarAdaptado.setNome(safofuncionarioConsult.getNome());
                militarAdaptado.setNomeGuerra(safofuncionarioConsult.getNomeGuerra());
                militarAdaptado.setNumeroFuncional(safofuncionarioConsult.getNumeroFuncional());
                militarAdaptado.setPostoGraduacao(safofuncionarioConsult.getIdpostograducao().getIdpostograducao());

                return militarAdaptado;
            }
        }
        return null;
    }

    public List<MilitarAdapter> getListMilitarByIdPostoGraduacao(Integer id) {
        int contador = 1;
        List<MilitarAdapter> listaReturn = new ArrayList<>();

        while (getMilitarById(contador) != null) {
            if (getMilitarById(contador).getPostoGraduacao().equals(id)) {
                listaReturn.add(getMilitarById(contador));
            }
            contador++;
        }
        return listaReturn;
    }

    public List<MilitarAdapter> getAllMilitarAdapter() {
        int contador = 1;
        List<MilitarAdapter> listaReturn = new ArrayList<>();
        while (getMilitarById(contador) != null) {
        
        //reduz consulta militar pra 100 pela demora de consulta
       
            listaReturn.add(getMilitarById(contador));
            contador++;
        }
        return listaReturn;
    }

    @Override
    public String toString() {
        return "MilitarAdapter{" + "idmilitar=" + idmilitar + ", isalocado=" + isalocado + ", idequipe=" + idequipe + ", idUnidade=" + idUnidade + ", celular=" + celular + ", categoriacnh=" + categoriacnh + ", nome=" + nome + ", nome_guerra=" + nomeGuerra + ", numero_funcional=" + numeroFuncional + ", posto_graduacao=" + postoGraduacao + '}';
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

    public String getNomeGuerra() {
        return nomeGuerra;
    }

    public void setNomeGuerra(String nomeGuerra) {
        this.nomeGuerra = nomeGuerra;
    }

    public String getNumeroFuncional() {
        return numeroFuncional;
    }

    public void setNumeroFuncional(String numeroFuncional) {
        this.numeroFuncional = numeroFuncional;
    }

    public Integer getPostoGraduacao() {
        return postoGraduacao;
    }

    public void setPostoGraduacao(Integer postoGraduacao) {
        this.postoGraduacao = postoGraduacao;
    }
}
