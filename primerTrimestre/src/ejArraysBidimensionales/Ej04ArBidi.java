package ejArraysBidimensionales;

import java.util.Scanner;

public class Ej04ArBidi {
  /*
   * 4. Modifica el programa anterior de tal forma que las sumas parciales y la
   * suma total aparezcan en la pantalla con un pequeño retardo, dando la
   * impresión de que el ordenador se queda “pensando” antes de mostrar los
   * números.
   * 
   * Algortimo 
   * Genero todos los valores para todos los huecos del array Voy esperando y
   * imprimiendo todos los valores por fila y al acabar cada fila, la suma de
   * todos Voy almacenando la suma en dos variables, una la pondré a 0 por cada
   * fila y la otra no, para que sea la suma total Ahora espero y imprimo la última fila
   * con las sumas de las columnas, para ello sumo todos los valores por columna y
   * los voy imprimiendo. Al final espero y muestro la variable que contiene la suma total.
   * 
   * Variables: 
   * tabla : Contiene los números (int) (array array) 
   * suma : Suma de todas las filas. (int) 
   * sumaColumna : Suma de las columnas. (int) 
   * sumaTotal : Suma de toda la tabla. (int)
   * 
   * 
   * @author Rafael Alberto Caballero Osuna
   */

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[][] tabla;
    tabla = new int[4][5];
    int suma = 0; // Suma de las filas
    int sumaColumnas = 0; // Suma de las columnas
    int sumaTotal = 0; // Suma total

    // Pido todos los números
    for (int fila = 0; fila < 4; fila++) {
      for (int columna = 0; columna < 5; columna++) {
        tabla[fila][columna] = (int) (Math.random() * 900 + 100);
      }
    }

    // Imprimo filas
    for (int fila = 0; fila < 4; fila++) {
      suma = 0;
      for (int columna = 0; columna < 5; columna++) {
        System.out.print(tabla[fila][columna] + " | ");
        suma += tabla[fila][columna];
        sumaTotal += tabla[fila][columna];
      }
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
      System.out.print(" Total fila " + (fila + 1) + " " + suma);
      System.out.println("\n-----------------------------------------------------------------------------");
    }

    // Imprimo la última fila con la suma de las columnas
    System.out.println("_____________________________________________________________________________");
    for (int columna = 0; columna < 5; columna++) {
      for (int fila = 0; fila < 4; fila++) {
        sumaColumnas += tabla[fila][columna];
      }
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
      System.out.print(sumaColumnas + " | ");
      sumaColumnas = 0;
    }
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
    }
    System.out.print("Total tabla: " + sumaTotal); // Imprimo el total

    s.close();
  }

}
