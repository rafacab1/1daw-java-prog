package ejRepetitivos;

/**
 * 11. Suponiendo que hemos introducido una cadena por teclado que representa una frase 
 * (palabras separadas por espacios), realiza un programa que cuente cuantas palabras tiene.
 *
 * @author Rafael Alberto Caballero Osuna
 * 
 * Algoritmo
 * Pido la frase
 * Establezo la variable palabras a 1 (para que cuente la última palabra)
 * Para i en el rango 0, longitud de la cadena...
 *   Si la posición i de la cadena es un espacio...
 *       Le sumo uno a palabras y pongo el contador de letras a 0
 * Muestro por pantalla el resultado.
 * 
 * Variables
 * cadena = Cadena introducida por el usuario (str)
 * palabras = Palabras que tiene la cadena (int)
 * 
 */
import java.util.Scanner;
public class ej11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // Pido la frase
    System.out.print("\nIntroduce una frase: ");
    String cadena = s.nextLine();
    int palabras = 1;

    for (int i=0;i<=cadena.length()-1;i++) {
      if (cadena.charAt(i)==' ') { //Si el caracter i de la cadena es espacio...
        palabras++; // Sumo uno a palabras
      }
    }
    System.out.println("\nEsta frase tiene " + palabras + " palabras.");
  s.close();
  }
}