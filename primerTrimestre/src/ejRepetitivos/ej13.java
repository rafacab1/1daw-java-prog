package ejRepetitivos;

/**
 * 13. Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y viceversa.
 *
 * @author Rafael Alberto Caballero Osuna
 * 
 * Defino la variable resultado
 * Pido la cadena
 * Para i en el rango de 0 a la longitud de la cadena...
 *   Si el caracter i en minúscula es igual a el caracter en la posición i de la cadena
 *    Se lo añado a resultado como mayúsculas
 *   Si el caracter i en mayúscula es igual a el caracter en la posición i de la cadena
 *    Se lo añado a resultado como minúscula
 * Muestro el resultado
 *
 * Variables
 * resultado = Cadena convertida (str)
 * cadena = Cadena sin convertir (str)
 * 
 */
import java.util.Scanner;
public class ej13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Programa que intercambia mayúsculas por minúsculas y minúsculas por mayúsculas.");

    // Defino la variable resultado
    String resultado = "";

    // Pido la cadena
    System.out.print("Introduce una cadena: ");
    String cadena = s.nextLine();

    for (int i=0;i<=cadena.length()-1;i++) {
      if (Character.toLowerCase(cadena.charAt(i)) == cadena.charAt(i)) { // Comparo el caracter i en minúscula con el caracter de la cadena
        resultado = resultado + Character.toUpperCase(cadena.charAt(i)); // Lo añado como mayúscula
      }
      if (Character.toUpperCase(cadena.charAt(i)) == cadena.charAt(i)) { // Comparo el caracter i en mayúscula con el caracter de la cadena
        resultado = resultado + Character.toLowerCase(cadena.charAt(i)); // Lo añado como minúscula
      }
    }
    System.out.print(resultado);
    s.close();
  }
}