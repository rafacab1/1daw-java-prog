package ejRepetitivos;

/**
 * 15. Introducir una cadena de caracteres e indicar si es un palíndromo. 
 * Una palabra palíndroma es aquella que se lee igual adelante que atrás.
 *
 * @author Rafael Alberto Caballero Osuna
 * 
 * Algoritmo
 * Pido la cadena
 * La paso a minúsculas y creo una variable en la que iré guardando los caracteres al revés
 * Recorro los caracteres desde los últimos a los primeros, y los voy guardando
 * Si la cadena original es igual que la nueva, es un palíndromo
 * Si no es igual, no es un palíndromo.
 * 
 * Variables
 * cadena = Cadena original introducida (String)
 * cadenaReves = Cadena en la que el bucle almacena los caracteres que recorre (String)
 * 
 */
import java.util.Scanner;
public class ej15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Programa que comprueba si una cadena es un palíndromo.");

    // Pido la cadena
    System.out.print("Introduce la cadena: ");
    String cadena = s.next();

    // La paso a minúscula y preparo la variable en la que almacenaré todo del revés
    cadena = cadena.toLowerCase();
    String cadenaReves = "";

    for (int i=cadena.length()-1;i>=0;i--) {
      cadenaReves = cadenaReves + cadena.substring(i,i+1); // Recorro la cadena al revés y voy guardando los caracteres en la nueva
    }

    if (cadena.equals(cadenaReves)) { // Comparo las dos cadenas
      System.out.print(cadena + " es un palíndromo.\n");
    } else {
      System.out.print(cadena + " no es un palíndromo.\n");
    }

    s.close();
  }
}