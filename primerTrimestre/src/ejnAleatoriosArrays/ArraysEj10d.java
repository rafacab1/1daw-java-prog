package ejnAleatoriosArrays;

public class ArraysEj10d {
  /*
   * 10. Escribe un programa que genere 20 números enteros aleatorios entre 0 y
   * 100 y que los almacene en un array. El programa debe ser capaz de pasar todos
   * los números pares a las primeras posiciones del array (del 0 en adelante) y
   * todos los números impares a las celdas restantes. Utiliza arrays auxiliares
   * si es necesario.
   * 
   * Algortimo
   * Genero números aleatorios y los guardo
   * Si el número aleatorio es par lo guardo en otro array
   * Si es impar, lo guardo en otro array
   * Coloco los números pares en el primer array, machacando los anteriores
   * Después, coloco los impares
   *
   * 
   * Variables
   * num : Números aleatorios (int) (array)
   * numPar : Números aleatorios pares (int) (array)
   * numImpar : Números aleatorios impares (int) (array)
   * contadorPar : Lleva la cuenta de los pares para ir guardándolos en numPar (int)
   * contadorImpar : Lleva la cuenta de los impares para ir guardándolos en numImpar (int)
   * 
   * @author Rafael Alberto Caballero Osuna
   */
  public static void main(String[] args) {
    int[] num;
    num = new int[20];
    int[] numPar;
    numPar = new int[20];
    int[] numImpar;
    numImpar = new int[20];
    int contadorPar = 0;
    int contadorImpar = 0;
    
    // Genero números aleatorios y los guardo
    for (int i=0;i<=19;i++) {
      num[i] = (int) (Math.random()*100);
      }
    
    // Clasifico en pares e impares
    for (int i=0;i<=19;i++) {
      if (num[i]%2==0) {
        numPar[contadorPar] = num[i];
        contadorPar++;
      } else {
        numImpar[contadorImpar] = num[i];
        contadorImpar++;
      }
    }
    
    // Meto los pares en el primer array
    for (int i=0;i<=contadorPar;i++) {
      num[i] = numPar[i];
    }
    
    // Meto los impares después de los pares
    for (int i=contadorPar;i<=19;i++) {
      num[i] = numImpar[i-contadorPar];
    }
    
    // Muestro por pantalla el array ya ordenado
    for (int i=0;i<=19;i++) {
      System.out.print(num[i] + " ");
    }
    }
    
  }