package ejCondicionales;

/**
 * 8. Algoritmo que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y muestre el 
 * mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad es mayor o igual a 
 * dieciocho y el sexo es ‘F’. En caso de que se cumpla lo mismo, pero el sexo sea ‘M’, debe 
 * imprimir ‘POSIBLE’. Si no se cumplen dichas condiciones se debe mostrar ‘NO ACEPTADA’.
 * 
 * Algoritmo
 * Pido los datos
 * Si nota es mayor o igual a 5 y edad es mayor o igual que 18 y el sexo es F, muestro ACEPTADA.
 * Si no, compruebo si la nota es mayor o igual a 5 y edad es mayor o igual que 18 y el sexo es M, en este caso muestro POSIBLE.
 * Si no, muestro NO ACEPTADA
 * 
 * Variables:
 * nota : Nota (double)
 * edad : Edad (int)
 * sexo = Sexo (String)
 * 
 * 
 * @author Rafael Alberto Caballero Osuna
 */
import java.util.Scanner;
public class ej8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // Pido los datos
    System.out.print("Introduce tu nota: ");
    double nota = s.nextDouble();
    System.out.print("Introduce tu edad: ");
    int edad = s.nextInt();
    System.out.print("Introduce tu sexo [M/F]: ");
    String sexo = s.next();

    // Hago las sentencias
    if (nota>=5 && edad>=18 && sexo.equals("F")) {
      System.out.println("ACEPTADA");
    } else if (nota>=5 && edad>=18 && sexo.equals("M")) {
      System.out.println("POSIBLE");
    } else {
      System.out.println("NO ACEPTADA");
    }
    s.close();
  }
}