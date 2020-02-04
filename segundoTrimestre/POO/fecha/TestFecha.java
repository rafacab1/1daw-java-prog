package fecha;
import javax.swing.JOptionPane;

public class TestFecha {

  public static void main(String[] args) {
    int day = Integer.parseInt(JOptionPane.showInputDialog("Introduce el día."));
    int month = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes."));
    int year = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año."));

    Fecha f1 = new Fecha(day, month, year);
    JOptionPane.showMessageDialog(null, "Creado objeto Fecha f1 con: " + f1);
    
    int daysSum = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos días quieres sumar a " + f1));
    Fecha nFecha = f1.sumaNDias(daysSum);
    JOptionPane.showMessageDialog(null, "La fecha resultante es " + nFecha + " \n La fecha original es: " + f1);
  }

}
