

package ejercicio6;
import java.util.Scanner;
import Entidades.Cafetera;
import Servicios.Cafeservices;
public class Ejercicio6 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafetera c = new Cafetera();
        Cafeservices cservi = new Cafeservices();
        int cantCafe;
       int tamTaza;
       int opc;
        
        c = cservi.llenarCafetera();
        
        
        do{
            System.out.println("1. LLENAR CAFETERA");
        System.out.println("2. SERVIR TAZA");
        System.out.println("3. VACIAR CAFETERA");
        System.out.println("4. AGREGAR CAFE");
            System.out.println("0. SALIR");
        
        
        System.out.println("---------------------");
            opc = leer.nextInt();
        
        switch(opc){
            case 1:
                cservi.llenarCafetera();
                System.out.println("LA CAFETERA ESTA LLENA " + c.getCantidadActual());
                break;
            case 2:
                
                cservi.servirTaza();
                break;
            case 3:
                
                cservi.vaciarCafetera();
                System.out.println("CAFETERA VACIA " + c.getCantidadActual());
                break;
            case 4:
                System.out.println("INGRESE LA CANTIDAD DE CAFÉ");
                cantCafe = leer.nextInt();
                System.out.println(cservi.agregarCafe(cantCafe));
                break;
           
        }
        
        }while( opc != 0);
        
        
        System.out.println("SALISTE DEL PROGRAMA");
        
        
        
        
        
       
       
       
       
       
       
       
        
        
    
    }

}
