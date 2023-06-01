
package Servicios;
import Entidades.Operación;
import java.util.Scanner;


public class opservicios {
    private final Operación op = new Operación();
    private final Scanner leer = new Scanner(System.in);
    
    
    
    public Operación crearOperacion(){
        
        
        System.out.println("INGRESE EL NUM1");
        op.setNum1(leer.nextInt());
        System.out.println("INGRESE EL NUM2");
        op.setNum2(leer.nextInt());
        
        return op;
    }
    
    
    
    public int sumar(Operación op){
        int suma;
        
        
        suma = op.num1 + op.num2;
        
        
        
        return suma;
        
        
        
    }
    public int restar(Operación op){
        int resta;
        
        
        resta = op.num1 - op.num2;
        
        
        
        return resta;
    }
    
    public int multiplicar(Operación op){
        int multiplicar;
        
        if (op.num1 == 0 || op.num2 == 0){
            multiplicar = 0;
        }else{
            multiplicar = op.num1 * op.num2;
        }
        
        
        
        
        
        return multiplicar;
    }
        
    public int dividir(Operación op){
        int dividir;
         if (op.num1 == 0 || op.num2 == 0){
            dividir = 0;
        }else{
            dividir = op.num1 / op.num2;
        }
        
        
        
        
        
        
        return dividir;
        
        
        
    }
    
}
