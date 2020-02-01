package ejnAleatoriosArrays;

public class ArraysEj1d {
  /*
   * 1. Define un array de 12 números enteros con nombre num y asigna los valores
   * según la tabla que se muestra a continuación. Muestra el contenido de todos
   * los elementos del array. ¿Qué sucede con los valores de los elementos que no
   * han sido inicializados?
   * 
   * Algortimo
   * Creo el array
   * Introduzco los valores
   * Imprimo todo el array
   * 
   * 
   * Variables:
   * num : Números (int) (array)
   * 
   * 
   * 
   * @author Rafael Alberto Caballero Osuna
   */
  public static void main(String[] args) {
    // Creo el array
    int[] num;
    num = new int[12];
    
    // Asigno los valores
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    
    // Imprimo todo lo que contiene el array
    for (int i=0;i<=11;i++) {
      System.out.println(num[i]);
    }
    
    // ¿Qué sucede con los valores de los elementos que no
    // han sido inicializados?
    // Los muestra como 0.
  }
}
