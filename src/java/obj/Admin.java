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

public class Admin {

   private String Login;
   private String Password;

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
   

       public String getLogin() {
        return Login;
    }

    public String getPassword() {
        return Password;
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
//        if (!(object instanceof Admin)) {
//            return false;
//        }
//        Admin other = (Admin) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "OBJ.Admin[ id=" + id + " ]";
//    }

 
}
