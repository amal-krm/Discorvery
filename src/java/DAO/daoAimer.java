/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.DAO;
import Database.Database;
import OBJ.Aimer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DREAM INFO
 */
public class daoAimer extends DAO<Aimer>{
    
     Database db;
    public daoAimer(Database db){
         this.db =db; 
    }

    @Override
    public boolean create(Aimer obj) {
        PreparedStatement PS = null;
        try {
            PS = db.con.prepareStatement("INSERT INTO discovery.aimer VALUES (?,?);");
            PS.setObject(1, obj.getId_voyages());
            PS.setObject(2, obj.getId_user());
        } catch (SQLException ex) {
            System.out.println("error create daoAimer");
        }

        return (db.dmlQuery(PS) == 0) ? false : true;
 }

    @Override
    public ResultSet find(String id) {
        String req;
        req="select * from discovery.aimer where Id_voyages=?";
        PreparedStatement PS = null;
        ResultSet Rs = null;
        try {
            PS = db.con.prepareStatement(req);
            PS.setObject(1, id);
            Rs = PS.executeQuery();
        } catch (SQLException ex) {
            System.out.println("error find daoAimer");
        }
        return Rs;
   }
    
     public ResultSet find(String id_voyage, String id_user) {
        String req;
        req="select * from discovery.aimer where Id_voyages=? and Id_user=?";
        PreparedStatement PS = null;
        ResultSet Rs = null;
        try {
            PS = db.con.prepareStatement(req);
            PS.setObject(1, id_voyage);
            PS.setObject(2, id_user);
            Rs = PS.executeQuery();
        } catch (SQLException ex) {
            System.out.println("error find daoAimer");
        }
        return Rs;
   }
     
     public static Integer getCount(String id) throws SQLException {
      Database db1 = new Database();
        ResultSet Rs = null;
        String req;
        req = "select count(*) from discovery.aimer where Id_voyages=?";
       PreparedStatement PS = null;
        try {
            PS = db1.con.prepareStatement(req);
            PS.setObject(1, id);
            Rs = PS.executeQuery();
        } catch (SQLException ex) {
            System.out.println("error find daoAimer");
        }
        Rs.next();
        return (Rs.getInt(1));

    }
    

    @Override
    public ResultSet all() {
        String req;
        req = "select * from discovery.aimer";
        Statement St;
        ResultSet Rs = null;
        try {
            St = db.con.createStatement();
            Rs = St.executeQuery(req);

        } catch (SQLException ex) {
            System.out.println("PB dans la requete selectall daoAimer");
        }
        return Rs;
 }

    @Override
    public boolean update(Aimer obj, String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public boolean delete(String id_voyage, String id_user) {
        PreparedStatement PS = null;
        try {
            PS = db.con.prepareStatement("DELETE FROM discovery.aimer WHERE Id_voyages = ? and Id_user =?;");
            PS.setObject(1, id_voyage);
            PS.setObject(2, id_user);
        } catch (SQLException ex) {
            System.out.println("error delete daoAimer");
        }

        return (db.dmlQuery(PS) == 0) ? false : true;
  }

    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
