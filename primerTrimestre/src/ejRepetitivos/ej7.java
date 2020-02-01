package ejRepetitivos;

/**
 * 7. Una persona adquirió un producto para pagar en 20 meses. 
 * El primer mes pagó 10 €, el segundo 20 €, el tercero 40 € y así sucesivamente. 
 * Realizar un programa para determinar cuánto debe pagar mensualmente y el total de lo que pagará después de los 20 meses.
 *
 * @author Rafael Alberto Caballero Osuna
 * 
 * Algoritmo
 * Veo que todo es la cantidad anterior multiplicada por 2.
 * Pongo el precio en 5
 * Creo la variable total
 * Para i en el rango 1, 21
 *   El mes i pagas el precio * 2, lo muestro
 *   Guardo precio * 2 en la propia variable
 *   Sumo al total la cantidad de la variable
 * Muestro el resultado
 *
 * Variables
 * precio = Precio antes del primer mes (int)
 * total = Precio total (int)
 *
 */
import java.util.Scanner;
public class ej7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Programa que indica cuanto tienes que pagar al mes y el total.");

    // Pongo el precio a 5 y el total a 0
    int precio = 5;
    int total = 0;

    for (int i=1;i<21;i++) {
      System.out.println("El mes " + i + " pagas " + (precio*2) + "€.");
      precio *= 2; // Le añado al precio
      total += precio; // Le sumo a total lo de este mes
    }
    System.out.println("Pagas un total de " + total + "€.");
    s.close();
  }
}