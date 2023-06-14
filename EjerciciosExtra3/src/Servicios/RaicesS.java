package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class RaicesS {

    private final Raices r = new Raices();
    private final Scanner leer = new Scanner(System.in);

    public Raices crearEcuacion() {
        System.out.println("INGRESE EL VALOR DE A");
        r.setA(leer.nextInt());
        System.out.println("INGRESE EL VALOR DE B");
        r.setB(leer.nextInt());
        System.out.println("INGRESE EL VALOR DE C");
        r.setC(leer.nextInt());

        return r;
    }

    public double getDiscriminate(Raices r) {
        //FORMULA (b°2)-4.a.c
        double discriminate;
        discriminate = Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
        // TESTING QA System.out.println("DISCRIMATE " + discriminate);
        return discriminate;
    }

    public boolean tieneRaices(Raices r) {
        boolean validar = false;

        if (getDiscriminate(r) >= 0) {
            validar = true;
        }
        return validar;
    }

    public boolean tieneRaiz(Raices r) {
        boolean validar = false;

        if (getDiscriminate(r) == 0) {
            validar = true;
        }
        return validar;
    }

    public double[] obtenerRaices(Raices r) {
        // FORMULA (-b±√((b^2)-(4*a*c)))/(2*a)
        double[] raiz = {0, 0};

        if (tieneRaices(r) == true) {
            raiz[0] = (r.getB() - Math.sqrt(getDiscriminate(r))) / (2 * r.getA());
            raiz[1] = (r.getB() + Math.sqrt(getDiscriminate(r))) / (2 * r.getA());

        }
        return raiz;

    }

    public double obtenerRaiz(Raices r) {
        // FORMULA (-b±√((b^2)-(4*a*c)))/(2*a)
        double raiz = 0;
        if (tieneRaiz(r) == true) {
            raiz = (r.getB() + Math.sqrt(getDiscriminate(r))) / (2 * r.getA());

        }
        return raiz;
    }

    public void calcular(Raices r) {
        if (tieneRaiz(r) == true) {
        System.out.println("TIENE UNA RAIZ UNICA " + obtenerRaiz(r));
        
        }else if (tieneRaices(r) == true) {
            System.out.println("RAIZ 1 " + obtenerRaices(r)[0] + " RAIZ 2 " + obtenerRaices(r)[1]);

        } else {
            System.out.println("NO TIENE RAICES POR QUE EL DISCRIMANTE ES NEGATIVO");
        }

    }

}
