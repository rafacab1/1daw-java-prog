package ejArraysBidimensionales;

import java.util.Scanner;

public class Ej02ArBidi {
  /*
   * 2. Escribe un programa que pida 20 números enteros. Estos números se deben
   * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
   * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
   * tratara. La suma total debe aparecer en la esquina inferior derecha.
   * 
   * Algortimo
   * Pido todos los valores para todos los huecos del array
   * Voy imprimiendo todos los valores por fila
   * y al acabar cada fila, la suma de todos
   * Voy almacenando la suma en dos variables, una la pondré a
   * 0 por cada fila y la otra no, para que sea la suma total
   * Ahora imprimo la última fila con las sumas de las
   * columnas, para ello sumo todos los valores por columna
   * y los voy imprimiendo. Al final muestro la variable
   * que contiene la suma total.
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
    for (int fila=0;fila<4;fila++) {
      for (int columna=0;columna<5;columna++) {
        System.out.print("Introduce, fila " + fila + ", columna " + columna + ": ");
        tabla[fila][columna] = s.nextInt();
      }
    }
    
    // Imprimo filas
    for (int fila=0;fila<4;fila++) {
      suma = 0;
      for (int columna=0;columna<5;columna++) {
        System.out.print(tabla[fila][columna] + " | ");
        suma += tabla[fila][columna];
        sumaTotal += tabla[fila][columna];
      }
    System.out.print(" Total fila " + (fila+1) + " " + suma);
    System.out.println("\n-----------------------------------------------------------------------------");
    }
    
    // Imprimo la última fila con la suma de las columnas
    System.out.println("_____________________________________________________________________________");
    for (int columna=0;columna<5;columna++) {
      for(int fila=0;fila<4;fila++) {
        sumaColumnas += tabla[fila][columna];
      }
      System.out.print(sumaColumnas + " | ");
      sumaColumnas = 0;
    }
    System.out.print("Total tabla: " + sumaTotal); // Imprimo el total
  
    s.close();
  }

}
