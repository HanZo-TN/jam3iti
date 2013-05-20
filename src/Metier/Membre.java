/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author rmh
 */
public class Membre {
    private int idMembre;
    private String nomMembre;
    private String prenomMembre;
    private String mdp;
    private String email;
    private String status;
    
    public Membre () {}
    public Membre (int idMembre, String nomMembre, String prenomMembre, String mdp, String email, String status) {
        this.idMembre = idMembre;
        this.nomMembre = nomMembre;
        this.prenomMembre = prenomMembre;
        this.mdp = mdp;
        this.email = email;
        this.status = status; 
    }
    public Membre (String nomMembre, String prenomMembre, String mdp, String email, String status) {
        
        this.nomMembre = nomMembre;
        this.prenomMembre = prenomMembre;
        this.mdp = mdp;
        this.email = email;
        this.status = status; 
    }

    /**
     * @return the idMembre
     */
    public int getIdMembre() {
        return idMembre;
    }

    /**
     * @param idMembre the idMembre to set
     */
    public void setIdMembre(int idMembre) {
        this.idMembre = idMembre;
    }

    /**
     * @return the nomMembre
     */
    public String getNomMembre() {
        return nomMembre;
    }

    /**
     * @param nomMembre the nomMembre to set
     */
    public void setNomMembre(String nomMembre) {
        this.nomMembre = nomMembre;
    }

    /**
     * @return the prenomMembre
     */
    public String getPrenomMembre() {
        return prenomMembre;
    }

    /**
     * @param prenomMembre the prenomMembre to set
     */
    public void setPrenomMembre(String prenomMembre) {
        this.prenomMembre = prenomMembre;
    }

    /**
     * @return the mdp
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * @param mdp the mdp to set
     */
    public void setMdp(String mdp) {
        this.mdp = mdp;
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

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
}
