/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBJ;

import java.util.Date;


/**
 *
 * @author DREAM INFO
 */

public abstract class User extends Personne{

    private Date Date_inscrip;
    private String Adresse;

    public void setDate_inscrip(Date Date_inscrip) {
        this.Date_inscrip = Date_inscrip;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }
    
      public Date getDate_inscrip() {
        return Date_inscrip;
    }

    public String getAdresse() {
        return Adresse;
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
//        if (!(object instanceof User)) {
//            return false;
//        }
//        User other = (User) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "OBJ.User[ id=" + id + " ]";
//    }

  
    
}
