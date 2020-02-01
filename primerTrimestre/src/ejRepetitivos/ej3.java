package ejRepetitivos;
/**
 * 3. Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ 
 * en caso contrario, el programa termina cuando se introduce un espacio.
 *
 * @author Rafael Alberto Caballero Osuna
 * 
 * Algoritmo
 * Mientras que una variable sea distinta de " "
 *   Pido un caracter
 *   Si es igual que "a" o "e" o "i" o "u" o "o" y la longitud es 1
 *       Muestro VOCAL
 *   Si no, compruebo que la longitud sea 1 y no sea " ", si es cierto, muestro "NO VOCAL"
 *   Si no, compruebo si es " ", si es cierto, muestro saliendo.
 *   Si no es nada de lo anterior, muestro error.
 * 
 * Variables
 * caracter = Caracter introducido (String)
 * 
 */

// EJERCICIO NO ACABADO: No consigo hacer que sirva el espacio para salir del programa
import java.util.Scanner;
public class ej3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    char caracter;

    do {
      System.out.print("Introduce un carácter: ");
      caracter = s.next().charAt(0);
      if (Character.toLowerCase(caracter) == 'a' || Character.toLowerCase(caracter) == 'e' || Character.toLowerCase(caracter) == 'i' || Character.toLowerCase(caracter) == 'o' || Character.toLowerCase(caracter) == 'u') {
        System.out.println("VOCAL");
      } else if (caracter!=' ') {
        System.out.println("NO VOCAL");
      } else {
        System.out.print("\nSaliendo..."); // TODO: Hacer que salga con espacio
      }
    }while (caracter!=' ');
    s.close();
}
}