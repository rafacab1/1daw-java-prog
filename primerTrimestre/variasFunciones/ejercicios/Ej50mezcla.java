package ejercicios;
import java.util.Scanner;
import conversionymezcla.Convermezcla;

public class Ej50mezcla {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Necesitamos dos arrays, asi que vamos a crear dos con números aleatorios: ");
   
    
    System.out.println("//PRIMER ARRAY\\");
    System.out.print("Introduce la longitud del array: ");
    int n = s.nextInt();
    System.out.print("Introduce el número mínimo a generar: ");
    int minimo = s.nextInt();
    System.out.print("Introduce el número máximo a generar: ");
    int maximo = s.nextInt();
    int[] array1 = Convermezcla.generaArrayInt(n, minimo, maximo);
    System.out.println("\nContenido del PRIMER array generado...");
    for (int i=0;i<n;i++) {
      System.out.print(array1[i] + " ");
    }
      
    System.out.println("\n//SEGUNDO ARRAY\\");
    System.out.print("Introduce la longitud del array: ");
    int n2 = s.nextInt();
    System.out.print("Introduce el número mínimo a generar: ");
    int minimo2 = s.nextInt();
    System.out.print("Introduce el número máximo a generar: ");
    int maximo2 = s.nextInt();
    int[] array2 = Convermezcla.generaArrayInt(n2, minimo2, maximo2);
    System.out.println("\nContenido del SEGUNDO array generado...");
    for (int i=0;i<n;i++) {
        System.out.print(array2[i] + " ");
    }
       
    System.out.println("\n\nArray resultante: ");
    
    int[] arrayNuevo = Convermezcla.mezcla(array1, array2);
    
    for (int i=0;i<arrayNuevo.length;i++) {
      System.out.print(arrayNuevo[i] + " ");
    }
    s.close();
  }

}
