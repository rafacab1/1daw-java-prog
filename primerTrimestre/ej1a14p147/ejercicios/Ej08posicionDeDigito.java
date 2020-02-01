package ejercicios;
import java.util.Scanner;
import funciones.Funciones114;

public class Ej08posicionDeDigito {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Prueba posicionDeDigito
    
    System.out.print("Introduce un número: ");
    int num = s.nextInt();
    System.out.print("Introduce el número a buscar: ");
    int numB = s.nextInt();
    
    System.out.println("El número " + numB + " está en la posición " + (Funciones114.posicionDeDigito(num, numB)+1));
    
    s.close();
  }

}
