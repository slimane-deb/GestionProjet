/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author selma
 */
@Entity
@Table(name = "PROJET")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Projet.findAll", query = "SELECT p FROM Projet p")
    , @NamedQuery(name = "Projet.findByIdProjet", query = "SELECT p FROM Projet p WHERE p.idProjet = :idProjet")
    , @NamedQuery(name = "Projet.findByPdated", query = "SELECT p FROM Projet p WHERE p.pdated = :pdated")
    , @NamedQuery(name = "Projet.findByPdatef", query = "SELECT p FROM Projet p WHERE p.pdatef = :pdatef")
    , @NamedQuery(name = "Projet.findByPdescription", query = "SELECT p FROM Projet p WHERE p.pdescription = :pdescription")
    , @NamedQuery(name = "Projet.findByPtitre", query = "SELECT p FROM Projet p WHERE p.ptitre = :ptitre")
    , @NamedQuery(name = "Projet.findByPhdescription", query = "SELECT p FROM Projet p WHERE p.phdescription = :phdescription")
    , @NamedQuery(name = "Projet.findByPhtitre", query = "SELECT p FROM Projet p WHERE p.phtitre = :phtitre")
    , @NamedQuery(name = "Projet.findByTdated", query = "SELECT p FROM Projet p WHERE p.tdated = :tdated")
    , @NamedQuery(name = "Projet.findByTdatef", query = "SELECT p FROM Projet p WHERE p.tdatef = :tdatef")
    , @NamedQuery(name = "Projet.findByTdescription", query = "SELECT p FROM Projet p WHERE p.tdescription = :tdescription")
    , @NamedQuery(name = "Projet.findByTetatavancement", query = "SELECT p FROM Projet p WHERE p.tetatavancement = :tetatavancement")
    , @NamedQuery(name = "Projet.findByTprecedente", query = "SELECT p FROM Projet p WHERE p.tprecedente = :tprecedente")
    , @NamedQuery(name = "Projet.findByTsuivante", query = "SELECT p FROM Projet p WHERE p.tsuivante = :tsuivante")
    , @NamedQuery(name = "Projet.findByTtitre", query = "SELECT p FROM Projet p WHERE p.ttitre = :ttitre")})
public class Projet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PROJET")
    private Long idProjet;
    @Column(name = "PDATED")
    @Temporal(TemporalType.DATE)
    private Date pdated;
    @Column(name = "PDATEF")
    @Temporal(TemporalType.DATE)
    private Date pdatef;
    @Size(max = 400)
    @Column(name = "PDESCRIPTION")
    private String pdescription;
    @Size(max = 250)
    @Column(name = "PTITRE")
    private String ptitre;
    @Size(max = 400)
    @Column(name = "PHDESCRIPTION")
    private String phdescription;
    @Size(max = 250)
    @Column(name = "PHTITRE")
    private String phtitre;
    @Column(name = "TDATED")
    @Temporal(TemporalType.DATE)
    private Date tdated;
    @Column(name = "TDATEF")
    @Temporal(TemporalType.DATE)
    private Date tdatef;
    @Size(max = 400)
    @Column(name = "TDESCRIPTION")
    private String tdescription;
    @Column(name = "TETATAVANCEMENT")
    private Integer tetatavancement;
    @Size(max = 250)
    @Column(name = "TPRECEDENTE")
    private String tprecedente;
    @Size(max = 250)
    @Column(name = "TSUIVANTE")
    private String tsuivante;
    @Size(max = 250)
    @Column(name = "TTITRE")
    private String ttitre;

    public Projet() {
    }

    public Projet(Long idProjet) {
        this.idProjet = idProjet;
    }

    public Long getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(Long idProjet) {
        this.idProjet = idProjet;
    }

    public Date getPdated() {
        return pdated;
    }

    public void setPdated(Date pdated) {
        this.pdated = pdated;
    }

    public Date getPdatef() {
        return pdatef;
    }

    public void setPdatef(Date pdatef) {
        this.pdatef = pdatef;
    }

    public String getPdescription() {
        return pdescription;
    }

    public void setPdescription(String pdescription) {
        this.pdescription = pdescription;
    }

    public String getPtitre() {
        return ptitre;
    }

    public void setPtitre(String ptitre) {
        this.ptitre = ptitre;
    }

    public String getPhdescription() {
        return phdescription;
    }

    public void setPhdescription(String phdescription) {
        this.phdescription = phdescription;
    }

    public String getPhtitre() {
        return phtitre;
    }

    public void setPhtitre(String phtitre) {
        this.phtitre = phtitre;
    }

    public Date getTdated() {
        return tdated;
    }

    public void setTdated(Date tdated) {
        this.tdated = tdated;
    }

    public Date getTdatef() {
        return tdatef;
    }

    public void setTdatef(Date tdatef) {
        this.tdatef = tdatef;
    }

    public String getTdescription() {
        return tdescription;
    }

    public void setTdescription(String tdescription) {
        this.tdescription = tdescription;
    }

    public Integer getTetatavancement() {
        return tetatavancement;
    }

    public void setTetatavancement(Integer tetatavancement) {
        this.tetatavancement = tetatavancement;
    }

    public String getTprecedente() {
        return tprecedente;
    }

    public void setTprecedente(String tprecedente) {
        this.tprecedente = tprecedente;
    }

    public String getTsuivante() {
        return tsuivante;
    }

    public void setTsuivante(String tsuivante) {
        this.tsuivante = tsuivante;
    }

    public String getTtitre() {
        return ttitre;
    }

    public void setTtitre(String ttitre) {
        this.ttitre = ttitre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProjet != null ? idProjet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Projet)) {
            return false;
        }
        Projet other = (Projet) object;
        if ((this.idProjet == null && other.idProjet != null) || (this.idProjet != null && !this.idProjet.equals(other.idProjet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.java.model.Projet[ idProjet=" + idProjet + " ]";
    }
    
}
