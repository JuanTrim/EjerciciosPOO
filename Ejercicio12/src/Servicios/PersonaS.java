package Servicios;

import Entidades.Persona;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;




public class PersonaS {
private final Persona p = new Persona();
private final Scanner leer = new Scanner(System.in);    
    

public Persona crearPersona(){
    System.out.println("INGRESE SU NOMBRE");
    p.setNombre(leer.next()); 
    
    System.out.println("INGRESE SU AÑO DE NACIMIENTO");
    int anio = leer.nextInt();
    System.out.println("INGRESE SU MES DE NACIMIENTO");
    int mes = leer.nextInt();
    System.out.println("INGRESE SU DIA DE NACIMIENTO");
    int dia = leer.nextInt();
    
    Calendar fecha = Calendar.getInstance();
    fecha.set(anio,mes-1,dia);
    
    Calendar fechaActual = Calendar.getInstance();
    p.setFechaActual(fechaActual);
    
    
    p.setFecha(fecha);
    
    return p;
}

public int calcularEdad(Persona p){
   
    
    if (p.getFechaActual().get(Calendar.MONTH) < p.getFecha().get(Calendar.MONTH)){
        
        return p.fechaActual.get(Calendar.YEAR) - p.fecha.get(Calendar.YEAR) - 1;
    }
    
    
    

    

        
    
    
     return p.fechaActual.get(Calendar.YEAR) - p.fecha.get(Calendar.YEAR);
    
}


public boolean menorQue(int edad, Persona p){
    boolean validar = false;
    
    if(calcularEdad(p) < edad){
        validar = true;
        
    }
        return validar;
}


public void mostrarPersona(Persona p){
     System.out.println(p.fecha.getTime());
}
  
    
    
    
    
    
    
    
}
