

package ejerciciosextra4;
import java.util.Scanner;
import Entidades.NIF;
import Servicios.NIFServicios;
public class EjerciciosExtra4 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        NIFServicios ns = new NIFServicios();
        NIF n = ns.crearNif();
        
        ns.mostrar();
        
    }
    

}
