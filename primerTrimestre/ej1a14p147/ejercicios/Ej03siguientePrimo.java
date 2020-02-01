package ejercicios;
import java.util.Scanner;
import funciones.Funciones114;

public class Ej03siguientePrimo {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Prueba siguientePrimo
    
    System.out.print("Introduce un número y te diré el siguiente primo: ");
    int num = s.nextInt();
    System.out.println("El siguiente primo es " + Funciones114.siguientePrimo(num));
    
    s.close();
  }

}
