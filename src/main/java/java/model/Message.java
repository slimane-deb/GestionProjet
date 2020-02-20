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
@Table(name = "MESSAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Message.findAll", query = "SELECT m FROM Message m")
    , @NamedQuery(name = "Message.findByIdMessage", query = "SELECT m FROM Message m WHERE m.idMessage = :idMessage")
    , @NamedQuery(name = "Message.findByContenu", query = "SELECT m FROM Message m WHERE m.contenu = :contenu")
    , @NamedQuery(name = "Message.findBySujet", query = "SELECT m FROM Message m WHERE m.sujet = :sujet")
    , @NamedQuery(name = "Message.findByIddestinataire", query = "SELECT m FROM Message m WHERE m.iddestinataire = :iddestinataire")
    , @NamedQuery(name = "Message.findByIduser", query = "SELECT m FROM Message m WHERE m.iduser = :iduser")})
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MESSAGE")
    private Integer idMessage;
    @Size(max = 600)
    @Column(name = "CONTENU")
    private String contenu;
    @Size(max = 250)
    @Column(name = "SUJET")
    private String sujet;
    @Column(name = "IDDESTINATAIRE")
    private Integer iddestinataire;
    @Column(name = "IDUSER")
    private Integer iduser;
    @OneToMany(mappedBy = "messageIdMessage")
    private Collection<Directeur> directeurCollection;
    @OneToMany(mappedBy = "messageIdMessage")
    private Collection<Administrateur> administrateurCollection;
    @OneToMany(mappedBy = "messageIdMessage")
    private Collection<Superviseur> superviseurCollection;
    @OneToMany(mappedBy = "messageIdMessage")
    private Collection<Chefprojet> chefprojetCollection;

    public Message() {
    }

    public Message(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public Integer getIddestinataire() {
        return iddestinataire;
    }

    public void setIddestinataire(Integer iddestinataire) {
        this.iddestinataire = iddestinataire;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
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
        hash += (idMessage != null ? idMessage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Message)) {
            return false;
        }
        Message other = (Message) object;
        if ((this.idMessage == null && other.idMessage != null) || (this.idMessage != null && !this.idMessage.equals(other.idMessage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.java.model.Message[ idMessage=" + idMessage + " ]";
    }
    
}
