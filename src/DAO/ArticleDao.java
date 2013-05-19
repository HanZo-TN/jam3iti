/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.Article;
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Article obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Article obj) {
        throw new UnsupportedOperationException("Not supported yet.");
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
