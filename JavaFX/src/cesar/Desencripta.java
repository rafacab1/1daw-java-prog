package cesar;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Desencripta {
  
  /**
   * Función desencripta, lee carácter a carácter, desplaza la cantidad indicada y lo concatena en una variable.
   * 
   * @param linea
   * @param desplaza
   * @return lineaDesencriptada
   */
  static String desencripta(String linea, int desplaza) {
    String letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZáéíóúñÁÉÍÓÚÑ";
    String lineaDesencriptada = "";
    for (char c: linea.toCharArray()) {
      char cDescifrado = c;
      if (letras.contains(Character.toString(c))) {
        int posDondeEsta = letras.indexOf(c);
        int posCDescifrado = ((posDondeEsta - desplaza) % letras.length());
        if (posCDescifrado < 0) {
          posCDescifrado = letras.length() + posCDescifrado;
        }
        cDescifrado = letras.charAt(posCDescifrado);
      }
      lineaDesencriptada += cDescifrado;
    }
    return lineaDesencriptada;
  }

  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    String continua;
    
    if (args.length < 1 || args.length > 2) {
      System.err.println("Número de parámetros incorrecto, saliendo...");
      System.exit(1);
    }
    
    String cifrado = args[0];
    String noCifrado;
    
    if (args.length == 1) { // Si sólo se pasa un parámetro...
      noCifrado = cifrado; // El contenido se guardará en el mismo archivo
      
      // Avisa y confirma
      System.out.println("Sólo un fichero como parámetro, se sobreescribirá " + cifrado);
      do {
        System.out.println("¿Desea seguir con la operación? [s/n]: ");
        continua = s.next().toUpperCase();
      } while (!continua.equals("S") && !continua.equals("N"));
      if (continua.equals("N")) {
        System.out.println("Saliendo...");
        System.exit(0);
      }
    } else {
      noCifrado = args[1]; // Si el número de argumentos NO es 1, cifrado coge el valor del segundo argumento.
    }
    
    // Manejador fichero cifrado
    BufferedReader manejadorCifrado = null;
    try {
      manejadorCifrado = new BufferedReader(new FileReader(cifrado));
    } catch (Exception e) {
      System.err.println("Error, no ha sido posible leer " + cifrado);
      System.exit(2);
    }
    
    // Manejador fichero no cifrado
    BufferedWriter manejadorNoCifrado = null;
    try {
      manejadorNoCifrado = new BufferedWriter(new FileWriter(noCifrado));
    } catch (Exception e) {
      System.err.println("Error, no ha sido posible abrir " + noCifrado);
      System.exit(2);
    }
    
    // Pide desplazamiento
    boolean sigue = true;
    int desp = 0;
    do {
      try {
        System.out.println("¿Que desplazamiento quieres usar para desencriptar? ");
        desp = s.nextInt();
        sigue = false;
      } catch (Exception e) {
        System.err.println("Debes introducir un entero...");
        s.nextLine();
      }
    } while (sigue);
    
    // Desencriptador
    String line = manejadorCifrado.readLine();
    while (line != null) {
      manejadorNoCifrado.write(desencripta(line, desp)); // Encripta
      manejadorNoCifrado.newLine(); // Salto de linea
      line = manejadorCifrado.readLine(); // Lee la siguiente línea
    }
    
    // Cierro ficheros
    manejadorCifrado.close();
    manejadorNoCifrado.close();
    
    s.close();
    
  }

}
