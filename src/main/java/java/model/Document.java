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
@Table(name = "DOCUMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Document.findAll", query = "SELECT d FROM Document d")
    , @NamedQuery(name = "Document.findByIdDoc", query = "SELECT d FROM Document d WHERE d.idDoc = :idDoc")
    , @NamedQuery(name = "Document.findByDate", query = "SELECT d FROM Document d WHERE d.date = :date")
    , @NamedQuery(name = "Document.findByUrlDoc", query = "SELECT d FROM Document d WHERE d.urlDoc = :urlDoc")})
public class Document implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_DOC")
    private Long idDoc;
    @Column(name = "DATE")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Size(max = 255)
    @Column(name = "URL_DOC")
    private String urlDoc;
    @JoinTable(name = "SUPERVISEUR_DOCUMENT", joinColumns = {
        @JoinColumn(name = "DOCUMENTS_ID_DOC", referencedColumnName = "ID_DOC")}, inverseJoinColumns = {
        @JoinColumn(name = "SUPERVISEUR_ID_MEMBRE", referencedColumnName = "ID_MEMBRE")})
    @ManyToMany
    private Collection<Superviseur> superviseurCollection;
    @JoinTable(name = "REUNION_DOCUMENT", joinColumns = {
        @JoinColumn(name = "DOCUMENTS_ID_DOC", referencedColumnName = "ID_DOC")}, inverseJoinColumns = {
        @JoinColumn(name = "REUNION_ID_R\u0629UNION", referencedColumnName = "ID_R\u0629UNION")})
    @ManyToMany
    private Collection<Reunion> reunionCollection;
    @ManyToMany(mappedBy = "documentCollection")
    private Collection<Administrateur> administrateurCollection;
    @ManyToMany(mappedBy = "documentCollection")
    private Collection<Directeur> directeurCollection;
    @ManyToMany(mappedBy = "documentCollection")
    private Collection<Chefprojet> chefprojetCollection;

    public Document() {
    }

    public Document(Long idDoc) {
        this.idDoc = idDoc;
    }

    public Long getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(Long idDoc) {
        this.idDoc = idDoc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUrlDoc() {
        return urlDoc;
    }

    public void setUrlDoc(String urlDoc) {
        this.urlDoc = urlDoc;
    }

    @XmlTransient
    public Collection<Superviseur> getSuperviseurCollection() {
        return superviseurCollection;
    }

    public void setSuperviseurCollection(Collection<Superviseur> superviseurCollection) {
        this.superviseurCollection = superviseurCollection;
    }

    @XmlTransient
    public Collection<Reunion> getReunionCollection() {
        return reunionCollection;
    }

    public void setReunionCollection(Collection<Reunion> reunionCollection) {
        this.reunionCollection = reunionCollection;
    }

    @XmlTransient
    public Collection<Administrateur> getAdministrateurCollection() {
        return administrateurCollection;
    }

    public void setAdministrateurCollection(Collection<Administrateur> administrateurCollection) {
        this.administrateurCollection = administrateurCollection;
    }

    @XmlTransient
    public Collection<Directeur> getDirecteurCollection() {
        return directeurCollection;
    }

    public void setDirecteurCollection(Collection<Directeur> directeurCollection) {
        this.directeurCollection = directeurCollection;
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
        hash += (idDoc != null ? idDoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Document)) {
            return false;
        }
        Document other = (Document) object;
        if ((this.idDoc == null && other.idDoc != null) || (this.idDoc != null && !this.idDoc.equals(other.idDoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.java.model.Document[ idDoc=" + idDoc + " ]";
    }
    
}
