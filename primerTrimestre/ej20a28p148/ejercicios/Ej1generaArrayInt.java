package ejercicios;
import java.util.Scanner;

import funciones.Funciones2028;

public class Ej1generaArrayInt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("1. Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.");
    
    System.out.print("Introduce la longitud del array: ");
    int n = s.nextInt();
    System.out.print("Introduce el número mínimo a generar: ");
    int minimo = s.nextInt();
    System.out.print("Introduce el número máximo a generar: ");
    int maximo = s.nextInt();
    
    
    int[] array = Funciones2028.generaArrayInt(n, minimo, maximo);
    
    for (int i=0;i<n;i++) {
      System.out.print(array[i] + " ");
    }
    
    s.close();
    
  }
}
