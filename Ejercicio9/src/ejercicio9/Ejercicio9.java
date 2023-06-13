

package ejercicio9;
import java.util.Scanner;
import Entidades.Matematica;
import Servicios.MatematicaS;

public class Ejercicio9 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        MatematicaS ms = new MatematicaS();
        Matematica m = ms.crearMatematica();
        
        System.out.println(m.num1);
        System.out.println(m.num2);
        
        System.out.println("MAYOR " + ms.devolverMayor(m));
        System.out.println("MAYOR " + ms.devolverMenor(m));
        
        System.out.println(ms.calcularPotencia(m));
        
        System.out.println("RAIZ CUADRADA " +ms.calcularRaiz(m));
        
        
               
    
        
        
        
    }

}
