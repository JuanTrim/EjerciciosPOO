

package ejercicio5;
import java.util.Scanner;
import Servicios.Cservices;
import Entidades.Cuenta;
public class Ejercicio5 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Cservices Cservi = new Cservices();
        Cuenta c = new Cuenta();
        int opc;
        // CREAR CUENTA
       c = Cservi.crearCuenta();
        
        
        
        do{
            System.out.println("1. INGRESAR");
        System.out.println("2. RETIRO");
        System.out.println("3. EXTRACCION RAPIDA");
        System.out.println("4. CONSULTAR SALDO");
        System.out.println("5. CONSULTAR DATOS");
        
        System.out.println("---------------------");
            opc = leer.nextInt();
        
        switch(opc){
            case 1:
                Cservi.ingresar(c);
                break;
            case 2:
                Cservi.retirar(c);
                break;
            case 3:
                Cservi.extraccionRapida(c);
                break;
            case 4:
                System.out.println(Cservi.consultarSaldo(c));
                break;
            case 5:
                Cservi.MostrarDatos(c);
                break;
        }
        
        }while( opc != 0);
        
        
        
        
        
        
        
        
        
}
}