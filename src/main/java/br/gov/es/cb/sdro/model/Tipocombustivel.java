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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Heitor
 */
@Entity
@Table(name = "tipocombustivel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipocombustivel.findAll", query = "SELECT t FROM Tipocombustivel t"),
    @NamedQuery(name = "Tipocombustivel.findByIdtipocombustivel", query = "SELECT t FROM Tipocombustivel t WHERE t.idtipocombustivel = :idtipocombustivel"),
    @NamedQuery(name = "Tipocombustivel.findByDescricao", query = "SELECT t FROM Tipocombustivel t WHERE t.descricao = :descricao")})
public class Tipocombustivel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipocombustivel")
    private Integer idtipocombustivel;
    @Column(name = "descricao")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipocombustivel")
    private List<Viatura> viaturaList;

    public Tipocombustivel() {
    }

    public Tipocombustivel(Integer idtipocombustivel) {
        this.idtipocombustivel = idtipocombustivel;
    }

    public Integer getIdtipocombustivel() {
        return idtipocombustivel;
    }

    public void setIdtipocombustivel(Integer idtipocombustivel) {
        this.idtipocombustivel = idtipocombustivel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<Viatura> getViaturaList() {
        return viaturaList;
    }

    public void setViaturaList(List<Viatura> viaturaList) {
        this.viaturaList = viaturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipocombustivel != null ? idtipocombustivel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipocombustivel)) {
            return false;
        }
        Tipocombustivel other = (Tipocombustivel) object;
        if ((this.idtipocombustivel == null && other.idtipocombustivel != null) || (this.idtipocombustivel != null && !this.idtipocombustivel.equals(other.idtipocombustivel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.gov.es.cb.sdro.model.Tipocombustivel[ idtipocombustivel=" + idtipocombustivel + " ]";
    }
    
}
