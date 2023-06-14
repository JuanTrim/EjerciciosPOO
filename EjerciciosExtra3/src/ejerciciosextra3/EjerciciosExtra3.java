

package ejerciciosextra3;
import java.util.Scanner;
import Entidades.Raices;
import Servicios.RaicesS;
public class EjerciciosExtra3 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        RaicesS rs = new RaicesS();
        Raices r = rs.crearEcuacion();
        int opc = 0 ;
//       do{
//           System.out.println("1. GETDISCRIMINATE");
//           System.out.println("2. TieneRaices");
//           System.out.println("3. TieneRaiz");
//           System.out.println("4. ObtenerRaices");
//           System.out.println("5. ObtenerRaiz");
//           System.out.println("6. Calcular");
//           System.out.println("7 SALIR");
//           opc = leer.nextInt();
////           switch (opc){
////               case 1:
////                   rs.getDiscriminate(r);
////                   break;
////               case 2:
////                   rs.tieneRaices(r);
////                   break;
////               case 3:
////                   rs.tieneRaiz(r);
////                   break;
////               case 4:
////                   rs.obtenerRaices(r);
////                   break;
////               case 5:
////                   rs.obtenerRaiz(r);
////                   break;
////               case 6:
////                   rs.calcular(r);
////                   break;
////               case 7:
////                   opc = 7;
////                   break;
////           }
////           
////           
////       }while(opc != 7);


        rs.calcular(r);
        
        
        
        
    }

}
