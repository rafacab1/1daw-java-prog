package ejSecuenciales;
/**
 * 17. Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. 
 * El tiempo de viaje hasta llegar a otra ciudad B es de T segundos. 
 * Escribir un algoritmo que determine la hora de llegada a la ciudad B.
 *
 * Algoritmo
 * Pido la hora, minuto, segundo de salida y los segundos que tarda en llegar a B.
 * Lo paso todo a segundos
 * Sumo a esos segundos lo que tarda en llegar a B
 * Lo paso todo a horas, minutos y segundos y muestro el resultado por pantalla
 * 
 * Variables:
 * horaSalidaS : Hora de salida (String)
 * minutoSalidaS : Minuto de salida (String)
 * segundoSalidaS : Segundo de salida (String)
 * tiempoSegS : Segundos que tarda en llegar (String)
 * horaSalida : Hora de salida (int)
 * minutoSalida : Minuto de salida (int)
 * segundoSalida : Segundo de salida (int)
 * tiempoSeg : Segundos que tarda en llegar (int)
 * tsegs : Hora, minuto y segundo de salida en segundos (int)
 * totalSeg : Segundos totales (segundos salida + segundos que tarda) (int)
 * horaLl : Hora de llegada (int)
 * minutoLl : Minuto de llegada (int)
 * segLl : Segundo de llegada (int)
 * 
 * 
 * @author Rafael Alberto Caballero Osuna
 */
public class ej17{
  public static void main(String[] args){
    // Defino las variables
    String horaSalidaS;
    String minutoSalidaS;
    String segundoSalidaS;
    String tiempoSegS;
    int horaSalida;
    int minutoSalida;
    int segundoSalida;
    int tiempoSeg;
    int tsegs;
    int totalSeg;
    int horaLl;
    int minutoLl;
    int segLl;

    // Pido los datos
    System.out.print("Introduce la hora de salida: ");
    horaSalidaS = System.console().readLine();
    System.out.print("Introduce el minuto de salida: ");
    minutoSalidaS = System.console().readLine();
    System.out.print("Introduce el segundo de salida: ");
    segundoSalidaS = System.console().readLine();
    System.out.print("¿Cuántos segundos has tardado en llegar a B?: ");
    tiempoSegS = System.console().readLine();

    // Los paso a int
    horaSalida = Integer.parseInt(horaSalidaS);
    minutoSalida = Integer.parseInt(minutoSalidaS);
    segundoSalida = Integer.parseInt(segundoSalidaS);
    tiempoSeg = Integer.parseInt(tiempoSegS);

    // Paso la hora, minuto y segundo de salida a segundos
    tsegs = ((horaSalida*3600)+(minutoSalida*60)+segundoSalida);

    // Lo sumo con el total de segundos que tarda
    totalSeg = (tiempoSeg+tsegs);

    // Paso el total a horas, minutos y segundos
    horaLl = (totalSeg/3600);
    minutoLl = ((totalSeg%3600)/60);
    segLl = ((totalSeg%3600)%60);

    // Muestro el resultado
    System.out.println("Llegas a B a las " + horaLl + " horas, " + minutoLl + " minutos y " + segLl + " segundos.");
  }
}