/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.DAO;
import Database.Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import obj.Voyage;


public class daoVoyage extends DAO<Voyage>{

    
    Database db;
    public daoVoyage(Database db){
         this.db =db; 
    }
    
    @Override
    public boolean create(Voyage obj) {
        PreparedStatement PS = null;
        try {
            PS = db.con.prepareStatement("INSERT INTO discovery.voyages VALUES (?,?,?,?,?,?,?,?,?);");
            PS.setObject(1, obj.getId_voyages());
            PS.setObject(2, obj.getNom_respo());
            PS.setObject(3, obj.getNom_voyage());
            PS.setObject(4, obj.getDescription());
            PS.setObject(5, obj.getVille());
            PS.setObject(6, obj.getDate());
            PS.setObject(7, obj.getPrix());
            PS.setObject(8, obj.getType().toString());
            PS.setObject(9, obj.getPhoto());
        } catch (SQLException ex) {
            System.out.println("error create daoVoyages");
        }

        return (db.dmlQuery(PS) == 0) ? false : true;
 
    }

    public ResultSet find(String nom, String date, String type) {
        String req;
        req="select * from discovery.voyages where Nom_voyage=? and Date=? and Type_voyage=?";
        PreparedStatement PS = null;
        ResultSet Rs = null;
        try {
            PS = db.con.prepareStatement(req);
            PS.setObject(1, nom);
            PS.setObject(2, date);
            PS.setObject(3, type);
            Rs = PS.executeQuery();
        } catch (SQLException ex) {
            System.out.println("error find daoVoyages");
        }
        return Rs;
    }

    @Override
    public ResultSet all() {
        String req;
        req = "select * from discovery.voyages";
        Statement St;
        ResultSet Rs = null;
        try {
            St = db.con.createStatement();
            Rs = St.executeQuery(req);

        } catch (SQLException ex) {
            System.out.println("PB dans la requete selectall daoVoyages");
        }
        return Rs;
   }

    @Override
    public boolean update(Voyage obj, String id) {
        PreparedStatement PS = null;
        try {
            PS = db.con.prepareStatement("UPDATE discovery.voyages SET Id_respo = ?, Nom_voyage=?, Description = ?, Ville = ?, Date = ?, Prix = ?, Type_voyage = ?, Photo=? WHERE Id_voyages = ?;");

            PS.setObject(1, obj.getNom_respo());
            PS.setObject(2, obj.getNom_voyage());
            PS.setObject(3, obj.getDescription());
            PS.setObject(4, obj.getVille());
            PS.setObject(5, obj.getDate());
            PS.setObject(6, obj.getPrix());
            PS.setObject(7, obj.getType().toString());
            PS.setObject(8, obj.getPhoto());
            PS.setObject(9, id);
        } catch (SQLException ex) {
            System.out.println("error update daoVoyage");
        }

        return (db.dmlQuery(PS) == 0) ? false : true;
   }

    @Override
    public boolean delete(String id) {
        PreparedStatement PS = null;
        try {
            PS = db.con.prepareStatement("DELETE FROM discovery.voyages WHERE Id_voyages = ?;");
            PS.setObject(1, id);
        } catch (SQLException ex) {
            System.out.println("error delete daoVoyage");
        }

        return (db.dmlQuery(PS) == 0) ? false : true;
   }

    @Override
    public ResultSet find(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      
    
   
}
