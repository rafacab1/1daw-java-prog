package ejCondicionales;
/**
 * 12. Escribir un programa que lea un año indicar si es bisiesto. 
 * Nota: un año es bisiesto si es un número divisible por 4, pero no si es divisible por 100, 
 * excepto que también sea divisible por 400.
 * 
 * Algoritmo
 * Pregunto el año
 * Si el resto del año entre 4, es 0...
 *   Si lo es, compruebo si es divisible entre 100.
 *       Si lo es, compruebo si es divisible entre 400
 *           Si lo es, es bisiesto.
 *           Si no lo es, no es bisiesto.
 *       Si no lo es, es bisiesto.
 *   Si no lo es, no es bisiesto
 * 
 * Variables:
 * year :  Año (int)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
import java.util.Scanner;
public class ej12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // Pido el año
    System.out.print("Introduce el año: ");
    int year = s.nextInt();

    // Hago las sentencias
    if (year%4==0) {
      if (year%100==0) {
        if (year%400==0) {
          System.out.println(year + " es bisiesto.");
        } else {
          System.out.println(year + " no es bisiesto.");
        }
      } else {
        System.out.println(year + " es bisiesto.");
      }
    } else {
      System.out.println(year + " no es bisiesto.");
    }
    s.close();
  }
}