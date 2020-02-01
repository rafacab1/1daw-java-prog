package ejCondicionales;

/**
 * 18. Realiza un programa que pida el día de la semana (del 1 al 7) y 
 * escriba el día correspondiente. Si introducimos otro número nos da un error.
 * 
 * Algoritmo
 * Pido el número
 * Si es 1, es lunes
 * Si es 2, es martes
 * Si es 3, es miércoles
 * Si es 4, es jueves
 * Si es 5, es viernes
 * Si es 6, es sábado
 * Si es 7, es domingo
 * Si no es nada de lo anterior dará error.
 * 
 * Variables:
 * dia : Número del día de la semana (int)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
import java.util.Scanner;
public class ej18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // Pido el día
    System.out.print("Introduce un día de la semana (1 a 7): ");
    int dia = s.nextInt();

    // Compruebo que día es y lo muestro
    if (dia==1) {
      System.out.println("Es lunes.");
    } else if (dia==2) {
      System.out.println("Es martes.");
    } else if (dia==3) {
      System.out.println("Es miércoles.");
    } else if (dia==4) {
      System.out.println("Es jueves.");
    } else if (dia==5) {
      System.out.println("Es viernes.");
    } else if (dia==6) {
      System.out.println("Es sábado.");
    } else if (dia==7) {
      System.out.println("Es domingo.");
    }
    s.close();
  }
}