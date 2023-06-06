
package Servicios;
import Entidades.Cadena;
import java.util.Scanner;

public class CadenaS {
    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Cadena c = new Cadena();
    
    
    public Cadena CrearCadena(){

        
        System.out.println("INGRESE LA FRASE");
        c.setFrase(leer.next());
        
        
        c.setLongitud(c.getFrase().length());
        
        
        
     return c;
    }
    
    
    
    public void mostrarVocales(Cadena c){
       int cont = 0;
        
        for (int i = 0; i < c.getLongitud(); i++) {
            
//           if(c.getFrase().contains("a") || c.getFrase().contains("e") || c.getFrase().contains("i")|| c.getFrase().contains("o") || c.getFrase().contains("u")){
//               cont++;
//           };
            
            
            
            
            switch (c.getFrase().substring(i, i+1)){
                case "a":
                case "A":
                    cont++;
                    break;
                case "E":
                case "e":
                    cont++;
                    break;
                case "i":
                case "I":
                    cont++;
                    break;
                case "O":
                case "o":
                    cont++;
                    break;
                case "U":
                case "u":
                    cont++;
                    break;
                    
                    
            }
            
            
        }
        System.out.println("LA CANTIDAD DE VOCALES EN LA FRASE ES DE: " + cont);
        
    }
    
    
    
    
    public void invertirFrase(Cadena c){
            
        for (int i = c.getLongitud()-1; i >= 0; i--) {
            
            System.out.print(c.getFrase().substring(i, i+1));
            
        }
        System.out.println("");
        
        
        
        
    }
    
    
    
    public void caracterRepetido(Cadena c){
        System.out.println("INGRESE UN CARACTER QUE BUSQUE EN LA FRASE");
        String caracter = leer.next();
        int cont = 0;
                
        
        
        for (int i = 0; i < c.getLongitud(); i++) {
            
            if(c.getFrase().substring(i, i+1).equalsIgnoreCase(caracter)){
                cont++;
            }
            
        }
        System.out.println(caracter + " Se encuentra" + cont + " veces en la frase");
    }
    public void compararLongitud(Cadena c){
        System.out.println("INGRESE UNA NUEVA FRASE");
        String frase = leer.next();
        
             if(frase.length() == c.getLongitud()){
                 System.out.println("LAS DOS FRASES TIENEN LA MISMA LONGITUD");
             }else{
                 System.out.println("LAS DOS FRASES TIENEN DISTINTA LONGITUD");
             }
        
        
   
        
    }
    public void unirFrase(Cadena c){
        System.out.println("INGRESE UNA NUEVA FRASE");
        String frase = leer.next();
        
             
             
             
             System.out.println(c.getFrase().concat(frase));
        
   
        
    }
    public void remplazar(Cadena c){
        System.out.println("INGRESE UN NUEVO CARACTER PARA REMPLAZAR POR LAS A");
        String caracter = leer.next();
        String cadena = c.getFrase();
        
        
        for (int i = 0; i < c.getLongitud(); i++) {
            if(c.getFrase().substring(i, i+1).equalsIgnoreCase("a")){
                
                cadena = cadena.replace("a", caracter).replace("A", caracter);
                
            }
            
            
        }
        c.setFrase(cadena);
        System.out.println(c.getFrase());
        
             
             
    
        
   
        
    }
    
    
    public boolean contiene(Cadena c){
        System.out.println("INGRESE UN NUEVO CARACTER PARA VER SI ESTA EN LA FRASE");
        String caracter = leer.next();
        boolean validar = false;
        
        for (int i = 0; i < c.getLongitud(); i++) {
            if(c.getFrase().substring(i, i+1).equals(caracter)){
                validar = true;
            }
        }
       
        
        return validar;
    }
    

    
    
    
    
    

}