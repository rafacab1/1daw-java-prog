package ejColecciones;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Ejercicio 10 de la página 228 del libro "Aprende Java con Ejercicios".
 * 
 * 10. Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
 * almacenar las parejas de palabras. El programa pedirá una palabra en español
 * y dará la correspondiente traducción en inglés.
 * 
 * @author Rafael Caballero
 * https://github.com/rafacab1
 */

public class EjHashMap10 {

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
    
    System.out.print("Introduce una palabra en español: ");
    String pesp = s.next();
    
    System.out.println("La traducción es " + dic.get(pesp));

    s.close();
  }

}
