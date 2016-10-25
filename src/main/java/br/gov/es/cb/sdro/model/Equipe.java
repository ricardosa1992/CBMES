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
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Heitor
 */
@Entity
@Table(name = "equipe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipe.findAll", query = "SELECT e FROM Equipe e"),
    @NamedQuery(name = "Equipe.findByIdequipe", query = "SELECT e FROM Equipe e WHERE e.idequipe = :idequipe"),
    @NamedQuery(name = "Equipe.findByDescricao", query = "SELECT e FROM Equipe e WHERE e.descricao = :descricao")})
public class Equipe implements Serializable {

    @JoinColumn(name = "idunidade", referencedColumnName = "idunidade")
    @ManyToOne
    private Unidade idunidade;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idequipe")
    private Integer idequipe;
    @Column(name = "descricao")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idequipe")
    private List<Viatura> viaturaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idequipe")
    private List<Empenho> empenhoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idequipe")
    private List<Militar> militarList;
    @JoinColumn(name = "idsco", referencedColumnName = "idsco")
    @ManyToOne(optional = false)
    private Sco idsco;

    public Equipe() {
    }

    public Equipe(Integer idequipe) {
        this.idequipe = idequipe;
    }

    public Integer getIdequipe() {
        return idequipe;
    }

    public void setIdequipe(Integer idequipe) {
        this.idequipe = idequipe;
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

    @XmlTransient
    public List<Empenho> getEmpenhoList() {
        return empenhoList;
    }

    public void setEmpenhoList(List<Empenho> empenhoList) {
        this.empenhoList = empenhoList;
    }

    @XmlTransient
    public List<Militar> getMilitarList() {
        return militarList;
    }

    public void setMilitarList(List<Militar> militarList) {
        this.militarList = militarList;
    }

    public Sco getIdsco() {
        return idsco;
    }

    public void setIdsco(Sco idsco) {
        this.idsco = idsco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idequipe != null ? idequipe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipe)) {
            return false;
        }
        Equipe other = (Equipe) object;
        if ((this.idequipe == null && other.idequipe != null) || (this.idequipe != null && !this.idequipe.equals(other.idequipe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.gov.es.cb.sdro.model.Equipe[ idequipe=" + idequipe + " ]";
    }

    public Unidade getIdunidade() {
        return idunidade;
    }

    public void setIdunidade(Unidade idunidade) {
        this.idunidade = idunidade;
    }
    
}
