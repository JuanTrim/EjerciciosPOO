
package Entidades;


public class NIF {
    public long numero;
    public String letra;

    public NIF() {
    }

    public NIF(long numero, String letra) {
        this.numero = numero;
        this.letra = letra;
    }

    public long getNumero() {
        return numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
    
    
}
