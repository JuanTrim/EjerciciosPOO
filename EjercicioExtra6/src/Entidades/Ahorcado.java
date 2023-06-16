
package Entidades;


public class Ahorcado {
   public String[] palabraFind;
   public int letrasEncontradas;
   public int jugadasMaximas;
   public String acu;
   

    public Ahorcado() {
    }

    public String[] getPalabraFind() {
        return palabraFind;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setPalabraFind(String[] palabraFind) {
        this.palabraFind = palabraFind;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public String getAcu() {
        return acu;
    }

    public void setAcu(String acu) {
        this.acu = acu;
    }

    public Ahorcado(String[] palabraFind, int letrasEncontradas, int jugadasMaximas, String acu) {
        this.palabraFind = palabraFind;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
        this.acu = acu;
    }
   
   
   
}
