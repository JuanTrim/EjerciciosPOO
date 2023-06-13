
package Servicios;
import Entidades.Raices;
import java.util.Scanner;

public class RaicesS {
    private final Raices r = new Raices();
    private final Scanner leer = new Scanner(System.in);
    
    
    
    
    public Raices crearEcuacion(){
        System.out.println("INGRESE EL VALOR DE A");
        r.setA(leer.nextInt());
        System.out.println("INGRESE EL VALOR DE B");
        r.setB(leer.nextInt());
        System.out.println("INGRESE EL VALOR DE C");
        r.setC(leer.nextInt());
        
        return r;
    }
    
    
    
    public double getDiscriminate(Raices r){
        //FORMULA (b°2)-4.a.c
        double discriminate = 0;
       discriminate = Math.pow(r.getB(),2)-4*r.getA()*r.getC();
       
       
       return discriminate;
    }
    public boolean tieneRaices(Raices r){
       boolean validar = false;
       
       
       if(getDiscriminate(r) >= 0){
           validar = true;
       }
       return validar;
    }
    public boolean tieneRaiz(Raices r){
       boolean validar = false;
       
       
       if(getDiscriminate(r) == 0){
           validar = true;
       }
       return validar;
    }
    public void obtenerRaices(Raices r){
        // FORMULA (-b±√((b^2)-(4*a*c)))/(2*a)
       if(tieneRaices(r) == true){
           
           System.out.println(r.getB()+ Math.sqrt(getDiscriminate(r) / 2 * r.getA()));
           System.out.println(r.getB()- Math.sqrt(getDiscriminate(r) / 2 * r.getA()));
       }
       
    }
    
    
     public void obtenerRaiz(Raices r){
        // FORMULA (-b±√((b^2)-(4*a*c)))/(2*a)
       if(tieneRaiz(r) == true){
           
           System.out.println(r.getB()+ Math.sqrt(getDiscriminate(r) / 2 * r.getA()));
           
       }
       
    }
     
     
     public void calcular(Raices r){
         if(tieneRaiz(r) == true){
             obtenerRaiz(r);
         }
         if(tieneRaices(r) == true){
             obtenerRaices(r);
         }
         
        
         
         
     }
    
    
    
    
    
    }
   

       
       
       
    
       
        
    
    
    
    

