/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author rmh
 */
public class Sondage {
    private int id;
    private String question;
    private String choixA;
    private String choixB;
    private String choixC;
    public Sondage(){}
    public Sondage(int i){this.id=i;}
    public Sondage(int id, String question, String choixA, String choixB, String choixC)
    {
        this.id=id;
        this.question=question;
        this.choixA=choixA;
        this.choixB=choixB;
        this.choixC=choixC;
        
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
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * @return the choixA
     */
    public String getChoixA() {
        return choixA;
    }

    /**
     * @param choixA the choixA to set
     */
    public void setChoixA(String choixA) {
        this.choixA = choixA;
    }

    /**
     * @return the choixB
     */
    public String getChoixB() {
        return choixB;
    }

    /**
     * @param choixB the choixB to set
     */
    public void setChoixB(String choixB) {
        this.choixB = choixB;
    }

    /**
     * @return the choixC
     */
    public String getChoixC() {
        return choixC;
    }

    /**
     * @param choixC the choixC to set
     */
    public void setChoixC(String choixC) {
        this.choixC = choixC;
    }
    
}
