package ejCondicionales;

/**
 * 4. Crea un programa que pida al usuario dos números 
 * y muestre su división si el segundo no es cero, o un mensaje de aviso en caso contrario.
 * 
 * Algoritmo
 * Pido los números
 * Si n2 es 0 digo que no puedo realizar la división
 * Si no, muestro el resultado de la división
 * 
 * Variables:
 * n1, n2 : Números (double)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
import java.util.Scanner;
public class ej4 {
  public static void main(String[] main) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce dos números: ");
    double n1 = s.nextDouble();
    double n2 = s.nextDouble();

    if (n2 == 0) {
      System.out.println("No puedes realizar una división entre 0.");
    } else {
      System.out.println("El resultado es " + (n1/n2));
    }

    s.close();
  }
}