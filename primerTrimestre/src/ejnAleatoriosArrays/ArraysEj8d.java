package ejnAleatoriosArrays;

import java.util.Scanner;

public class ArraysEj8d {
  /*
   * 8. Realiza un programa que pida la temperatura media que ha hecho en cada mes
   * de un determinado año y que muestre a continuación un diagrama de barras
   * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
   * de asteriscos o cualquier otro carácter.
   * 
   * Algortimo 
   * Pido la temperatura de todos los meses
   * Luego, imprimo las temperatus y mientras que un contador no llegue a la temperatura
   * imprimo # simulando una barra
   *
   * 
   * Variables 
   * temp : Temperatura de media de los meses (int)(array)
   * 
   * 
   * @author Rafael Alberto Caballero Osuna
   */

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] temp;
    temp = new int[12];
    int contador = 0;
    
    // Pido la temperatura media por mes
    for (int i=0;i<=11;i++) {
      System.out.print("Introduce la temperatura para del mes " + (i+1) + ": ");
      temp[i] = s.nextInt();
    }
    
    // Muestro la temperatura por mes y el gráfico.
    for (int i=0;i<=11;i++) {
      contador = 0;
      System.out.print("\nEl mes " + (i+1) + " la media de temperatura fue " + temp[i] + "Cº. |" );
      while (contador<=temp[i]) {
        System.out.print("#");
        contador++;
      }
    }
    s.close();    
  }

}
