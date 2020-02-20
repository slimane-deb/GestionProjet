/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author selma
 */
@Entity
@Table(name = "NOTIFICATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notification.findAll", query = "SELECT n FROM Notification n")
    , @NamedQuery(name = "Notification.findById", query = "SELECT n FROM Notification n WHERE n.id = :id")
    , @NamedQuery(name = "Notification.findByCommentaire", query = "SELECT n FROM Notification n WHERE n.commentaire = :commentaire")
    , @NamedQuery(name = "Notification.findByTitre", query = "SELECT n FROM Notification n WHERE n.titre = :titre")})
public class Notification implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 400)
    @Column(name = "COMMENTAIRE")
    private String commentaire;
    @Size(max = 250)
    @Column(name = "TITRE")
    private String titre;
    @OneToMany(mappedBy = "notificationId")
    private Collection<Directeur> directeurCollection;
    @OneToMany(mappedBy = "notificationId")
    private Collection<Administrateur> administrateurCollection;
    @OneToMany(mappedBy = "notificationId")
    private Collection<Superviseur> superviseurCollection;
    @OneToMany(mappedBy = "notificationId")
    private Collection<Chefprojet> chefprojetCollection;

    public Notification() {
    }

    public Notification(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
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
        if (!(object instanceof Notification)) {
            return false;
        }
        Notification other = (Notification) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.java.model.Notification[ id=" + id + " ]";
    }
    
}
