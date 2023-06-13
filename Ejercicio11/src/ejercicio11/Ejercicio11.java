

package ejercicio11;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("INGRESE UN DIA");
        int dia = leer.nextInt();
        System.out.println("INGRESE UN MES");
        int mes = leer.nextInt()-1;
        System.out.println("INGRESE UN AÑO");
        int anio = leer.nextInt();
        
        Date d = new Date(anio,mes,dia);
        
        Date actual = new Date();
        
        Date fechadiferencia = new Date();
        
       
        fechadiferencia.setYear(actual.getYear()-d.getYear());
        
        
        
        
        
  
        System.out.println("FECHA ACTUAL "+ (actual.getYear()+1900));
        System.out.println("FECHA INGRESADA "+ (d.getYear()));
        System.out.println("DIFERENCIA " +fechadiferencia.getYear());
        
        
        
        
        
        
        
        
        
        
        
        
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
