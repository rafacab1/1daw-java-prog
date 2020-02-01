package ejercicios;
import java.util.Scanner;
import funciones.Funciones114;

public class Ej07digitoN {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Prueba digitoN
    
    System.out.print("Introduce el número que quieres usar: ");
    int num = s.nextInt();
    System.out.print("¿Qué posición del número quieres que saque? ");
    int pos = s.nextInt();
    System.out.println("En la posición " + pos + " está el número " + Funciones114.digitoN(num, pos));
    
    s.close();
  }

}
