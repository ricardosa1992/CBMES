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
@Table(name = "unidade")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unidade.findAll", query = "SELECT u FROM Unidade u"),
    @NamedQuery(name = "Unidade.findByIdunidade", query = "SELECT u FROM Unidade u WHERE u.idunidade = :idunidade"),
    @NamedQuery(name = "Unidade.findByNome", query = "SELECT u FROM Unidade u WHERE u.nome = :nome"),
    @NamedQuery(name = "Unidade.findByIdcomandante", query = "SELECT u FROM Unidade u WHERE u.idcomandante = :idcomandante"),
    @NamedQuery(name = "Unidade.findByIdsubcomandante", query = "SELECT u FROM Unidade u WHERE u.idsubcomandante = :idsubcomandante")})
public class Unidade implements Serializable {

    @OneToMany(mappedBy = "idunidade")
    private List<Equipe> equipeList;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idunidade")
    private Integer idunidade;
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "idcomandante")
    private int idcomandante;
    @Basic(optional = false)
    @Column(name = "idsubcomandante")
    private int idsubcomandante;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idunidade")
    private List<Viatura> viaturaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idunidade")
    private List<Equipamento> equipamentoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idunidade")
    private List<Militar> militarList;

    public Unidade() {
    }

    public Unidade(Integer idunidade) {
        this.idunidade = idunidade;
    }

    public Unidade(String nome, int idcomandante, int idsubcomandante) {
        this.nome = nome;
        this.idcomandante = idcomandante;
        this.idsubcomandante = idsubcomandante;
    }

    
    
    public Unidade(Integer idunidade, int idcomandante, int idsubcomandante) {
        this.idunidade = idunidade;
        this.idcomandante = idcomandante;
        this.idsubcomandante = idsubcomandante;
    }

    public Integer getIdunidade() {
        return idunidade;
    }

    public void setIdunidade(Integer idunidade) {
        this.idunidade = idunidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdcomandante() {
        return idcomandante;
    }

    public void setIdcomandante(int idcomandante) {
        this.idcomandante = idcomandante;
    }

    public int getIdsubcomandante() {
        return idsubcomandante;
    }

    public void setIdsubcomandante(int idsubcomandante) {
        this.idsubcomandante = idsubcomandante;
    }

    @XmlTransient
    public List<Viatura> getViaturaList() {
        return viaturaList;
    }

    public void setViaturaList(List<Viatura> viaturaList) {
        this.viaturaList = viaturaList;
    }

    @XmlTransient
    public List<Equipamento> getEquipamentoList() {
        return equipamentoList;
    }

    public void setEquipamentoList(List<Equipamento> equipamentoList) {
        this.equipamentoList = equipamentoList;
    }

    @XmlTransient
    public List<Militar> getMilitarList() {
        return militarList;
    }

    public void setMilitarList(List<Militar> militarList) {
        this.militarList = militarList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idunidade != null ? idunidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidade)) {
            return false;
        }
        Unidade other = (Unidade) object;
        if ((this.idunidade == null && other.idunidade != null) || (this.idunidade != null && !this.idunidade.equals(other.idunidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.gov.es.cb.sdro.model.Unidade[ idunidade=" + idunidade + " ]";
    }

    @XmlTransient
    public List<Equipe> getEquipeList() {
        return equipeList;
    }

    public void setEquipeList(List<Equipe> equipeList) {
        this.equipeList = equipeList;
    }
    
}
