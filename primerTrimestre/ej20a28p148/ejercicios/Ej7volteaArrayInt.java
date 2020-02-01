package ejercicios;
import java.util.Scanner;

import funciones.Funciones2028;

public class Ej7volteaArrayInt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("7. Le da la vuelta a un array.");
    
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
    
    int[] arrayVolt = Funciones2028.volteaArrayInt(array);
    System.out.println("\nContenido del array volteado...");
    for (int i=0;i<n;i++) {
      System.out.print(arrayVolt[i] + " ");
    }
    
    s.close();
    
  }
}
