package ejnAleatoriosArrays;

import java.util.Random;

public class Ej3Matrix {

  /*
   * 3. Realiza un programa que llene la pantalla de caracteres aleatorios (a lo
   * Matrix) con el código ascii entre el 32 y el 126. Puedes hacer casting con
   * (char) para convertir un entero en un carácter.
   * 
   * Algortimo: En un bucle: Genero un caracter aleatorio Lo muestro por pantalla
   * Y sumo uno a dos contadores Cuando uno de los contadores llego a 1000, salto
   * la línea Todo esto lo hago mientras el otro contador no llegue a un número
   * muy grande.
   * 
   * 
   * Variables: contador : Contador para saber cuando saltar la línea (int)
   * contadorLimit : Contador para saber cuando acabar el programa y hacer que sea
   * finito (int) aleatorio : Carácter generado (char)
   * 
   * 
   * @author Rafael Alberto Caballero Osuna
   */
  public static void main(String[] args) {
    Random random = new Random();
    int contador = 0;
    int contadorLimit = 0;
    do {
      char aleatorio = (char) (random.nextInt(127) + 32);
      System.out.print(aleatorio);
      contador++;
      contadorLimit++;
      while (contador == 1000) {
        System.out.println("");
        contador = 0;
      }
    } while (contadorLimit != 999999999);

  }

}
