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
            pst = this.connect().prepareStatement("update Sondage set question=?, choixa=?, choixb=?, choixc=? where id=? ;");
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
        Sondage found = null; 
            PreparedStatement pst = null;
            ResultSet rs = null;
        
        try {
            pst=this.connect().prepareStatement("select * from Sondage where id= ?");
            pst.setInt(1, id);
            rs=pst.executeQuery();
            System.out.println("recherche individuelle réussie");
            if (rs.next()) {
               
                found = new Sondage(rs.getInt("id"), rs.getString("question"), rs.getString("choixa"), rs.getString("choixb"), rs.getString("choixc"));
            
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SondageDao.class.getName()).log(Level.SEVERE, "recherche individuelle echoué", ex);
        }finally{
            
            
                try {
                    if (rs != null)
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SondageDao.class.getName()).log(Level.SEVERE, "liberation result set echoué", ex);
                }
                
                 
                try {
                    if (pst != null)
                    pst.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SondageDao.class.getName()).log(Level.SEVERE, "liberation prepared statement echoué", ex);
                }
                
        }
        return found;
    }

    @Override
    public List<Sondage> findAll() {
        List<Sondage> listS = new ArrayList<Sondage>();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = this.connect().createStatement();
            rs = st.executeQuery("select * from Sondage");
            System.out.println("recherche général effectuée");
            
            
            while (rs.next()) {
              
                
                Sondage sd = new Sondage(rs.getInt("id"), rs.getString("question"), rs.getString("choixa"), rs.getString("choixb"), rs.getString("choixc"));
                
                
               
                               listS.add(sd);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SondageDao.class.getName()).log(Level.SEVERE, "recherche general echoué", ex);
        }finally{
            try {
                if(rs != null)
                rs.close();
                if(st != null)
                st.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(SondageDao.class.getName()).log(Level.SEVERE, "liberation statement || resultset echoué", ex);
            }
        }
        
        
        return listS;
    }
    
}
