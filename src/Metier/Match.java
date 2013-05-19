/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;
import java.sql.*;

/**
 *
 * @author rmh
 */
public class Match {
    private int id;
    private String equipeA;
    private String equipeB;
    private int scoreA;
    private int scoreB;
    private Date datematch;
    
    
    public Match () {}
    public Match (int id) {
        this.id=id;
    }
    public Match (int id, String equipeA, String equipeB, int scoreA, int scoreB, Date datematch) {
    
        this.id=id;
        this.equipeA=equipeA;
        this.equipeB=equipeB;
        this.scoreA=scoreA;
        this.scoreB=scoreB;
        this.datematch=datematch;
        
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
     * @return the equipeA
     */
    public String getEquipeA() {
        return equipeA;
    }

    /**
     * @param equipeA the equipeA to set
     */
    public void setEquipeA(String equipeA) {
        this.equipeA = equipeA;
    }

    /**
     * @return the equipeB
     */
    public String getEquipeB() {
        return equipeB;
    }

    /**
     * @param equipeB the equipeB to set
     */
    public void setEquipeB(String equipeB) {
        this.equipeB = equipeB;
    }

    /**
     * @return the scoreA
     */
    public int getScoreA() {
        return scoreA;
    }

    /**
     * @param scoreA the scoreA to set
     */
    public void setScoreA(int scoreA) {
        this.scoreA = scoreA;
    }

    /**
     * @return the scoreB
     */
    public int getScoreB() {
        return scoreB;
    }

    /**
     * @param scoreB the scoreB to set
     */
    public void setScoreB(int scoreB) {
        this.scoreB = scoreB;
    }

    /**
     * @return the datematch
     */
    public Date getDatematch() {
        return datematch;
    }

    /**
     * @param datematch the datematch to set
     */
    public void setDatematch(Date datematch) {
        this.datematch = datematch;
    }
    
    
    
    
}
