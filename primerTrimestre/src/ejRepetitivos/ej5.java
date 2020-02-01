package ejRepetitivos;

/**
* 5. Escribe un programa que pida el limite inferior y superior de un intervalo. 
* Si el límite inferior es mayor que el superior lo tiene que volver a pedir. 
* A continuación se van introduciendo números hasta que introduzcamos el 0. Cuando termine el programa dará las siguientes informaciones:
*	La suma de los números que están dentro del intervalo (intervalo abierto).
*	Cuantos números están fuera del intervalo.
*	Informa si hemos introducido algún número igual a los límites del intervalo.
*
*
* @author Rafael Alberto Caballero Osuna
* 
* Algoritmo
* Pido los límites
* Mientras el límite inferior sea mayor que el superior, pido los límites de nuevo.
* Defino las variables que cuentan los números y la del mismo número
* Mientras el número no sea 0...
*   Pido un número
*   Si es 0, muestro el resultado de los contadores
*   Si es menor que el superior y mayor que el inferior, sumo uno en dentro
*   Si es menor que el inferior o mayor que el superior, sumo uno en fuera
*   Si es igual que el inferior o igual que el superior, sumo uno en igual
* 
* Variables
* sup = Límite superior (int)
* inf = Límite inferior (int)
* num = Número introducido (int)
* dentro = Números dentro del intervalo (int)
* fuera = Números fuera del intervalo (int)
* igual = Números iguales al intervalo (int)
* 
*/
import java.util.Scanner;
public class ej5 {
 public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
  
   System.out.println("Programa que pide un intervalo y luego pide números. Muestra cuantos números estan dentro, fuera o iguales al intervalo.");
   System.out.println("Para salir, introduzca un 0.");

   // Pido los límites
   System.out.print("\nIntroduce el límite superior: ");
   int sup = s.nextInt();
   System.out.print("Introduce el límite inferior: ");
   int inf = s.nextInt();

   // En el caso de que el límite inferior sea mayor que el superior...
   while (inf>sup) {
    System.out.println("\nEl límite inferior no puede ser mayor que el límite superior. Introduce los datos de nuevo.");
    System.out.print("\nIntroduce el límite superior: ");
    sup = s.nextInt();
    System.out.print("Introduce el límite inferior: ");
    inf = s.nextInt();
   }

   // Declaro variables
   int num = 1;
   int dentro = 0;
   int fuera = 0;
   int igual = 0;

   //  Mientras que no sea 0, que será cuando el bucle acabe
   while (num!=0) {
      System.out.print("Introduce un número: ");
      num = s.nextInt();

      if (num==0) {
        System.out.println("\nHas introducido " + dentro + " números dentro del intervalo, " + fuera + " número fuera del intervalo y " + igual + " números iguales que los límites.");
        System.out.println("Saliendo...");
      }
      if (num<sup && num>inf) {
        dentro++;
      } else if (num<inf || num>sup) {
        fuera++;
      } else if (num==inf || num==sup) {
        igual++;
      }
   }
   s.close();
 }
}