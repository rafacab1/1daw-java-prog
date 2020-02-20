package ejColecciones;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Ejercicio 11 de la página 228 del libro "Aprende Java con Ejercicios".
 * 
 * 11. Realiza un programa que escoja al azar 5 palabras en español del mini-
 * diccionario del ejercicio anterior. El programa irá pidiendo que el usuario teclee
 * la traducción al inglés de cada una de las palabras y comprobará si son
 * correctas. Al final, el programa deberá mostrar cuántas respuestas son válidas
 * y cuántas erróneas.
 * 
 * @author Rafael Caballero
 * https://github.com/rafacab1
 */

public class EjHashMap11 {

  public static void main(String[] args) {
    HashMap<String, String> dic = new HashMap<String, String>();
    Scanner s = new Scanner(System.in);
    
    dic.put("hola", "hello");
    dic.put("ratón", "mouse");
    dic.put("teclado", "keyboard");
    dic.put("teléfono", "telephone");
    dic.put("llaves", "keys");
    dic.put("ojos", "eyes");
    dic.put("música", "music");
    dic.put("altavoz", "speaker");
    dic.put("pantalla", "screen");
    dic.put("manos", "hands");
    dic.put("escuela", "school");
    dic.put("líquido", "liquid");
    dic.put("gafas de sol", "sunglasses");
    dic.put("ordenador portátil", "laptop");
    dic.put("ruta", "route");
    dic.put("camisa", "shirt");
    dic.put("mesa", "table");
    dic.put("galletas", "cookies");
    dic.put("clase", "class");
    dic.put("cristal", "glass");
    
    // Meto las palabras en español en un array
    String[] espanol = dic.keySet().toArray(new String[0]);
    
    for (int i=1;i<=5;i++) {
      int indice = (int)(Math.random()*(1-20+1)+20);
      
      // Miro la posición del índice en el array
      System.out.print("Introduce " + espanol[indice] + " en inglés: ");
      String enenglish = s.next();
      
      if (enenglish.equals(dic.get(espanol[indice]))) {
        System.out.println("Enhorabuena, has acertado.");
      } else {
        System.out.println("No, esa no es...");
      }
    }
    
    s.close();
  }

}
