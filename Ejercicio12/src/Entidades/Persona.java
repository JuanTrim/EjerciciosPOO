
package Entidades;

import java.util.Calendar;


public class Persona {
    public String nombre;
    public Calendar fecha;
    public Calendar fechaActual;

    public Persona(String nombre, Calendar fecha, Calendar fechaActual) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.fechaActual = fechaActual;
    }

    public void setFechaActual(Calendar fechaActual) {
        this.fechaActual = fechaActual;
    }

    public Calendar getFechaActual() {
        return fechaActual;
    }

    public Persona() {
    }


    public String getNombre() {
        return nombre;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
