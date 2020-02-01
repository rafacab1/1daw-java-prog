package ejArraysBidimensionales;

public class Ej06ArBidi {
  /*
   * 6. Modifica el programa anterior de tal forma que no se repita ningún número en
   * el array.
   * 
   * Algortimo:
   * Genero un número y lo guardo en una posición del array, pero para
   * ver si está repetido, comparo el array (con posiciones originales)
   * con las posiciones correspondientes pero con la fila dividida entre 10
   * y la columna el resto de la operación anterior, para que varíe.
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
   * seRepite : Variable que indica si un número está repetido o no (boolean)
   * 
   * 
   * @author Rafael Alberto Caballero Osuna
   */

  public static void main(String[] args) {
    int[][] array;
    array = new int[6][10];
    
    boolean seRepite; // Variable para ver si el número ya
    // está en el array
    
    int max = 0; // Número máximo.
    int maxPosF = 0; // Posición de la fila del número máximo.
    int maxPosC = 0; // Posición de la columna del número máximo.
    
    int min = 1000; // Número mínimo.
    int minPosF = 0; // Posición de la fila del número mínimo.
    int minPosC = 0; // Posición de la columna del número mínimo.
    
    // Genero los números
    for (int i=0;i<6;i++) {
      for (int j=0;j<10;j++) {
        do {
          array[i][j] = (int) (Math.random()*1000+1);
          // Compruebo si el número se repite
          seRepite = false;
          for (int k=0;k<10*i+j;k++) {
            if (array[i][j]==array[(k/10)][(k%10)]) {
              seRepite = true;
            }
          }
        } while (seRepite);
      }
    }
    
    
    // Ahora calculo el máximo y el mínimo
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
