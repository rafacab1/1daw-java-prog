package ejRepetitivos;

/**
 * 6. Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), 
 * saque por pantalla el resultado de la potencia. No se puede utilizar el operador de potencia.
 *
 * @author Rafael Alberto Caballero Osuna
 * 
 * Algoritmo
 * Pido la base y el exponente al usuario
 * Defino una variable (b1) que sea igual a la base
 * Defino una variable que haga de contador
 * Mientras que el exponente no sea igual que a la cantidad que lleva el contador...
 *   Multiplica la variable b1 por la base
 *   Le sumo uno al contador
 * Muestro por pantalla el resultado
 * 
 * Variables
 * base = Base (int)
 * exp = Exponente (int)
 * cont = Contador de veces que se multiplica la base (int)
 * b1 = Base después de una multiplicación (int)
 * 
 */
import java.util.Scanner;
public class ej6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Programa que calcula el resultado de una potencia.");

    // Pido los datos
    System.out.print("\nIntroduce la base: ");
    int base = s.nextInt();
    System.out.print("Introduce el exponente: ");
    int exp = s.nextInt();
    int b1 = base;
    int cont = 1;

    // Mientras que el exponente no sea igual que el contador...
    while (exp!=cont) {
      b1 = (b1*base);
      cont++;
    }

    // Muestro el resultado
    System.out.println("\nEl resultado de " + base + " elevado a " + exp + " es " + b1 + ".");
    s.close();
  }
}