

package ejercicios3;
import java.util.Scanner;
import Entidades.Operación;
import Servicios.opservicios;

public class Ejercicios3 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Operación op = new Operación();
        opservicios opservicios = new opservicios();
        
        
        op = opservicios.crearOperacion();
        
        opservicios.restar(op);
        opservicios.dividir(op);
        opservicios.multiplicar(op);
        
        
        System.out.println("LA SUMA ES: " + opservicios.sumar(op));
        System.out.println("LA resta ES: " + opservicios.restar(op));
        System.out.println("LA multiplicación ES: " + opservicios.multiplicar(op));
        System.out.println("LA división ES: " + opservicios.dividir(op));
    }

}
