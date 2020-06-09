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

public abstract class Personne {

   private String Id;
   private String Nom;
   private Date Date_naissance;
   private String Email;
   private String Tel;

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setDate_naissance(Date Date_naissance) {
        this.Date_naissance = Date_naissance;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

   
   
    public String getId() {
        return Id;
    }

    public String getNom() {
        return Nom;
    }

    public Date getDate_naissance() {
        return Date_naissance;
    }

    public String getEmail() {
        return Email;
    }

    public String getTel() {
        return Tel;
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
//        if (!(object instanceof Personne)) {
//            return false;
//        }
//        Personne other = (Personne) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "OBJ.Personne[ id=" + id + " ]";
//    }
    
}
