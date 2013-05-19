/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.Article;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rednaks
 */
public class ArticleDao extends DaoAbstraite<Article> {
    
    private static ArticleDao instance;
    private ArticleDao(){
        
    }
    
    public static synchronized ArticleDao getInstance(){
        if(instance == null)
            instance = new ArticleDao();
        return instance;
    }

    @Override
    public void create() {
       Statement st = null;
        try {
            st = this.connect().createStatement();
            st.executeUpdate("create table Article(id int(4) , titre varchar(255) , resume text , date date  );");
            System.out.println("la table Article est creé");
        } catch (SQLException ex) {
            Logger.getLogger(JoueurDao.class.getName()).log(Level.SEVERE, "creation de la table Article echoué", ex);
        }
    }

    @Override
    public Article insert(Article obj) {
        PreparedStatement pst = null;
        try {
                            pst = this.connect().prepareStatement("INSERT INTO Article (titre, resume, date, id) VALUES (?,?,?,?);");
                            pst.setString(1, obj.getTitlre());
                            pst.setString(2, obj.getResume());
                            pst.setDate(3, obj.getDate());
                            pst.setInt(4, obj.getId());                           
                            pst.executeUpdate();
                            System.out.println("insertion Article terminé");
        } catch (SQLException ex) {
            Logger.getLogger(JoueurDao.class.getName()).log(Level.SEVERE, "insertion echoué", ex);
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
    public void delete(Article obj) {
        PreparedStatement pst = null;
        
        try {
            
            pst = this.connect().prepareStatement("DELETE FROM Article where id=?;");
            pst.setInt(1, obj.getId());
            pst.executeUpdate();
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
    public void update(Article obj) {
PreparedStatement pst = null;
        try {
            pst = this.connect().prepareStatement("update Article set titre=?, resume=?, date=? where id=? ;");
            pst.setString(1, obj.getTitlre());
            pst.setString(2, obj.getResume());
            pst.setDate(3, obj.getDate());
            pst.setInt(4, obj.getId());     
            pst.executeUpdate();
            
            System.out.println("modification Article effectuée");
            
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
    public Article find(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Article> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
