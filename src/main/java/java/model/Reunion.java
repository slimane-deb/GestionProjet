/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author selma
 */
@Entity
@Table(name = "REUNION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reunion.findAll", query = "SELECT r FROM Reunion r")
    , @NamedQuery(name = "Reunion.findByIdR\u0629union", query = "SELECT r FROM Reunion r WHERE r.idR\u0629union = :idR\u0629union")
    , @NamedQuery(name = "Reunion.findByRdate", query = "SELECT r FROM Reunion r WHERE r.rdate = :rdate")
    , @NamedQuery(name = "Reunion.findByRemplacement", query = "SELECT r FROM Reunion r WHERE r.remplacement = :remplacement")
    , @NamedQuery(name = "Reunion.findByRtitre", query = "SELECT r FROM Reunion r WHERE r.rtitre = :rtitre")})
public class Reunion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_R\u0629UNION")
    private Long idRةunion;
    @Column(name = "RDATE")
    @Temporal(TemporalType.DATE)
    private Date rdate;
    @Size(max = 150)
    @Column(name = "REMPLACEMENT")
    private String remplacement;
    @Size(max = 250)
    @Column(name = "RTITRE")
    private String rtitre;
    @ManyToMany(mappedBy = "reunionCollection")
    private Collection<Document> documentCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reunion")
    private Collection<ProjetReunion> projetReunionCollection;

    public Reunion() {
    }

    public Reunion(Long idRةunion) {
        this.idRةunion = idRةunion;
    }

    public Long getIdRةunion() {
        return idRةunion;
    }

    public void setIdRةunion(Long idRةunion) {
        this.idRةunion = idRةunion;
    }

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }

    public String getRemplacement() {
        return remplacement;
    }

    public void setRemplacement(String remplacement) {
        this.remplacement = remplacement;
    }

    public String getRtitre() {
        return rtitre;
    }

    public void setRtitre(String rtitre) {
        this.rtitre = rtitre;
    }

    @XmlTransient
    public Collection<Document> getDocumentCollection() {
        return documentCollection;
    }

    public void setDocumentCollection(Collection<Document> documentCollection) {
        this.documentCollection = documentCollection;
    }

    @XmlTransient
    public Collection<ProjetReunion> getProjetReunionCollection() {
        return projetReunionCollection;
    }

    public void setProjetReunionCollection(Collection<ProjetReunion> projetReunionCollection) {
        this.projetReunionCollection = projetReunionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRةunion != null ? idRةunion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reunion)) {
            return false;
        }
        Reunion other = (Reunion) object;
        if ((this.idRةunion == null && other.idRةunion != null) || (this.idRةunion != null && !this.idRةunion.equals(other.idRةunion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.java.model.Reunion[ idR\u0629union=" + idRةunion + " ]";
    }
    
}
