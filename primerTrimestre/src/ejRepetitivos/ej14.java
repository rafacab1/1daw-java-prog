package ejRepetitivos;

/**
 * 14. Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos cadenas se introducen por teclado.
 *
 * @author Rafael Alberto Caballero Osuna
 * 
 * Algoritmo
 * Pido la cadena
 * Pido la subcadena
 * Pongo un contador para saber cuando se ha encontrado una subcadena
 * Si un rango de caracteres es igual que la subcadena, la ha encontrado e incremento el contador
 * Si no, miro si el contador está a 0 y si lo está digo que no la ha encontrado
 *
 * Variables
 * cadena = Cadena introducida (String)
 * subcadena = Cadena a buscar (String)
 * sub = Variable en la que guardo la subcadena que estoy comprobando (String)
 * c = Contador para saber cuando puedo mostrar que no hay subcadenas (String)
 * 
 */

import java.util.Scanner;
public class ej14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Programa que comprueba si una cadena contiene una subcadena.");

    // Pido las cadenas y pongo a 0 el contador
    System.out.print("\nIntroduce una cadena: ");
    String cadena = s.next();
    System.out.print("Introduce la subcadena: ");
    String subcadena = s.next();

    // Creo que el contador a 0 y la variable que usará el bucle
    int c = 0;
    String sub = "";

    for (int i=0;i<=cadena.length();i++) {
      try {
      sub = (cadena.substring(i, (subcadena.length()+i)));
      } catch (StringIndexOutOfBoundsException e) {

      }

      if (subcadena.equals(sub)) { // Si la subcadena es igual que el fragmento que lleva la variable sub
        System.out.println("Si, " + cadena + " incluye " + subcadena + ".");
        c = 1;
      } else if ((c==0) && (cadena.length()==(i+1))) {
        System.out.println("No, " + cadena + " no incluye " + subcadena + ".");
      }
    }
    s.close();
  }
}