
package Entidades;

public class Meses {
    String[] meses = {"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};
    String mesOculto = meses[5];

    public Meses() {
    }

    public String[] getMeses() {
        return meses;
    }

    public String getMesOculto() {
        return mesOculto;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public void setMesOculto(String mesOculto) {
        this.mesOculto = mesOculto;
    }
    
    
    
}
