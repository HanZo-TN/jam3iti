/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.Joueur;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rmh
 */
public class JoueurDao extends DaoAbstraite<Joueur>{
    
    private JoueurDao () {}
    public static JoueurDao instance;
    public static synchronized JoueurDao getInstance(){
        if(instance==null)
		instance=new JoueurDao();
		return instance;
    }

    @Override
    public void create() {
        Statement st;
        try {
            st = this.connect().createStatement();
            st.executeUpdate("create table Joueur(id int(4) not null, nom varchar(30) not null, prenom varchar(30) not null,email varchar(30) not null, post varchar(30) not null, salaire float not null, taille float not null, poid float not null, datenaiss date not null );");
            System.out.println("la table Joueur est creer");
        } catch (SQLException ex) {
            Logger.getLogger(JoueurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
			
    }

    @Override
    public Joueur insert(Joueur obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Joueur obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Joueur obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Joueur find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
