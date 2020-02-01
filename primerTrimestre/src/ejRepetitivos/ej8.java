package ejRepetitivos;

/**
 * 8. Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.
 * Para hacer una espera en Python podemos usar el método sleep del módulo time.
 *
 * @author Rafael Alberto Caballero Osuna
 * 
 * Algoritmo
 * Defino unas variables a 0, para las horas, los minutos y los segundos.
 * Mientras que sea verdadero...
 *   Le sumo un segundo a los segundos
 *   Si los segundos son 60...
 *       Pongo los segundos a 0
 *       Sumo uno a los minutos
 *   Si los minutos son 60
 *       Pongo los minutos a 0
 *       Sumo uno a las horas
 *   Imprimo el resultado por pantalla
 *   Espero un segundo
 * 
 * Variables
 * seg = Segundos (int)
 * mins = Minutos (int)
 * hrs = Horas (int)
 *
 */
public class ej8 {
  public static void main(String[] args) {
    System.out.println("Programa que hace de cronómetro.");

    // Defino las variables
    int seg = 0;
    int mins = 0;
    int hrs = 0;

    while (true) {
      seg++; // Sumo un segundo
      if (seg==60) { // Cuando lleve 60 segundos, pongo los segundos a cero y sumo un minuto.
        seg = 0;
        mins++;
      }
      if (mins==60) { // Cuando lleve 60 minutos, pongo los minutos a 0 y sumo una hora
        mins = 0;
        hrs++;
      }
    System.out.println(hrs + ":" + mins + ":" + seg);
    try {
      Thread.sleep(1000);
    } catch(InterruptedException e) {
    }
  }
  // Echar vistazo a la revisión de este ejercicio (v2) con bucles for.
  /* Sobre instalación de paquetes:
  * Estructura de árbol de proyectos
  * org/iesgrancapitan/PROGR/ejercicios/ej02repetitivas;
  *
  * Podemos comentar la línea 1 y funcionará.
  */
  }
}