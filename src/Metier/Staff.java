/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author rmh
 */
public class Staff {
    private int id;
    private String fonction;
    private String nom;
    private String prenom;
    private int age;
    public Staff(){}
    public Staff(int i){this.id=i;}
    public Staff(int id, String fonction, String nom, String prenom, int age){
        this.id=id;
        this.fonction=fonction;
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the fonction
     */
    public String getFonction() {
        return fonction;
    }

    /**
     * @param fonction the fonction to set
     */
    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    
    
}
