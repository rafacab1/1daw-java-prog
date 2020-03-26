package ej01;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ej01Cesar {
  
  /**
   * Función encripta, lee carácter a carácter, desplaza la cantidad indicada y lo concatena en una variable.
   * 
   * @param linea
   * @param desplaza
   * @return lineaEncriptada
   */
  private static String encripta(String linea, int desplaza) {
    String letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZáéíóúñÁÉÍÓÚÑ";
    String lineaEncriptada = "";
    for (int i=0;i<linea.length();i++) {
      String c = linea.substring(i, i+1);
      if (letras.contains(letras)) {
        int posDondeEsta = letras.indexOf(c);
        int posCEncriptado = ((posDondeEsta + desplaza) % letras.length());
        c = letras.substring(posCEncriptado, posCEncriptado+1);
      }
      lineaEncriptada += c;
    }
    return lineaEncriptada;
  }

  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    String continua;
    
    if (args.length < 1 || args.length > 2) {
      System.err.println("Número de parámetros incorrecto, saliendo...");
      System.exit(1);
    }
    
    String noCifrado = args[0];
    String cifrado;
    
    if (args.length == 1) { // Si sólo se pasa un parámetro...
      cifrado = noCifrado; // El contenido se guardará en el mismo archivo
      
      // Avisa y confirma
      System.out.println("Sólo un fichero como parámetro, se sobreescribirá " + noCifrado);
      do {
        System.out.println("¿Desea seguir con la operación? [s/n]: ");
        continua = s.next().toUpperCase();
      } while (!continua.equals("S") && !continua.equals("N"));
      if (continua.equals("N")) {
        System.out.println("Saliendo...");
        System.exit(0);
      }
    } else {
      cifrado = args[1]; // Si el número de argumentos NO es 1, cifrado coge el valor del segundo argumento.
    }
    
    // Manejador fichero sin cifrar
    BufferedReader manejadorNoCifrado = null;
    try {
      manejadorNoCifrado = new BufferedReader(new FileReader(noCifrado));
    } catch (Exception e) {
      System.err.println("Error, no ha sido posible leer " + noCifrado);
      System.exit(2);
    }
    
    // Manejador fichero cifrado
    BufferedWriter manejadorCifrado = null;
    try {
      manejadorCifrado = new BufferedWriter(new FileWriter(cifrado));
    } catch (Exception e) {
      System.err.println("Error, no ha sido posible abrir " + cifrado);
      System.exit(2);
    }
    
    // Pide desplazamiento
    boolean sigue = true;
    int desp = 0;
    do {
      try {
        System.out.println("¿Que desplazamiento quieres usar para encriptar? ");
        desp = s.nextInt();
        sigue = false;
      } catch (Exception e) {
        System.err.println("Debes introducir un entero...");
        s.nextLine();
      }
    } while (sigue);
    
    // Encriptador
    String line = manejadorNoCifrado.readLine();
    while (line != null) {
      manejadorCifrado.write(encripta(line, desp)); // Encripta
      manejadorCifrado.newLine(); // Salto de linea
      line = manejadorNoCifrado.readLine(); // Lee la siguiente línea
    }
    
    // Cierro ficheros
    manejadorNoCifrado.close();
    manejadorCifrado.close();
    
    s.close();
    
  }

}
