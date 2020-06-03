/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBJ;

import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author DREAM INFO
 */ 

public class Reservation {

    private String Id_voyages;
    private String Id_user;

    public void setId_voyages(String Id_voyages) {
        this.Id_voyages = Id_voyages;
    }

    public void setId_user(String Id_user) {
        this.Id_user = Id_user;
    }
    
    
    public String getId_voyages() {
        return Id_voyages;
    }

    public String getId_user() {
        return Id_user;
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
//        if (!(object instanceof Reservation)) {
//            return false;
//        }
//        Reservation other = (Reservation) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "OBJ.Reservation[ id=" + id + " ]";
//    }
//    

  
}
