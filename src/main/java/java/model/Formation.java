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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "FORMATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formation.findAll", query = "SELECT f FROM Formation f")
    , @NamedQuery(name = "Formation.findById", query = "SELECT f FROM Formation f WHERE f.id = :id")
    , @NamedQuery(name = "Formation.findByDatefr", query = "SELECT f FROM Formation f WHERE f.datefr = :datefr")
    , @NamedQuery(name = "Formation.findByIntitul\u0629", query = "SELECT f FROM Formation f WHERE f.intitul\u0629 = :intitul\u0629")})
public class Formation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Column(name = "DATEFR")
    @Temporal(TemporalType.DATE)
    private Date datefr;
    @Size(max = 255)
    @Column(name = "INTITUL\u0629")
    private String intitulة;
    @ManyToMany(mappedBy = "formationCollection")
    private Collection<Directeur> directeurCollection;
    @ManyToMany(mappedBy = "formationCollection")
    private Collection<Administrateur> administrateurCollection;
    @JoinTable(name = "SUPERVISEUR_FORMATION", joinColumns = {
        @JoinColumn(name = "FORMATIONS_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
        @JoinColumn(name = "SUPERVISEUR_ID_MEMBRE", referencedColumnName = "ID_MEMBRE")})
    @ManyToMany
    private Collection<Superviseur> superviseurCollection;
    @ManyToMany(mappedBy = "formationCollection")
    private Collection<Chefprojet> chefprojetCollection;

    public Formation() {
    }

    public Formation(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatefr() {
        return datefr;
    }

    public void setDatefr(Date datefr) {
        this.datefr = datefr;
    }

    public String getIntitulة() {
        return intitulة;
    }

    public void setIntitulة(String intitulة) {
        this.intitulة = intitulة;
    }

    @XmlTransient
    public Collection<Directeur> getDirecteurCollection() {
        return directeurCollection;
    }

    public void setDirecteurCollection(Collection<Directeur> directeurCollection) {
        this.directeurCollection = directeurCollection;
    }

    @XmlTransient
    public Collection<Administrateur> getAdministrateurCollection() {
        return administrateurCollection;
    }

    public void setAdministrateurCollection(Collection<Administrateur> administrateurCollection) {
        this.administrateurCollection = administrateurCollection;
    }

    @XmlTransient
    public Collection<Superviseur> getSuperviseurCollection() {
        return superviseurCollection;
    }

    public void setSuperviseurCollection(Collection<Superviseur> superviseurCollection) {
        this.superviseurCollection = superviseurCollection;
    }

    @XmlTransient
    public Collection<Chefprojet> getChefprojetCollection() {
        return chefprojetCollection;
    }

    public void setChefprojetCollection(Collection<Chefprojet> chefprojetCollection) {
        this.chefprojetCollection = chefprojetCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formation)) {
            return false;
        }
        Formation other = (Formation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.java.model.Formation[ id=" + id + " ]";
    }
    
}
