package ejercicios;
import java.util.Scanner;

import funciones.Funciones2028;

public class Ej8rotaDerechaArrayInt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("8. Rota n posiciones a la derecha los números de un array.");
    
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
    
    System.out.print("\n\n¿Cuántas posiciones a la derecha quieres rotar el array? ");
    int posDcha = s.nextInt();
    
    int[] arrayRotDcha = Funciones2028.rotaDerechaArrayInt(array, posDcha);
    System.out.println("\nContenido del array rotado " + posDcha + " posiciones a la derecha...");
    for (int i=0;i<n;i++) {
      System.out.print(arrayRotDcha[i] + " ");
    }
    
    s.close();
    
  }
}
