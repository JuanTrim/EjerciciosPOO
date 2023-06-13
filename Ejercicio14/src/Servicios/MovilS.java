
package Servicios;
import Entidades.Movil;
import java.util.Scanner;



public class MovilS {
    private final Movil m = new Movil();
    private final Scanner leer = new Scanner(System.in);
    
    public Movil cargarCelular(){
        System.out.println("INGRESE EL NOMBRE DE LA MARCA DEL MOVIL");
        m.setMarca(leer.next());
        System.out.println("INGRESE EL NOMBRE DE LA MODELO DEL MOVIL"); 
        m.setModelo(leer.next());
        System.out.println("INGRESE EL PRECIO DEL MOVIL"); 
        m.setPrecio(leer.nextDouble());
        System.out.println("INGRESE EL ALMACENAMIENTO DEL MOVIL"); 
        m.setAlmacenamiento(leer.nextInt());
        System.out.println("INGRESE LA MEMORIA RAM DEL MOVIL"); 
        m.setMemoriaRam(leer.nextInt());
        
        return m;
    }
    
    
    
    public void ingresarCodigo(Movil m){
        int[] codigo = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("INGRESE EL NUMERO DEL CODIGO " + "[" + i + "]");
            codigo[i] = leer.nextInt();
        }
        
        m.setCodigo(codigo);
        
       
        
        
        
        
    }
}
