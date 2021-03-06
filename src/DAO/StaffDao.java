/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Metier.Staff;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rmh
 */
public class StaffDao extends DaoAbstraite<Staff>{
    
     private StaffDao () {}
    public static StaffDao instance;
    public static synchronized StaffDao getInstance(){
        if(instance==null)
		instance=new StaffDao();
		return instance;
    }

    @Override
    public void create() {
         Statement st = null;
        try {
            st = this.connect().createStatement();
            st.executeUpdate("create table Staff(id int(4) , fonction varchar(50) , nom varchar(30), prenom varchar(30), age int );");
            System.out.println("la table Sondage est creer");
        } catch (SQLException ex) {
            Logger.getLogger(StaffDao.class.getName()).log(Level.SEVERE, "creation de la table Staff echoué", ex);
        }
    }

    @Override
    public Staff insert(Staff obj) {
        PreparedStatement pst = null;
        try {
                            pst = this.connect().prepareStatement("INSERT INTO Staff (fonction,nom,prenom,age,id) VALUES (?,?,?,?,?);");
                            pst.setString(1, obj.getFonction());
                            pst.setString(2, obj.getNom());
                            pst.setString(3, obj.getPrenom());
                            pst.setInt(4, obj.getAge());
                            
                            pst.setInt(5, obj.getId());
                            
                            pst.executeUpdate();
                            System.out.println("insertion Staff terminer");
        } catch (SQLException ex) {
            Logger.getLogger(StaffDao.class.getName()).log(Level.SEVERE, "insertion echouer", ex);
        }finally{
        
            try {
            if(pst != null)
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, "liberation du preparedstatement echouée", ex);
        }
            
        }
        
        
        
        return obj;
    }

    @Override
    public void delete(Staff obj) {
        PreparedStatement pst = null;
        
        try {
            
            pst = this.connect().prepareStatement("DELETE FROM Staff where id=?;");
            pst.setInt(1, obj.getId());
            pst.executeUpdate();
            System.out.println("suppression effectuer");
            
        } catch (SQLException ex) {
            Logger.getLogger(StaffDao.class.getName()).log(Level.SEVERE, "suppression echoué", ex);
        }finally{
            
            try {
                if(pst != null)
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(StaffDao.class.getName()).log(Level.SEVERE, "liberation preparedstatement echoué", ex);
            }
        }
    }

    @Override
    public void update(Staff obj) {
        PreparedStatement pst = null;
        try {
            pst = this.connect().prepareStatement("update Staff set fonction=?, nom=?, prenom=?, age=? where id=? ;");
            pst.setString(1, obj.getFonction());
            pst.setString(2, obj.getNom());
            pst.setString(3, obj.getPrenom());
            pst.setInt(4, obj.getAge());
            pst.setInt(5, obj.getId());
            pst.executeUpdate();
            
            System.out.println("modification Sondage effectuée");
            
        } catch (SQLException ex) {
            Logger.getLogger(StaffDao.class.getName()).log(Level.SEVERE, "requete modification echoué", ex);
        }finally{
            try {
                if(pst != null)
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(StaffDao.class.getName()).log(Level.SEVERE, "liberation prepared statement échoué", ex);
            }
            
        }
    }

    @Override
    public Staff find(int id) {
        Staff found = null; 
            PreparedStatement pst = null;
            ResultSet rs = null;
        
        try {
            pst=this.connect().prepareStatement("select * from Staff where id= ?");
            pst.setInt(1, id);
            rs=pst.executeQuery();
            System.out.println("recherche individuelle réussie");
            if (rs.next()) {
               
                found = new Staff(rs.getInt("id"), rs.getString("fonction"), rs.getString("nom"), rs.getString("prenom"), rs.getInt("age"));
            
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StaffDao.class.getName()).log(Level.SEVERE, "recherche individuelle echoué", ex);
        }finally{
            
            
                try {
                    if (rs != null)
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StaffDao.class.getName()).log(Level.SEVERE, "liberation result set echoué", ex);
                }
                
                 
                try {
                    if (pst != null)
                    pst.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StaffDao.class.getName()).log(Level.SEVERE, "liberation prepared statement echoué", ex);
                }
                
        }
        return found;
    }

    @Override
    public List<Staff> findAll() {
        List<Staff> listS = new ArrayList<Staff>();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = this.connect().createStatement();
            rs = st.executeQuery("select * from Staff");
            System.out.println("recherche général effectuée");
            
            
            while (rs.next()) {
              
                
                Staff stf = new Staff(rs.getInt("id"), rs.getString("fonction"), rs.getString("nom"), rs.getString("prenom"), rs.getInt("age"));
                
                
               
                               listS.add(stf);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(StaffDao.class.getName()).log(Level.SEVERE, "recherche general echoué", ex);
        }finally{
            try {
                if(rs != null)
                rs.close();
                if(st != null)
                st.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(StaffDao.class.getName()).log(Level.SEVERE, "liberation statement || resultset echoué", ex);
            }
        }
        
        
        return listS;
    }
    
}
