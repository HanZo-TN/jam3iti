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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Match insert(Match obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Match obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Match obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
