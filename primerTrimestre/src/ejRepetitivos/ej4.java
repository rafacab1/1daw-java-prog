package ejRepetitivos;

/**
 * 4. Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario.
 *
 * @author Rafael Alberto Caballero Osuna
 * 
 * Algoritmo
 * Pido los dos números
 * Compruebo si n1 es menor que n2, si lo es muestro una advertencia, si no sigo.
 * En el rango de n1 a n2...
 *   Si el resto de i entre 2 es 0, muestro i, ya que es par
 * 
 * Variables
 * n1 : Número 1 (int)
 * n2 : Número 2 (int)
 * 
 */
import java.util.Scanner;
public class ej4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // Pido los números
    System.out.print("Introduce el primer número: ");
    int n1 = s.nextInt();
    System.out.print("Introduce el segundo número: ");
    int n2 = s.nextInt();

    int i;

    if (n2<n1) {
      System.out.println("Escribe primero el número mas pequeño, y después el mas grande.");
    } else {
    for (i=n1;i<=n2;i++) {
        if (i%2==0) { // Si el resto es 0, significa que es par.
          System.out.println(i);
        }
    }  
    }
    s.close();
  }
}