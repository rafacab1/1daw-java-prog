package ejercicios;
import java.util.Scanner;

import funciones.Funciones2028;

public class Ej6posicionEnArray {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("6. Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.");
    
    System.out.println("Primero vamos a crear un array con enteros aleatorios...");
    System.out.print("Introduce la longitud del array: ");
    int n = s.nextInt();
    System.out.print("Introduce el número mínimo a generar: ");
    int minimo = s.nextInt();
    System.out.print("Introduce el número máximo a generar: ");
    int maximo = s.nextInt();
    
    int[] array = Funciones2028.generaArrayInt(n, minimo, maximo);
    
    System.out.print("\nIntroduce el número del cual quieres conocer su posición en el array: ");
    int numeropos = s.nextInt();
    if (Funciones2028.posicionEnArray(array, numeropos)==-1) {
      System.out.println("Ese número no está en el array.");
    } else {
      System.out.println("El número " + numeropos + " está en la posición " + Funciones2028.posicionEnArray(array, numeropos) + ".");
    }
    
    
    System.out.println("\nContenido del array generado...");
    for (int i=0;i<n;i++) {
      System.out.print(array[i] + " ");
    }
    
    s.close();
    
  }
}
