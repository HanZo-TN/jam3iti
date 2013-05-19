/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Metier.Joueur;
import DAO.JoueurDao;


/**
 *
 * @author rmh
 */
public class test {
    public static void main(String[] args) {
        
        JoueurDao jrd =null;
        jrd = JoueurDao.getInstance();
        Joueur j1 = new Joueur(10);
        Joueur j2 = new Joueur(11);
        jrd.insert(j1);
        jrd.insert(j2);
        jrd.delete(j2);
        j1.setNomJoueur("salah");
        jrd.update(j1);
        jrd.find(10);
        jrd.findAll();
       
        
    
    }
    
}
