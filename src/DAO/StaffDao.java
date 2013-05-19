/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Metier.Staff;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rmh
 */
public class StaffDao extends DaoAbstraite<Staff>{
    
     private StaffDao () {}
    public static StaffDao instance;
    public static synchronized StaffDao getInstance(){
        if(instance==null)
		instance=new StaffDao();
		return instance;
    }

    @Override
    public void create() {
         Statement st = null;
        try {
            st = this.connect().createStatement();
            st.executeUpdate("create table Staff(id int(4) , fonction varchar(50) , nom varchar(30), prenom varchar(30), age int );");
            System.out.println("la table Sondage est creer");
        } catch (SQLException ex) {
            Logger.getLogger(StaffDao.class.getName()).log(Level.SEVERE, "creation de la table Staff echoué", ex);
        }
    }

    @Override
    public Staff insert(Staff obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Staff obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Staff obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Staff find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Staff> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
