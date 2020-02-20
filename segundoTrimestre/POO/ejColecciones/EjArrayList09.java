package ejColecciones;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Ejercicio 9 de la página 228 del libro "Aprende Java con Ejercicios".
 * 
 * 9. Modifica el programa anterior de tal forma que las cartas se muestren
 * ordenadas. Primero se ordenarán por palo: bastos, copas, espadas, oros.
 * Cuando coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7,
 * sota, caballo, rey.
 * 
 * @author Rafael Caballero
 * https://github.com/rafacab1
 * 
 */

public class EjArrayList09 {

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
      int ntmp = (int)(Math.random()*(11+1));
      int ptmp = (int)(Math.random()*(3+1));
      
      Carta tmp = new Carta(numeroAl.get(ntmp), paloAl.get(ptmp));
      
      while (cartas.contains(tmp)) {
        tmp = new Carta(numeroAl.get(ntmp), paloAl.get(ptmp)); // Mientras que cartas tenga tmp, hago nuevas cartas.
      }
      cartas.add(tmp);
    }
    
    // Ordenar el ArrayList
    Collections.sort(cartas); // No he conseguido ordenarlo por número cuando el palo es el mismo.
    
    // Bucle que muestra las cartas del ArrayList
    for (int i=0;i<cartas.size();i++) {
      System.out.println(cartas.get(i));
    }
}
}
