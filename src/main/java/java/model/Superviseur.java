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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "SUPERVISEUR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Superviseur.findAll", query = "SELECT s FROM Superviseur s")
    , @NamedQuery(name = "Superviseur.findByIdMembre", query = "SELECT s FROM Superviseur s WHERE s.idMembre = :idMembre")
    , @NamedQuery(name = "Superviseur.findByEMail", query = "SELECT s FROM Superviseur s WHERE s.eMail = :eMail")
    , @NamedQuery(name = "Superviseur.findByLogin", query = "SELECT s FROM Superviseur s WHERE s.login = :login")
    , @NamedQuery(name = "Superviseur.findByNom", query = "SELECT s FROM Superviseur s WHERE s.nom = :nom")
    , @NamedQuery(name = "Superviseur.findByNumbureau", query = "SELECT s FROM Superviseur s WHERE s.numbureau = :numbureau")
    , @NamedQuery(name = "Superviseur.findByPassword", query = "SELECT s FROM Superviseur s WHERE s.password = :password")
    , @NamedQuery(name = "Superviseur.findByPr\u0629nom", query = "SELECT s FROM Superviseur s WHERE s.pr\u0629nom = :pr\u0629nom")
    , @NamedQuery(name = "Superviseur.findByT\u0629l", query = "SELECT s FROM Superviseur s WHERE s.t\u0629l = :t\u0629l")})
public class Superviseur implements Serializable {

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
    @ManyToMany(mappedBy = "superviseurCollection")
    private Collection<Formation> formationCollection;
    @ManyToMany(mappedBy = "superviseurCollection")
    private Collection<Document> documentCollection;
    @JoinColumn(name = "MESSAGE_ID_MESSAGE", referencedColumnName = "ID_MESSAGE")
    @ManyToOne
    private Message messageIdMessage;
    @JoinColumn(name = "NOTIFICATION_ID", referencedColumnName = "ID")
    @ManyToOne
    private Notification notificationId;

    public Superviseur() {
    }

    public Superviseur(Integer idMembre) {
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
    public Collection<Formation> getFormationCollection() {
        return formationCollection;
    }

    public void setFormationCollection(Collection<Formation> formationCollection) {
        this.formationCollection = formationCollection;
    }

    @XmlTransient
    public Collection<Document> getDocumentCollection() {
        return documentCollection;
    }

    public void setDocumentCollection(Collection<Document> documentCollection) {
        this.documentCollection = documentCollection;
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
        if (!(object instanceof Superviseur)) {
            return false;
        }
        Superviseur other = (Superviseur) object;
        if ((this.idMembre == null && other.idMembre != null) || (this.idMembre != null && !this.idMembre.equals(other.idMembre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.java.model.Superviseur[ idMembre=" + idMembre + " ]";
    }
    
}
