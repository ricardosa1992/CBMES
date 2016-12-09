
package br.gov.es.cb.sdro.model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Heitor
 */
@Entity
@Table(name = "empenho")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empenho.findAll", query = "SELECT e FROM Empenho e"),
    @NamedQuery(name = "Empenho.findByIdempenho", query = "SELECT e FROM Empenho e WHERE e.idempenho = :idempenho"),
    @NamedQuery(name = "Empenho.findByIdequipe", query = "SELECT e FROM Empenho e WHERE e.idequipe = :idequipe"),
    @NamedQuery(name = "Empenho.findByDescricao", query = "SELECT e FROM Empenho e WHERE e.descricao = :descricao"),
    @NamedQuery(name = "Empenho.findByDatainicio", query = "SELECT e FROM Empenho e WHERE e.datainicio = :datainicio"),
    @NamedQuery(name = "Empenho.findByDatafim", query = "SELECT e FROM Empenho e WHERE e.datafim = :datafim")})
public class Empenho implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idempenho")
    private Integer idempenho;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "datainicio")
    @Temporal(TemporalType.DATE)
    private Date datainicio;
    @Column(name = "datafim")
    @Temporal(TemporalType.DATE)
    private Date datafim;
    @JoinColumn(name = "idequipe", referencedColumnName = "idequipe")
    @ManyToOne(optional = false)
    private Equipe idequipe;

    public Empenho() {
        // para criação de um novo Empenho
    }

    public Empenho(Integer idempenho) {
        this.idempenho = idempenho;
    }

    public Integer getIdempenho() {
        return idempenho;
    }

    public void setIdempenho(Integer idempenho) {
        this.idempenho = idempenho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public Equipe getIdequipe() {
        return idequipe;
    }

    public void setIdequipe(Equipe idequipe) {
        this.idequipe = idequipe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idempenho != null ? idempenho.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Empenho)) {
            return false;
        }
        Empenho other = (Empenho) object;
        if ((this.idempenho == null && other.idempenho != null) || (this.idempenho != null && !this.idempenho.equals(other.idempenho))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.gov.es.cb.sdro.model.Empenho[ idempenho=" + idempenho + " ]";
    }
    
}
