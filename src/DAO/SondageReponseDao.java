/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.Sondage;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rednaks
 */
public class SondageReponseDao extends DaoAbstraite<Sondage> {

           
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

    @Override
    public Sondage insert(Sondage obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Sondage obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Sondage obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sondage find(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Sondage> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
