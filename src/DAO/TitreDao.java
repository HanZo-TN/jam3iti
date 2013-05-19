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
         PreparedStatement pst = null;
        try {
                            pst = this.connect().prepareStatement("INSERT INTO Titre (nom,annee,id) VALUES (?,?,?);");
                            pst.setString(1, obj.getNom());
                            pst.setString(2, obj.getAnnee());
                            
                            pst.setInt(3, obj.getId());
                            
                            pst.executeUpdate();
                            System.out.println("insertion Titre terminer");
        } catch (SQLException ex) {
            Logger.getLogger(TitreDao.class.getName()).log(Level.SEVERE, "insertion echouer", ex);
        }finally{
        
            try {
            if(pst != null)
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(TitreDao.class.getName()).log(Level.SEVERE, "liberation du preparedstatement echouée", ex);
        }
            
        }
        
        
        
        return obj;
    }

    @Override
    public void delete(Titre obj) {
        PreparedStatement pst = null;
        
        try {
            
            pst = this.connect().prepareStatement("DELETE FROM Titre where id=?;");
            pst.setInt(1, obj.getId());
            pst.executeUpdate();
            System.out.println("suppression effectuer");
            
        } catch (SQLException ex) {
            Logger.getLogger(TitreDao.class.getName()).log(Level.SEVERE, "suppression echoué", ex);
        }finally{
            
            try {
                if(pst != null)
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(TitreDao.class.getName()).log(Level.SEVERE, "liberation preparedstatement echoué", ex);
            }
        }
    }

    @Override
    public void update(Titre obj) {
        PreparedStatement pst = null;
        try {
            pst = this.connect().prepareStatement("update Titre set nom=?, annee=?, where id=? ;");
            pst.setString(1, obj.getNom());
            pst.setString(2, obj.getAnnee());
            pst.setInt(3, obj.getId());
            pst.executeUpdate();
            
            System.out.println("modification Titre effectuée");
            
        } catch (SQLException ex) {
            Logger.getLogger(TitreDao.class.getName()).log(Level.SEVERE, "requete modification echoué", ex);
        }finally{
            try {
                if(pst != null)
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(TitreDao.class.getName()).log(Level.SEVERE, "liberation prepared statement échoué", ex);
            }
            
        }
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
