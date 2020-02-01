package ejCondicionales;

/**
 * 10. Algoritmo que pida los puntos centrales x1,y1,x2,y2 y los radios r1,r2 de dos 
 * circunferencias y las clasifique en uno de estos estados:
 * 
 * exteriores
 * tangentes exteriores
 * secantes
 * tangentes interiores
 * interiores
 * concéntricas
 * 
 * Algoritmo:
 * Pido los datos.
 * Calculo la distancia entre los dos puntos.
 * Valoro como son las dos circurferencias:
 * Si d es mayor que la suma de los radios, son exteriores.
 * Si d es menor que la suma de los radios y mayor que su diferencia, son secantes.
 * Si d es mayor que 0 y menor que su diferencia, son interiores.
 * Si d es igual que la suma de los radios, son tangentes exteriores.
 * Si d es igual que la diferencia de los radios, son tangentes interiores.
 * Si d es 0, son concéntricas.
 * 
 * Variables:
 * d = Distancia entre las dos circurferencias (double)
 * x1 = Posición x de la primera circurferencia (double)
 * x2 = Posición x de la segunda circureferencia (double)
 * y1 = Posición y de la primera circurferencia (double)
 * y2 = Posición y de la segunda circureferencia (double)
 * r1 = Radio de la primera circurferencia (double)
 * r2 = Radio de la segunda circurferencia (double)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
import java.util.Scanner;
public class ej10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Pido los datos
    System.out.print("Introduce x1: ");
    double x1 = s.nextDouble();
    System.out.print("Introduce x2: ");
    double x2 = s.nextDouble();
    System.out.print("Introduce y1: ");
    double y1 = s.nextDouble();
    System.out.print("Introduce y2: ");
    double y2 = s.nextDouble();
    System.out.print("Introduce r1: ");
    double r1 = s.nextDouble();
    System.out.print("Introduce r2: ");
    double r2 = s.nextDouble();

    // Calculo la distancia entre las circurferencias
    double d = Math.sqrt((Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)));

    // Hago las sentencias
    if (d>(r1+r2)) {
      System.out.println("Las dos circurferencias son exteriores.");
    }
    if (d < (r1+r2) && d > (r1-r2)) {
      System.out.println("Las dos circurferencias son secantes.");
    }
    if (d > 0 && d < (r1-r2)) {
      System.out.println("Las dos circurferencias son interiores.");
    }
    if (d==(r1+r2)) {
      System.out.println("Las dos circurferencias son tangentes exteriores.");
    }
    if (d==(r1-r2)) {
      System.out.println("Las dos circurferencias son tangentes interiores.");
    }
    if (d==0) {
      System.out.println("Las dos circurferencias son concéntricas.");
    }
    s.close();
  }
}