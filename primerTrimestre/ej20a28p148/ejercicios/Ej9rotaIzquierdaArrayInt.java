package ejercicios;
import java.util.Scanner;

import funciones.Funciones2028;

public class Ej9rotaIzquierdaArrayInt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("9. Rota n posiciones a la izquierda los números de un array.");
    
    System.out.println("Primero vamos a crear un array con enteros aleatorios...");
    System.out.print("Introduce la longitud del array: ");
    int n = s.nextInt();
    System.out.print("Introduce el número mínimo a generar: ");
    int minimo = s.nextInt();
    System.out.print("Introduce el número máximo a generar: ");
    int maximo = s.nextInt();
    
    int[] array = Funciones2028.generaArrayInt(n, minimo, maximo);    
    
    System.out.println("\nContenido del array generado...");
    for (int i=0;i<n;i++) {
      System.out.print(array[i] + " ");
    }
    
    System.out.print("\n\n¿Cuántas posiciones a la izquierda quieres rotar el array? ");
    int posIzda = s.nextInt();
    
    int[] arrayRotIzda = Funciones2028.rotaIzquierdaArrayInt(array, posIzda);
    System.out.println("\nContenido del array rotado " + posIzda + " posiciones a la izquierda...");
    for (int i=0;i<n;i++) {
      System.out.print(arrayRotIzda[i] + " ");
    }
    
    s.close();
    
  }
}
