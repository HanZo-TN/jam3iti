/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Metier.Sondage;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author rmh
 */
public class SondageDao extends DaoAbstraite<Sondage>{
        
         private SondageDao () {}
    public static SondageDao instance;
    public static synchronized SondageDao getInstance(){
        if(instance==null)
		instance=new SondageDao();
		return instance;
    }

    @Override
    public void create() {
        Statement st = null;
        try {
            st = this.connect().createStatement();
            st.executeUpdate("create table Sondage(id int(4) , question varchar(50) , choixa varchar(30), choixb varchar(30), choixc varchar(30) );");
            System.out.println("la table Sondage est creer");
        } catch (SQLException ex) {
            Logger.getLogger(SondageDao.class.getName()).log(Level.SEVERE, "creation de la table Sondage echoué", ex);
        }
    }

    @Override
    public Sondage insert(Sondage obj) {
        PreparedStatement pst = null;
        try {
                            pst = this.connect().prepareStatement("INSERT INTO Sondage (question,choixa,choixb,choixc,id) VALUES (?,?,?,?,?);");
                            pst.setString(1, obj.getQuestion());
                            pst.setString(2, obj.getChoixA());
                            pst.setString(3, obj.getChoixB());
                            pst.setString(4, obj.getChoixC());
                            
                            pst.setInt(5, obj.getId());
                            
                            pst.executeUpdate();
                            System.out.println("insertion Titre terminer");
        } catch (SQLException ex) {
            Logger.getLogger(SondageDao.class.getName()).log(Level.SEVERE, "insertion echouer", ex);
        }finally{
        
            try {
            if(pst != null)
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(SondageDao.class.getName()).log(Level.SEVERE, "liberation du preparedstatement echouée", ex);
        }
            
        }
        
        
        
        return obj;
    }

    @Override
    public void delete(Sondage obj) {
        PreparedStatement pst = null;
        
        try {
            
            pst = this.connect().prepareStatement("DELETE FROM Sondage where id=?;");
            pst.setInt(1, obj.getId());
            pst.executeUpdate();
            System.out.println("suppression effectuer");
            
        } catch (SQLException ex) {
            Logger.getLogger(SondageDao.class.getName()).log(Level.SEVERE, "suppression echoué", ex);
        }finally{
            
            try {
                if(pst != null)
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(SondageDao.class.getName()).log(Level.SEVERE, "liberation preparedstatement echoué", ex);
            }
        }
    }

    @Override
    public void update(Sondage obj) {
        PreparedStatement pst = null;
        try {
            pst = this.connect().prepareStatement("update Sondage set question=?, choixa=?, choixb, choixc where id=? ;");
            pst.setString(1, obj.getQuestion());
            pst.setString(2, obj.getChoixA());
            pst.setString(3, obj.getChoixB());
            pst.setString(4, obj.getChoixC());
            pst.setInt(5, obj.getId());
            pst.executeUpdate();
            
            System.out.println("modification Sondage effectuée");
            
        } catch (SQLException ex) {
            Logger.getLogger(SondageDao.class.getName()).log(Level.SEVERE, "requete modification echoué", ex);
        }finally{
            try {
                if(pst != null)
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(SondageDao.class.getName()).log(Level.SEVERE, "liberation prepared statement échoué", ex);
            }
            
        }
    }

    @Override
    public Sondage find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sondage> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
