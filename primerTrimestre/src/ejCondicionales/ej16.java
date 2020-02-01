package ejCondicionales;

/**
 * 16. La política de cobro de una compañía telefónica es: cuando se realiza una llamada, 
 * el cobro es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro, 
 * los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, y a partir del décimo minuto, 50 céntimos. 
 * Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de mañana, 15 %, y en turno de tarde, 10 %. 
 * Realice un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.
 * 
 * Algoritmo
 * Pido el tiempo de la llamada
 * Pregunto si la llamada fue en domingo
 * Si no lo fue, pregunto si fue por la mañana o por la tarde
 * Si el tiempo es menor que 5,  multiplico por 100 céntimos (1€)
 * Si es menor que 8, le quito los minutos anteriores y multiplico por 80 céntimos y le sumo 500 céntimos de los minutos anteriores
 * Si es menor que 10, le quito los minutos anteriores y multiplico por 70 céntimos y le sumo 240 céntimos y 500 céntimos de los minutos anteriores
 * Si es mayor que 10, le quito al tiempo los minutos anteriores y lo multiplico por 50 céntimos y les sumo los de los minutos anteriores (140+240+500)
 * Luego aplico el impuesto
 * Si es domingo, le añado el 3%
 * Si no, si fue por la mañana le añado el 15%
 * Y si tampoco, será por la tarde y le añado el 10%
 * 
 * Variables:
 * tiempo : Tiempo de la llamada en minutos (double)
 * domingo : Indica si la llamada fue en domingo (String)
 * horario : Indica si la llamada fue por la mañana o por la tarde (String) 
 * debePagar : Resultado (double)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
import java.util.Scanner;
public class ej16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String horario = "null";
    double debePagar = 0;
    double impuesto = 0;

    // Pido los datos
    System.out.print("¿Cuánto duró la llamada? (Minutos): ");
    double tiempo = s.nextDouble();
    System.out.print("¿Esa llamada se hizo un domingo? (S/n): ");
    String domingo = s.next();

    if (domingo.equalsIgnoreCase("n")) {
      System.out.print("¿La llamada fue por la mañana o por la tarde? [M/t]: ");
      horario = s.next();
    }

    // Hago las sentencias
    if (tiempo<=5) {
      debePagar = (tiempo*100);
    } else if (tiempo<=8) {
      debePagar = ((tiempo-5)*80+500);
    } else if (tiempo<=10) {
      debePagar = ((tiempo-8)*70+240+500);
    } else if (tiempo>10) {
      debePagar = ((tiempo-10)*50+140+240+500);
    }
    if (domingo.equalsIgnoreCase("s")) {
      impuesto = ((debePagar/100)*3);
    } else if (horario.equalsIgnoreCase("m")) {
      impuesto = ((debePagar/100)*15);
    } else if (horario.equalsIgnoreCase("t")) {
      impuesto = ((debePagar/100)*10);
    }
    // Muestro el resultado
    System.out.println("Precio base: " + (debePagar/100) + "€.");
    System.out.println("Impuesto: " + (impuesto/100) + "€.");
    System.out.println("Precio total: " + ((debePagar+impuesto)/100) + "€.");
    s.close();
  }
}