package ejCondicionales;

/**
 * 17. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado 
 * de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
 * 
 * Algoritmo
 * Pido el número del dado
 * Si es 1, muestro "seis"
 * Si es 2, muestro "cinco"
 * Si es 3, muestro "cuatro"
 * Si es 4, muestro "tres"
 * Si es 5, muestro "dos"
 * Si es 6, muestro "uno"
 * Si el número no es ninguno de los errores, muestro ERROR: número incorrecto
 * 
 * Variables:
 * n : Número del dado (int)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
import java.util.Scanner;
public class ej17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // Pido el número
    System.out.print("Introduce el número que has obtenido en el dado (en número): ");
    int n = s.nextInt();

    // Compruebo cual es el número y digo cual es la cara opuesta
    if (n==1) {
      System.out.println("En la cara opuesta está el seis.");
    } else if (n==2) {
      System.out.println("En la cara opuesta está el cinco.");
    } else if (n==3) {
      System.out.println("En la cara opuesta está el cuatro.");
    } else if (n==4) {
      System.out.println("En la cara opuesta está el tres.");
    } else if (n==5) {
      System.out.println("En la cara opuesta está el dos.");
    } else if (n==6) {
      System.out.println("En la cara opuesta está el uno.");
    } else {
      System.out.println("ERROR: número incorrecto.");
    }
    s.close();
  }
}