package ejSecuenciales;

/**
 * 13. Realizar un algoritmo que lea un número y que muestre su raíz cuadrada y su raíz cúbica. 
 * Python no tiene ninguna función predefinida que permita calcular la raíz cúbica, 
 * ¿cómo se puede calcular?
 *
 * Algoritmo
 * Pido el número
 * Hago los cálculos, raíz cuadrada y para la cúbica elevo el número a 1/3
 * Muestro el resultado
 * 
 * Variables:
 * nS : Número (String)
 * n : Número (double)
 * cuadrada : Resultado raíz cuadrada (double)
 * cubica : Resultado raíz cúbica (double)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
public class ej13{
  public static void main(String[] args) {
    // Defino las variables
    String nS;
    double n;
    double cuadrada;
    double cubica;

    // Pido el número
    System.out.print("Introduce el número: ");
    nS = System.console().readLine();

    // Lo paso a double
    n = Double.parseDouble(nS);

    // Hago los calculos
    cuadrada = (Math.sqrt(n));
    cubica = (Math.pow(n, 1.0/3.0));

    // Muestro los resultados
    System.out.println("La raíz cuadrada es " + cuadrada);
    System.out.println("La raíz cúbica es " + cubica);
  }
}