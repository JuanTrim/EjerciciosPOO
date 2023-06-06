
package Entidades;
import Entidades.Servicios.PersonaService;
import java.util.Scanner;
import Entidades.*;





public class Persona {
    
    
    public int edad;
    private String nombre;
    public String Pais;
    Scanner leer = new Scanner(System.in);
    PersonaService servicios = new PersonaService();
    
        
    
    public Persona(){
       
    }

    public Persona(int edad, String nombre, String Pais) {
        this.edad = edad;
        this.nombre = nombre;
        this.Pais = Pais;
    }

   

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return Pais;
    }

  

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
    
 
    

}
