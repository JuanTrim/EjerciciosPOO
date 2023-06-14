package Servicios;
import Entidades.NIF;
import java.util.Scanner;

public class NIFServicios {
    private final NIF n = new NIF();
    private final Scanner leer = new Scanner(System.in);
    private final String[] letras ={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"}; 
    
    
    public NIF crearNif(){
              
       long resto;
        System.out.println("INGRESE SU DNI");
        n.setNumero(leer.nextLong());
        resto = n.getNumero() % 23;
        
        
        n.setLetra(letras[(int)resto]);
        
        
        
        
        
        
        
        
        
        
        
        return n;
    }
    
    
    public void mostrar(){
        System.out.println(n.getNumero() + "-" + n.getLetra() );
    }
    
}
