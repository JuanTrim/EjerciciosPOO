
package Servicios;
import Entidades.Array;
import java.util.Arrays;
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
        for (int i = 0; i < 50; i++) {
            Arrays.sort(a.getArray());
            
            if (i < 10){
                a.setArray2I(a.getArray(), i);
            }else if( i < 20){
                 a.setArray2I(0.5, i);
            }
            
            
            
        }
       
            
        }
    public void mostrarArrays(double[] a, double[] a2){
        for(int i = 0; i <  50 ; i++) {
            System.out.print(" " + array.Array[i] + " "); 
        }
        System.out.println("");
        for(int i = 0; i <  20 ; i++) {
            System.out.print( " " +array.Array2[i] + " "); 
        }
        System.out.println("");
        
        
    }

  
    
    
    
    
    
    
    
    
    
}
