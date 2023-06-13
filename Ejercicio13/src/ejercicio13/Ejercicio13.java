

package ejercicio13;
import java.util.Scanner;
import Entidades.Curso;
import Servicios.CursoServicios;

public class Ejercicio13 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        CursoServicios cs = new CursoServicios();
        Curso c = cs.crearCurso();
        
        
        
        System.out.println("TU GANANCIA SEMANAL ES " + cs.calcularGananciaSemanal(c));
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
