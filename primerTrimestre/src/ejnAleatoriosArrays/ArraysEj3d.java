package ejnAleatoriosArrays;

import java.util.Scanner;

public class ArraysEj3d {
  /*
   * 3. Escribe un programa que lea 10 números por teclado y que luego los muestre
   * en orden inverso, es decir, el primero que se introduce es el último en
   * mostrarse y viceversa.
   * 
   * Algortimo 
   * Creo el array
   * En un bucle que dure lo que el array, pido números
   * Luego imprimo el contenido del array del revés, recorriendo con el bucle del revés
   * 
   * Variables
   * num = Números introducidos por el usuario (int) (array)
   * 
   * @author Rafael Alberto Caballero Osuna
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    // Creo el array
    int[] num;
    num = new int[10];
    
    // Pido los valores;
    for (int i=0;i<=9;i++) {
      System.out.print("Introduce el número " + (i+1) + ": ");
      num[i] = s.nextInt();
    }
    
    // Muestro los valores del array
    for (int i=9;i>0;i--) {
      System.out.println(num[i]);
    }
    s.close();
  }

}
