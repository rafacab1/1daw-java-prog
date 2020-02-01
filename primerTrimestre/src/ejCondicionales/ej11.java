package ejCondicionales;

/**
 * 11. Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un triángulo. 
 * El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:
 * 
 * Si los 3 lados son iguales es equilátero.
 * Si se cumple Pitágoras entonces es triángulo rectángulo
 * Si sólo dos lados del triángulo son iguales entonces es isósceles.
 * Si no se cumple ninguna de las condiciones anteriores, es escaleno.
 * 
 * Algoritmo
 * Pido los lados
 * Si se cumple Pitágoras, es rectángulo
 * Si tiene dos lados iguales y uno no, es isósceles
 * Si todos los lados son iguales es equilátero
 * Si no, es escaleno
 * 
 * Variables:
 * a : Lado a (double)
 * b : Lado b (double)
 * c : Lado c (double)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
import java.util.Scanner;
public class ej11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // Pido los lados
    System.out.print("Introduce el lado a: ");
    double a = s.nextDouble();
    System.out.print("Introduce el lado b: ");
    double b = s.nextDouble();
    System.out.print("Introduce el lado c: ");
    double c = s.nextDouble();

    // Hago las sentencias
    if (a==b && b==c) {
      System.out.println("El triángulo es equiátero.");
    } else if ((Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2)) || (Math.pow(b, 2)+Math.pow(c, 2)==Math.pow(a, 2)) || (Math.pow(c, 2)+Math.pow(a, 2)==Math.pow(b, 2))) {
      System.out.println("El triángulo es rectángulo.");
    } else if (a==b || a==c || b==c) {
      System.out.println("El triángulo es isósceles.");
    } else {
      System.out.println("El triángulo es escaleno");
    }
    s.close();
  }
}