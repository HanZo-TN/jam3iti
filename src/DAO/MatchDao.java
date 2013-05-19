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
            st.executeUpdate("create table Match(id int(4) , equipeA varchar(30) , equipeB varchar(30) , scoreA int(2) , scoreB int(2) , datematch date  );");
            System.out.println("la table Match est creer");
        } catch (SQLException ex) {
            Logger.getLogger(MatchDao.class.getName()).log(Level.SEVERE, "creation de la table Match echoué", ex);
        }
    }

    @Override
    public Match insert(Match obj) {
        PreparedStatement pst = null;
        try {
                            pst = this.connect().prepareStatement("INSERT INTO match (equipeA, equipeB,datematch,scoreA,scoreB,id) VALUES (?,?,?,?,?,?);");
                            pst.setString(1, obj.getEquipeA());
                            pst.setString(2, obj.getEquipeB());
                            pst.setDate(3, obj.getDatematch());
                            pst.setInt(4, obj.getScoreA());
                            pst.setInt(5, obj.getScoreB());
                            pst.setInt(9, obj.getId());
                            
                            pst.executeUpdate();
                            System.out.println("insertion Match terminer");
        } catch (SQLException ex) {
            Logger.getLogger(MatchDao.class.getName()).log(Level.SEVERE, "insertion echouer", ex);
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
    public void delete(Match obj) {
        PreparedStatement pst = null;
        
        try {
            
            pst = this.connect().prepareStatement("DELETE FROM Match where id=?;");
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
                Logger.getLogger(JoueurDao.class.getName()).log(Level.SEVERE, "liberation preparedstatement echoué", ex);
            }
        }
    }

    @Override
    public void update(Match obj) {
        
    }

    @Override
    public Match find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Match> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
