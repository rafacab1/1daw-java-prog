package ejCondicionales;

/**
 * 20. Una compañía de transporte internacional tiene servicio en algunos países de 
 * América del Norte, América Central, América del Sur, Europa y Asia. 
 * El costo por el servicio de transporte se basa en el peso del paquete y la zona a la que va dirigido. 
 * Lo anterior se muestra en la tabla:
 *
 * ZONA  UBICACIÓN	        COSTO/GRAMO
 * 1	    América del Norte	24.00 euros
 * 2	    América Central	    20.00 euros
 * 3	    América del Sur	    21.00 euros
 * 4	    Europa	            10.00 euros
 * 5	    Asia	            18.00 euros
 *
 * Parte de su política implica que los paquetes con un peso superior a 5 kg no son transportados, 
 * esto por cuestiones de logística y de seguridad. 
 *
 * Realice un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.
 *
 * Algoritmo
 * Pido el peso en gramos del paquete.
 * Pido la zona a la que se envía.
 * Hago la sentencia.
 * Si el peso es mayor que 5000 gramos, rechazo la entrega.
 * Si no, hago las siguientes sentencias:
 *   Si va a la zona 1, peso * 24 y lo muestro por pantalla.
 *   Si va a la zona 2, peso * 20 y lo muestro por pantalla.
 *   Si va a la zona 3, peso * 21 y lo muestro por pantalla.
 *   Si va a la zona 4, peso * 10 y lo muestro por pantalla.
 *   Si va a la zona 5, peso * 18 y lo muestro por pantalla.
 * 
 * Variables:
 * peso : Peso del paquete en gramos (int)
 * zona : Zona a la que se envía el paquete (int)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
import java.util.Scanner;
public class ej20 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // Pido el peso
    System.out.print("Introduce el peso en gramos del paquete: ");
    int peso = s.nextInt();

    // Muestro un menú
    System.out.println("\nElige la zona de destino: ");
    System.out.println("1. América del norte.");
    System.out.println("2. América Central.");
    System.out.println("3. América del Sur.");
    System.out.println("4. Europa.");
    System.out.println("5. Asia.");

    // Pido la opción del menú
    System.out.print("\nIntroduce el número de la zona de destino: ");
    int zona = s.nextInt();

    // Hago las sentencias
    if (peso>5000) {
      System.out.println("\nEnvío rechazado. El paquete no puede pesar mas de 5 kg.");
    } else if (zona==1) {
      System.out.println("\nEl precio del envío con destino América del Norte es de " + (peso*24) + "€.");
    } else if (zona==2) {
      System.out.println("\nEl precio del envío con destino América Central es de " + (peso*20) + "€.");
    } else if (zona==3) {
      System.out.println("\nEl precio del envío con destino América del Sur es de " + (peso*21) + "€.");
    } else if (zona==4) {
      System.out.println("\nEl precio del envío con destino Europa es de " + (peso*10) + "€.");
    } else if (zona==5) {
      System.out.println("\nEl precio del envío con destino Asia es de " + (peso*18) + "€.");
    } else {
      System.out.println("\nERROR: La zona indicada no es correcta.");
    }
    s.close();
  }
}