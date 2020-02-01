package ejSecuenciales;

/**
 * 2. Calcular el perí­metro y área de un rectángulo dada su base y su altura.
 * 
 * Algoritmo
 * Pido el ancho y el alto y los meto en una variable.
 * Hago los cálculos y los meto en una variable.
 * Imprimo por pantalla los resultados.
 * 
 * Variables:
 * anchoS: El ancho del rectángulo (String)
 * altoS: El alto del rectángulo (String)
 * ancho: El ancho del rectángulo (double)
 * alto: El alto del rectángulo (double)
 * 
 * @author Rafael Alberto Caballero Osuna
 */

public class ej2 {
    public static void main(String[] args) {
        // Defino las variables
        String anchoS;
        String altoS;
        double ancho;
        double alto;

        // Pido el ancho y el alto
        System.out.print("Introduce el ancho del rectángulo: ");
        anchoS = System.console().readLine();
        System.out.print("Introduce el alto del rectángulo: ");
        altoS = System.console().readLine();

        // Convierto a double
        ancho = Double.parseDouble(anchoS);
        alto = Double.parseDouble(altoS);

        // Muestro el resultado
        System.out.println("El perímetro del rectángulo es " + 2*(ancho+alto));
        System.out.println("El área del rectángulo es " + ancho*alto);
    }
}