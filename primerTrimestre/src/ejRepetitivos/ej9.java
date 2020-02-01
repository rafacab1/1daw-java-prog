package ejRepetitivos;

/**
 * 9. Mostrar en pantalla los N primero número primos. 
 * Se pide por teclado la cantidad de números primos que queremos mostrar.
 *
 * @author Rafael Alberto Caballero Osuna
 * 
 * Algoritmo
 * Pido la cantidad de números a mostrar
 * Creo una variable que haga de contador
 * En un rango de 2 (primer primo) a un número muy largo
 * Compruebo si no he superado el contador
 * Calculo el factorial de i-1, para luego sumar 1 y ver si el resto del mismo entre i es 0 (en ese caso es primo) https://www.wikiprimes.com/como-saber-si-un-numero-es-primo/
 * Si el resto es 0, muestro i y le sumo uno al contador
 * Si he superado el contador, salgo del bucle
 * 
 * Variables
 * n = número introducido por el usuario (int)
 * c = contador (int)
 * 
 */

// Corregido en clase en Python (9v2.py)
import java.util.Scanner;
public class ej9 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Programa que muestra los n primeros números primos.");

    System.out.print("\nIntroduce cuantos números quieres mostrar: ");
    int n = s.nextInt();

    boolean es_primo = true;
    int num = 2;

    while (num<=Math.sqrt(n) && es_primo) {
      if ((n%num)==0) {
        es_primo = false;
      }
    }

    if (es_primo) {
      System.out.println("Es primo.");
    } else {
      System.out.println("No es primo.");
    }

    
    s.close();
  }
}