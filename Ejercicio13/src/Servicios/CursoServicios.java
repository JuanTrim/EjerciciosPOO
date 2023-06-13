
package Servicios;
import Entidades.Curso;
import java.util.Scanner;

public class CursoServicios {
    private final Curso c = new Curso();
    private final Scanner leer = new Scanner(System.in);
    
    public void cargarAlumnos(Curso c){
        for (int i = 0; i < 5; i++) {
            System.out.println("INGRESE EL NOMBRE DEL ALUMNO " + i);
            c.alumnos[i] = leer.next();
            
        }
        
        
        
        
    }
    
    
   public Curso crearCurso(){
       
       System.out.println("INGRESE EL NOMBRE DE SU CURSO");
       c.setNombreCurso(leer.next());
       System.out.println("INGRESE UNA CANTIDAD DE DIAS POR SEMANA");
       c.setCantidadDiasPorSemana(leer.nextInt());
       System.out.println("INGRESE UNA CANTIDAD DE HORAS POR DIA");
       c.setCantidadHorasPorDia(leer.nextInt());
       System.out.println("INGRESE EL PRECIO POR HORA DE LA CLASE");
       c.setPrecioPorHora(leer.nextInt());
       cargarAlumnos(c);
       
       
       
       
       
       
       
       
       
       
       
        return c;
       
   }
   
   
   public int calcularGananciaSemanal(Curso c){
       
       return (c.getCantidadDiasPorSemana() * c.getCantidadHorasPorDia() * c.getPrecioPorHora() * 5);
   }
   
   
    
    
    
}
