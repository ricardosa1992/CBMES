/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Heitor
 */
@Entity
@Table(name = "safo_lotacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SafoLotacao.findAll", query = "SELECT s FROM SafoLotacao s"),
    @NamedQuery(name = "SafoLotacao.findByIdlotacao", query = "SELECT s FROM SafoLotacao s WHERE s.idlotacao = :idlotacao"),
    @NamedQuery(name = "SafoLotacao.findByDataUltAlteracao", query = "SELECT s FROM SafoLotacao s WHERE s.dataUltAlteracao = :dataUltAlteracao"),
    @NamedQuery(name = "SafoLotacao.findByUsuarioUltAlteracao", query = "SELECT s FROM SafoLotacao s WHERE s.usuarioUltAlteracao = :usuarioUltAlteracao"),
    @NamedQuery(name = "SafoLotacao.findByVersao", query = "SELECT s FROM SafoLotacao s WHERE s.versao = :versao"),
    @NamedQuery(name = "SafoLotacao.findByAtual", query = "SELECT s FROM SafoLotacao s WHERE s.atual = :atual"),
    @NamedQuery(name = "SafoLotacao.findByDataFim", query = "SELECT s FROM SafoLotacao s WHERE s.dataFim = :dataFim"),
    @NamedQuery(name = "SafoLotacao.findByDataInicio", query = "SELECT s FROM SafoLotacao s WHERE s.dataInicio = :dataInicio"),
    @NamedQuery(name = "SafoLotacao.findBySubstituicao", query = "SELECT s FROM SafoLotacao s WHERE s.substituicao = :substituicao"),
    @NamedQuery(name = "SafoLotacao.findByFuncaoqdi", query = "SELECT s FROM SafoLotacao s WHERE s.funcaoqdi = :funcaoqdi"),
    @NamedQuery(name = "SafoLotacao.findByFuncionario", query = "SELECT s FROM SafoLotacao s WHERE s.funcionario = :funcionario"),
    @NamedQuery(name = "SafoLotacao.findByLocal", query = "SELECT s FROM SafoLotacao s WHERE s.local = :local")})
public class SafoLotacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idlotacao")
    private Integer idlotacao;
    @Basic(optional = false)
    @Column(name = "data_ult_alteracao")
    @Temporal(TemporalType.DATE)
    private Date dataUltAlteracao;
    @Basic(optional = false)
    @Column(name = "usuario_ult_alteracao")
    private String usuarioUltAlteracao;
    @Basic(optional = false)
    @Column(name = "versao")
    private int versao;
    @Basic(optional = false)
    @Column(name = "atual")
    private String atual;
    @Basic(optional = false)
    @Column(name = "data_fim")
    @Temporal(TemporalType.DATE)
    private Date dataFim;
    @Basic(optional = false)
    @Column(name = "data_inicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Basic(optional = false)
    @Column(name = "substituicao")
    private String substituicao;
    @Basic(optional = false)
    @Column(name = "funcaoqdi")
    private int funcaoqdi;
    @Basic(optional = false)
    @Column(name = "funcionario")
    private int funcionario;
    @Basic(optional = false)
    @Column(name = "local")
    private int local;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idlotacao")
    private List<SafoFuncionario> safoFuncionarioList;

    public SafoLotacao() {
    }

    public SafoLotacao(Integer idlotacao) {
        this.idlotacao = idlotacao;
    }

    public SafoLotacao(Integer idlotacao, Date dataUltAlteracao, String usuarioUltAlteracao, int versao, String atual, Date dataFim, Date dataInicio, String substituicao, int funcaoqdi, int funcionario, int local) {
        this.idlotacao = idlotacao;
        this.dataUltAlteracao = dataUltAlteracao;
        this.usuarioUltAlteracao = usuarioUltAlteracao;
        this.versao = versao;
        this.atual = atual;
        this.dataFim = dataFim;
        this.dataInicio = dataInicio;
        this.substituicao = substituicao;
        this.funcaoqdi = funcaoqdi;
        this.funcionario = funcionario;
        this.local = local;
    }

    public Integer getIdlotacao() {
        return idlotacao;
    }

    public void setIdlotacao(Integer idlotacao) {
        this.idlotacao = idlotacao;
    }

    public Date getDataUltAlteracao() {
        return dataUltAlteracao;
    }

    public void setDataUltAlteracao(Date dataUltAlteracao) {
        this.dataUltAlteracao = dataUltAlteracao;
    }

    public String getUsuarioUltAlteracao() {
        return usuarioUltAlteracao;
    }

    public void setUsuarioUltAlteracao(String usuarioUltAlteracao) {
        this.usuarioUltAlteracao = usuarioUltAlteracao;
    }

    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    public String getAtual() {
        return atual;
    }

    public void setAtual(String atual) {
        this.atual = atual;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getSubstituicao() {
        return substituicao;
    }

    public void setSubstituicao(String substituicao) {
        this.substituicao = substituicao;
    }

    public int getFuncaoqdi() {
        return funcaoqdi;
    }

    public void setFuncaoqdi(int funcaoqdi) {
        this.funcaoqdi = funcaoqdi;
    }

    public int getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(int funcionario) {
        this.funcionario = funcionario;
    }

    public int getLocal() {
        return local;
    }

    public void setLocal(int local) {
        this.local = local;
    }

    @XmlTransient
    public List<SafoFuncionario> getSafoFuncionarioList() {
        return safoFuncionarioList;
    }

    public void setSafoFuncionarioList(List<SafoFuncionario> safoFuncionarioList) {
        this.safoFuncionarioList = safoFuncionarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlotacao != null ? idlotacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SafoLotacao)) {
            return false;
        }
        SafoLotacao other = (SafoLotacao) object;
        if ((this.idlotacao == null && other.idlotacao != null) || (this.idlotacao != null && !this.idlotacao.equals(other.idlotacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.gov.es.cb.sdro.model.SafoLotacao[ idlotacao=" + idlotacao + " ]";
    }
    
}
