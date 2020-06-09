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

public class Voyage {

    private String Id_voyages;          
    private String Id_respo;            
    private String Description;         
    private String Ville;
    private String Date;
    private Double Prix;
    private Type_Voyage Type;

    public void setType(Type_Voyage Type) {
        this.Type = Type;
    }

    
    
    public Type_Voyage getType() {
        return Type;
    }

    
    
    public void setId_voyages(String Id_voyages) {
        this.Id_voyages = Id_voyages;
    }

    public void setId_respo(String Id_respo) {
        this.Id_respo = Id_respo;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public void setPrix(Double Prix) {
        this.Prix = Prix;
    }

    
    
    public String getId_voyages() {
        return Id_voyages;
    }

    public String getId_respo() {
        return Id_respo;
    }

    public String getDescription() {
        return Description;
    }

    public String getVille() {
        return Ville;
    }

    public String getDate() {
        return Date;
    }

    public Double getPrix() {
        return Prix;
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
//        if (!(object instanceof Voyage)) {
//            return false;
//        }
//        Voyage other = (Voyage) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "OBJ.Voyage[ id=" + id + " ]";
//    }
    
}
