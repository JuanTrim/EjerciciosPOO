

package ejercicio10;
import java.util.Scanner;
import Entidades.Array;
import Servicios.ArrayServices;
public class Ejercicio10 {

    
    
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      
        ArrayServices as = new ArrayServices();
        Array a = new Array();
        
        
        a = as.crearArray();
        System.out.println("-------------------------------");
        as.ordenarArray(a);
        
        as.mostrarArrays(a.getArray(), a.getArray2());
        
    
        
        
        
        
        
        
        
        
        
        
        
    }

}
