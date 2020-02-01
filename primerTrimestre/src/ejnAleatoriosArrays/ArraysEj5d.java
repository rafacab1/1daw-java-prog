package ejnAleatoriosArrays;

import java.util.Scanner;

public class ArraysEj5d {
  /*
   * 5. Escribe un programa que pida 10 números por teclado y que luego muestre
   * los números introducidos junto con las palabras “máximo” y “mínimo” al lado
   * del máximo y del mínimo respectivamente.
   * 
   * Algortimo
   * Creo un array
   * En ese array meto 10 números
   * Busco el máximo y el mínimo
   * Imprimo el contenido del array y justo después,
   * si el contenido que toca del array es igual al máximo, imprimo máximo
   * si el contenido que toca del array es igual al mínimo, imprimo mínimo
   *
   * 
   * Variables
   * num : Números introducidos por el usuario (int) (array)
   * max : Número máximo (int)
   * min : Número mínimo (int)
   * 
   * @author Rafael Alberto Caballero Osuna
   */

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int max = 0;
    int min = 9999999;
    // Creo el array
    int[] num;
    num = new int[10];
    
    // Pido números;
    for (int i=0;i<=9;i++) {
      System.out.print("Introduce el número " + (i+1) + ": ");
      num[i] = s.nextInt();
    }
    
    // Busco el máximo y el mínimo
    for (int i=0;i<=9;i++) {
      if (num[i]>max) {
        max = num[i];
      }
      if (num[i]<min) {
        min = num[i];
      }
    }
    
    // Muestro el array, con el máximo y el mínimo correspondiente.
    for (int i=0;i<=9;i++) {
      System.out.print("\n" + num[i]);
      if (num[i]==max) {
        System.out.print(" máximo.");
      }
      if (num[i]==min) {
        System.out.print(" mínimo.");
      }
    }
    s.close();

  }

}
