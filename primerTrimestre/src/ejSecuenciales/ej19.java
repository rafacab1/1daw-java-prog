package ejSecuenciales;

/**
 * 19. Escribir un algoritmo para calcular la nota final de un estudiante, 
 * considerando que por cada respuesta correcta 5 puntos, por una incorrecta -1 
 * y por respuestas en blanco 0. Imprime el resultado obtenido por el estudiante.
 *
 * Algoritmo
 * Pregunto cuantas respuestas correctas, incorrectas y en blanco ha tenido.
 * Multiplico el número de correctas por 5, el número de incorrectas por -1 y el número de preguntas 
 * en blanco por 0.
 * Muestro el resultado
 * 
 * Variables:
 * correctasS : Preguntas correctas (String)
 * incorrectasS : Preguntas incorrectas (String)
 * blancoS : Preguntas en blanco (String)
 * correctas : Preguntas correctas (int)
 * incorrectas : Preguntas incorrectas (int)
 * blanco : Preguntas en blanco (int)
 * resultado : Puntuación final (int)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
public class ej19{
  public static void main(String[] args){
    // Defino las variables
    String correctasS;
    String incorrectasS;
    String blancoS;
    int correctas;
    int incorrectas;
    int blanco;
    int resultado;

    // Pido los datos
    System.out.print("¿Cuántas respuestas correctas has tenido?: ");
    correctasS = System.console().readLine();
    System.out.print("¿Cuántas respuestas incorrectas has tenido?: ");
    incorrectasS = System.console().readLine();
    System.out.print("¿Cuántas respuestas has dejado sin contestar?: ");
    blancoS = System.console().readLine();

    // Los paso a int
    correctas = Integer.parseInt(correctasS);
    incorrectas = Integer.parseInt(incorrectasS);
    blanco = Integer.parseInt(blancoS);

    // Calculo cuantos puntos tiene
    resultado = ((correctas*5)-(incorrectas*-1)+(blanco*0));

    // Muestro el resultado
    System.out.println("En total tienes " + resultado + " puntos.");
  }
}