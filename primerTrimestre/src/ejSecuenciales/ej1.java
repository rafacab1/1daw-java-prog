package ejSecuenciales;

/**
 * 1. Escribir un programa que pregunte al usuario su nombre, y luego lo salude.
 * 
 * Algoritmo
 * Pido el nombre del usuario
 * Lo muestro por pnatlla junto con un saludo
 * 
 * Variables:
 * nombre: Nombre del usuario (String)
 * 
 * @author Rafael Alberto Caballero Osuna
 */

public class ej1 {
  public static void main(String[] args) {
    // Creo la variable
    String nombre;
    // Pido el nombre
    System.out.print("¿Como te llamas? ");
    nombre = System.console().readLine();
    //Saludo
    System.out.println("¡Hola " + nombre + " un saludo!");
  }
}