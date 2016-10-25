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
@Table(name = "sco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sco.findAll", query = "SELECT s FROM Sco s"),
    @NamedQuery(name = "Sco.findByIdsco", query = "SELECT s FROM Sco s WHERE s.idsco = :idsco"),
    @NamedQuery(name = "Sco.findByNome", query = "SELECT s FROM Sco s WHERE s.nome = :nome"),
    @NamedQuery(name = "Sco.findByDatainicio", query = "SELECT s FROM Sco s WHERE s.datainicio = :datainicio"),
    @NamedQuery(name = "Sco.findByDatafim", query = "SELECT s FROM Sco s WHERE s.datafim = :datafim"),
    @NamedQuery(name = "Sco.findByLocal", query = "SELECT s FROM Sco s WHERE s.local = :local"),
    @NamedQuery(name = "Sco.findByIdfuncionariocomando", query = "SELECT s FROM Sco s WHERE s.idfuncionariocomando = :idfuncionariocomando"),
    @NamedQuery(name = "Sco.findByIdfuncionariooperacoes", query = "SELECT s FROM Sco s WHERE s.idfuncionariooperacoes = :idfuncionariooperacoes"),
    @NamedQuery(name = "Sco.findByIdfuncionarioplanejamento", query = "SELECT s FROM Sco s WHERE s.idfuncionarioplanejamento = :idfuncionarioplanejamento"),
    @NamedQuery(name = "Sco.findByIdfuncionariologistica", query = "SELECT s FROM Sco s WHERE s.idfuncionariologistica = :idfuncionariologistica"),
    @NamedQuery(name = "Sco.findByIdfuncionarioadministracao", query = "SELECT s FROM Sco s WHERE s.idfuncionarioadministracao = :idfuncionarioadministracao")})
public class Sco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsco")
    private Integer idsco;
    @Column(name = "nome")
    private String nome;
    @Column(name = "datainicio")
    @Temporal(TemporalType.DATE)
    private Date datainicio;
    @Column(name = "datafim")
    @Temporal(TemporalType.DATE)
    private Date datafim;
    @Column(name = "local")
    private String local;
    @Column(name = "idfuncionariocomando")
    private Integer idfuncionariocomando;
    @Column(name = "idfuncionariooperacoes")
    private Integer idfuncionariooperacoes;
    @Column(name = "idfuncionarioplanejamento")
    private Integer idfuncionarioplanejamento;
    @Column(name = "idfuncionariologistica")
    private Integer idfuncionariologistica;
    @Column(name = "idfuncionarioadministracao")
    private Integer idfuncionarioadministracao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idsco")
    private List<Viatura> viaturaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idsco")
    private List<Equipe> equipeList;

    public Sco() {
    }

    public Sco(Integer idsco) {
        this.idsco = idsco;
    }

    public Integer getIdsco() {
        return idsco;
    }

    public void setIdsco(Integer idsco) {
        this.idsco = idsco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }

    public Date getDatafim() {
        return datafim;
    }

    public void setDatafim(Date datafim) {
        this.datafim = datafim;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Integer getIdfuncionariocomando() {
        return idfuncionariocomando;
    }

    public void setIdfuncionariocomando(Integer idfuncionariocomando) {
        this.idfuncionariocomando = idfuncionariocomando;
    }

    public Integer getIdfuncionariooperacoes() {
        return idfuncionariooperacoes;
    }

    public void setIdfuncionariooperacoes(Integer idfuncionariooperacoes) {
        this.idfuncionariooperacoes = idfuncionariooperacoes;
    }

    public Integer getIdfuncionarioplanejamento() {
        return idfuncionarioplanejamento;
    }

    public void setIdfuncionarioplanejamento(Integer idfuncionarioplanejamento) {
        this.idfuncionarioplanejamento = idfuncionarioplanejamento;
    }

    public Integer getIdfuncionariologistica() {
        return idfuncionariologistica;
    }

    public void setIdfuncionariologistica(Integer idfuncionariologistica) {
        this.idfuncionariologistica = idfuncionariologistica;
    }

    public Integer getIdfuncionarioadministracao() {
        return idfuncionarioadministracao;
    }

    public void setIdfuncionarioadministracao(Integer idfuncionarioadministracao) {
        this.idfuncionarioadministracao = idfuncionarioadministracao;
    }

    @XmlTransient
    public List<Viatura> getViaturaList() {
        return viaturaList;
    }

    public void setViaturaList(List<Viatura> viaturaList) {
        this.viaturaList = viaturaList;
    }

    @XmlTransient
    public List<Equipe> getEquipeList() {
        return equipeList;
    }

    public void setEquipeList(List<Equipe> equipeList) {
        this.equipeList = equipeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsco != null ? idsco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sco)) {
            return false;
        }
        Sco other = (Sco) object;
        if ((this.idsco == null && other.idsco != null) || (this.idsco != null && !this.idsco.equals(other.idsco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.gov.es.cb.sdro.model.Sco[ idsco=" + idsco + " ]";
    }
    
}
