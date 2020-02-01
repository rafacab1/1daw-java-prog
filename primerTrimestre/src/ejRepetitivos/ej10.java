package ejRepetitivos;

/**
 * 10. Pide una cadena y un carácter por teclado y muestra cuantas veces aparece el carácter en la cadena.
 *
 * @author Rafael Alberto Caballero Osuna
 * 
 * Algoritmo
 * Pido la cadena y el caracter
 * Creo un contador que cuente los caracteres
 *   Para i en el rango de 0 a la longitud de la cadena...
 *       Si el caracter de la posición i en la cadena en minúscula es igual que el caracter en minúscula, incremento el contador en uno mas.
 * Muestro el resultado por pantalla
 * 
 * Variables
 * cadena = Cadena (str)
 * caracter = Caracter (str)
 * contador = Contador de los caracteres iguales al caracter introducido (int)
 * cadenalower = Cadena en minúscula (String)
 * caracterlower = Caracter en minúscula (String)
 * 
 */
import java.util.Scanner;
public class ej10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Programa que te dice cuantos caracteres iguales tiene una cadena.");

    // Pido la cadena y el caracter
    System.out.print("\nIntroduce una cadena: ");
    String cadena = s.next();
    System.out.print("Introduce un caracter: ");
    String caracter = s.next();

    // Creo un contador y paso la cadena y el caracter a minúscula
    int contador = 0;
    String cadenalower = cadena.toLowerCase();
    String caracterlower = caracter.toLowerCase();

    for (int i=0;i<=cadena.length()-1;i++) {
      if (cadenalower.charAt(i) == caracterlower.charAt(0)) { //Si el caracter i de la cadena es igual que el caracter...
        contador++; // Sumo uno
      }
    }
    System.out.println("\nLa cadena " + cadena + " tiene " + contador + " " + caracter);
    s.close();
  }
}