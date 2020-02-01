package ejCondicionales;

/**
 * 1. Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no.
 * 
 * Algoritmo
 * Pido los dos números
 * Compruebo si n1 es mayor que n2, si lo es muestro que n1 es mayor que n2
 * Si no, compruebo si n1 y n2 son iguales, si lo son muestro que son iguales.
 * Si no, digo que n1 es menor que n2
 * 
 * Variables:
 * n1, n2 : Números (double)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
import java.util.Scanner;
public class ej1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Pido los dos números
    System.out.print("Introduce dos números: ");
    double n1 = s.nextDouble();
    double n2 = s.nextDouble();

    // Hago las sentencias
    if (n1>n2) {
      System.out.println(n1 + " es mayor que " + n2);
    } else if (n1==n2) {
      System.out.println(n1 + " y " + n2 + " son iguales.");
    } else {
      System.out.println(n1 + " es menor que " + n2);
    }

    s.close();
  }
}
