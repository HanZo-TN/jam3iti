/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.Joueur;
import java.sql.*;
import java.util.List;
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
            Logger.getLogger(JoueurDao.class.getName()).log(Level.SEVERE, "creation de la table joueur echoué", ex);
        }
			
    }

    @Override
    public Joueur insert(Joueur obj) {
        PreparedStatement pst = null;
        try {
                            pst = this.connect().prepareStatement("INSERT INTO player (nom, prenom,dateNaiss,post,salaire,poid,taille,email) VALUES (?,?,?,?,?,?,?,?);");
                            pst.setString(1, obj.getNomJoueur());
                            pst.setString(2, obj.getPrenomJoueur());
                            pst.setDate(3, obj.getDatenaiss());
                            pst.setString(4, obj.getPostJoueur());
                            pst.setFloat(5, obj.getSalaire());
                            pst.setFloat(6, obj.getPoidsJoueur());
                            pst.setFloat(7, obj.getTailleJoueur());
                            pst.setString(8,obj.getEmail());
                            
                            pst.executeUpdate();
                            System.out.println("insertion Joueur terminer");
        } catch (SQLException ex) {
            Logger.getLogger(JoueurDao.class.getName()).log(Level.SEVERE, "insertion echouer", ex);
        }finally{
        
            try {
            if(pst != null)
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(JoueurDao.class.getName()).log(Level.SEVERE, "liberation du preparedstatement echouée", ex);
        }
            
        }
        
        
        
        return obj;
        
    }

    @Override
    public void delete(Joueur obj) {
        
    }

    @Override
    public void update(Joueur obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Joueur find(int id) {
            Joueur found = null; 
            PreparedStatement pst = null;
            ResultSet rs = null;
        
        try {
            pst=this.connect().prepareStatement("select * from Joueur where id= ?");
            pst.setInt(1, id);
            rs=pst.executeQuery();
            System.out.println("recherche individuelle réussie");
            if (rs.next()) {
               
                found = new Joueur(rs.getInt("id"), rs.getString(",om"), rs.getString("prenom"), rs.getDate("dateNaiss"), rs.getString("post"),rs.getFloat("salaire"), rs.getFloat("poid"), rs.getFloat("taille"), rs.getString("email"));
            
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(JoueurDao.class.getName()).log(Level.SEVERE, "recherche individuelle echoué", ex);
        }finally{
            
            
                try {
                    if (rs != null)
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(JoueurDao.class.getName()).log(Level.SEVERE, "liberation result set echoué", ex);
                }
                
                 
                try {
                    if (pst != null)
                    pst.close();
                } catch (SQLException ex) {
                    Logger.getLogger(JoueurDao.class.getName()).log(Level.SEVERE, "liberation prepared statement echoué", ex);
                }
                
        }
        return found;
    }
    

    @Override
    public List<Joueur> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
