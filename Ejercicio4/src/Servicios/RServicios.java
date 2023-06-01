
package Servicios;
import Entidades.Rectangulo;
import java.util.Scanner;

public class RServicios {
    private final Rectangulo r = new Rectangulo();
    private final Scanner leer = new Scanner(System.in);
    
    
    public Rectangulo crearRectangulo(){
        System.out.println("INGERESE LA ALTURA");
        r.setAltura(leer.nextInt());
        System.out.println("INGRESE LA BASE");
        r.setBase(leer.nextInt());
        
        
        
        return r ;
    }
    
    public int superficie(Rectangulo r){
        int superficie = r.getBase() * r.getAltura();
        
        return superficie;
        
    }
    public int perimetro(Rectangulo r){
        int perimetro = (r.getBase() + r.getAltura()) * 2;
        
        return perimetro;
        
    }
    public void dibujo(Rectangulo r){
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getBase(); j++) {
                
                if(i == 0 || j == 0 || i == r.getAltura() - 1 || j == r.getBase()-1 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
                
            }
            System.out.println(" ");
        }
        
        
        
    }
    
//   * * * 0,0 0,1 0,2 FILA 1
//   *   * 0,0,1,0, 2,0 3,0 1 VERTICAL 1
//   *   * 3,0 3,1, 3,2 Fila 2
//   * * * 0,3. 0,2. 0,1. 0,0 VERTICAL 2   
    
    
    
    
}
