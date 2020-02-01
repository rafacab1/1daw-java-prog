package ejercicios;
import java.util.Scanner;
import funciones.Funciones114;

public class Ej12PegaPorDelante {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Prueba pegaPorDelante
    
    System.out.print("Introduce el número: ");
    int num = s.nextInt();
    System.out.print("Introduce lo que quieres añadir: ");
    int numsp = s.nextInt();
    
    System.out.println("El número resultante es " + Funciones114.pegaPorDelante(num, numsp));
    
    s.close();
  }

}
