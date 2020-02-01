package ejercicios;
import java.util.Scanner;

import funciones.Funciones2028;

public class Ej3maximoArrayInt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("3. Devuelve el máximo del array que se pasa como parámetro.");
    
    System.out.println("Primero vamos a crear un array con enteros aleatorios...");
    System.out.print("Introduce la longitud del array: ");
    int n = s.nextInt();
    System.out.print("Introduce el número mínimo a generar: ");
    int minimo = s.nextInt();
    System.out.print("Introduce el número máximo a generar: ");
    int maximo = s.nextInt();
    
    
    System.out.println("\nContenido del array generado...");
    int[] array = Funciones2028.generaArrayInt(n, minimo, maximo);
    for (int i=0;i<n;i++) {
      System.out.print(array[i] + " ");
    }
    
    System.out.println("\n\nEl máximo es " + Funciones2028.maximoArrayInt(array));
    
    s.close();
    
  }
}
