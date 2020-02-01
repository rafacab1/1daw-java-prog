package ejSecuenciales;

/**
 * 14. Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número invertido.
 *
 * Algoritmo
 * Pido el número
 * Saco el resto de dividir n entre 10, lo multiplico por 10 y le sumo lo que de n entre 10.
 * Muestro el resultado
 * 
 * Variables:
 * nS : Número (String)
 * n : Número (int)
 * ni : Número invertido (int)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
public class ej14{
  public static void main(String[] args) {
    // Defino las variables
    String nS;
    int n;
    int ni;

    // Pido el número
    System.out.print("Introduce un número de dos cifras: ");
    nS = System.console().readLine();

    // Lo paso a Int
    n = Integer.parseInt(nS);

    // Los invierto
    ni = ((n%10)*10+(n/10));

    // Muestro el número invertido
    System.out.println(ni);
  }
}