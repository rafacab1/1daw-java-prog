package ejLibro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 1. Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * 
 * @author rafacab1
 *
 */

public class ej01primos {

  public static void main(String[] args) {
    
    // Creo el fichero
    try {
      BufferedWriter primos = new BufferedWriter(new FileWriter("primos.dat"));
      
      // Calculo primos y los guardo
      boolean es_primo = true;
      int num = 2;
      
      for (int i=0;i<=500;i++) {
        es_primo = true;
        while (num != i && es_primo) {
          if ((i % num)==0) {
            es_primo = false;
            num++;
          } else {
            primos.write(i + "\n");
            es_primo = false;
            // Esto también lo incluyo en el bloque try catch porque
            // puede dar error al escribir en el fichero.
          }
        }
      }
      primos.close();
    } catch (IOException e) {
      System.err.println("Error de escritura.");
      System.exit(1);
    }
  }

}
