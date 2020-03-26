package ejLibro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

/* 
 * Ejercicio 05 de la página 257 del libro "Aprende Java con Ejercicios"
 * 
 * Escribe un programa capaz de quitar los comentarios de un programa de Java.
 * Se utilizaría de la siguiente manera:
 * quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
 * Por ejemplo:
 * quita_comentarios hola.java holav2.java
 * crea un fichero con nombre holav2.java que contiene el código de hola.java pero
 * sin los comentarios.
 * 
 * @author Rafa C. (rafacab1)
 */

public class quita_comentarios {

  public static void main(String[] args) {
    
    // Compruebo si el número de parámetros es correcto.
    if (args.length < 1 || args.length > 2) {
      System.err.println("Número de parámetros incorrecto, saliendo...");
      System.exit(1);
    }
    
    // Guardo el nombre de los archivos en variables
    String primerFichero = args[0];
    String segundoFichero = args[1];
    
    
    try {
      BufferedReader fichero1 = new BufferedReader(new FileReader(primerFichero));
      BufferedWriter fichero2 = new BufferedWriter(new FileWriter(segundoFichero));
      
      boolean enBloque = false; // Controla si el puntero está en un bloque de comentarios
      
      // Lectura y escritura
      String linea = fichero1.readLine();
      while (linea != null) { // Mientras que no llegue al EOF...
        if (!enBloque) {
          boolean escribeLinea = true; // Variable para controlar si tiene que escribir esa línea o no
          if (linea.contains("//")) {
            int dondeEmpiezaBarra2 = linea.indexOf("//");
            linea = linea.substring(0, dondeEmpiezaBarra2);
            if (linea.trim().equals("")) {
              escribeLinea = false; // Si la línea está vacía, no la escribe.
            }
          }
          
          // ¿Tiene que escribir la línea?
          if (escribeLinea) {
            fichero2.write(linea);
            fichero2.newLine();
          }
        }
        
        // Lee siguiente línea
        linea = fichero1.readLine();
      }
      
      // Cierra ficheros
      fichero1.close();
      fichero2.close();
      
    } catch (FileNotFoundException fnfe) {
      System.err.println("Error, archivo " + primerFichero + " no encontrado...");
      System.exit(1);
    } catch (IOException ioe) {
      System.err.println("Error de entrada/salida...");
      System.exit(2);
    }
    
    

  }

}
