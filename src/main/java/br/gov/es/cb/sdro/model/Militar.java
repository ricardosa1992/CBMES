/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Heitor
 */
@Entity
@Table(name = "militar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Militar.findAll", query = "SELECT m FROM Militar m"),
    @NamedQuery(name = "Militar.disponiveisUnidade", query = "SELECT m FROM Militar m where m.isalocado = false and m.idunidade = :idunidade"),
    @NamedQuery(name = "Militar.findByIdmilitar", query = "SELECT m FROM Militar m WHERE m.idmilitar = :idmilitar"),
    @NamedQuery(name = "Militar.findByIsalocado", query = "SELECT m FROM Militar m WHERE m.isalocado = :isalocado")})
public class Militar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmilitar")
    private Integer idmilitar;
    @Column(name = "isalocado")
    private Boolean isalocado;
    @JoinColumn(name = "idequipe", referencedColumnName = "idequipe")
    @ManyToOne(optional = false)
    private Equipe idequipe;
    @JoinColumn(name = "safo_idfuncionario", referencedColumnName = "idfuncionario")
    @ManyToOne(optional = false)
    private SafoFuncionario safoIdfuncionario;
    @JoinColumn(name = "idunidade", referencedColumnName = "idunidade")
    @ManyToOne(optional = false)
    private Unidade idunidade;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmilitar")
    private List<Usuario> usuarioList;
    public Militar() {
    }

    public Militar(Integer idmilitar) {
        this.idmilitar = idmilitar;
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

    public SafoFuncionario getSafoIdfuncionario() {
        return safoIdfuncionario;
    }

    public void setSafoIdfuncionario(SafoFuncionario safoIdfuncionario) {
        this.safoIdfuncionario = safoIdfuncionario;
    }

    public Unidade getIdunidade() {
        return idunidade;
    }

    public void setIdunidade(Unidade idunidade) {
        this.idunidade = idunidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmilitar != null ? idmilitar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Militar)) {
            return false;
        }
        Militar other = (Militar) object;
        if ((this.idmilitar == null && other.idmilitar != null) || (this.idmilitar != null && !this.idmilitar.equals(other.idmilitar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.gov.es.cb.sdro.model.Militar[ idmilitar=" + idmilitar + " ]";
    }
    
}
