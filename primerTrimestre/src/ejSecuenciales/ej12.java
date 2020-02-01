package ejSecuenciales;

/**
 * 12. Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano. 
 * Calcula y muestra la diferencia entre ellos
 *
 * Algoritmo
 * Pido los números
 * Hago los cálculos, raíz cuadrada de x2 - x1 al cuadrado + y2 - y1 al cuadrado
 * Muestro el resultado
 * 
 * Variables:
 * x1S : Número (String)
 * x2S : Número (String)
 * y1S : Número (String)
 * y2S : Número (String)
 * x1 : Número (double)
 * x2 : Número (double)
 * y1 : Número (double)
 * y2 : Número (double)
 * distancia : Distancia entre los números (double)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
public class ej12{
  public static void main(String[] args) {
    // Defino las variables
    String x1S;
    String x2S;
    String y1S;
    String y2S;
    double x1;
    double x2;
    double y1;
    double y2;
    double distancia;

    // Pido los datos
    System.out.print("Introduce x1: ");
    x1S = System.console().readLine();
    System.out.print("Introduce x2: ");
    x2S = System.console().readLine();
    System.out.print("Introduce y1: ");
    y1S = System.console().readLine();
    System.out.print("Introduce y2: ");
    y2S = System.console().readLine();

    // Los paso a double
    x1 = Double.parseDouble(x1S);
    x2 = Double.parseDouble(x2S);
    y1 = Double.parseDouble(y1S);
    y2 = Double.parseDouble(y2S);

    // Calculo la distancia
    distancia = Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2)));

    // Muestro el resultado
    System.out.println("Distancia: " + distancia);
  }
}