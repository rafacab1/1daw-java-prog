package ejercicios;
import java.util.Scanner;
import funciones.Funciones114;

public class Ej09quitaPorDetras {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Prueba quitaPorDetras
    
    System.out.print("Introduce el número: ");
    int num = s.nextInt();
    System.out.print("Introduce la cantidad de dígitos a quitar: ");
    int numB = s.nextInt();
    
    System.out.println("El número resultante es " + Funciones114.quitaPorDetras(num, numB));
    
    s.close();
  }

}
