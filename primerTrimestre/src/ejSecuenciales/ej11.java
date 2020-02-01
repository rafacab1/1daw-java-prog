package ejSecuenciales;

/**
 * 11. Pide al usuario dos números y muestra la "distancia" entre ellos 
 * (el valor absoluto de su diferencia, de modo que el resultado sea siempre positivo).
 *
 * Algoritmo
 * Pido los dos números
 * Los resto y muestro por pantalla el valor absoluto
 * 
 * Variables:
 * n1S : Número 1 (String)
 * n2S: Número 2 (String)
 * n1 : Número 1 (double)
 * n2 : Número 2 (double)
 * valor : Resultado (double)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
public class ej11{
  public static void main(String[] args) {
    // Defino las variables
    String n1S;
    String n2S;
    double n1;
    double n2;
    double valor;

    // Pido los datos
    System.out.print("Introduce el primer número: ");
    n1S = System.console().readLine();
    System.out.print("Introduce el segundo número: ");
    n2S = System.console().readLine();

    // Los paso a double
    n1 = Double.parseDouble(n1S);
    n2 = Double.parseDouble(n2S);

    // Calculo el valor absoluto
    valor = Math.abs(n1-n2);

    // Muestro el resultado
    System.out.println("La distancia entre " + n1 + " y " + n2 + " es " + valor);
  }
}