package ejercicios;
import java.util.Scanner;
import funciones.Funciones114;

public class Ej14juntaNumeros {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Prueba juntaNumeros
    
    System.out.print("Introduce el número 1: ");
    int num1 = s.nextInt();
    System.out.print("Introduce el número 2: ");
    int num2 = s.nextInt();
        
    System.out.println("Los dos números juntos son el " + Funciones114.juntaNumeros(num1, num2));
    
    s.close();
  }

}
