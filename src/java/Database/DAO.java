/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;


import java.sql.ResultSet;



/**
 *
 * @author DREAM INFO
 * @param <T>
 */

public abstract class DAO<T> {

    protected Database db;
    
   public abstract boolean create(T obj); 
   public abstract ResultSet find(String id); 
   public abstract ResultSet all(); 
   public abstract boolean update(T obj , String id);
   public abstract boolean delete (String id);


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
//        if (!(object instanceof DAO)) {
//            return false;
//        }
//        DAO other = (DAO) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "Database.DAO[ id=" + id + " ]";
//    }
//    
}
