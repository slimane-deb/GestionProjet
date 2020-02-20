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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Table(name = "CHEFPROJET")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chefprojet.findAll", query = "SELECT c FROM Chefprojet c")
    , @NamedQuery(name = "Chefprojet.findByIdMembre", query = "SELECT c FROM Chefprojet c WHERE c.idMembre = :idMembre")
    , @NamedQuery(name = "Chefprojet.findByEMail", query = "SELECT c FROM Chefprojet c WHERE c.eMail = :eMail")
    , @NamedQuery(name = "Chefprojet.findByLogin", query = "SELECT c FROM Chefprojet c WHERE c.login = :login")
    , @NamedQuery(name = "Chefprojet.findByNom", query = "SELECT c FROM Chefprojet c WHERE c.nom = :nom")
    , @NamedQuery(name = "Chefprojet.findByNumbureau", query = "SELECT c FROM Chefprojet c WHERE c.numbureau = :numbureau")
    , @NamedQuery(name = "Chefprojet.findByPassword", query = "SELECT c FROM Chefprojet c WHERE c.password = :password")
    , @NamedQuery(name = "Chefprojet.findByPr\u0629nom", query = "SELECT c FROM Chefprojet c WHERE c.pr\u0629nom = :pr\u0629nom")
    , @NamedQuery(name = "Chefprojet.findByT\u0629l", query = "SELECT c FROM Chefprojet c WHERE c.t\u0629l = :t\u0629l")})
public class Chefprojet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MEMBRE")
    private Integer idMembre;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "E_MAIL")
    private String eMail;
    @Size(max = 50)
    @Column(name = "LOGIN")
    private String login;
    @Size(max = 50)
    @Column(name = "NOM")
    private String nom;
    @Column(name = "NUMBUREAU")
    private Integer numbureau;
    @Size(max = 8)
    @Column(name = "PASSWORD")
    private String password;
    @Size(max = 50)
    @Column(name = "PR\u0629NOM")
    private String prةnom;
    @Size(max = 10)
    @Column(name = "T\u0629L")
    private String tةl;
    @JoinTable(name = "CHEFPROJET_PROJET", joinColumns = {
        @JoinColumn(name = "CHEFPROJET_ID_MEMBRE", referencedColumnName = "ID_MEMBRE")}, inverseJoinColumns = {
        @JoinColumn(name = "PROJETS_ID_PROJET", referencedColumnName = "ID_PROJET")})
    @ManyToMany
    private Collection<Projet> projetCollection;
    @JoinTable(name = "PROJET_CHEFPROJET", joinColumns = {
        @JoinColumn(name = "CHEFPROJETS_ID_MEMBRE", referencedColumnName = "ID_MEMBRE")}, inverseJoinColumns = {
        @JoinColumn(name = "PROJET_ID_PROJET", referencedColumnName = "ID_PROJET")})
    @ManyToMany
    private Collection<Projet> projetCollection1;
    @JoinTable(name = "CHEFPROJET_DOCUMENT", joinColumns = {
        @JoinColumn(name = "CHEFPROJET_ID_MEMBRE", referencedColumnName = "ID_MEMBRE")}, inverseJoinColumns = {
        @JoinColumn(name = "DOCUMENTS_ID_DOC", referencedColumnName = "ID_DOC")})
    @ManyToMany
    private Collection<Document> documentCollection;
    @JoinTable(name = "CHEFPROJET_FORMATION", joinColumns = {
        @JoinColumn(name = "CHEFPROJET_ID_MEMBRE", referencedColumnName = "ID_MEMBRE")}, inverseJoinColumns = {
        @JoinColumn(name = "FORMATIONS_ID", referencedColumnName = "ID")})
    @ManyToMany
    private Collection<Formation> formationCollection;
    @JoinColumn(name = "MESSAGE_ID_MESSAGE", referencedColumnName = "ID_MESSAGE")
    @ManyToOne
    private Message messageIdMessage;
    @JoinColumn(name = "NOTIFICATION_ID", referencedColumnName = "ID")
    @ManyToOne
    private Notification notificationId;

    public Chefprojet() {
    }

    public Chefprojet(Integer idMembre) {
        this.idMembre = idMembre;
    }

    public Integer getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(Integer idMembre) {
        this.idMembre = idMembre;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNumbureau() {
        return numbureau;
    }

    public void setNumbureau(Integer numbureau) {
        this.numbureau = numbureau;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrةnom() {
        return prةnom;
    }

    public void setPrةnom(String prةnom) {
        this.prةnom = prةnom;
    }

    public String getTةl() {
        return tةl;
    }

    public void setTةl(String tةl) {
        this.tةl = tةl;
    }

    @XmlTransient
    public Collection<Projet> getProjetCollection() {
        return projetCollection;
    }

    public void setProjetCollection(Collection<Projet> projetCollection) {
        this.projetCollection = projetCollection;
    }

    @XmlTransient
    public Collection<Projet> getProjetCollection1() {
        return projetCollection1;
    }

    public void setProjetCollection1(Collection<Projet> projetCollection1) {
        this.projetCollection1 = projetCollection1;
    }

    @XmlTransient
    public Collection<Document> getDocumentCollection() {
        return documentCollection;
    }

    public void setDocumentCollection(Collection<Document> documentCollection) {
        this.documentCollection = documentCollection;
    }

    @XmlTransient
    public Collection<Formation> getFormationCollection() {
        return formationCollection;
    }

    public void setFormationCollection(Collection<Formation> formationCollection) {
        this.formationCollection = formationCollection;
    }

    public Message getMessageIdMessage() {
        return messageIdMessage;
    }

    public void setMessageIdMessage(Message messageIdMessage) {
        this.messageIdMessage = messageIdMessage;
    }

    public Notification getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Notification notificationId) {
        this.notificationId = notificationId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMembre != null ? idMembre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chefprojet)) {
            return false;
        }
        Chefprojet other = (Chefprojet) object;
        if ((this.idMembre == null && other.idMembre != null) || (this.idMembre != null && !this.idMembre.equals(other.idMembre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.java.model.Chefprojet[ idMembre=" + idMembre + " ]";
    }
    
}
