package ejSecuenciales;

/**
 * 7. Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas horas y minutos corresponde.
 * 
 * Algoritmo
 * Pido los minutos
 * Hago los cálculos (divido los minutos entre 60, eso serían horas y los minutos sería el resto de la división anterior)
 * y muestro el resultado por pantalla
 * 
 * Variables:
 * minsS : Minutos indicados (String)
 * mins : Minutos indicados (int)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
public class ej7 {
  public static void main(String[] args) {
    // Defino las variables
    String minsS;
    int mins;

    // Pido los minutos
    System.out.print("Introduce los minutos: ");
    minsS = System.console().readLine();

    // Los paso a Int
    mins = Integer.parseInt(minsS);

    // Muestro los resultados
    System.out.println(mins + " minutos equivalen a " + mins/60 + " horas y " + mins%60 + " minutos.");
  }
}