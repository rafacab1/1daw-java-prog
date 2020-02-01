package ejercicios;
import java.util.Scanner;
import funciones.Funciones114;

public class Ej04potencia {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Prueba potencia
    
    System.out.print("Introduce la base de la potencia: ");
    int base = s.nextInt();
    System.out.print("Introduce el exponente de la potencia: ");
    int exp = s.nextInt();
    System.out.println("El resultado de la potencia es " + Funciones114.potencia(base, exp));
    
    s.close();
  }

}
