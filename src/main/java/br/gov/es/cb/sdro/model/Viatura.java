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
@Table(name = "viatura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Viatura.UpdateIsAlocado", query = "UPDATE Viatura SET isalocado=true WHERE idViatura = :idviatura"),
     @NamedQuery(name = "Viatura.liberaViatura", query = "UPDATE Viatura SET isalocado=false WHERE idViatura = :idviatura"),
    @NamedQuery(name = "Viatura.findAllDisponiveis", query = "SELECT v FROM Viatura v where v.isalocado = false and v.idunidade = :idUnidade"),
    @NamedQuery(name = "Viatura.findAllAlocadas", query = "SELECT v FROM Viatura v where v.isalocado = true and v.idunidade = :idUnidade"),
    @NamedQuery(name = "Viatura.findAll", query = "SELECT v FROM Viatura v"),
    @NamedQuery(name = "Viatura.findByIdviatura", query = "SELECT v FROM Viatura v WHERE v.idviatura = :idviatura"),
    @NamedQuery(name = "Viatura.findByIsalocado", query = "SELECT v FROM Viatura v WHERE v.isalocado = :isalocado"),
    @NamedQuery(name = "Viatura.findByIscbmes", query = "SELECT v FROM Viatura v WHERE v.iscbmes = :iscbmes"),
    @NamedQuery(name = "Viatura.findByPrefixo", query = "SELECT v FROM Viatura v WHERE v.prefixo = :prefixo"),
    @NamedQuery(name = "Viatura.findByPlaca", query = "SELECT v FROM Viatura v WHERE v.placa = :placa"),
    @NamedQuery(name = "Viatura.findByMarca", query = "SELECT v FROM Viatura v WHERE v.marca = :marca"),
    @NamedQuery(name = "Viatura.findByModelo", query = "SELECT v FROM Viatura v WHERE v.modelo = :modelo"),
    @NamedQuery(name = "Viatura.findByAno", query = "SELECT v FROM Viatura v WHERE v.ano = :ano"),
    @NamedQuery(name = "Viatura.findByCapagua", query = "SELECT v FROM Viatura v WHERE v.capagua = :capagua"),
    @NamedQuery(name = "Viatura.findByCappessoas", query = "SELECT v FROM Viatura v WHERE v.cappessoas = :cappessoas")})
public class Viatura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idviatura")
    private Integer idviatura;
    @Column(name = "isalocado")
    private Boolean isalocado;
    @Column(name = "iscbmes")
    private Boolean iscbmes;
    @Column(name = "prefixo")
    private String prefixo;
    @Column(name = "placa")
    private String placa;
    @Column(name = "marca")
    private String marca;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "ano")
    private Integer ano;
    @Column(name = "capagua")
    private Integer capagua;
    @Column(name = "cappessoas")
    private Integer cappessoas;
    @JoinColumn(name = "idcategoria", referencedColumnName = "idcategoria")
    @ManyToOne(optional = false)
    private Categoria idcategoria;
    @JoinColumn(name = "idequipe", referencedColumnName = "idequipe")
    @ManyToOne(optional = false)
    private Equipe idequipe;
    @JoinColumn(name = "idsco", referencedColumnName = "idsco")
    @ManyToOne(optional = false)
    private Sco idsco;
    @JoinColumn(name = "idstatus", referencedColumnName = "idstatus")
    @ManyToOne(optional = false)
    private Status idstatus;
    @JoinColumn(name = "idtipocombustivel", referencedColumnName = "idtipocombustivel")
    @ManyToOne(optional = false)
    private Tipocombustivel idtipocombustivel;
    @JoinColumn(name = "idtipoviatura", referencedColumnName = "idtipoviatura")
    @ManyToOne(optional = false)
    private Tipoviatura idtipoviatura;
    @JoinColumn(name = "idunidade", referencedColumnName = "idunidade")
    @ManyToOne(optional = false)
    private Unidade idunidade;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idviatura")
    private List<Equipamento> equipamentoList;

    public Viatura() {
    }

    public Viatura(Integer idviatura) {
        this.idviatura = idviatura;
    }

    public Integer getIdviatura() {
        return idviatura;
    }

    public void setIdviatura(Integer idviatura) {
        this.idviatura = idviatura;
    }

    public Boolean getIsalocado() {
        return isalocado;
    }

    public void setIsalocado(Boolean isalocado) {
        this.isalocado = isalocado;
    }

    public Boolean getIscbmes() {
        return iscbmes;
    }

    public void setIscbmes(Boolean iscbmes) {
        this.iscbmes = iscbmes;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getCapagua() {
        return capagua;
    }

    public void setCapagua(Integer capagua) {
        this.capagua = capagua;
    }

    public Integer getCappessoas() {
        return cappessoas;
    }

    public void setCappessoas(Integer cappessoas) {
        this.cappessoas = cappessoas;
    }

    public Categoria getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Categoria idcategoria) {
        this.idcategoria = idcategoria;
    }

    public Equipe getIdequipe() {
        return idequipe;
    }

    public void setIdequipe(Equipe idequipe) {
        this.idequipe = idequipe;
    }

    public Sco getIdsco() {
        return idsco;
    }

    public void setIdsco(Sco idsco) {
        this.idsco = idsco;
    }

    public Status getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(Status idstatus) {
        this.idstatus = idstatus;
    }

    public Tipocombustivel getIdtipocombustivel() {
        return idtipocombustivel;
    }

    public void setIdtipocombustivel(Tipocombustivel idtipocombustivel) {
        this.idtipocombustivel = idtipocombustivel;
    }

    public Tipoviatura getIdtipoviatura() {
        return idtipoviatura;
    }

    public void setIdtipoviatura(Tipoviatura idtipoviatura) {
        this.idtipoviatura = idtipoviatura;
    }

    public Unidade getIdunidade() {
        return idunidade;
    }

    public void setIdunidade(Unidade idunidade) {
        this.idunidade = idunidade;
    }

    @XmlTransient
    public List<Equipamento> getEquipamentoList() {
        return equipamentoList;
    }

    public void setEquipamentoList(List<Equipamento> equipamentoList) {
        this.equipamentoList = equipamentoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idviatura != null ? idviatura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Viatura)) {
            return false;
        }
        Viatura other = (Viatura) object;
        if ((this.idviatura == null && other.idviatura != null) || (this.idviatura != null && !this.idviatura.equals(other.idviatura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.gov.es.cb.sdro.model.Viatura[ idviatura=" + idviatura + " ]";
    }
    
}
