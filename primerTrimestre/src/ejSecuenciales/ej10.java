package ejSecuenciales;

/**
 * 10. Un alumno desea saber cual será su calificación final en la materia de Algoritmos. 
 * Dicha calificación se compone de los siguientes porcentajes:
 *
 * 55% del promedio de sus tres calificaciones parciales.
 * 30% de la calificación del examen final.
 * 15% de la calificación de un trabajo final.
 *
 * Algoritmo
 * Pido el todas las notas
 * Calculo la media
 * Calculo los procentajes
 * Sumo todo y muestro el resultado por pantalla
 * 
 * Variables:
 * c1S, c2S, c3S : Calificaciones parciales (String)
 * efS : Calificación examen final (String)
 * tfS : Calificación trabajo final (String)
 * ef : Calificación examen final (double)
 * tf : Calificación trabajo final (double)
 * c1, c2, c3 : Calificaciones parciales (double)
 * mediac : Media calificaciones parciales (double)
 * pc : Parte porcentual correspondiente a calificaciones parciales (double)
 * ec : Parte porcentual correspondiente a examen final (double)
 * tc : Parte porcentual correspondiente a trabajo final (double)
 * total : Calificación final (double)
 * 
 * 
 * @author Rafael Alberto Caballero Osuna
 */
public class ej10 {
  public static void main(String[] args) {
    // Defino las variables
    String c1S;
    String c2S;
    String c3S;
    String efS;
    String tfS;
    double c1;
    double c2;
    double c3;
    double ef;
    double tf;
    double mediac;
    double pc;
    double ec;
    double tc;
    double total;

    // Pido los datos
    System.out.print("Introduce la primera calificación parcial: ");
    c1S = System.console().readLine();
    System.out.print("Introduce la segunda calificación parcial: ");
    c2S = System.console().readLine();
    System.out.print("Introduce la tercera calificación parcial: ");
    c3S = System.console().readLine();
    System.out.print("Introduce tu calificación en el examen final: ");
    efS = System.console().readLine();
    System.out.print("Introduce tu calificación en el trabajo final: ");
    tfS = System.console().readLine();

    // Los paso a double
    c1 = Double.parseDouble(c1S);
    c2 = Double.parseDouble(c2S);
    c3 = Double.parseDouble(c3S);
    ef = Double.parseDouble(efS);
    tf = Double.parseDouble(tfS);

    // Calculo la media
    mediac = ((c1+c2+c3)/3);

    // Calculo las partes
    pc = (mediac*55/100);
    ec = (ef*30/100);
    tc = (tf*15/100);

    // Calculo el total
    total = (pc+ec+tc);

    // Muestro el resultado
    System.out.println("Tu nota final es " + total);
  }
}