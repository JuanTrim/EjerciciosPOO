

package ejercicio14;
import java.util.Scanner;
import Entidades.Movil;
import Servicios.MovilS;
public class Ejercicio14 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        MovilS ms = new MovilS();
        Movil m = ms.cargarCelular();
        
        
        ms.ingresarCodigo(m);
        
        
        
        
    }

}
