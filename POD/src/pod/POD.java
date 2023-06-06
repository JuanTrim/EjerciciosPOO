package pod;

import Entidades.Servicios.PersonaService;
import java.util.Scanner;
import Entidades.*;
import Entidades.Servicios.*;


public class POD {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 10;
 
        
        
        
        
       PersonaService servicios = new PersonaService();
       
       Persona p = servicios.Crear();
       
        
      
      
    }

}
