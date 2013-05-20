/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Metier.Sondage;
import Metier.SondageReponse;
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
                            pst.setInt(2, obj.getNombreChoix());
                            pst.setInt(3, obj.getId());
                            
                            pst.setInt(5, obj.getId());
                            
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

    }

    @Override
    public SondageReponse find(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<SondageReponse> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
