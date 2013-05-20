/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author rednaks
 */
public class SondageReponse {
    private int id;
    private int id_sondage;
    private int choix;
    private int nombreChoix;

    public SondageReponse(){
        
    }
    
    public SondageReponse(int id, int id_sondage, int choix, int nombreChoix) {
        this.id = id;
        this.id_sondage = id_sondage;
        this.choix = choix;
        this.nombreChoix = nombreChoix;
    }

    public int getId() {
        return id;
    }

    public int getId_sondage() {
        return id_sondage;
    }

    public int getChoix() {
        return choix;
    }

    public int getNombreChoix() {
        return nombreChoix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_sondage(int id_sondage) {
        this.id_sondage = id_sondage;
    }

    public void setChoix(int choix) {
        this.choix = choix;
    }

    public void setNombreChoix(int nombreChoix) {
        this.nombreChoix = nombreChoix;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        hash = 97 * hash + this.id_sondage;
        hash = 97 * hash + this.choix;
        hash = 97 * hash + this.nombreChoix;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SondageReponse other = (SondageReponse) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.id_sondage != other.id_sondage) {
            return false;
        }
        if (this.choix != other.choix) {
            return false;
        }
        if (this.nombreChoix != other.nombreChoix) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SondageReponse{" + "id=" + id + ", id_sondage=" + id_sondage + ", choix=" + choix + ", nombreChoix=" + nombreChoix + '}';
    }
    
    
}
