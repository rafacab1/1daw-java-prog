package ejnAleatoriosArrays;

public class ArraysEj2d {
  /*
   * 2. Define un array de 10 caracteres con nombre simbolo y asigna valores a los
   * elementos según la tabla que se muestra a continuación. Muestra el contenido
   * de todos los elementos del array. ¿Qué sucede con los valores de los
   * elementos que no han sido inicializados?
   * 
   * Algortimo
   * Creo el array
   * Introduzco los valores
   * Imprimo todo el contenido del array
   * 
   * 
   * Variables:
   * simbolo : Caracteres (char) (array)
   * 
   * 
   * @author Rafael Alberto Caballero Osuna
   */
  public static void main(String[] args) {
    // Creo el array
    char[] simbolo;
    simbolo = new char[10];

    // Introduzco los valores
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';

    // Muestro todo el array
    for (int i = 0; i <= 9; i++) {
      System.out.println(simbolo[i]);
    }

    // ¿Qué sucede con los valores de los
    // elementos que no han sido inicializados?
    // Se muestran como caracteres vacíos (espacios).
  }

}
