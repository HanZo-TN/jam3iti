/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.Sondage;
import Metier.SondageReponse;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rednaks
 */
public class SondageReponseDao extends DaoAbstraite<SondageReponse> {

           
    private SondageReponseDao () {}
    public static SondageReponseDao instance;
    public static synchronized SondageReponseDao getInstance(){
        if(instance==null)
		instance=new SondageReponseDao();
		return instance;
    }
    @Override
    public void create() {
        Statement st = null;
        try {
            st = this.connect().createStatement();
            st.executeUpdate("create table SondageReponse(id int(4) , id_sondage int(4), choix int(1) , nombreChoix int(30) );");
            System.out.println("la table Sondage Réponse est creer");
        } catch (SQLException ex) {
            Logger.getLogger(SondageDao.class.getName()).log(Level.SEVERE, "creation de la table Sondage Reponse echoué", ex);
        }

    }

   
    public SondageReponse insert(SondageReponse obj) {
     PreparedStatement pst = null;
        try {
                            pst = this.connect().prepareStatement("INSERT INTO SondageReponse (id_sondage,choix, nombreChoix,id) VALUES (?,?,?,?);");
                            pst.setInt(1, obj.getId_sondage());
                            pst.setInt(2, obj.getChoix());
                            pst.setInt(3, obj.getNombreChoix());
                            pst.setInt(4, obj.getId());             
                            pst.executeUpdate();
                            System.out.println("insertion SondageReponse terminer");
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
    public void delete(SondageReponse obj) {
         PreparedStatement pst = null;
        
        try {
            
            pst = this.connect().prepareStatement("DELETE FROM SondageReponse where id=?;");
            pst.setInt(1, obj.getId());
            pst.executeUpdate();
            System.out.println("suppression effectuer");
            
        } catch (SQLException ex) {
            Logger.getLogger(SondageReponseDao.class.getName()).log(Level.SEVERE, "suppression echoué", ex);
        }finally{
            
            try {
                if(pst != null)
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(SondageReponseDao.class.getName()).log(Level.SEVERE, "liberation preparedstatement echoué", ex);
            }
        }

    }

    @Override
    public void update(SondageReponse obj) {
        PreparedStatement pst = null;
        try {
            pst = this.connect().prepareStatement("update SondageReponse set id_sondage=?, choix=?, nombreChoix=? where id=? ;");
            pst.setInt(1, obj.getId_sondage());
            pst.setInt(2, obj.getChoix());
            pst.setInt(3, obj.getNombreChoix());
            pst.setInt(4, obj.getId());
            pst.executeUpdate();
            
            System.out.println("modification SondageReponse effectuée");
            
        } catch (SQLException ex) {
            Logger.getLogger(SondageReponseDao.class.getName()).log(Level.SEVERE, "requete modification echoué", ex);
        }finally{
            try {
                if(pst != null)
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(SondageReponseDao.class.getName()).log(Level.SEVERE, "liberation prepared statement échoué", ex);
            }
            
        }

    }

    @Override
    public SondageReponse find(int id) {
        SondageReponse found = null; 
            PreparedStatement pst = null;
            ResultSet rs = null;
        
        try {
            pst=this.connect().prepareStatement("select * from SondageReponse where id= ?");
            pst.setInt(1, id);
            rs=pst.executeQuery();
            System.out.println("recherche individuelle réussie");
            if (rs.next()) {
               
                found = new SondageReponse(rs.getInt("id"), rs.getInt("id_sondage"), rs.getInt("choix"), rs.getInt("nombreChoix"));
                
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
    public List<SondageReponse> findAll() {
        List<SondageReponse> listS = new ArrayList<SondageReponse>();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = this.connect().createStatement();
            rs = st.executeQuery("select * from SondageReponse");
            System.out.println("recherche général effectuée");
            
            
            while (rs.next()) {
              
                
                SondageReponse sd = new SondageReponse(rs.getInt("id"), rs.getInt("id_sondage"), rs.getInt("choix"), rs.getInt("nombreChoix"));
                
                
               
                               listS.add(sd);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SondageReponseDao.class.getName()).log(Level.SEVERE, "recherche general echoué", ex);
        }finally{
            try {
                if(rs != null)
                rs.close();
                if(st != null)
                st.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(SondageReponseDao.class.getName()).log(Level.SEVERE, "liberation statement || resultset echoué", ex);
            }
        }
        
        
        return listS;

    }
    
}
