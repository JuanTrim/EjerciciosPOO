
package Servicios;
import Entidades.Cafetera;
import java.util.Scanner;


public class Cafeservices {
    private final Cafetera c = new Cafetera();
    private final Scanner leer = new Scanner(System.in);
    
    
    
    
    
    public Cafetera llenarCafetera(){
        
        c.setCantidadActual(c.getCantidadMaxima());
        
        return c;
        
    }
    public Cafetera servirTaza(){
        int tamTaza;
        System.out.println("INGRESE EL TAMAÑO DE LA TAZA");
        tamTaza = leer.nextInt();
        
        if (c.getCantidadActual() < tamTaza){
            System.out.println("LA TAZA NO SE LLENO");
            System.out.println(c.getCantidadActual() - tamTaza + "ml Faltaron para llenar la taza");
            c.setCantidadActual(0);
        }else{
            System.out.println("LA TAZA SE LLENO");
            System.out.println(c.getCantidadActual()-tamTaza + "ESTO ES LO QUE QUEDO EN LA CAFETERA");
            c.setCantidadActual(c.getCantidadActual()-tamTaza);
            
        }
        
        
        return c;
        
    }
    
    
    public Cafetera vaciarCafetera() {
    c.setCantidadActual(0);
        
        return c;
    }
    public Cafetera agregarCafe(int cantCafe) {
        
                if((c.getCantidadActual() + cantCafe) > c.getCantidadMaxima()){
                    System.out.println("SUPERASTE LA CANTIDAD MAXIMA DE LA CAFETERA");
                }else{
                    c.setCantidadActual(cantCafe);
                }
    
    
        
        System.out.println(c.toString());
        return c;
    }
        
}
