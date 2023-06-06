
package Servicios;
import Entidades.Persona;
import java.util.Scanner;


public class PersonaS {
    private final Persona p = new Persona();
    private final Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        String genero;
        System.out.println("INGRESE EL NOMBRE DE LA PERSONA");
        p.setNombre(leer.next());
        
         System.out.println("INGRESE LA EDAD DE LA PERSONA");
        p.setEdad(leer.nextInt());
        
         System.out.println("INGRESE LA ALTURA DE LA PERSONA");
        p.setAltura(leer.nextDouble());
        
         System.out.println("INGRESE EL PESO DE LA PERSONA");
        p.setPeso(leer.nextDouble());
        
         System.out.println("INGRESE LA HABILIDAD DE LA PERSONA");
        p.setHabilidad(leer.next());
        
         
        
        do{
            System.out.println("INGRESE EL GENERO DE LA PERSONA");
        genero = leer.next().toUpperCase();
             switch(genero){
                 
            case "O":
                System.out.println("EL GENERO ES O");
                p.setGenero(genero);
                break;
            case "M":
                System.out.println("EL GENERO ES M");
                p.setGenero(genero);
                break;
            case "H":
                System.out.println("EL GENERO ES H");
                p.setGenero(genero);
                break;
                
            default:
                System.out.println("EL GENERO NO EXISTE");
                
        }
        
        }while(!genero.equals("H") && !genero.equals("M") && !genero.equals("O"));
                
                
                
                
        return p;
       
        
        
        
        
    }
    
    
    
    
    public int calcularIMC(Persona p){
        double altura = p.getAltura();
        
        
        double imc = p.getPeso() / (altura * altura);
        
        
        if(imc < 20){
            
            return -1;
        }else if (imc > 20 && imc <= 25){
            
            return 0;
            
        }else{
            
            return 1;
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    public boolean esMayorDeEdad(Persona p){
            if(p.getEdad() > 18){
                System.out.println("LA PERSONA ES MAYOR DE EDAD");
                return true;
            }else{
                System.out.println("ERES MENOR DE EDAD");
                return false;
            }
        
        }
    

    
  
    
}
