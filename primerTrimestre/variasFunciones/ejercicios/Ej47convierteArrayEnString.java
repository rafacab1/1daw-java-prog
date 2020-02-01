package ejercicios;
import java.util.Scanner;
import conversionymezcla.Convermezcla;

public class Ej47convierteArrayEnString {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Primero vamos a crear un array con enteros aleatorios...");
    System.out.print("Introduce la longitud del array: ");
    int n = s.nextInt();
    System.out.print("Introduce el número mínimo a generar: ");
    int minimo = s.nextInt();
    System.out.print("Introduce el número máximo a generar: ");
    int maximo = s.nextInt();
    
    int[] array = Convermezcla.generaArrayInt(n, minimo, maximo);
    
    System.out.println("\nContenido del array generado...");
    for (int i=0;i<n;i++) {
      System.out.print(array[i] + " ");
    }

    System.out.println("\nContenido del array como cadena: ");
    System.out.println(Convermezcla.convierteArrayEnString(array));
    
    s.close();
  }

}
