

package ejercicio7;
import java.util.Scanner;
import Entidades.Persona;
import Servicios.PersonaS;

public class Ejercicio7 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int contDebajo = 0;
        int contEncima = 0;
        int contIdeal = 0;
       int contMenores = 0;
       int contMayores = 0;
      
       
     
        int[] IMC = new int [4];
        boolean[] esMayor = new boolean [4];
        
        PersonaS ps = new PersonaS();
        Persona vector[] = new Persona[4];
      
       
        for (int i = 0; i < 4; i++) {
            vector[i] = ps.crearPersona();
            IMC[i] = ps.calcularIMC(vector[i]);
            esMayor[i] = ps.esMayorDeEdad(vector[i]);
        }
        
        for (int i = 0; i < 4; i++) {
            switch(ps.calcularIMC(vector[i])){
               case -1:
                   contDebajo++;
                   System.out.println(" Esta por debajo de su peso ideal");
                    break;
               case 0:
                   contIdeal++;
                   System.out.println("0 Esta en de su peso ideal");

                    break;
               case 1:
                   contEncima++;
                   System.out.println("0 Esta en con sobrepeso");
                    break;
            }
        }
        
        
        for (int i = 0; i < 4; i++) {
            if (esMayor[i] == true){
                contMayores++;
            }else{
                contMenores++;
            }
            
        }
        
        
         System.out.println("EL PORCENTAJE DE MAYORES ES: " + (contMayores * 100 / 4) + "%");
            System.out.println("EL PORCENTAJE DE Menores ES: " + (contMenores * 100  / 4) + "%");
            System.out.println("EL PORCENTAJE DE PESO POR ENCIMA DE LO NORMAL ES: " +( contEncima * 100 / 4) + "%");
            System.out.println("EL PORCENTAJE DE PESO POR DEBAJO DE LO NORMAL ES: " +( contDebajo * 100 / 4) + "%");
            System.out.println("EL PORCENTAJE DE PESO IDEAL ES: " + (contIdeal * 100 / 4) + "%"); 
        
    }

}
