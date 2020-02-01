package ejnAleatoriosArrays;

import java.util.Scanner;

public class Ej1Quiniela {
  /**
   * 1. Escribe un programa que muestre tres apuestas de la quiniela en tres
   * columnas para los 14 partidos y el pleno al quince (15 filas) de forma que la
   * probabilidad de que salga un 1 sea de 1/2, la probabilidad de que salga x sea
   * de 1/3 y la probabilidad de que salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 =
   * 2/6.
   * 
   * Algoritmo: Pido el pronóstico de los partidos, con un bucle y que lo vaya
   * guardando en un array. Decido el resultado del partido, en el rango entre dos
   * de las probabilidades, y guardo como correcto el resultado Si el pronóstico y
   * el resultado concuerdan, doy acierto, si no, miro cual es el ganador y doy no
   * acierto y el resultado.
   * 
   * Variables: pronostico : Pronóstico del jugador (char) acierto1 : Resultados
   * equipo 1 (String array) aciertox : Resultados empate (String array) acierto2
   * : Resultados equipo 2 (String array)
   * 
   * 
   * @author Rafael Alberto Caballero Osuna
   *
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    // Defino el array que contiene los pronósticos de la quiniela
    char[] pronostico;
    pronostico = new char[16];

    // Defino los arrays que contendrán los resultados
    String[] acierto1;
    acierto1 = new String[16];
    String[] aciertox;
    aciertox = new String[16];
    String[] acierto2;
    acierto2 = new String[16];

    for (int i = 1; i <= 15; i++) {
      System.out.print("Introduce el pronóstico para el partido " + i + ": ");
      pronostico[i] = s.next().charAt(0);
      double random = (int) (Math.random()*6 + 1); // Genero el número aleatorio

      if (random >= 1 && random <= 3) { // Decido el resultado
        acierto1[i] = "Correcto";
        aciertox[i] = "no";
        acierto2[i] = "no";
      } else if (random >= 4 && random <= 5) {
        aciertox[i] = "Correcto";
        acierto1[i] = "no";
        acierto2[i] = "no";
      } else if (random == 6) {
        acierto2[i] = "Correcto";
        aciertox[i] = "no";
        acierto1[i] = "no";
      }

    }

    System.out.println("___RESULTADOS___\n");
    for (int i = 1; i <= 15; i++) {

      if (acierto1[i] == "Correcto" && aciertox[i] == "no" && acierto2[i] == "no" && pronostico[i] == '1') {
        System.out.println("Partido " + i + ": " + pronostico[i] + " ACIERTO.");
      } else if (aciertox[i] == "Correcto" && acierto1[i] == "no" && acierto2[i] == "no" && pronostico[i] == 'x') {
        System.out.println("Partido " + i + ": " + pronostico[i] + " ACIERTO.");
      } else if (acierto2[i] == "Correcto" && acierto1[i] == "no" && aciertox[i] == "no" && pronostico[i] == '2') {
        System.out.println("Partido " + i + ": " + pronostico[i] + " ACIERTO.");
      } else {
        if (acierto1[i] == "Correcto") {
          System.out.println("Partido " + i + ": " + pronostico[i] + " NO ACIERTO. Resultado: 1");
        } else if (aciertox[i] == "Correcto") {
          System.out.println("Partido " + i + ": " + pronostico[i] + " NO ACIERTO. Resultado: x");
        } else if (acierto2[i] == "Correcto") {
          System.out.println("Partido " + i + ": " + pronostico[i] + " NO ACIERTO. Resultado: 2");
        }

      }
    }
    s.close();
  }
}

