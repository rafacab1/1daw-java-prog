package ejercicios;
import java.util.Scanner;
import funciones.Funciones114;

public class Ej06voltea {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Prueba voltea
    
    System.out.print("Introduce un número y te lo devolveré volteado: ");
    int num = s.nextInt();
    System.out.println(Funciones114.voltea(num));
    
    s.close();
  }

}
