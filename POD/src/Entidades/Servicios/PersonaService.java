
package Entidades.Servicios;
import Entidades.*;
import Entidades.Persona;
import java.util.Scanner;

public class PersonaService {
private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    
    
    public Persona Crear(){
        Persona persona = new Persona();
         
        System.out.println("INGRESE UN NOMBRE");
        persona.setNombre(leer.next());
        System.out.println("INGRESE LA EDAD");
        persona.setEdad(leer.nextInt());
        System.out.println("INGRESE EL PAIS");
        persona.setPais(leer.next());
        
        
        
        
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getPais());
     
                
        
        
        
        
        
        return persona;
             
    } 
}
