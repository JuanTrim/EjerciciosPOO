
package Entidades;


public class Drop {
    
    double costoProducto;
    double costoEnvio;
    double costoAdministrativo;
    
    double utilidad;
    double cpa;
    double porcentajeUtilidad;
    double costoTotal;

    
    double precioFinal;
    double roasMinimo;

  
    public Drop(double costoProducto, double costoEnvio, double costoAdministrativo, double utilidad, double cpa, double porcentajeUtilidad, double costoTotal, double precioFinal, double roasMinimo) {
        this.costoProducto = costoProducto;
        this.costoEnvio = costoEnvio;
        this.costoAdministrativo = costoAdministrativo;
        this.utilidad = utilidad;
        this.cpa = cpa;
        this.porcentajeUtilidad = porcentajeUtilidad;
        this.costoTotal = costoTotal;
        this.precioFinal = precioFinal;
        this.roasMinimo = roasMinimo;
    }

    public double getCostoProducto() {
        return costoProducto;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }

    public double getCostoAdministrativo() {
        return costoAdministrativo;
    }

    public double getUtilidad() {
        return utilidad;
    }

    public double getCpa() {
        return cpa;
    }

    public double getPorcentajeUtilidad() {
        return porcentajeUtilidad;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public double getRoasMinimo() {
        return roasMinimo;
    }

    public void setCostoProducto(double costoProducto) {
        this.costoProducto = costoProducto;
    }

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public void setCostoAdministrativo(double costoAdministrativo) {
        this.costoAdministrativo = costoAdministrativo;
    }

    public void setUtilidad(double utilidad) {
        this.utilidad = utilidad;
    }

    public void setCpa(double cpa) {
        this.cpa = cpa;
    }

    public void setPorcentajeUtilidad(double porcentajeUtilidad) {
        this.porcentajeUtilidad = porcentajeUtilidad;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public void setRoasMinimo(double roasMinimo) {
        this.roasMinimo = roasMinimo;
    }

    public Drop() {
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public double getCostoTotal() {
        return costoTotal;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
