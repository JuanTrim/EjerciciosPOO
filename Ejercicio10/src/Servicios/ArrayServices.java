
package Servicios;
import Entidades.Array;
import java.util.Scanner;


public class ArrayServices {
    private final Array array = new Array();
    private final Scanner leer = new Scanner(System.in);
    
    
    public Array crearArray(){
        
          
        for (int i = 0; i < 50; i++) {
           array.Array[i] = (int)(Math.random()*10) ;
           
            System.out.print("  "+array.Array[i]+"  ");
            
        }
        System.out.println("");
        return array ;
    }
    
    public void ordenarArray(Array a){
        int aux = 0;
        for (int i = 0; i < 50; i++) {
            aux = i;
            if(array.Array[aux] > array.Array[aux+1]){
                array.Array[aux] = array.Array[aux+1];
                array.Array[aux+1] = array.Array[aux];
                
                
                        
            }
            System.out.print(array.Array[i]);
        }
        System.out.println("");
    }
    
    
    
    
    
}
