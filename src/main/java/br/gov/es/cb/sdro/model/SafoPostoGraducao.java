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
@Table(name = "safo_posto_graducao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SafoPostoGraducao.findAll", query = "SELECT s FROM SafoPostoGraducao s"),
    @NamedQuery(name = "SafoPostoGraducao.findByIdpostograducao", query = "SELECT s FROM SafoPostoGraducao s WHERE s.idpostograducao = :idpostograducao"),
    @NamedQuery(name = "SafoPostoGraducao.findByDataUltAlteracao", query = "SELECT s FROM SafoPostoGraducao s WHERE s.dataUltAlteracao = :dataUltAlteracao"),
    @NamedQuery(name = "SafoPostoGraducao.findByUsuarioUltAlteracao", query = "SELECT s FROM SafoPostoGraducao s WHERE s.usuarioUltAlteracao = :usuarioUltAlteracao"),
    @NamedQuery(name = "SafoPostoGraducao.findByVersao", query = "SELECT s FROM SafoPostoGraducao s WHERE s.versao = :versao"),
    @NamedQuery(name = "SafoPostoGraducao.findByAbreviacao", query = "SELECT s FROM SafoPostoGraducao s WHERE s.abreviacao = :abreviacao"),
    @NamedQuery(name = "SafoPostoGraducao.findByDescricao", query = "SELECT s FROM SafoPostoGraducao s WHERE s.descricao = :descricao"),
    @NamedQuery(name = "SafoPostoGraducao.findByNumeroOrdem", query = "SELECT s FROM SafoPostoGraducao s WHERE s.numeroOrdem = :numeroOrdem")})
public class SafoPostoGraducao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpostograducao")
    private Integer idpostograducao;
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
    @Column(name = "abreviacao")
    private String abreviacao;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "numero_ordem")
    private String numeroOrdem;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpostograducao")
    private List<SafoFuncionario> safoFuncionarioList;

    public SafoPostoGraducao() {
    }

    public SafoPostoGraducao(Integer idpostograducao) {
        this.idpostograducao = idpostograducao;
    }

    public SafoPostoGraducao(Integer idpostograducao, Date dataUltAlteracao, String usuarioUltAlteracao, int versao, String abreviacao, String descricao) {
        this.idpostograducao = idpostograducao;
        this.dataUltAlteracao = dataUltAlteracao;
        this.usuarioUltAlteracao = usuarioUltAlteracao;
        this.versao = versao;
        this.abreviacao = abreviacao;
        this.descricao = descricao;
    }

    public Integer getIdpostograducao() {
        return idpostograducao;
    }

    public void setIdpostograducao(Integer idpostograducao) {
        this.idpostograducao = idpostograducao;
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

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNumeroOrdem() {
        return numeroOrdem;
    }

    public void setNumeroOrdem(String numeroOrdem) {
        this.numeroOrdem = numeroOrdem;
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
        hash += (idpostograducao != null ? idpostograducao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SafoPostoGraducao)) {
            return false;
        }
        SafoPostoGraducao other = (SafoPostoGraducao) object;
        if ((this.idpostograducao == null && other.idpostograducao != null) || (this.idpostograducao != null && !this.idpostograducao.equals(other.idpostograducao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.gov.es.cb.sdro.model.SafoPostoGraducao[ idpostograducao=" + idpostograducao + " ]";
    }
    
}
