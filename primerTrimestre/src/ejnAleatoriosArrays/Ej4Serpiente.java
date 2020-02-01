package ejnAleatoriosArrays;

import java.util.Scanner;

public class Ej4Serpiente {

  /*
   * 4. Realiza un programa que pinte por pantalla una serpiente con un
   * “serpenteo” aleatorio. La cabeza se representará con el carácter @ y se debe
   * colocar exactamente en la posición 13 (con 12 espacios delante). A partir de
   * ahí, el cuerpo irá serpenteando de la siguiente manera: se generará de forma
   * aleatoria un valor entre tres posibles que hará que el siguiente carácter se
   * coloque una posición a la izquierda del anterior, alineado con el anterior o
   * una posición a la derecha del anterior. La longitud de la serpiente se pedirá
   * por teclado y se supone que el usuario introducirá un dato correcto.
   * 
   * Algortimo
   * Pido la longitud de la serpiente
   * Imprimo la cabeza de la serpiente
   * Para la longitud de la serpiente...
   *  Genero un número aleatorio entre 0 y 2
   *  Si es 0, le resto uno a una variable que cuente cuantas veces tiene que repetir: imprimir espacio
   *  Si es 1, repite imprimir espacio las veces que tenga la variable
   *  Si es 2, le sumo uno a la variable que cuenta y repito imprimir espacio
   *  Una vez haga estas condiciones, imprimo una * en la misma línea
   * 
   * Variables:
   * posicion = Espacios a imprimir (int)
   * longitud = Longitud de la serpiente (int)
   * movimiento = Número aleatorio (int)
   * 
   * @author Rafael Alberto Caballero Osuna
   */

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int posicion = 13;

    // Pido la longitud de la serpiente.
    System.out.print("Introduce la longitud de la serpiente: ");
    int longitud = s.nextInt();

    // Imprimo la cabeza (fija) de la serpiente.
    System.out.print("            @");

    for (int i=1;i<=longitud;i++) {
        // Genero el número que dirá la posición de la parte del cuerpo.
        int movimiento = (int) (Math.random()*3);
        if (movimiento==0) {
          posicion--;
          System.out.println();
          for (int j=1;j<=posicion;j++) {
            System.out.print(" ");
          }
        } else if (movimiento==1) {
          System.out.println();
          for (int k=1;k<=posicion;k++) {
            System.out.print(" ");
          }
        } else if (movimiento==2) {
          posicion++;
          System.out.println();
          for (int l=1;l<=posicion;l++) {
            System.out.print(" ");
        } 
      }
      System.out.print("*");
  }
  s.close();
  }
}
