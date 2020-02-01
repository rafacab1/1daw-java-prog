package ejercicios;
import java.util.Scanner;
import funciones.Funciones114;

public class Ej02esPrimo {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Prueba esPrimo
    
    System.out.print("Introduce un número y te diré si es primo: ");
    int num = s.nextInt();
    if (Funciones114.esPrimo(num)) {
      System.out.println("Sí, " + num + " es primo.");
    } else {
      System.out.println("No, " + num + " no es primo.");
    }
    
    s.close();
  }

}
