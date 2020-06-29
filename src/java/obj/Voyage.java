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


public class Voyage {

    private String Id_voyages;          
    private String Id_respo;     
    private String Nom_voyage;
    private String Description;         
    private String Ville;
    private String Date;
    private Double Prix;
    private Type_Voyage Type;
    private String Photo;

    public Voyage(String Id_voyages, String Id_respo, String Nom, String Description, String Ville, String Date, Double Prix, Type_Voyage Type, String image) {
        this.Id_voyages = Id_voyages;
        this.Id_respo = Id_respo;
        this.Nom_voyage = Nom;
        this.Description = Description;
        this.Ville = Ville;
        this.Date = Date;
        this.Prix = Prix;
        this.Type = Type;
        this.Photo = image;
    }

    public void setType(Type_Voyage Type) {
        this.Type = Type;
    }

    
    
    public Type_Voyage getType() {
        return Type;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setNom_voyage(String Nom_voyage) {
        this.Nom_voyage = Nom_voyage;
    }

    public String getNom_voyage() {
        return Nom_voyage;
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

    

    
}
