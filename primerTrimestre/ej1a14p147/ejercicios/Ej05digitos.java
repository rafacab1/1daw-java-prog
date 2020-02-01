package ejercicios;
import java.util.Scanner;
import funciones.Funciones114;

public class Ej05digitos {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Prueba digitos
    
    System.out.print("Introduce un número entero y te diré cuántos dígitos tiene: ");
    int num = s.nextInt();
    System.out.println(num + " tiene " + Funciones114.digitos(num) + " dígitos");
    
    s.close();
  }

}
