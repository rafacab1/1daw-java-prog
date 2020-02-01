package ejSecuenciales;

/**
 * 16. Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados por una distancia d. 
 * El que está detrás viaja a una velocidad mayor. Se pide hacer un algoritmo para ingresar la 
 * distancia entre los dos vehículos (km) y sus respectivas velocidades (km/h) y con esto determinar
 * y mostrar en que tiempo (minutos) alcanzará el vehículo más rápido al otro.
 *
 * Algoritmo
 * Pido la velocidad de los vehículos y la distancia entre ellos
 * Calculo la diferencia de velocidad
 * Divido la distancia entre la diferencia y lo multiplico por 60
 * Muestro el resultado
 * 
 * Variables:
 * v1S : Velocidad 1 (String)
 * v2S : Velocidad 2 (String)
 * distanciaS : Distancia entre los vehículos (String)
 * v1 : Velocidad 1 (double)
 * v2 : Velocidad 2 (double)
 * distancia : Distancia entre los vehículos (double)
 * tarda : Resultado de lo que tarda en alcanzar el vehículo mas lento al más rápido (double)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
public class ej16 {
  public static void main(String[] args) {
    // Defino las variables
    String v1S;
    String v2S;
    String distanciaS;
    double v1;
    double v2;
    double distancia;
    double tarda;

    // Pido los datos
    System.out.print("¿A que velocidad viaja el primer vehículo? (Más lento) ");
    v1S = System.console().readLine();
    System.out.print("¿A que velocidad viaja el segundo vehículo? (Más rápido) ");
    v2S = System.console().readLine();
    System.out.print("¿Distancia entre los dos vehículos? ");
    distanciaS = System.console().readLine();

    // Los paso a double
    v1 = Double.parseDouble(v1S);
    v2 = Double.parseDouble(v2S);
    distancia = Double.parseDouble(distanciaS);

    // Calculo cuanto tarda
    tarda = (60*distancia/(v2-v1));

    // Muestro el resultado
    System.out.println("El vehículo más rápido tarda " + tarda + " minutos en alcanzar al mas lento.");
  }
}