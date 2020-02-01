package ejnAleatoriosArrays;

public class Ej550aleatorios {
  /*
   * 5. Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
   * separados por espacios. Muestra también el máximo, el mínimo, la moda, la
   * media, la mediana y la desviación típica.
   * 
   * Algortimo
   * Genero los números aleatorios y los guardo
   * Si el número es mayor que el máximo actual, renuevo el máximo
   * Si el número es menor que el mínimo actual, renuevo el mínimo
   * Voy sumando todos los valores del array en una variable, la divido entre 50 y ya tengo
   * la media.
   * Ahora calculo la varianza para la desviación típica,
   * en una variable meto los números-media, y después los elevo al cuadrado
   * Sumo todos y los divido entre 50, ya tengo la varianza, y para obtener la 
   * desviación típica calculo la raíz cuadrada de la varianza. 
   * 
   * 
   * Variables:
   * num : Números generados aleatorios (int) (array)
   * max : Número máximo (int)
   * min : Número mínimo (int)
   * suma : Todos los números sumados (int)
   * media : La media de todos los números del array (double)
   * moda : La moda de los aleatorios (int)
   * num0 : Aleatorios ordenados (int) (array)
   * menosMedia2: Números del array menos la media y elevados al cuadrado (int) (array)
   * sumaVarianza : La suma de todos los números de menosMedia2 (int)
   * varianza : Resultado de la varianza (double)
   * desviacion : Resultado de la desviación (double) 
   * 
   * @author Rafael Alberto Caballero Osuna
   */

  public static void main(String[] args) {
    int[] num;
    num = new int[50];
    /* int[] num0;
    num0 = new int[50]; */
    int max = 100;
    int min = 199;
    int suma = 0;
    double[] menosMedia2;
    menosMedia2 = new double[50];
    int sumaVarianza = 0;
    double varianza = 0;
    double desviacion = 0;
    
    
    // Genero los números aleatorios
    for (int i=0;i<=49;i++) {
      num[i] = (int) (Math.random()*100+100);
      System.out.print(num[i] + " ");
    }
    
    
    
    // Calcular máximo y mínimo
    for (int i=0;i<=49;i++) {
      if (num[i]>max) {
        max = num[i];
      }
      if (num[i]<min) {
        min = num[i];
      }
    }
    
    
    
    // Calcular la media
    for (int i=0;i<=49;i++) {
      suma += num[i];
    }
    double media = (suma/50);
    
    
    
    // Calcular la moda (SIN HACER)
    /* int moda = 0;
    for (int i=0;i<=49;i++) {
      for (int j=49;j>=0;j--) {
        if (num[i]==num[j]) {
          moda = num[i];
        }
      }
    } */
    
    
    
    // Calcular la mediana (SIN HACER)
    // Ordeno de menor a mayor
    /* for (int i=0;i<=49;i++) {
      for (int j=0;j<=49-j-1;j++) {
          if(num[i] < num[i+1]){
              num0[i] = num[i+1];
          }
      }
    } */
    
    
    
    // Calcular la desviación típica
    // Primero calculo la varianza
    for (int i=0;i<=49;i++) {
      menosMedia2[i] = (num[i]-media);
      menosMedia2[i] = Math.pow(menosMedia2[i], 2);
    }
    for (int i=0;i<=49;i++) {
      sumaVarianza += menosMedia2[i];
    }
    varianza = sumaVarianza/50;
    // Ahora calculo la desviación típica
    desviacion = Math.sqrt(varianza);
    
    
    
    System.out.println("\nEl número mas grande generado es el " + max);
    System.out.println("El número mas pequeño generado es el " + min);
    System.out.println("La media es " + media);
    // System.out.println("La moda es " + moda);
    // System.out.println("La mediana es " + );
    System.out.println("La desviación típica es " + desviacion);
  }
}
