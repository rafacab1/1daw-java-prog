package ejRepetitivos;

/**
 * 1. Crea una aplicación que permita adivinar un número. 
 * La aplicación genera un número aleatorio del 1 al 100. 
 * A continuación va pidiendo números y va respondiendo 
 * si el número a adivinar es mayor o menor que el introducido,
 * a demás de los intentos que te quedan (tienes 10 intentos para acertarlo).
 * El programa termina cuando se acierta el número 
 * (además te dice en cuantos intentos lo has acertado), 
 * si se llega al limite de intentos te muestra el número que había generado.
 * 
 * @author Rafael Alberto Caballero Osuna
 * 
 * Algoritmo
 * Genero un número aleatorio
 * Mientras que un contador sea 10 o menor que 10 y una variable no sea 1...
 * Comparo el número, si es menor que el buscado o mayor lo muestro por pantalla
 * Si el contador está a 10 digo que ya no quedan mas intentos
 * Si acierta el número, doy la enhorabuena
 * 
 * Variables
 * i = Contador de intentos (int)
 * y = Contador de salida (int)
 * num = Número a adivinar (int)
 * inputNum = Número introducido (int)
 */
import java.util.Scanner;
public class ej1 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);

  // Declaro las variables
  int i = 1;
  int y = 0;

  // Genero el número
  int num = (int) (Math.random() * 100 ) + 1;
  do {
    System.out.print("Introduce un número: ");
    int inputNum = s.nextInt();
    if (inputNum>num && i<10) { // Si es mayor...
      System.out.println("Intento: " + i + ". El número introducido es mayor que el generado. Es decir, buscamos uno menor que " + inputNum + ".");
    }
    if (inputNum<num && i<10) { // Si es menor
      System.out.println("Intento: " + i + ". El número introducido es menor que el generado. Es decir, buscamos uno mayor que " + inputNum + ".");
    }
    if (i==10) { // Si no me quedan intentos
      System.out.println("Lo siento, no lo has adivinado, el número era el " + num);
    }
    if (num==inputNum) { // Si he adivinado el número
      System.out.println("Enhorabuena, has acertado con " + i + " intentos.");
      y++;
    }
    i++;
  }  while (i<=10 && y==0);
  s.close();
  }
}