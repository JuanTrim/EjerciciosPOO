
package Services;
import Entidades.*;
import java.util.Scanner;
public class CircunferenciaServices {
    private final Scanner leer = new Scanner(System.in);

    
    
   public Circunferencia crearCircunferencia(){
       Circunferencia circu = new Circunferencia();
       System.out.println("INGRESE EL RADIO");
       double radio = leer.nextDouble();
       circu.setRadio(radio);
       
       
       
       
       
       
        
 
       return circu;
       
   } 
   
   public double area(Circunferencia circu){
       
       
       double area = Math.PI * Math.pow(circu.radio, 2) ;
       
       
        return area;
       
   }
   
   public double perimetro(Circunferencia circu){
       double perimetro = 2* Math.PI * circu.radio; 
       
       return perimetro;
       
   }


    
    
}
