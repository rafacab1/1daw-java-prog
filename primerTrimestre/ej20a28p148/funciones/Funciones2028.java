package funciones;

/**
 * Funciones de los ejercicios 20 a 28 de la página 148 del libro "Aprende Java
 * con Ejercicios"
 * 
 * @author rafacab1
 *
 */

public class Funciones2028 {
  
  /**
   * 1. Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo
   * y máximo) se indica como parámetro.
   * 
   * Algoritmo 
   * Creo un array Recorro el array y en cada entrada guardo un número
   * aleatorio Devuelvo el array
   * 
   * Variables 
   * n = Longitud del array (int) 
   * minimo = Número mínimo a generar (int)
   * maximo = Número máximo a generar (int) 
   * array_int = Array de enteros
   * 
   * @param n : Longitud del array
   * @param minimo : Número mínimo a generar
   * @param maximo : Número máximo a generar
   * @return arrayInt : Array con los números aleatorios
   */
  
  public static int[] generaArrayInt(int n, int minimo, int maximo) {
    int[] arrayInt;
    arrayInt = new int[n];
    
    for (int i=0;i<n;i++) {
      arrayInt[i] = (int)(Math.random()*(minimo-maximo+1)+maximo);
    }
    return arrayInt;
  }
  
  /**
   * 2. Devuelve el mínimo del array que se pasa como parámetro.
   * 
   * Algortimo
   * Recorro el array, comparándolo con el anterior mínimo, si la posición en la
   * que estoy del array es menor, actualizo la variable que contiene el mínimo
   * 
   * Variables 
   * array = Array pasado como parámetro 
   * minimo = Número mínimo (int)
   * 
   * @param array : Array dado a la función
   * @return minimo : Número mínimo encontrado en el array
   */
  public static int minimoArrayInt(int[] array) {
    int minimo = 9999999;
    for (int i=0;i<array.length;i++) {
      if (array[i]<=minimo) {
        minimo = array[i];
      }
    }
    return minimo;
  }
  
  /**
   * 3. Devuelve el máximo del array que se pasa como parámetro.
   * 
   * Algoritmo
   * Recorro el array, comparándolo con el anterior maximo, si la posición en la
   * que estoy del array es mayor, actualizo la variable que contiene el máximo
   * 
   * Variables 
   * array = Array pasado como parámetro 
   * maximo = Número maximo (int)
   * 
   * @param array : Array dado a la función
   * @return maximo : Número ḿaximo encontrado en el array
   */
  public static int maximoArrayInt(int[] array) {
    int maximo = -9999999;
    for (int i=0;i<array.length;i++) {
      if (array[i]>=maximo) {
        maximo = array[i];
      }
    }
    return maximo;
  }
  
  /**
   * 4. Devuelve la media del array que se pasa como parámetro.
   * 
   * Algortimo 
   * Recorro el array y voy sumando todo en una variable Devuelvo el
   * resultado de la división de la variable entre la longitud del array
   * 
   * Variables 
   * array : Array introducido por el usuario 
   * sumatorio : Contiene la suma de todos los números del array (double)
   * 
   * @param array : Array dado a la función
   * @return sumatorio/array.length Resultado de la media
   */
  public static double mediaArrayInt(int[] array) {
    double sumatorio = 0;
    for (int i=0;i<array.length;i++) {
      sumatorio += array[i];
    }
    return sumatorio/array.length;
  }
  
  /**
   * 5. Dice si un número está o no dentro de un array.
   * 
   * Algoritmo 
   * Recorro el array, si el número del array es igual que el número
   * introducido, marco que si que está en una variable, la función devuelve esta
   * última variable
   * 
   * Variables 
   * esta = Controla si el número está en el array (boolean) 
   * array = Array introducido por el usuario 
   * numero = Número introducido por el usuario
   * 
   * @param array : Array dado a la función
   * @param n : Número a buscar en el array
   * @return esta : boolean que dice si el número está o no en el array
   * 
   */
  public static boolean estaEnArrayInt(int[] array, int n) {
    boolean esta = false;
    for (int i=0;i<array.length;i++) {
      if (array[i]==n) {
        esta = true;
      }
    }
    return esta;
  }
  
  /**
   * 6. Busca un número en un array y devuelve la posición (el índice) en la que
   * se encuentra.
   * 
   * Algoritmo 
   * Recorro el array y comparo el número con la posición actual del
   * array, si es igual, guardo la posición en una variable.
   * 
   * Variables 
   * array : Array introducido por el usuario 
   * numero : Número introducido por el usuario (int) 
   * pos : Posición del número en el array (int)
   * 
   * @param array : Array dado a la función
   * @param numero : Número del cual queremos saber su posición
   * @return pos : Posición de numero en el array
   * 
   */
  public static int posicionEnArray(int[] array, int numero) {
    int pos = -1;
    for (int i=0;i<array.length;i++) {
      if (array[i]==numero) {
        pos = i;
      }
    }
    return pos;
  }
  
  /**
   * 7. Le da la vuelta a un array
   * 
   * Algoritmo 
   * Recorro el array, y voy guardando en las últimas posiciones del
   * array volteado el número actual del ciclo del array principal, devuelvo el
   * array volteado.
   * 
   * Variables 
   * array : Array introducido por el usuario 
   * arrayVolt : Array volteado
   * 
   * @param array : Array dado a la función
   * @returnn arrayVolt : Array volteado
   */
  public static int[] volteaArrayInt(int[] array) {
    int[] arrayVolt;
    arrayVolt = new int[array.length];
    for (int i=0;i<array.length;i++) {
      arrayVolt[(array.length-1)-i] = array[i];
    }
    return arrayVolt;
  }
  
  /**
   * 8. Rota n posiciones a la derecha los números de un array.
   * 
   * Algoritmo 
   * Recorro el array, si la suma de i y las posiciones a rotar son
   * iguales o mayores que la longitud del array, meto los números al principio
   * del array (si no, no volvería a empezar por la izquierda). En el caso de que
   * esa condición fuese falsa, mete los números en la posición i + posiciones a
   * rotar.
   * 
   * Variables 
   * array : Array introducido por el usuario
   *  n : Número de posiciones a rotar 
   *  j : Contador para volver a empezar el array por el principio 
   *  arrayDcha : Array rotado a la derecha
   *  
   *  @param array : Array dado a la función
   *  @param n : Posiciones a rotar a la derecha
   *  @return arrayDcha : Array rotado a la derecha
   */
  public static int[] rotaDerechaArrayInt(int[] array, int n) {
    int[] arrayDcha;
    arrayDcha = new int[array.length];
    int j = -1;
    
    for (int i=0;i<array.length;i++) {
      if (i+n>=array.length) {
        j++;
        arrayDcha[1*j] = array[i];
      } else {
        arrayDcha[i+n] = array[i];
      }
    }
    return arrayDcha;
  }
  
  /**
   * 9. Rota n posiciones a la izquierda los números de un array.
   * 
   * Algoritmo 
   * Volteo el array Aprovecho la función anterior de rotar a la
   * derecha, lo roto hacia la derecha Vuelvo a voltear el array Devuelvo el array
   * 
   * Variables 
   * array : Array introducido por el usuario
   *  n : Posiciones a rotar
   * aVolt : Array volteado 
   * arrayIzda : Array rotado
   */
  public static int[] rotaIzquierdaArrayInt(int[] array, int n) {
    int[] aVolt = new int[array.length];
    int[] arrayIzda = new int[array.length];
    
    aVolt = volteaArrayInt(array);
    arrayIzda = volteaArrayInt(rotaDerechaArrayInt(aVolt, n));
    return arrayIzda;
    
  }
}
