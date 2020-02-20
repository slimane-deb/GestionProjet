/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author selma
 */
@Embeddable
public class ProjetReunionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "PROJET_ID_PROJET")
    private long projetIdProjet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REUNIONS_ID_R\u0629UNION")
    private long reunionsIdRةunion;

    public ProjetReunionPK() {
    }

    public ProjetReunionPK(long projetIdProjet, long reunionsIdRةunion) {
        this.projetIdProjet = projetIdProjet;
        this.reunionsIdRةunion = reunionsIdRةunion;
    }

    public long getProjetIdProjet() {
        return projetIdProjet;
    }

    public void setProjetIdProjet(long projetIdProjet) {
        this.projetIdProjet = projetIdProjet;
    }

    public long getReunionsIdRةunion() {
        return reunionsIdRةunion;
    }

    public void setReunionsIdRةunion(long reunionsIdRةunion) {
        this.reunionsIdRةunion = reunionsIdRةunion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) projetIdProjet;
        hash += (int) reunionsIdRةunion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProjetReunionPK)) {
            return false;
        }
        ProjetReunionPK other = (ProjetReunionPK) object;
        if (this.projetIdProjet != other.projetIdProjet) {
            return false;
        }
        if (this.reunionsIdRةunion != other.reunionsIdRةunion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.java.model.ProjetReunionPK[ projetIdProjet=" + projetIdProjet + ", reunionsIdR\u0629union=" + reunionsIdRةunion + " ]";
    }
    
}
