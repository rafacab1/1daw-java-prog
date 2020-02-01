package ejCondicionales;

/**
 * 3. Escribe un programa que lea un número e indique si es par o impar.
 * 
 * Algoritmo
 * Pido el número
 * Si el resto del número entre 2 es 0 digo que es par.
 * Si no, digo que es impar.
 * 
 * Variables:
 * n : Número (int)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
import java.util.Scanner;
public class ej3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número y te diré si es par o impar: ");
    int n = s.nextInt();

    if (n%2==0) {
      System.out.println(n + " es par.");
    } else {
      System.out.println(n + " es impar.");
    }
    s.close();
  }
}