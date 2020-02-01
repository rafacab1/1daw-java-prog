package ejSecuenciales;

/**
 * 20. Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos)
 * después de pedirnos cuantas monedas tenemos de 2e, 1e, 50 céntimos, 20 céntimos o 10 céntimos.
 *
 * Algoritmo
 * Pregunto cuantas monedas tiene de cada
 * Calculo cuanto dinero tiene por cada tipo de moneda
 * Sumo todo para ver cuantos euros tiene
 * Multiplico por 100 para calcular los céntimos totales
 * Muestro por pantalla los resultados
 * 
 * Variables:
 * e2S : Monedas de 2€ (String)
 * e1S : Monedas de 1€ (String)
 * cent50S : Monedas de 50 cént (String)
 * cent20S : Monedas de 20 cént (String)
 * cent10S : Monedas de 10 cént (String)
 * e2 : Monedas de 2€ (double)
 * e1 : Monedas de 1€ (double)
 * cent50 : Monedas de 50 cént (double)
 * cent20 : Monedas de 20 cént (double)
 * cent10 : Monedas de 10 cént (double)
 * euros : Euros totales (double)
 * centimos: Céntimos totales (double)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
public class ej20{
  public static void main(String[] args) {
    // Defino las variables
    String e2S;
    String e1S;
    String cent50S;
    String cent20S;
    String cent10S;
    double e2;
    double e1;
    double cent50;
    double cent20;
    double cent10;
    double euros;
    double centimos;

    // Pido los datos
    System.out.print("¿Cuántas monedas de 2€ tienes?: ");
    e2S = System.console().readLine();
    System.out.print("¿Cuántas monedas de 1€ tienes?: ");
    e1S = System.console().readLine();
    System.out.print("¿Cuántas monedas de 50 céntimos tienes?: ");
    cent50S = System.console().readLine();
    System.out.print("¿Cuántas monedas de 20 céntimos tienes?: ");
    cent20S = System.console().readLine();
    System.out.print("¿Cuántas monedas de 10 céntimos tienes?: ");
    cent10S = System.console().readLine();

    // Los paso a double
    e2 = Double.parseDouble(e2S);
    e1 = Double.parseDouble(e1S);
    cent50 = Double.parseDouble(cent50S);
    cent20 = Double.parseDouble(cent20S);
    cent10 = Double.parseDouble(cent10S);

    // Calculo los euros
    e2 = (e2*2);
    cent50 = (cent50*0.50);
    cent20 = (cent20*0.20);
    cent10 = (cent10*0.10);

    // Sumo los euros y los paso a céntimos
    euros = (e2+e1+cent50+cent20+cent10);
    centimos = (euros*100);

    // MUerstro los resultados
    System.out.println("Tienes " + euros + "€");
    System.out.println("Tienes " + centimos + " céntimos (contando euros).");
  }
}