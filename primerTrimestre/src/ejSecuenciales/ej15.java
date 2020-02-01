package ejSecuenciales;

/**
 * 15. Dadas dos variables numéricas A y B, que el usuario debe teclear, 
 * se pide realizar un algoritmo que intercambie los valores de ambas variables y muestre 
 * cuanto valen al final las dos variables.
 *
 * Algoritmo
 * Pido los dos números
 * Meto a en una variable nueva
 * Sustituyo el valor de a por el de b
 * Sustituyo el valor de b por el que tengo en la nueva variable
 * Muestro el resultado
 * 
 * Variables:
 * aS : Número (String)
 * bS : Número (String)
 * a : Número (double)
 * b : Número (double)
 * z : Número (double)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
public class ej15{
  public static void main(String[] args) {
    // Defino las variables
    String aS;
    String bS;
    double a;
    double b;
    double z;

    // Pido los datos
    System.out.print("Introduce el valor de A: ");
    aS = System.console().readLine();
    System.out.print("Introduce el valor de B: ");
    bS = System.console().readLine();

    // Los paso a double
    a = Double.parseDouble(aS);
    b = Double.parseDouble(bS);

    // Intercambio las variables
    z = a;
    a = b;
    b = z;

    // Muestro los resultados
    System.out.println("El valor de a ahora es: " + a);
    System.out.println("El valor de b ahora es: " + b);
  }
}