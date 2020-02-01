package ejSecuenciales;
/**
 * 4. Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.
 * 
 * Algoritmo
 * Pido los números
 * Hago los cálculos
 * Imprimo por pantalla los resultados.
 * 
 * Variables:
 * n1S : Número 1 (String)
 * n2S : Número 2 (String)
 * n1 : Número 1 (double)
 * n2 : Número 2 (double)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
public class ej4 {
  public static void main(String[] args) {
    // Defino las variables
    String n1S;
    String n2S;
    double n1;
    double n2;

    // Pido los números
    System.out.print("Introduce el primer número: ");
    n1S = System.console().readLine();
    System.out.print("Introduce el segundo número: ");
    n2S = System.console().readLine();

    // Paso a double
    n1 = Double.parseDouble(n1S);
    n2 = Double.parseDouble(n2S);

    // Muestro los resultados
    System.out.println("El resultado de la suma es: " + (n1+n2));
    System.out.println("El resultado de la resta es: " + (n1-n2));
    System.out.println("El resultado de la división es: " + (n1/n2));
    System.out.println("El resultado de la multiplicación es: " + (n1*n2));
  }
}