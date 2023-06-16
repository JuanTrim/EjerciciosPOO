package Servicios;

import Entidades.Ahorcado;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AhorcadoServicios {

    private final Ahorcado a = new Ahorcado();
    private final Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego() {
        String palabra;
        String[] vpalabra;
        String[] vjuego;
        System.out.println("INGRESE LA PALABRA A BUSCAR");
        palabra = leer.next();
        a.setAcu("*");

        //DIMENSION AL VECTOR DEL OBJETO
        a.setPalabraFind(new String[palabra.length()]);

        //DIMENSION A LOS VECTOR LOCAL
        vpalabra = new String[palabra.length()];
        vjuego = new String[palabra.length()];

        //FOR QUE GUARDA LA PALABRA EN EL VECTOR
        for (int i = 0; i < palabra.length(); i++) {
            vpalabra[i] = palabra.substring(i, i + 1);
        }
        //IGUALAR VECTOR LOCAL A VECTOR DEL OBJETO
        a.setPalabraFind(vpalabra);

        System.out.println("INGRESE LA CANTIDAD DE JUGADAS MAXIMA");
        a.setJugadasMaximas(leer.nextInt());

        for (int i = 0; i < palabra.length(); i++) {
            vjuego[i] = "-";
            System.out.print(" " + vjuego[i] + " ");
        }
        System.out.println("");

        a.setLetrasEncontradas(0);

        return a;
    }

    public void longitud(Ahorcado a) {
        System.out.println("LA LONGITUD DE LA PALABRA QUE SE DEBE BUSCAR ES: " + a.getPalabraFind().length);
    }

    public void buscar(String letra, Ahorcado a, boolean v) {
        v = false;

        for (int i = 0; i < a.getPalabraFind().length; i++) {

            if (a.getAcu().contains(letra)) {
                
                System.out.println("LA LETRA ESTA REPETIDA");
                v = false;
                break;
            }

            if (letra.equals(a.getPalabraFind()[i])) {
                v = true;

            }
            
        }
          if (v == true) {
                System.out.println("LA LETRA SE ENCUENTRA EN LA PALABRA");
                a.setLetrasEncontradas(a.getLetrasEncontradas() + 1);
                

            } else {
                System.out.println("LA LETRA NO SE ENCUENTRA EN LA PALABRA");
                a.setJugadasMaximas(a.getJugadasMaximas() - 1);
                

            }
            a.setAcu(a.getAcu() + letra);
    }

    public void encontradas(Ahorcado a, String l, boolean v) {

        System.out.println("NUMERO DE LETRAS(ENCONTRADAS, FALTANTES): " + a.getLetrasEncontradas() + ", " + (a.getPalabraFind().length - a.letrasEncontradas));

    }

    public void intentos(Ahorcado a) {

        System.out.println("TE QUEDAN " + a.getJugadasMaximas() + " INTENTOS");
    }

    public void juego() {
        boolean v = false;
        Ahorcado game;
        game = crearJuego();
        int aux = game.getLetrasEncontradas();
        int intentos = game.getJugadasMaximas();

        for (int i = 0; i < intentos; i++) {
            System.out.println("INGRESE LA LETRA A BUSCAR");
            String letra = leer.next();

            buscar(letra, game, v);
            encontradas(game, letra, v);
            intentos(game);

            if (game.getLetrasEncontradas() == game.getPalabraFind().length) {

                System.out.println("HAS GANADO ENCONTRASTE TODAS LAS LETRAS");
                break;
            }

        }
        if (game.getJugadasMaximas() == 0) {
            System.out.println("PERDISTE!!!!! SE TERMINARON TUS INTENTOS");
        }

    }

}
