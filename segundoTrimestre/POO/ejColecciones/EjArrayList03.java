package ejColecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Ejercicio 3 de la página 228 del libro "Aprende Java con Ejercicios".
 * 
 * 3. Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 * 
 * @author Rafael Caballero
 * https://github.com/rafacab1
 * 
 */

public class EjArrayList03 {

  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<Integer>();
    Scanner s = new Scanner(System.in);

    for (int i = 1; i <= 10; i++) {
      System.out.print("\nIntroduce el número " + i + " : ");
      al.add(s.nextInt());
    }

    System.out.println("\nARRAYLIST SIN ORDENAR");
    System.out.println("------------------------");
    for (int i = 0; i < 10; i++) {
      System.out.println("En la posición " + i + " del ArrayList se encuentra el: " + al.get(i));
    }

    // Ordeno el ArrayList
    Collections.sort(al);

    System.out.println("\nARRAYLIST ORDENADO");
    System.out.println("------------------------");
    for (int i = 0; i < 10; i++) {
      System.out.println("En la posición " + i + " del ArrayList se encuentra el: " + al.get(i));
    }

    s.close();
  }

}
