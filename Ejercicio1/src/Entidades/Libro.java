
package Entidades;


public class Libro {
   public int ISBN;
   public String autor;
   public int numpags;
   public String tiutlo;

    public Libro() {
        
    }

    public Libro(int ISBN, String autor, int numpags, String tiutlo) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.numpags = numpags;
        this.tiutlo = tiutlo;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumpags() {
        return numpags;
    }

    public String getTiutlo() {
        return tiutlo;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumpags(int numpags) {
        this.numpags = numpags;
    }

    public void setTiutlo(String tiutlo) {
        this.tiutlo = tiutlo;
    }
    
    
    
    
    
    
}
