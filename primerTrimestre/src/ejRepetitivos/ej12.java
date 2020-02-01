package ejRepetitivos;

/**
 * 12. Pide una cadena y dos caracteres por teclado (valida que sea un carácter), 
 * sustituye la aparición del primer carácter en la cadena por el segundo carácter.
 *
 * @author Rafael Alberto Caballero Osuna
 * 
 * Algoritmo
 * Pido la cadena y los caracteres
 * Creo una variable para ir metiendo todos los caracteres
 * Compruebo si la longitud de lo introducido es un 1
 *   Si lo es, en un rango de 0 a cadena
 *       Compruebo si el caracter de la posición es igual que el primero introducido. Si lo es, añado el segundo caracter
 *       Compruebo si el caracter de la posición no es igual que el primero introducido. Si es cierto, añado el mismo caracter.
 *  Si no lo es, digo que no se han introducido bien los caracteres
 * Muestro el contenido de la nueva cadena con los caracteres reemplazados
 * 
 * Variables
 * cadena = Cadena introducida por el usuario (str)
 * c1 = Primer caracter (str)
 * c2 = Segundo caracter (str)
 * c1c = Primer caracter (char)
 * c2c = Segundo caracter (char)
 * repl = Nueva cadena con los caracteres reemplazados (str)
 * 
 */
import java.util.Scanner;
public class ej12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Programa que a partir de una cadena reemplaza un caracter indicado por otro.");

    // Pido la cadena y los caracteres
    System.out.print("\nIntroduce una cadena: ");
    String cadena = s.nextLine();
    System.out.print("Introduce un caracter: ");
    String c1 = s.next();
    System.out.print("Introduce otro caracter: ");
    String c2 = s.next();

    // Creo una variable donde ir almacenando los caracteres, paso todo a minúsculas y saco el caracter como caracter
    String repl = "";
    cadena = cadena.toLowerCase();
    c1 = c1.toLowerCase();
    c2 = c2.toLowerCase();
    char c1c = c1.charAt(0);
    char c2c = c2.charAt(0);

    for (int i=0;i<=cadena.length()-1;i++) {
      if (cadena.charAt(i) == c1c) { // Si el caracter i de la cadena es como el primero
        repl = repl + c2c; // Añado el segundo
      }
      if (cadena.charAt(i) != c1c) { // Si no es como el primero
        repl = repl + cadena.charAt(i); // Añado el caraacter i de la cadena
      }
    }
    System.out.println("\n" + repl);
    s.close();
  }
}