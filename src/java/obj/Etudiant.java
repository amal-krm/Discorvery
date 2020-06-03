/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBJ;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author DREAM INFO
 */

public class Etudiant extends User {

   private String Id_etudiant;

    public String getId_etudiant() {
        return Id_etudiant;
    }

    public void setId_etudiant(String Id_etudiant) {
        this.Id_etudiant = Id_etudiant;
    }

   
   
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (id != null ? id.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Etudiant)) {
//            return false;
//        }
//        Etudiant other = (Etudiant) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "OBJ.Etudiant[ id=" + id + " ]";
//    }
//    
}
