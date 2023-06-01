

package ejercicio2;
import java.util.Scanner;
import Entidades.*;
import Services.*;

public class Ejercicio2 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        CircunferenciaServices circu = new CircunferenciaServices();
        Circunferencia circulo;
        circulo = circu.crearCircunferencia();
        
        
        
        System.out.println("El area del circulo es: " + circu.area(circulo));
        System.out.println("El Perimetro del circulo es: " + circu.perimetro(circulo));
        System.out.println("El Radio del circulo es: " + circulo.getRadio());
        
        
        
    }

}
