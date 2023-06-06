
package Entidades;


public class Persona {
    public String Nombre;
    public int Edad;
    public double Peso;
    public double altura;
    public String Habilidad;
    public String Genero;

    public Persona() {
    }

    public Persona(String Nombre, int Edad, double Peso, double altura, String Habilidad, String Genero) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Peso = Peso;
        this.altura = altura;
        this.Habilidad = Habilidad;
        this.Genero = Genero;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public double getPeso() {
        return Peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getHabilidad() {
        return Habilidad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setHabilidad(String Habilidad) {
        this.Habilidad = Habilidad;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
    
    
    
        
    
    
    
    
    
    
    
    
}
