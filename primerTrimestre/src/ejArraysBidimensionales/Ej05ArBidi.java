package ejArraysBidimensionales;

public class Ej05ArBidi {
  /*
   * 5. Realiza un programa que rellene un array de 6 filas por 10 columnas con
   * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
   * continuación, el programa deberá dar la posición tanto del máximo como del
   * mínimo.
   * 
   * Algortimo:
   * Genero un número y lo guardo en una posición del array.
   * Si el número del array es mayor que el máximo,
   * renuevo el máximo y me quedo con las posiciones en el array.
   * Si el número del array es menor que el mínimo,
   * renuevo el mínimo y me quedo con las posiciones en el array.
   * 
   * Variables:
   * array : Array con números aleatorios (int) (array array)
   * max : Número máximo (int)
   * maxPosF : Posición de la fila del número máximo (int)
   * maxPosC : Posición de la columna del número máximo (int)
   * min : Número mínimo (int)
   * minPosF : Posición de la fila del número mínimo (int)
   * minPosC : Posición de la columna del número mínimo (int)
   * 
   * 
   * @author Rafael Alberto Caballero Osuna
   */

  public static void main(String[] args) {
    int[][] array;
    array = new int[6][10];
    
    int max = 0; // Número máximo.
    int maxPosF = 0; // Posición de la fila del número máximo.
    int maxPosC = 0; // Posición de la columna del número máximo.
    
    int min = 1000; // Número mínimo.
    int minPosF = 0; // Posición de la fila del número mínimo.
    int minPosC = 0; // Posición de la columna del número mínimo.
    
    // Genero los números
    for (int i=0;i<6;i++) {
      for (int j=0;j<10;j++) {
        array[i][j] = (int) (Math.random()*1000+1);
      }
    }
    
    for (int i=0;i<6;i++) {
      for (int j=0;j<10;j++) {
        if (array[i][j]>max) { // Comparo el número del array con el máximo actual
          max = array[i][j];
          maxPosF = (i+1); // Me quedo con la fila
          maxPosC = (j+1); // Me quedo con la columna
        }
        if (array[i][j]<min) { // Comparo el número del array con el mínimo actual
          min = array[i][j];
          minPosF = (i+1); // Me quedo con la fila
          minPosC = (j+1); // Me quedo con la columna
        }
      }
    }
    
    System.out.println("El máximo es " + max + " en la fila " + maxPosF + " y en la columna " + maxPosC + ".");
    System.out.println("El mínimo es " + min + " en la fila " + minPosF + " y en la columna " + minPosC + ".");
    
  }

}
