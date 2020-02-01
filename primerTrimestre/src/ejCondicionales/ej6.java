package ejCondicionales;

/**
 * 6. Programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
 * 
 * Algoritmo
 * 
 * 
 * Variables:
 * n1, n2 : Números (double)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
import java.util.Scanner;
public class ej6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce una letra mayúscula: ");
    String letra = s.nextLine();

    if (letra==letra.toUpperCase() && letra.length() == 1) {
      System.out.println("Bien, " + letra + " es una letra mayúscula.");
    } else {
      System.out.println(letra + " no es una letra mayúscula.");
    }

    s.close();
  }
}