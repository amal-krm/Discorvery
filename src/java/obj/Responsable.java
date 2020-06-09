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

public class Responsable extends Personne{

   private String Profil;

    public void setProfil(String Profil) {
        this.Profil = Profil;
    }

    public String getProfil() {
        return Profil;
    }
   
//
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
//        if (!(object instanceof Responsable)) {
//            return false;
//        }
//        Responsable other = (Responsable) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "OBJ.Responsable[ id=" + id + " ]";
//    }
//    

}
