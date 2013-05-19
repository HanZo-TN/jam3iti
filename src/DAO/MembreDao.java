/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Metier.Membre;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rmh
 */
public class MembreDao extends DaoAbstraite<Membre>{
    
         private MembreDao () {}
    public static MembreDao instance;
    public static synchronized MembreDao getInstance(){
        if(instance==null)
		instance=new MembreDao();
		return instance;
    }

    @Override
    public void create() {
         Statement st = null;
        try {
            st = this.connect().createStatement();
            st.executeUpdate("create table Membre(id int(4) , nom varchar(30) , prenom varchar(30), email varchar(30),mdp(30), status varchar(30) );");
            System.out.println("la table Membre est creer");
        } catch (SQLException ex) {
            Logger.getLogger(MembreDao.class.getName()).log(Level.SEVERE, "creation de la table Membre echoué", ex);
        }
    }

    @Override
    public Membre insert(Membre obj) {
        PreparedStatement pst = null;
        try {
                            pst = this.connect().prepareStatement("INSERT INTO Membre (email,nom,prenom,mdp,status,id) VALUES (?,?,?,?,?,?);");
                            pst.setString(1, obj.getEmail());
                            pst.setString(2, obj.getNomMembre());
                            pst.setString(3, obj.getPrenomMembre());
                            pst.setString(4, obj.getMdp());
                            pst.setString(5, obj.getStatus());
                            pst.setInt(6, obj.getIdMembre());
                            
                            pst.executeUpdate();
                            System.out.println("insertion Membre terminer");
        } catch (SQLException ex) {
            Logger.getLogger(MembreDao.class.getName()).log(Level.SEVERE, "insertion echouer", ex);
        }finally{
        
            try {
            if(pst != null)
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(MembreDao.class.getName()).log(Level.SEVERE, "liberation du preparedstatement echouée", ex);
        }
            
        }
        
        
        
        return obj;
    }

    @Override
    public void delete(Membre obj) {
        PreparedStatement pst = null;
        
        try {
            
            pst = this.connect().prepareStatement("DELETE FROM Membre where id=?;");
            pst.setInt(1, obj.getIdMembre());
            pst.executeUpdate();
            System.out.println("suppression effectuer");
            
        } catch (SQLException ex) {
            Logger.getLogger(MembreDao.class.getName()).log(Level.SEVERE, "suppression echoué", ex);
        }finally{
            
            try {
                if(pst != null)
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(MembreDao.class.getName()).log(Level.SEVERE, "liberation preparedstatement echoué", ex);
            }
        }
    }

    @Override
    public void update(Membre obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Membre find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Membre> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
