package ejLibro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 2. Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 * 
 * @author rafacab1
 *
 */

public class ej02primosleer {

  public static void main(String[] args) throws IOException, FileNotFoundException {   
    // Abro el archivo
    BufferedReader primos = null;
    try {
      primos = new BufferedReader(new FileReader("primos.dat"));
    } catch (IOException e) {
      System.err.println("Error al abrir el fichero.");
      System.exit(1);
    }
    
    // Imprimo el contenido
    String sLinea = primos.readLine();
    while (sLinea != null) {
      System.out.println(sLinea);
      sLinea = primos.readLine();
    }
  }

}
