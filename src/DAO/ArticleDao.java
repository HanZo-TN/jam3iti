/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.Article;
import java.util.List;

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
        throw new UnsupportedOperationException("Not supported yet.");
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
