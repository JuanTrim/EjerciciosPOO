

package ejercicio8;
import java.util.Scanner;
import Entidades.Cadena;
import Servicios.CadenaS;


public class Ejercicio8 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        CadenaS cs = new CadenaS();
        
        Cadena c = cs.CrearCadena();
        
        
        cs.mostrarVocales(c);
        cs.invertirFrase(c);
        cs.caracterRepetido(c);
        cs.compararLongitud(c);
        cs.unirFrase(c);
        cs.remplazar(c);
        if(cs.contiene(c) == true){
            System.out.println("LA LETRA SI ESTA EN LA FRASE");
        }else{
            System.out.println("LA LETRA NO SE ENCUENTRA EN LA FRASE");
        }
        
        
        
        
        
    }

}
