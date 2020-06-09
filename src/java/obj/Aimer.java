/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBJ;



/**
 *
 * @author DREAM INFO
 */

public class Aimer {

  private String Id_user;
  private String Id_voyages;

    public String getId_user() {
        return Id_user;
    }

    public void setId_user(String id) {
        this.Id_user = id;
    }
     public String getId_voyages() {
        return Id_voyages;
    }

    public void setId_voyages(String id) {
        this.Id_voyages = id;
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
//        if (!(object instanceof Aimer)) {
//            return false;
//        }
//        Aimer other = (Aimer) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "classes.Aimer[ id=" + id + " ]";
//    }
//    
}
