package ejercicios;
import java.util.Scanner;
import funciones.Funciones114;

public class Ej13trozoDeNumero {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Prueba trozoDeNumero
    
    System.out.print("Introduce el número: ");
    int num = s.nextInt();
    System.out.print("Introduce la posición inicial: ");
    int posI = s.nextInt();
    System.out.print("Introduce la posición final: ");
    int posF = s.nextInt();
    
    System.out.println("El número resultante es " + Funciones114.trozoDeNumero(num, posI, posF));
    
    s.close();
  }

}
