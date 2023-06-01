

package ejercicio1;
import java.util.Scanner;
import Entidades.*;
import Entidades.Servicios.LibroServices;
public class Ejercicio1 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        LibroServices lib = new LibroServices();
        Libro lib2 = new Libro();
        
        
       lib2 = lib.cargar();
        lib.mostrar(lib2);
        
        
    }
    
    }
               
        
        
        
    
    