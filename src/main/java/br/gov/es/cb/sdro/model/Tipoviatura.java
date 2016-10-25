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
@Table(name = "tipoviatura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoviatura.findAll", query = "SELECT t FROM Tipoviatura t"),
    @NamedQuery(name = "Tipoviatura.findByIdtipoviatura", query = "SELECT t FROM Tipoviatura t WHERE t.idtipoviatura = :idtipoviatura"),
    @NamedQuery(name = "Tipoviatura.findByDescricao", query = "SELECT t FROM Tipoviatura t WHERE t.descricao = :descricao")})
public class Tipoviatura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipoviatura")
    private Integer idtipoviatura;
    @Column(name = "descricao")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipoviatura")
    private List<Viatura> viaturaList;

    public Tipoviatura() {
    }

    public Tipoviatura(Integer idtipoviatura) {
        this.idtipoviatura = idtipoviatura;
    }

    public Integer getIdtipoviatura() {
        return idtipoviatura;
    }

    public void setIdtipoviatura(Integer idtipoviatura) {
        this.idtipoviatura = idtipoviatura;
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
        hash += (idtipoviatura != null ? idtipoviatura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoviatura)) {
            return false;
        }
        Tipoviatura other = (Tipoviatura) object;
        if ((this.idtipoviatura == null && other.idtipoviatura != null) || (this.idtipoviatura != null && !this.idtipoviatura.equals(other.idtipoviatura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.gov.es.cb.sdro.model.Tipoviatura[ idtipoviatura=" + idtipoviatura + " ]";
    }
    
}
