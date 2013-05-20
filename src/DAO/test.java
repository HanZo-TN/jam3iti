/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Metier.Joueur;
import DAO.JoueurDao;
import DAO.MembreDao;



/**
 *
 * @author rmh
 */
public class test {
    public static void main(String[] args) {
        
        
        MembreDao m = null;
        m = MembreDao.getInstance();
        m.create();
        
        
        
        
       
        
    
    }
    
}
