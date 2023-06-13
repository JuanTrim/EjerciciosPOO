package Servicios;

import Entidades.Matematica;

public class MatematicaS {

    private final Matematica m = new Matematica();

    public Matematica crearMatematica() {

        m.setNum1((int) (Math.random() * 10));
        m.setNum2((int) (Math.random() * 10));

        return m;
    }

    public int devolverMayor(Matematica m) {
        int aux;
        if (m.num1 > m.num2) {
            return m.num1;

        } else if (m.num1 == m.num2) {
            return m.num1;
        } else {
            return m.num2;
        }
    }

    public int devolverMenor(Matematica m) {
        int aux;
        if (m.num1 > m.num2) {
            return m.num2;

        } else if (m.num1 == m.num2) {
            return m.num2;
        } else {
            return m.num1;
        }

    }

    public int calcularPotencia(Matematica m) {
        int mayor = devolverMayor(m);
        int menor = devolverMenor(m);
        int aux = 1;

        for (int i = 0; i < menor; i++) {
            aux = aux * mayor;

        }
        mayor = aux;

        return mayor;

    }

    public int calcularRaiz(Matematica m) {
        int raiz = 0;
        int menor = devolverMenor(m);

        for (int i = 0; i < 10; i++) {
            if (i * i == menor) {
                raiz = i;
            }
        }

        return raiz ;

    }

}
