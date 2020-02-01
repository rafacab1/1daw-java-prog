package ejRepetitivos;

/**
 * 2. Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir). 
 * El programa debe informar de cuantos números introducidos son mayores que 0, menores que 0 e iguales a 0.
 *
 * @author Rafael Alberto Caballero Osuna
 * 
 * Algoritmo
 * Pido la cantidad de números
 * Mietras que no sea i la cantidad de números
 *  Pido números
 *    Si es mayor que 0 le sumo uno al contador positivo
 *    Si es menor que 0 le sumo uno al contador negativo
 *    Si es 0, le sumo uno a la variable cero
 * Muestro los resultados
 * 
 * Variables
 * cant = Cantidad de números (int)
 * contador = Contador de números que llevo contados (int)
 * num = Número introducido (int)
 * positivo = Cantidad positivos (int)
 * negativo = Cantidad negativos (int)
 * cero = Cantidad iguales a 0 (int)
 * 
 */
import java.util.Scanner;
public class ej2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // Pido la cantidad de números a introducir
    System.out.print("Introduce la cantidad de números que vas a introducir: ");
    int cont = s.nextInt();

    // Declaro las variables y las pongo a 0
    int positivo = 0;
    int negativo = 0;
    int cero = 0;
    int contador = 0;

    // Mientras que el contador no llegue a la cantidad...
    while (contador!=cont) {
      System.out.print("Introduce un número: ");
      int num = s.nextInt();
      if (num>0) { // Si es mayor que 0 sumo uno a positivo
        positivo++;
      }
      if (num<0) { // Si es menor que 0 sumo uno a negativo
        negativo++;
      }
      if (num==0) { // Si es 0 sumo uno a 0
        cero++;
      }
      contador++; // Le sumo uno al contador
    }
    // Muestro los resultados
    System.out.println("Has introducido " + positivo + " mayores que 0.");
    System.out.println("Has introducido " + negativo + " menores que 0.");
    System.out.println("Has introducido " + cero + " iguales que 0.");
    s.close();
  }
}