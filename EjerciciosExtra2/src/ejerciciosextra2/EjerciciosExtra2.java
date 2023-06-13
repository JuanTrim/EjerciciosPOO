

package ejerciciosextra2;
import java.util.Scanner;
import Entidades.Puntos;
import Servicios.PuntosS;

public class EjerciciosExtra2 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        PuntosS ps = new PuntosS();
        Puntos p = ps.crearPuntos();
        
        
        
        System.out.println(ps.calcularDistacia(p));
    }

}
