
package Servicios;
import Entidades.Puntos;
import java.util.Scanner;
public class PuntosS {
    private final Puntos p = new Puntos();
    private final Scanner leer = new Scanner(System.in);
    public Puntos crearPuntos(){
        //PUNTO 1
        System.out.println("INGRESE EL X1");
        p.setX1(leer.nextInt());
        System.out.println("INGRESE EL X2");
        p.setX2(leer.nextInt());
        
        
        //PUNTO 2
        System.out.println("INGRESE EL Y1");
        p.setY1(leer.nextInt());
        System.out.println("INGRESE EL Y2");
        p.setY2(leer.nextInt());
        
        // FORMULA:  DISTANCIA = RAIZ((x2 - x1)2 + (y2 - y1)2)
                
        return p;
    }
    //Math.pow(p.GetX2-p.GetX1,2) + Math.pow(p.GetY2-p.GetY1,2) 
    public double calcularDistacia(Puntos p){
        double distancia = Math.sqrt(Math.pow(p.getX2() - p.getX1(),2) + Math.pow(p.getY2() - p.getY1(),2));
        return distancia;
    }
    
    
}
