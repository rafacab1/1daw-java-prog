package ejArraysBidimensionales;

public class Ej13ArBidi {
  /*
   * 13. Realiza un programa que calcule la estatura media, mínima y máxima en
   * centímetros de personas de diferentes países. El array que contiene los
   * nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
   * “Australia”}. Los datos sobre las estaturas se deben simular mediante un
   * array de 4 filas por 10 columnas con números aleatorios generados al azar
   * entre 140 y 210. Los decimales de la media se pueden despreciar. Los nombres
   * de los países se deben mostrar utilizando el array de países (no se pueden
   * escribir directamente).
   * 
   * Algortimo:
   * Creo el array pais con los países
   * Genero números aleatorios entre 140 y 210, luego imprimo...
   * el pais, tengo que hacerlo cuatro veces distintas, y cada vez de esas
   * imprimiré los valores (10) para ese país, y luego la media, el máximo y el mínimo
   *  
   * 
   * Variables:
   * pais : Países que se incluyen (String) (array)
   * estaturas : Estaturas de los ciudadanos (int) (array bidimensional)
   * suma : Suma de las estaturas de un país
   * min : Estatura mínima de un país
   * max : Estatura máxima de un país
   * 
   * 
   * @author Rafael Alberto Caballero Osuna
   */

  public static void main(String[] args) {
    String[] pais = {"España", "Rusia", "Japón", "Australia"};
    int[][] estaturas;
    estaturas = new int[4][10];
    int suma = 0; // Suma de todas las estaturas de un país
    int min = 210; 
    int max = 0;
    
    for (int i=0;i<4;i++) {
      for (int j=0;j<10;j++) {
        estaturas[i][j] = (int) (Math.random()*(210-140+1)+140);
      }
    }
    
    for (int i=0;i<4;i++) {
      System.out.print("\n" + pais[i] + ": ");
        suma = 0;
        max = 0;
        min = 210;
        /*System.out.println("\n");*/
        for (int j=0;j<10;j++) {
          System.out.print(estaturas[i][j] + " ");
            suma += estaturas[i][j];
          if (estaturas[i][j]>max) {
            max = estaturas[i][j];
          }
          if (estaturas[i][j]<min) {
            min = estaturas[i][j];
          }
        }
        System.out.print("| " + suma/10 + " med ");
        System.out.print(max + " max ");
        System.out.print(min + " min");
      }
    }
  }

