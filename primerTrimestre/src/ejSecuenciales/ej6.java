package ejSecuenciales;

/**
 * 6. Calcular la media de tres números pedidos por teclado.
 * 
 * Algoritmo
 * Pido los números
 * Hago los cálculos (sumar todo y dividir entre 3) y muestro el resultado
 * 
 * Variables:
 * n1S : Número 1 (String)
 * n2S : Número 2 (String)
 * n3S : Número 3 (String)
 * n1: Número 1 (double)
 * n2: Número 2 (double)
 * n3: Número 3 (double)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
public class ej6 {
  public static void main(String[] args) {
    // Defino las variables
    String n1S;
    String n2S;
    String n3S;
    double n1;
    double n2;
    double n3;

    // Pido los números
    System.out.print("Introduce el primer número: ");
    n1S = System.console().readLine();
    System.out.print("Introduce el segundo número: ");
    n2S = System.console().readLine();
    System.out.print("Introduce el tercer número: ");
    n3S = System.console().readLine();

    // Los paso a double
    n1 = Double.parseDouble(n1S);
    n2 = Double.parseDouble(n2S);
    n3 = Double.parseDouble(n3S);

    // Calculo la media y muestro el resultado
    System.out.println("La media de " + n1 + ", " + n2 + " y " + n3 + " es " + ((n1+n2+n3)/3));
  }
}