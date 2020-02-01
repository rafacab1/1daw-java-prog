package ejSecuenciales;

/**
 * 9. Una tienda ofrece un descuento del 15% sobre el total de la compra 
 * y un cliente desea saber cuanto deberá pagar finalmente por su compra.
 * 
 * Algoritmo
 * Pido el total de la compra
 * Calculo el descuento y lo muestro por pantalla
 * 
 * Variables:
 * compraS = Total de la compra sin el descuento (String)
 * compra = Total de la compra sin el descuento (double)
 * descuento = Total de la compra con el descuento (double)
 * 
 * 
 * @author Rafael Alberto Caballero Osuna
 */
public class ej9 {
  public static void main(String[] args) {
    // Defino las variables
    String compraS;
    double compra;
    double descuento;

    // Pido los datos
    System.out.print("Introduce el total de la compra: ");
    compraS = System.console().readLine();

    // Los paso a double
    compra = Double.parseDouble(compraS);

    // Calculo el coste de la compra con el descuento
    descuento = (compra-(compra*15/100));

    // Muestro el resultado
    System.out.println("Debes pagar " + descuento + "€ en total.");
  }
}