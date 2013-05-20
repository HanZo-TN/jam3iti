/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.Match;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rmh
 */
public class MatchDao extends DaoAbstraite<Match>{
    
    private MatchDao () {}
    public static MatchDao instance;
    public static synchronized MatchDao getInstance(){
        if(instance==null)
		instance=new MatchDao();
		return instance;
    }

    @Override
    public void create() {
        Statement st = null;
        try {
            st = this.connect().createStatement();
            st.executeUpdate("create table Matches(id int(4) AUTO_INCREMENT Primary Key, equipeA varchar(30) , equipeB varchar(30) , scoreA int(2) , scoreB int(2) , datematch date  );");
            System.out.println("la table Match est creer");
        } catch (SQLException ex) {
            Logger.getLogger(MatchDao.class.getName()).log(Level.SEVERE, "creation de la table Match echoué", ex);
        }
    }

    @Override
    public Match insert(Match obj) {
        PreparedStatement pst = null;
        try {
                            pst = this.connect().prepareStatement("INSERT INTO Matches (equipeA, equipeB,datematch,scoreA,scoreB,id) VALUES (?,?,?,?,?,?);");
                            pst.setString(1, obj.getEquipeA());
                            pst.setString(2, obj.getEquipeB());
                            pst.setDate(3, obj.getDatematch());
                            pst.setInt(4, obj.getScoreA());
                            pst.setInt(5, obj.getScoreB());
                            pst.setInt(6, obj.getId());
                            
                            pst.executeUpdate();
                            System.out.println("insertion Match terminer");
        } catch (SQLException ex) {
            Logger.getLogger(MatchDao.class.getName()).log(Level.SEVERE, "insertion echouer", ex);
        }finally{
        
            try {
            if(pst != null)
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(MatchDao.class.getName()).log(Level.SEVERE, "liberation du preparedstatement echouée", ex);
        }
            
        }
        
        
        
        return obj;
        
    }

    @Override
    public void delete(Match obj) {
        PreparedStatement pst = null;
        
        try {
            
            pst = this.connect().prepareStatement("DELETE FROM Matches where id=?;");
            pst.setInt(1, obj.getId());
            pst.executeUpdate();
            System.out.println("suppression effectuer");
            
        } catch (SQLException ex) {
            Logger.getLogger(MatchDao.class.getName()).log(Level.SEVERE, "suppression echoué", ex);
        }finally{
            
            try {
                if(pst != null)
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(MatchDao.class.getName()).log(Level.SEVERE, "liberation preparedstatement echoué", ex);
            }
        }
    }

    @Override
    public void update(Match obj) {
        PreparedStatement pst = null;
        try {
            pst = this.connect().prepareStatement("update Matches set equipeA=?, equipeB=?, scoreA=?, scoreB=?, datematch=? where id=? ;");
            pst.setString(1, obj.getEquipeA());
            pst.setString(2, obj.getEquipeB());
            pst.setInt(3, obj.getScoreA());
            pst.setInt(4, obj.getScoreB());
            pst.setDate(5, obj.getDatematch());
            pst.setInt(6, obj.getId());
            pst.executeUpdate();
            
            System.out.println("modification Match effectuée");
            
        } catch (SQLException ex) {
            Logger.getLogger(MatchDao.class.getName()).log(Level.SEVERE, "requete modification echoué", ex);
        }finally{
            try {
                if(pst != null)
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(MatchDao.class.getName()).log(Level.SEVERE, "liberation prepared statement échoué", ex);
            }
            
        }
    }

    @Override
    public Match find(int id) {
        Match found = null; 
            PreparedStatement pst = null;
            ResultSet rs = null;
        
        try {
            pst=this.connect().prepareStatement("select * from Matches where id= ?");
            pst.setInt(1, id);
            rs=pst.executeQuery();
            System.out.println("recherche individuelle réussie");
            if (rs.next()) {
               
                found = new Match(rs.getInt("id"), rs.getString("equipeA"), rs.getString("equipeB"),rs.getInt("scoreA"), rs.getInt("scoreB"), rs.getDate("datematch"));
            
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MatchDao.class.getName()).log(Level.SEVERE, "recherche individuelle echoué", ex);
        }finally{
            
            
                try {
                    if (rs != null)
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MatchDao.class.getName()).log(Level.SEVERE, "liberation result set echoué", ex);
                }
                
                 
                try {
                    if (pst != null)
                    pst.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MatchDao.class.getName()).log(Level.SEVERE, "liberation prepared statement echoué", ex);
                }
                
        }
        return found;
    }

    @Override
    public List<Match> findAll() {
        List<Match> listM = new ArrayList<Match>();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = this.connect().createStatement();
            rs = st.executeQuery("select * from Matches");
            System.out.println("recherche général effectuée");
            
            
            while (rs.next()) {
              
                
                Match mt = new Match(rs.getInt("id"), rs.getString("equipeA"), rs.getString("equipeB"),rs.getInt("scoreA"), rs.getInt("scoreB"), rs.getDate("datematch"));
                
                
               
                               listM.add(mt);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MatchDao.class.getName()).log(Level.SEVERE, "recherche general echoué", ex);
        }finally{
            try {
                if(rs != null)
                rs.close();
                if(st != null)
                st.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(MatchDao.class.getName()).log(Level.SEVERE, "liberation statement || resultset echoué", ex);
            }
        }
        
        
        return listM;
    }
    
}
