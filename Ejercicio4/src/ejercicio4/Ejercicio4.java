

package ejercicio4;
import java.util.Scanner;
import Entidades.*;
import Servicios.*;
public class Ejercicio4 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Rectangulo r = new Rectangulo();
        RServicios rs = new RServicios();
        
        
        
        
        r = rs.crearRectangulo();
        
        
        System.out.println("El perimetro es: " + rs.perimetro(r));
        System.out.println("El perimetro es: " + rs.superficie(r));
       rs.dibujo(r);
        
        
        
        
    }

}
