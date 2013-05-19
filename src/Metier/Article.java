/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author rednaks
 */
public class Article {

    private int id;
    private String titlre;
    private String resume;
    private String date;
    
    public Article(){
        
    }
    public Article(int id, String titlre, String resume) {
        this.id = id;
        this.titlre = titlre;
        this.resume = resume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void setTitlre(String titlre) {
        this.titlre = titlre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.id;
        hash = 79 * hash + (this.titlre != null ? this.titlre.hashCode() : 0);
        hash = 79 * hash + (this.resume != null ? this.resume.hashCode() : 0);
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
        final Article other = (Article) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.titlre == null) ? (other.titlre != null) : !this.titlre.equals(other.titlre)) {
            return false;
        }
        if ((this.resume == null) ? (other.resume != null) : !this.resume.equals(other.resume)) {
            return false;
        }
        return true;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    @Override
    public String toString() {
        return "Article{" + "id=" + id + ", titlre=" + titlre + ", resume=" + resume + '}';
    }

    public String getTitlre() {
        return titlre;
    }

    public String getResume() {
        return resume;
    }

}
