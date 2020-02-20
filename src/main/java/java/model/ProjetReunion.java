/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author selma
 */
@Entity
@Table(name = "PROJET_REUNION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProjetReunion.findAll", query = "SELECT p FROM ProjetReunion p")
    , @NamedQuery(name = "ProjetReunion.findByProjetIdProjet", query = "SELECT p FROM ProjetReunion p WHERE p.projetReunionPK.projetIdProjet = :projetIdProjet")
    , @NamedQuery(name = "ProjetReunion.findByReunionsIdR\u0629union", query = "SELECT p FROM ProjetReunion p WHERE p.projetReunionPK.reunionsIdR\u0629union = :reunionsIdR\u0629union")})
public class ProjetReunion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProjetReunionPK projetReunionPK;
    @JoinColumn(name = "REUNIONS_ID_R\u0629UNION", referencedColumnName = "ID_R\u0629UNION", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Reunion reunion;

    public ProjetReunion() {
    }

    public ProjetReunion(ProjetReunionPK projetReunionPK) {
        this.projetReunionPK = projetReunionPK;
    }

    public ProjetReunion(long projetIdProjet, long reunionsIdRةunion) {
        this.projetReunionPK = new ProjetReunionPK(projetIdProjet, reunionsIdRةunion);
    }

    public ProjetReunionPK getProjetReunionPK() {
        return projetReunionPK;
    }

    public void setProjetReunionPK(ProjetReunionPK projetReunionPK) {
        this.projetReunionPK = projetReunionPK;
    }

    public Reunion getReunion() {
        return reunion;
    }

    public void setReunion(Reunion reunion) {
        this.reunion = reunion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (projetReunionPK != null ? projetReunionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProjetReunion)) {
            return false;
        }
        ProjetReunion other = (ProjetReunion) object;
        if ((this.projetReunionPK == null && other.projetReunionPK != null) || (this.projetReunionPK != null && !this.projetReunionPK.equals(other.projetReunionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.java.model.ProjetReunion[ projetReunionPK=" + projetReunionPK + " ]";
    }
    
}
