package ejColecciones;

import java.util.ArrayList;

/*
 * Ejercicio 2 de la página 228 del libro "Aprende Java con Ejercicios".
 * 
 * 2. Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 * 
 * @author Rafael Caballero
 * https://github.com/rafacab1
 * 
 */

public class EjArrayList02 {

  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<Integer>();

    // Genero un número aleatorio, entre 10 y 20, que será la cantidad de números
    // que generaré y por lo tanto el tamaño del ArrayList.
    int size = ((int) (Math.random() * 10 + 10));

    for (int i = 0; i <= size; i++) {
      al.add((int) (Math.random() * 100));
    }

    System.out.println("Tamaño del ArrayList: " + al.size());

    for (int i = 0; i <= size; i++) {
      System.out.println("El número que hay en la posición " + i + " es el " + al.get(i));
    }
  }

}
