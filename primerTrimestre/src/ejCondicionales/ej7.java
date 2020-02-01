package ejCondicionales;

/**
 * 7. Realiza un algoritmo que calcule la potencia, para ello pide por teclado la base y el exponente. 
 * Pueden ocurrir tres cosas:
 * 
 * El exponente sea positivo, sólo tienes que imprimir la potencia.
 * El exponente sea 0, el resultado es 1.
 * El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
 * 
 * Algoritmo
 * Pido la base y el exponente
 * Si el exponente es 0, digo que el resultado es 1
 * Si no, compruebo que el exponente es positivo y si lo es muestro el resultado
 * Si no, compruebo que el exponente es negativo (menor que 0) y muestro el resultado de la base elevada a 1/exponente positivo
 * 
 * Variables:
 * base : Base (int)
 * exp : Exponente (int)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
import java.util.Scanner;
public class ej7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce la base del número: ");
    int base = s.nextInt();
    System.out.print("Introduce el exponente del número: ");
    int exp = s.nextInt();

    if (exp==0) {
      System.out.println("El resultado es 1.");
    } else if (exp==Math.abs(exp)) {
      System.out.println("El resultado es " + Math.pow(base, exp));
    } else if (exp<0) {
      System.out.println("El resultado es " + Math.pow(base, (1.0/Math.abs(exp))));
    }
    s.close();
  }
}