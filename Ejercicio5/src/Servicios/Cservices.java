
package Servicios;
import Entidades.*;
import Servicios.*;
import java.util.Scanner;
public class Cservices {
    private final Cuenta c = new Cuenta();
   private final Scanner leer = new Scanner(System.in);
    public Cuenta crearCuenta(){
        Cuenta c = new Cuenta();
        
        System.out.println("INGRESE SU NUMERO DE CUENTA");
        c.setNumeroCuenta(leer.nextInt());
        
        System.out.println("INGRESE SU NUMERO DE DNI");
        c.setDni(leer.nextInt());
        
        System.out.println("INGRESE SU SALDO");
        c.setSaldo(leer.nextInt());
        
     
        
        return c;
        
    }
    
    public double ingresar(Cuenta c ){
        double ingreso;
        System.out.println("Ingrese el monto que quiere depositar");
        ingreso = leer.nextDouble();
        
        c.setSaldo(c.getSaldo() + ingreso);
        
        return c.getSaldo();
        
    }
    public double retirar(Cuenta c ){
        double retiro;
        System.out.println("Ingrese el monto que quiere retirar");
        retiro = leer.nextDouble();
        
        if (c.getSaldo() < retiro){
            c.setSaldo(0);
        }else{
            c.setSaldo(c.getSaldo() - retiro);
        }
        return c.getSaldo();
        
        
       
    }   
    public double extraccionRapida(Cuenta c ){
        double retiro;
        System.out.println("Ingrese el monto que quiere retirar");
        retiro = leer.nextDouble();
        
        if (retiro > c.getSaldo() * 0.2){
            System.out.println("SOLO PUEDE RETIRAR HASTA UN 20% DEL TOTAL DE SU SALDO");
        }else{
            c.setSaldo(c.getSaldo() - retiro);
        }
        return c.getSaldo();
        
        
       
    }   
    public double consultarSaldo(Cuenta c ){
       
        return c.getSaldo();
        
        
       
    }
    public void MostrarDatos(Cuenta c ){
        System.out.println("SU NUMERO DE CUENTA ES: " + c.getNumeroCuenta());
        System.out.println("SU SALDO ES: " +c.getSaldo());
        System.out.println("SU DNI ES: " + c.getDni());
        
        
        
       
    }
    
    
    
    
    
}
