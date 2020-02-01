package ejSecuenciales;

/**
 * 5. Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
 * 
 * Algoritmo
 * Pido los grados Fahrenheit
 * Hago los cálculos
 * Imprimo por pantalla los resultados.
 * 
 * Variables:
 * farenheitS : Grados Fahrenheit (String)
 * farenheit : Grados Fahrenheit (double)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
public class ej5 {
  public static void main(String[] args) {
    // Defino las variables
    String farenheitS;
    double farenheit;

    // Pido los grados Farenheit
    System.out.print("Introduce los grados Farenheit: ");
    farenheitS = System.console().readLine();

    // Los paso a double
    farenheit = Double.parseDouble(farenheitS);

    // Muestro el resultado
    System.out.println(farenheit + " grados Farenheit equivale a " + ((farenheit-32)/1.8));
  }
}