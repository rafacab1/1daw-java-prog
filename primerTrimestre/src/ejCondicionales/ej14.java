package ejCondicionales;

/**
 * 14. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, 
 * la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la venta del producto, 
 * ésta es de un solo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva 
 * que entrega en un embarque, considerando lo siguiente: si es de tipo A, 
 * se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de tamaño 2. 
 * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2. 
 * Realice un algoritmo para determinar la ganancia obtenida.
 *
 * Algoritmo
 * Pido el precio inicial de la uva
 * Pido los kilos
 * Pido el tipo de la uva
 * Pido el tamaño de la uva
 * Según el tipo y el tamaño, sumo los céntimos al precio inicial y lo multiplico por los kilos.
 *
 * Variables
 * pInicial = Precio inicial de la uva (double)
 * kilos = Kilos de uvas (double)
 * tipo = Tipo de la uva (String)
 * tamano = Tamaño de la uva (int)
 * ganancia = Resultado (double)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
import java.util.Scanner;
public class ej14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // Pido los datos
    System.out.print("Introduce el precio inicial de la uva: ");
    double pInicial = s.nextDouble();
    System.out.print("Introduce los kilos de uvas: ");
    double kilos = s.nextDouble();
    System.out.print("Introduce el tipo de la uva (A/B): ");
    String tipo = s.next();
    System.out.print("Introduce el tamaño de la uva (1/2): ");
    int tamano = s.nextInt();

    // Calculo el precio de la uva según su tipo y tamaño
    if ((tipo.equalsIgnoreCase("a")) && (tamano==1)) {
      double ganancia = ((pInicial*kilos) + (kilos*0.20));
      System.out.println("La ganancia es de " + ganancia + "€.");
    } else if ((tipo.equalsIgnoreCase("a")) && (tamano==2)) {
      double ganancia = ((pInicial*kilos) + (kilos*0.30));
      System.out.println("La ganancia es de " + ganancia + "€.");
    } else if ((tipo.equalsIgnoreCase("b")) && (tamano==1)) {
      double ganancia = ((pInicial*kilos) + (kilos*-0.30));
      System.out.println("La ganancia es de " + ganancia + "€.");
    } else if ((tipo.equalsIgnoreCase("b")) && (tamano==2)) {
      double ganancia = ((pInicial*kilos) + (kilos*-0.50));
      System.out.println("La ganancia es de " + ganancia + "€.");
    } else {
      System.out.println("Error, datos introducidos incorrectos.");
    }
    s.close();
  }
}