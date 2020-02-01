package ejercicios;
import java.util.Scanner;

import triangulos.DibujaTriangulos;

public class Ej42triangulo {
  
  /**
   * Algoritmo
   * Pido la altura del tirangulo
   * Llamo a la función tantas veces como la altura sea
   * En la última vuelta del ciclo, en vez de llamar a la función, simplemente imprimo un *
   * 
   * Variables
   * altura : Altura del triángulo
   * 
   * @author Rafael Alberto Caballero Osuna
   */

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la altura del triángulo: ");
    int altura = s.nextInt();

    for (int i=1;i<altura;i++) {
      System.out.println(DibujaTriangulos.triangulo(altura-i+1));
      if (i==altura-1) {
        System.out.println("*");
      }
    }
    s.close();
  }

}
