
package Entidades.Servicios;
import Entidades.Libro;
import java.util.Scanner;

public class LibroServices {
    
    
     public Libro cargar(){
        Scanner leer = new Scanner(System.in);
        Libro lib = new Libro();
        
        System.out.println("Ingrese el autor del libro");
        lib.autor = leer.next();
        System.out.println("Ingrese el titulo del libro");
        lib.tiutlo = leer.next();
        System.out.println("Ingrese el ISBN del libro");
        lib.ISBN = leer.nextInt();
        System.out.println("Ingrese el numero de paginas del libro");
        lib.numpags = leer.nextInt();
        
        return lib;
    }
     
     
     public void mostrar(Libro lib2){
        Scanner leer = new Scanner(System.in);
        
        System.out.println(lib2.getAutor());

        System.out.println(lib2.getTiutlo());
 
        System.out.println(lib2.getISBN());
  
        System.out.println(lib2.getNumpags());
    }
    
}
