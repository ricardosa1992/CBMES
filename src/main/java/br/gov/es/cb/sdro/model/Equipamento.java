/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Heitor
 */
@Entity
@Table(name = "equipamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipamento.findAllDisponiveis", query = "SELECT e FROM Equipamento e where e.isalocado = false"),
    @NamedQuery(name = "Equipamento.findAllDisponiveisUnidade", query = "SELECT e FROM Equipamento e where e.isalocado = false and e.idunidade = :idUnidade"),
    @NamedQuery(name = "Equipamento.findAllAlocadosViatura", query = "SELECT e FROM Equipamento e where e.isalocado = true and e.idviatura = :idViatura"),
    @NamedQuery(name = "Equipamento.UpdateEstadoEquipamento", query = "UPDATE Equipamento SET isalocado=true, idviatura = :idviatura WHERE idViatura = :idequipamento"),
     @NamedQuery(name = "Equipamento.liberaEquipamento", query = "UPDATE Equipamento SET isalocado=false, idviatura = null WHERE idViatura = :idequipamento"),
    @NamedQuery(name = "Equipamento.findAll", query = "SELECT e FROM Equipamento e"),
    @NamedQuery(name = "Equipamento.findByIdequipamento", query = "SELECT e FROM Equipamento e WHERE e.idequipamento = :idequipamento"),
    @NamedQuery(name = "Equipamento.findByNome", query = "SELECT e FROM Equipamento e WHERE e.nome = :nome"),
    @NamedQuery(name = "Equipamento.findByMarca", query = "SELECT e FROM Equipamento e WHERE e.marca = :marca"),
    @NamedQuery(name = "Equipamento.findByIsalocado", query = "SELECT e FROM Equipamento e WHERE e.isalocado = :isalocado")})
public class Equipamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idequipamento")
    private Integer idequipamento;
    @Column(name = "nome")
    private String nome;
    @Column(name = "marca")
    private String marca;
    @Column(name = "isalocado")
    private Boolean isalocado;
    @JoinColumn(name = "idstatus", referencedColumnName = "idstatus")
    @ManyToOne(optional = false)
    private Status idstatus;
    @JoinColumn(name = "idunidade", referencedColumnName = "idunidade")
    @ManyToOne(optional = false)
    private Unidade idunidade;
    @JoinColumn(name = "idviatura", referencedColumnName = "idviatura")
    @ManyToOne(optional = false)
    private Viatura idviatura;

    public Equipamento() {
    }

    public Equipamento(Integer idequipamento) {
        this.idequipamento = idequipamento;
    }

    public Integer getIdequipamento() {
        return idequipamento;
    }

    public void setIdequipamento(Integer idequipamento) {
        this.idequipamento = idequipamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean getIsalocado() {
        return isalocado;
    }

    public void setIsalocado(Boolean isalocado) {
        this.isalocado = isalocado;
    }

    public Status getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(Status idstatus) {
        this.idstatus = idstatus;
    }

    public Unidade getIdunidade() {
        return idunidade;
    }

    public void setIdunidade(Unidade idunidade) {
        this.idunidade = idunidade;
    }

    public Viatura getIdviatura() {
        return idviatura;
    }

    public void setIdviatura(Viatura idviatura) {
        this.idviatura = idviatura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idequipamento != null ? idequipamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipamento)) {
            return false;
        }
        Equipamento other = (Equipamento) object;
        if ((this.idequipamento == null && other.idequipamento != null) || (this.idequipamento != null && !this.idequipamento.equals(other.idequipamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.gov.es.cb.sdro.model.Equipamento[ idequipamento=" + idequipamento + " ]";
    }
    
}
