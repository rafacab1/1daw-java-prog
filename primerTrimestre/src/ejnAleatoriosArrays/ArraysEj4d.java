package ejnAleatoriosArrays;

public class ArraysEj4d {
  /*
   * 4. Define tres arrays de 20 números enteros cada una, con nombres numero,
   * cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100.
   * En el array cuadrado se deben almacenar los cuadrados de los valores que hay
   * en el array numero. En el array cubo se deben almacenar los cubos de los
   * valores que hay en numero. A continuación, muestra el contenido de los tres
   * arrays dispuesto en tres columnas.
   * 
   * Algortimo
   * Creo los arrays
   * En el array numero voy metiendo los números aleatorios
   * En el array cuadrado voy metiendo los resultados de los números de numero elevado a 2
   * En el array cubo voy metiendo los resultados de los números de numero elevado a 3
   * Imprimo todo por pantalla
   *
   * 
   * Variables
   * numero : Números aleatorios generados por la máquina (int) (array)
   * cuadrado : Resultado de numero elevado a dos (int) (array)
   * cubo : Resultado de numero elevado a tres (int) (array)
   * 
   * 
   * @author Rafael Alberto Caballero Osuna
   */

  public static void main(String[] args) {
    // Creo los arrays
    int[] numero;
    numero = new int[20];

    int[] cuadrado;
    cuadrado = new int[20];

    int[] cubo;
    cubo = new int[20];

    // Meto los valores aleatorios en el array numero
    for (int i = 0; i <= 19; i++) {
      numero[i] = (int) (Math.random() * 100);
    }

    // Meto los cuadrados de los aleatorios en el array cuadrado
    for (int i = 0; i <= 19; i++) {
      cuadrado[i] = (int) (Math.pow(numero[i], 2));
    }

    // Meto los cubos de los aleatorios en el array cubo
    for (int i = 0; i <= 19; i++) {
      cubo[i] = (int) (Math.pow(numero[i], 3));
    }

    // Imprimo los resultados
    System.out.println("NÚMERO | CUADRADO | CUBO");
    for (int i = 0; i <= 19; i++) {
      System.out.print("\n" + numero[i] + " " + cuadrado[i] + " " + cubo[i]);
    }
  }

}
