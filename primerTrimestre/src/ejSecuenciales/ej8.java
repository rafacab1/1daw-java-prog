package ejSecuenciales;

/**
 * 8. Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, 
 * el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las 
 * tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta
 * su sueldo base y comisiones.
 * 
 * Algoritmo
 * Pido el salario base
 * Hago los cálculos y muestro los resultados
 * 
 * Variables:
 * sbS : Salario base (String)
 * v1S : Ventas 1 (String)
 * v2S : Ventas 2 (String)
 * v3S : Ventas 3 (String)
 * sb : Salario base (double)
 * v1 : Ventas 1 (double)
 * v2 : Ventas 2 (double)
 * v3 : Ventas 3 (double)
 * comision : Comisión (double)
 * 
 * @author Rafael Alberto Caballero Osuna
 */
public class ej8 {
  public static void main(String[] args) {
    // Defino las variables
    String sbS;
    String v1S;
    String v2S;
    String v3S;
    double sb;
    double v1;
    double v2;
    double v3;
    double comision;

    // Pido los datos
    System.out.print("Introduce tu salario base: ");
    sbS = System.console().readLine();
    System.out.print("Introduce el precio de la venta 1: ");
    v1S = System.console().readLine();
    System.out.print("Introduce el precio de la venta 2: ");
    v2S = System.console().readLine();
    System.out.print("Introduce el precio de la venta 3: ");
    v3S = System.console().readLine();
    
    // Paso a double
    sb = Double.parseDouble(sbS);
    v1 = Double.parseDouble(v1S);
    v2 = Double.parseDouble(v2S);
    v3 = Double.parseDouble(v3S);

    // Calculo la comisión
    comision = ((v1*0.1)+(v2*0.1)+(v3*0.1));

    // Muestro los resultados
    System.out.println("Comisión por ventas: " + comision + "€");
    System.out.println("Sueldo total: " + (sb+comision) + "€");
  }
}