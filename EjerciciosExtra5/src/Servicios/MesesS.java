
package Servicios;
import Entidades.Meses;
import java.util.Scanner;

public class MesesS {
    private final Meses m = new Meses();
    private final Scanner leer = new Scanner(System.in);
    public void Juego(){
        String opc;
        do{
            System.out.println("INGRESE UN MES EN MAYUSCULAS");
            opc = leer.next();
            
            
            
            if(!opc.equals(m.getMesOculto())){
                System.out.println("EQUIVOCADO, INTENTA DE NUEVO");
            }
            

            
            
         
        }while(!opc.equals(m.getMesOculto()));
        
        System.out.println("ACERTASTE");
        
    } 
}
