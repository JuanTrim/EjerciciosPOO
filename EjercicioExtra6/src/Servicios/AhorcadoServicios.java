
package Servicios;
import Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicios {
    private final Ahorcado a = new Ahorcado();
    private final Scanner leer = new Scanner(System.in);
    public Ahorcado crearJuego(){
        System.out.println("INGRESE LA PALABRA A BUSCAR");
        a.setPalabraFind(leer.next());
        
        System.out.println("INGRESE LA CANTIDAD DE JUGADAS MAXIMA");
    }
}
