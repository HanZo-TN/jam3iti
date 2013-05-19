/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.sql.Date;

/**
 *
 * @author rmh
 */
public class Joueur {
        private int idJoueur;
        private String nomJoueur;
        private String prenomJoueur;
        private Date datenaiss;
        private String postJoueur;
        private float salaire;
        private float tailleJoueur;
        private float poidsJoueur;
        private String email;
     
     public Joueur(int i) {this.idJoueur=i;}
     public Joueur(int IdJoueur, String nomJoueur , String prenomJoueur, Date datenaiss, String postJoueur, float salaire, float tailleJoueur, float poidsJoueur, String email) {
         this.idJoueur=IdJoueur;
         this.nomJoueur=nomJoueur;
         this.prenomJoueur=prenomJoueur;
         this.datenaiss=datenaiss;
         this.postJoueur=postJoueur;
         this.salaire = salaire;
         this.tailleJoueur=tailleJoueur;
         this.poidsJoueur= poidsJoueur;
         this.email=email;
         
     }
    /**
     * @return the IdJoueur
     */
    public int getIdJoueur() {
        return idJoueur;
    }

    /**
     * @param IdJoueur the IdJoueur to set
     */
    public void setIdJoueur(int IdJoueur) {
        this.idJoueur = IdJoueur;
    }

    /**
     * @return the NomJoueur
     */
    public String getNomJoueur() {
        return nomJoueur;
    }

    /**
     * @param NomJoueur the NomJoueur to set
     */
    public void setNomJoueur(String NomJoueur) {
        this.nomJoueur = NomJoueur;
    }

    /**
     * @return the prenomJoueur
     */
    public String getPrenomJoueur() {
        return prenomJoueur;
    }

    /**
     * @param prenomJoueur the prenomJoueur to set
     */
    public void setPrenomJoueur(String prenomJoueur) {
        this.prenomJoueur = prenomJoueur;
    }

    /**
     * @return the datenaiss
     */
    public Date getDatenaiss() {
        return datenaiss;
    }

    /**
     * @param datenaiss the datenaiss to set
     */
    public void setDatenaiss(Date datenaiss) {
        this.datenaiss = datenaiss;
    }

    /**
     * @return the PostJoueur
     */
    public String getPostJoueur() {
        return postJoueur;
    }

    /**
     * @param PostJoueur the PostJoueur to set
     */
    public void setPostJoueur(String PostJoueur) {
        this.postJoueur = PostJoueur;
    }

    /**
     * @return the salaire
     */
    public float getSalaire() {
        return salaire;
    }

    /**
     * @param salaire the salaire to set
     */
    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    /**
     * @return the tailleJoueur
     */
    public float getTailleJoueur() {
        return tailleJoueur;
    }

    /**
     * @param tailleJoueur the tailleJoueur to set
     */
    public void setTailleJoueur(float tailleJoueur) {
        this.tailleJoueur = tailleJoueur;
    }

    /**
     * @return the poidsJoueur
     */
    public float getPoidsJoueur() {
        return poidsJoueur;
    }

    /**
     * @param poidsJoueur the poidsJoueur to set
     */
    public void setPoidsJoueur(float poidsJoueur) {
        this.poidsJoueur = poidsJoueur;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}


