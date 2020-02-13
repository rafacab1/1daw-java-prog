package ejColecciones;

import java.util.ArrayList;

/*
 * Ejercicio 8 de la página 228 del libro "Aprende Java con Ejercicios".
 * 
 * 8. Realiza un programa que escoja al azar 10 cartas de la baraja española
 * (10 objetos de la clase Carta). Emplea un objeto de la clase
 * ArrayList para almacenarlas y asegúrate de que no se repite ninguna.
 * 
 * @author Rafael Caballero
 * https://github.com/rafacab1
 * 
 */

public class EjArrayList08 {

  public static void main(String[] args) {
    // Creo dos ArrayList, uno con los números del 1 al 12
    // y otro con los cuatro palos
    ArrayList<Integer> numeroAl = new ArrayList<Integer>();
    ArrayList<String> paloAl = new ArrayList<String>();
    
    // Creo otro ArrayList, para almacenar las cartas
    ArrayList<Carta> cartas = new ArrayList<Carta>();

    // Añado los números a numeroAl
    for (int i = 1; i <= 12; i++) {
      numeroAl.add(i);
    }

    // Añado los palos a paloAl
    paloAl.add("bastos");
    paloAl.add("copas");
    paloAl.add("espadas");
    paloAl.add("oros");

    // Hago 10 objetos de la clase Carta, y los añado al ArrayList
    for (int i = 0; i < 10; i++) {
      // Genero dos números aleatorios para seleccionar el número y el
      // palo aleatoriamente
      int ntmp = (int)(Math.random()*(1-12+1)+12);
      int ptmp = (int)(Math.random()*(1-4+1)+4);
      
      Carta tmp = new Carta(numeroAl.get(ntmp), paloAl.get(ptmp));
      if (!cartas.contains(tmp)) {
        cartas.add(tmp);
      } // TODO: Queda ver que hago en esta parte, en el caso de que 
      // ya esté la carta dentro, además de mostrar los eventos por
      // pantalla.
    }
  }

}
