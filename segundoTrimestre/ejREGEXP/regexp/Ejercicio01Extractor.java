package regexp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1. Programa que recibe dos parámetros: 
 * - Un fichero de texto
 * - Una cadena que le indica qué información va extraer del mismo 
 * 
 * Después muestra por la pantalla los datos extraídos.
 * Los posibles valores del segundo parámetro y la información que extrae es:
 * 
 *  DNI: extrae los DNIs.
 *  
 *  IP: extrae las direcciones IP.
 *  
 *  MAT: extrae matrículas de coche con formato 0000XXX.
 *  
 *  HEX: extrae números hexadecimales. 
 *  Entendemos que las letras entre A y F son en mayúsculas y el número empieza con #.
 *  
 *  FEC: extrae fechas con formato dd/mm/aaaa. 
 *  
 *  TWT: extrae usuarios de twitter: empieza por @ y puede contener letras mayusculas y minusculas, numeros, guiones y guiones bajos.
 * 
 */

public class Ejercicio01Extractor {

  public static void main(String[] args) throws IOException {
    
    // Inicializa la variable en la que se guardará la expresión regular
    String regexp = "";
    
    // Comprueba si se han pasado dos parámetros
    if (args.length < 1 || args.length > 2) {
      System.err.println("Número de parámetros incorrecto, saliendo...");
      System.exit(1);
    }
    
    // Guarda los parámetros en variables
    String nFichero = args[0];
    String aBuscar = args[1];
    
    // Abro el fichero
    BufferedReader fichero = null;
    try {
      fichero = new BufferedReader(new FileReader(nFichero));
    } catch (Exception e) {
      System.err.println("Error, no se ha podido abrir " + nFichero);
      System.exit(1);
    }
    
    // Patrón para buscar DNI
    if (aBuscar.equals("DNI")) {
      regexp = "\\d{8}[A-HJ-NP-TV-Z]";
    }
    
    // Patrón para buscar IP
    if (aBuscar.equals("IP")) {
      regexp = "\\b\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\b";
    }
    
    // Patrón para buscar matrículas
    if (aBuscar.equals("MAT")) {
      regexp = "[0-9]{4}[BCDFGHJKLMNPRSTVWXYZ]{3}";
    }
    
    // Patrón para buscar números hexadecimales
    if (aBuscar.equals("HEX")) {
      regexp = "#[0-9A-F]+\\b";
    }
    
    // Patrón para buscar fechas
    if (aBuscar.equals("FEC")) {
      regexp = "\\d{1,2}/\\d{1,2}/\\d{4}";
    }
    
    // Patrón para buscar usuarios de Twitter
    if (aBuscar.equals("TWT")) {
      regexp = "@[A-Za-z\\_\\-0-9]+";
    }
    
    // Mostrar por pantalla
    System.out.println("Resultados para " + aBuscar + ".");
    buscarRegexp(fichero, regexp);
    
    // Final del programa
    fichero.close();

  }
  
  /** 
   * Función que usa Pattern y Matcher para buscar en un archivo a partir de una expresión regular.
   * 
   * @param archivo
   * @param patron
   * @throws IOException
   */
  private static void buscarRegexp(BufferedReader archivo, String patron) throws IOException {
    String lineaActual = "";
    Pattern elPatron = Pattern.compile(patron);
    lineaActual = archivo.readLine();
    
    while (lineaActual != null) { // Mientras no llegue al EOF...
      Matcher matcher = elPatron.matcher(lineaActual);
      while (matcher.find()) {
        System.out.println(matcher.group());
      }
      lineaActual = archivo.readLine();
    } 
  }

}
