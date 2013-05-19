/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Metier.Titre;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author rmh
 */
public class TitreDao extends DaoAbstraite<Titre>{
    
    private TitreDao () {}
    public static TitreDao instance;
    public static synchronized TitreDao getInstance(){
        if(instance==null)
		instance=new TitreDao();
		return instance;
    }

    @Override
    public void create() {
        Statement st = null;
        try {
            st = this.connect().createStatement();
            st.executeUpdate("create table Titre(id int(4) , nom varchar(30) , annee varchar(30) );");
            System.out.println("la table Titre est creer");
        } catch (SQLException ex) {
            Logger.getLogger(TitreDao.class.getName()).log(Level.SEVERE, "creation de la table Titre echoué", ex);
        }
    }

    @Override
    public Titre insert(Titre obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Titre obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Titre obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Titre find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Titre> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
