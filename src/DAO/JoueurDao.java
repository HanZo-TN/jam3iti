/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.Joueur;
import java.sql.*;
import java.util.*;
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
        PreparedStatement pst = null;
        
        try {
            
            pst = this.connect().prepareStatement("delete from Joueur where id=? ;");
            pst.setInt(1, obj.getIdJoueur());
            System.out.println("suppression effectuer");
            
        } catch (SQLException ex) {
            Logger.getLogger(JoueurDao.class.getName()).log(Level.SEVERE, "suppression echoué", ex);
        }finally{
            
            try {
                if(pst != null)
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(JoueurDao.class.getName()).log(Level.SEVERE, "liberation preparedstatement echoué", ex);
            }
        }
        
    }

    @Override
    public void update(Joueur obj) {
        PreparedStatement pst = null;
        try {
            pst = this.connect().prepareStatement("update Joueur set nom=?, prenom=?, post=?, taille=?, poids=?, email=?, salaire=?, datenaiss=? where id=? ;");
            pst.setString(1, obj.getNomJoueur());
            pst.setString(2, obj.getPrenomJoueur());
            pst.setString(3, obj.getPostJoueur());
            pst.setFloat(4, obj.getTailleJoueur());
            pst.setFloat(5, obj.getPoidsJoueur());
            pst.setString(6, obj.getEmail());
            pst.setFloat(7, obj.getSalaire());
            pst.setDate(8, obj.getDatenaiss());
            pst.setInt(9, obj.getIdJoueur());
            pst.executeUpdate();
            
            System.out.println("modification joueur effectuée");
            
        } catch (SQLException ex) {
            Logger.getLogger(JoueurDao.class.getName()).log(Level.SEVERE, "requete modification echoué", ex);
        }finally{
            try {
                if(pst != null)
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(JoueurDao.class.getName()).log(Level.SEVERE, "liberation prepared statement échoué", ex);
            }
            
        }
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
        List<Joueur> listJ = new ArrayList<Joueur>();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = this.connect().createStatement();
            rs = st.executeQuery("select * from Joueur");
            System.out.println("recherche général effectuée");
            
            
            while (rs.next()) {
              
                
                Joueur jr = new Joueur(rs.getInt("id"), rs.getString("nom"),rs.getString("prenom"),rs.getDate("datenaiss"),rs.getString("post"),rs.getFloat("salaire"),rs.getFloat("taille"),rs.getFloat("poid"),rs.getString("email"));
                
                
               
                               listJ.add(jr);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(JoueurDao.class.getName()).log(Level.SEVERE, "recherche general echoué", ex);
        }finally{
            try {
                if(rs != null)
                rs.close();
                if(st != null)
                st.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(JoueurDao.class.getName()).log(Level.SEVERE, "liberation statement || resultset echoué", ex);
            }
        }
        
        
        return listJ;
    }
    
}
