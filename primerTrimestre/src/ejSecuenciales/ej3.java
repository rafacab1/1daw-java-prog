package ejSecuenciales;

/**
 * 3. Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
 * 
 * Algoritmo
 * Pido los catetos
 * Hago los cálculos
 * Imprimo por pantalla los resultados.
 * 
 * Variables:
 * c1S: Cateto 1 (String)
 * c2S: Cateto 2 (String)
 * c1: Cateto 1 (double)
 * c2: Cateto 2 (double)
 * 
 * @author Rafael Alberto Caballero Osuna
 */

 public class ej3 {
     public static void main(String[] args) {
        // Defino las variables
        String c1S;
        String c2S;
        double c1;
        double c2;

        // Pido los catetos
        System.out.print("Introduce el cateto 1: ");
        c1S = System.console().readLine();
        System.out.print("Introduce el cateto 2: ");
        c2S = System.console().readLine();

        // Paso a double
        c1 = Double.parseDouble(c1S);
        c2 = Double.parseDouble(c2S);

        // Muestro el resultado
        System.out.println("La hipotenusa es: " + Math.sqrt(Math.pow(c1, 2)+Math.pow(c2, 2)));
     }
 }