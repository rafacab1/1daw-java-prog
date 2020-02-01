package triangulos;

/**
 * Ejercicio 42 del libro "Aprende Java con Ejercicios"
 * 
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura. Utiliza
 * funciones para pintar las líneas.
 * 
 * @author Rafael Alberto Caballero Osuna
 *
 */

public class DibujaTriangulos {

  /**
   * Algoritmo
   * Guardo en una variable los * que saque, que dependerán de la vuelta del bucle y el parámetro
   * 
   * Variables
   * almacen : Aqui voy guardando los * a devolver
   * 
   * @param n : Altura del triángulo
   * @return almacen : Línea de *
   */
  
  public static String triangulo(int n) {
    String almacen = "";
    
    for (int i=0;i<n;i++) {
      almacen += "*";
    }
    return almacen;
  }
}
