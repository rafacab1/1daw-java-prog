package ejCondicionales;

/**
 * 19. Escribe un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el mes correspondiente.
 * 
 * Algoritmo
 * Pido el número del mes.
 * Si el mes es el 1, el 3, el 5, el 7, el 8, el 10, o el 12, tiene 31 días.
 * si el mes es el 4, 6, 9 o el 11, tiene 30 días.
 * Si el mes es el 2, tiene 28 días.
 * Si no, ese número no es el de ningún mes y daré ERROR.
 * 
 * Variables:
 * n : Número mes (int)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
import java.util.Scanner;
public class ej19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // Pido el número del mes
    System.out.print("Introduce el número del mes (1 a 12): ");
    int n = s.nextInt();

    // Hago las sentencias
    if (n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12) { //31
      System.out.println(n + " tiene 31 días.");
    } else if (n==4 || n==6 || n==9 || n==11) { //30
      System.out.println(n + " tiene 30 días.");
    } else if (n==2) { //28
      System.out.println(n + " tiene 28 días.");
    } else {
      System.out.println("ERROR: " + n + " no es el número de ningún mes.");
    }
    s.close();
  }
}