/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Database.DAO;
import Database.Database;
import OBJ.Admin;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.annotation.ManagedBean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author DREAM INFO
 */

public class daoAdmin extends DAO<Admin>{

     Database db;
    public daoAdmin(Database db){
         this.db =db; 
    }
   
    
    @Override
    public boolean create(Admin obj) {
        PreparedStatement PS = null;
        try {
            PS = db.con.prepareStatement("INSERT INTO discovery.admin VALUES (?,?);");
            PS.setObject(1, obj.getLogin());
            PS.setObject(2, obj.getPassword());
        } catch (SQLException ex) {
            System.out.println("error create daoAdmin");
        }

        return (db.dmlQuery(PS) == 0) ? false : true;
    }

    @Override
    public ResultSet find(String id) {
        String req;
        req="select * from discovery.admin where Login=?";
        PreparedStatement PS = null;
        ResultSet Rs = null;
        try {
            PS = db.con.prepareStatement(req);
            PS.setObject(1, id);
            Rs = PS.executeQuery();
        } catch (SQLException ex) {
            System.out.println("error find daoAdmin");
        }
        return Rs;
   }

    @Override
    public ResultSet all() {
        String req;
        req = "select * from discovery.admin";
        Statement St;
        ResultSet Rs = null;
        try {
            St = db.con.createStatement();
            Rs = St.executeQuery(req);

        } catch (SQLException ex) {
            System.out.println("PB dans la requete selectall daoAdmin");
        }
        return Rs;
   }

    @Override
    public boolean update(Admin obj, String id) {
        PreparedStatement PS = null;
        try {
            PS = db.con.prepareStatement("UPDATE discovery.admin SET Password = ? WHERE Login = ?;");

            PS.setObject(1, obj.getPassword());
            PS.setObject(2, id);
        } catch (SQLException ex) {
            System.out.println("error update daoAdmin");
        }

        return (db.dmlQuery(PS) == 0) ? false : true;
   }

    @Override
    public boolean delete(String id) {
         PreparedStatement PS = null;
        try {
            PS = db.con.prepareStatement("DELETE FROM discovery.admin WHERE Login = ?;");
            PS.setObject(1, id);
        } catch (SQLException ex) {
            System.out.println("error delete daoAdmin");
        }

        return (db.dmlQuery(PS) == 0) ? false : true;
   }

    
    

    
}
