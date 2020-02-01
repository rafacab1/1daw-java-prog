package ejercicios;
import java.util.Scanner;
import funciones.Funciones114;

public class Ej01esCapicua {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Prueba esCapicua
    
    System.out.print("Introduce un número y te diré si es capicúa: ");
    int num = s.nextInt();
    if (Funciones114.esCapicua(num)) {
      System.out.println("Sí, " + num + " es capicúa.");
    } else {
      System.out.println("No, " + num + " no es capicúa.");
    }
    
    s.close();
  }

}
