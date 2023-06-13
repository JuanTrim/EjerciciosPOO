

package ejercicio12;
import java.util.Scanner;
import Entidades.Persona;
import Servicios.PersonaS;
import java.util.Calendar;

public class Ejercicio12 {
    
   
   
   


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaS ps = new PersonaS(); 
        Persona p = ps.crearPersona();
        
        System.out.println("INGRESE LA EDAD DE LA PERSONA A LA QUE SE QUIERE SE COMPARAR");
        int edad2 = leer.nextInt();
        
        System.out.println("Tu edad es " + ps.calcularEdad(p));
        
      
        if(ps.menorQue(edad2, p) == true){
            System.out.println("ERES MENOR QUE LA PERSONA ANTERIOR");
        }else{
            System.out.println("ERES MAYOR QUE LA PERSONA ANTERIOR");
        }
        
        
        ps.mostrarPersona(p);
        
        
    }

}
