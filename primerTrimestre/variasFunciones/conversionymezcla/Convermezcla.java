package conversionymezcla;

public class Convermezcla {
  /**
   * Funciones de los ejercicios 47 y 50 del libro "Aprende Java con Ejercicios" 
   * 
   * @author Rafael Alberto Caballero Osuna
   */
  
  
  
  /**
   * 
   * 47. Esta función toma como parámetro un array que contiene números y devuelve una
   * cadena de caracteres con esos números. Por ejemplo, si a = { }, con-
   * vierteArrayEnString(a) devuelve “”; si a = { 8 }, convierteArrayEnString(a)
   * devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
   * “62501”. 
   * 
   * Algoritmo
   * Voy recorriendo el array y guardando todo en una variable de tipo cadena.
   * 
   * 
   * Variables almacen : Es donde se van guardando los enteros del array como
   * cadena
   * 
   * @param a : Array introducido por el usuario
   * @return almacen : Es donde se van guardando los enteros del array como cadena
   */
  
  
  public static String convierteArrayEnString(int[] a) {
    String almacen = "";
    for (int i=0;i<a.length;i++) {
      almacen += Integer.toString(a[i]);
    }
    return almacen;
  }
  
  
  /**
   * 50. Esta función toma dos arrays como parámetros y devuelve un array que es
   * el resultado de mezclar los números de ambos de forma alterna, se coge un
   * número de a, luego de b, luego de a, etc. Los arrays a y b pueden tener
   * longitudes diferentes; por tanto, si se terminan los números de un array se
   * terminan de coger todos los que quedan del otro.
   * 
   * Algoritmo
   * Mientras que un contador que tengo no sea igual que la longitud que tendrá el nuevo array (longitud de a + b)
   * Miro si el contador que incremento cada vez que meto algo es menor que el de cuando meto algo en el primer array, si lo es
   * añado la entrada del array al nuevo array, y igual para el caso del segundo array. Devuelvo el nuevo array.
   * 
   * 
   * Variables
   * nuevoArray : Nuevo array mezclado
   * cAr1 : Contador de números que llevo en array1
   * CAr2 : Contador de números que llevo en array2
   * contador : Contador de números que llevo en general
   * 
   * @param array1 
   * @param array2
   * @return nuevoArray Array mezclado
   * 
   */
  public static int[] mezcla(int[] array1, int[] array2) {
    int[] nuevoArray = new int[array1.length+array2.length];
    int cAr1 = 0;
    int cAr2 = 0;
    int contador = 0;
    
    while (contador < array1.length+array2.length) {
      if (cAr1<array1.length) {
        nuevoArray[contador++] = array1[cAr1++];
      }
      if (cAr2<array2.length) {
        nuevoArray[contador++] = array2[cAr2++];
      }
    }
    return nuevoArray;
    
  }
  
  
  
  // FUNCIÓN DE LA PRÁCTICA ANTERIOR, USADA PARA GENERAR ARRAYS ////////////////////////////
  
  /**
   * 
   * Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo
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
}
