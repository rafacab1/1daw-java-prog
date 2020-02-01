package ejSecuenciales;

/**
 * 18. Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.
 *
 * Algoritmo
 * Pido nombre, apellido y segundo apellido del usuario.
 * Cojo el primer carácter de cada variable
 * Muestro el resultado
 * 
 * Variables:
 * nombre : Nombre (String)
 * apellido1 : Apellido 1 (String)
 * apellido2 : Apellido 2 (String)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
public class ej18{
  public static void main(String[] args) {
    // Defino las variables
    String nombre;
    String apellido1;
    String apellido2;

    // Pido los datos
    System.out.print("Introduce tu nombre: ");
    nombre = System.console().readLine();
    System.out.print("Introduce tu primer apellido: ");
    apellido1 = System.console().readLine();
    System.out.print("Introduce tu segundo apellido: ");
    apellido2 = System.console().readLine();

    // Muestro el resultado
    System.out.println("Tus iniciales son: " + nombre.substring(0,1) + apellido1.substring(0,1) + apellido2.substring(0,1)); 
  }
}