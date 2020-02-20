package ejColecciones;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Ejercicio 12 de la página 228 del libro "Aprende Java con Ejercicios".
 * 
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja
 * española y que sume los puntos según el juego de la brisca. El valor de las
 * cartas se debe guardar en una estructura HashMap que debe contener parejas
 * (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser una
 * estructura de la clase ArrayList que contiene objetos de la clase Carta . El valor
 * de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo → 3, rey → 4;
 * el resto de cartas no vale nada.
 * 
 * @author Rafael Caballero
 * https://github.com/rafacab1
 * 
 */

public class EjHashMap12 {

  public static void main(String[] args) {
    // Creo dos ArrayList, uno con los números del 1 al 12
    // y otro con los cuatro palos
    ArrayList<Integer> numeroAl = new ArrayList<Integer>();
    ArrayList<String> paloAl = new ArrayList<String>();
    
    ArrayList<Carta> cartar = new ArrayList<Carta>();
    HashMap<String, String> cartas = new HashMap<String, String>();

    // Añado los números a numeroAl
    for (int i = 1; i <= 12; i++) {
      numeroAl.add(i);
    }

    // Añado los palos a paloAl
    paloAl.add("bastos");
    paloAl.add("copas");
    paloAl.add("espadas");
    paloAl.add("oros");

    int ptos = 0;
    // Hago 10 objetos de la clase Carta, y los añado al HashMap
    for (int i = 0; i < 5; i++) {
      // Genero dos números aleatorios para seleccionar el número y el
      // palo aleatoriamente
      String ntmp = Integer.toString((int)(Math.random()*(1-12+1)+12));
      int ptmp = (int)(Math.random()*(1-4+1)+4);
      
      int intmp = Integer.parseInt(ntmp);
      Carta tmp = new Carta(numeroAl.get(intmp), paloAl.get(ptmp));
      
      while (cartar.contains(tmp)) {
        tmp = new Carta(numeroAl.get(intmp), paloAl.get(ptmp)); // Mientras que cartas tenga tmp, hago nuevas cartas.
      }
      cartar.add(tmp);
      
      if (ntmp.equals("1")) {
        ptos += 11;
        ntmp = "as";
      }
      if (ntmp.equals("3")) {
        ptos += 10;
      }
      if (ntmp.equals("10")) {
        ptos += 2;
        ntmp = "sota";
      }
      if (ntmp.equals("11")) {
        ptos += 3;
        ntmp = "caballo";
      }
      if (ntmp.equals("12")) {
        ptos += 4;
        ntmp = "rey";
      }
      
      cartas.put(ntmp, paloAl.get(ptmp));
    }
    
    // Bucle que muestra las cartas del ArrayList
    for (int i=0;i<cartas.size();i++) {
      System.out.println(cartar.get(i));
    }
    System.out.println("Tienes " + ptos + " puntos.");
    
}
}