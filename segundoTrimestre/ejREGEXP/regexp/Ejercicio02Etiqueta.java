package regexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 2. Programa que reciba una url y el nombre de una etiqueta html. 
 * Si la url es válida debe mostrar por la pantalla el contenido 
 * de cada etiqueta.
 *
 */

public class Ejercicio02Etiqueta {

  public static void main(String[] args) throws IOException, MalformedURLException {
    
    String direccion = args[0];
    String etiqueta = args[1];
    int contador = 0;
    
    // Crea la conexión
    URL url = new URL(direccion);
    HttpURLConnection web = (HttpURLConnection) url.openConnection();
    web.setRequestMethod("GET");
    
    // Guardo el código fuente en un BufferedReader como si fuese un archivo.
    // System.out.println("Respuesta: " + web.getResponseCode());
    BufferedReader breader = new BufferedReader(new InputStreamReader(web.getInputStream()));
    
    
    // Compilo el patrón
    // Pattern elPatron = Pattern.compile("<" + etiqueta + ">(.*)<//" + etiqueta + ">"); ¿Por qué no funciona?
    Pattern elPatron = Pattern.compile("<" + etiqueta + "[^>]*>(.*?)</" + etiqueta + ">", Pattern.DOTALL);
    
    
    // Voy leyendo el fichero y buscando la expresión regular
    System.out.println("Contenido de las etiquetas " + etiqueta + " encontradas.");
    
    String lineaActual = breader.readLine();
    
    while (lineaActual != null) { // Mientras no llegue al EOF...
      Matcher matcher = elPatron.matcher(lineaActual);
      while (matcher.find()) {
        System.out.println(matcher.group(1));
        contador++;
      } 
      lineaActual = breader.readLine();
    }
    
    System.out.println("Se han encontrado un total de " + contador + " etiquetas " + etiqueta + ".");
    
    
    // Fin del programa
    breader.close();
  }

}
