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
        
        Titre found = null; 
            PreparedStatement pst = null;
            ResultSet rs = null;
        
        try {
            pst=this.connect().prepareStatement("select * from Titre where id= ?");
            pst.setInt(1, id);
            rs=pst.executeQuery();
            System.out.println("recherche individuelle réussie");
            if (rs.next()) {
               
                found = new Titre(rs.getInt("id"), rs.getString("nom"), rs.getString("annee"));
            
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TitreDao.class.getName()).log(Level.SEVERE, "recherche individuelle echoué", ex);
        }finally{
            
            
                try {
                    if (rs != null)
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TitreDao.class.getName()).log(Level.SEVERE, "liberation result set echoué", ex);
                }
                
                 
                try {
                    if (pst != null)
                    pst.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TitreDao.class.getName()).log(Level.SEVERE, "liberation prepared statement echoué", ex);
                }
                
        }
        return found;
    }

    @Override
    public List<Titre> findAll() {
        List<Titre> listT = new ArrayList<Titre>();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = this.connect().createStatement();
            rs = st.executeQuery("select * from Titre");
            System.out.println("recherche général effectuée");
            
            
            while (rs.next()) {
              
                
                Titre tr = new Titre(rs.getInt("id"), rs.getString("nom"), rs.getString("annee"));
                
                
               
                               listT.add(tr);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(TitreDao.class.getName()).log(Level.SEVERE, "recherche general echoué", ex);
        }finally{
            try {
                if(rs != null)
                rs.close();
                if(st != null)
                st.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(TitreDao.class.getName()).log(Level.SEVERE, "liberation statement || resultset echoué", ex);
            }
        }
        
        
        return listT;
    }
    
}
