package ejercicios;
import java.util.Scanner;

import funciones.Funciones2028;

public class Ej5estaEnArrayInt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("5. Dice si un número está o no dentro de un array.");
    
    System.out.println("Primero vamos a crear un array con enteros aleatorios...");
    System.out.print("Introduce la longitud del array: ");
    int n = s.nextInt();
    System.out.print("Introduce el número mínimo a generar: ");
    int minimo = s.nextInt();
    System.out.print("Introduce el número máximo a generar: ");
    int maximo = s.nextInt();
    
    int[] array = Funciones2028.generaArrayInt(n, minimo, maximo);
    
    System.out.print("\nIntroduce el número que quieres buscar en el array: ");
    int buscar = s.nextInt();
    if (Funciones2028.estaEnArrayInt(array, buscar)) {
      System.out.println("Sí, " + buscar + " está en el array.");
    } else {
      System.out.println("No, " + buscar + " no está en el array.");
    }
    
    System.out.println("\nContenido del array generado...");
    for (int i=0;i<n;i++) {
      System.out.print(array[i] + " ");
    }
    
    s.close();
    
  }
}
