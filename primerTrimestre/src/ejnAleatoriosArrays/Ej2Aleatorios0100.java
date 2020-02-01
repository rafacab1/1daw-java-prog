package ejnAleatoriosArrays;

public class Ej2Aleatorios0100 {

  /*
   * 2. Realiza un programa que vaya generando números aleatorios pares entre 0 y
   * 100 y que no termine de generar números hasta que no saque el 24. El programa
   * deberá decir al final cuántos números se han generado.
   * 
   * Algortimo: Genero un número, si el resto de ese número entre dos es 0
   * significa que es par Ese número par lo muestro por pantalla, e incremento el
   * contador, todo esto lo hago mientras que el número par no sea 24.
   * 
   * Variables: contador : Contador de números pares que se han generado (int) num
   * : Número aleatorio generado (int) numpar : Número par generado (int)
   * 
   * 
   * @author Rafael Alberto Caballero Osuna
   */

  public static void main(String[] args) {
    int contador = 0;
    int numpar = 0;
    do {
      int num = (int) (Math.random() * 100) + 1; // Genero el número
      if (num % 2 == 0) { // Compruebo que sea par
        numpar = num;
        System.out.println(numpar);
        contador++;
      }
    } while (numpar != 24);
    System.out.println("Ya he encontrado el 24, he tenido que generar " + contador + " números.");
  }
}
