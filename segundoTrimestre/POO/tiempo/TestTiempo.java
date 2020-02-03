package tiempo;
import javax.swing.JOptionPane;

public class TestTiempo {

  public static void main(String[] args) {
    Tiempo ti = new Tiempo(10, 10, 10);
    JOptionPane.showMessageDialog(null, "Tiempo 1 es " + ti);
    int hsum = Integer.parseInt(JOptionPane.showInputDialog("Horas a sumar a " + ti));
    ti.sumaHoras(hsum);
    JOptionPane.showMessageDialog(null, "Ahora tiempo 1 es " + ti);

    int hmin = Integer.parseInt(JOptionPane.showInputDialog("Minutos a sumar a " + ti));
    ti.sumaMinutos(hmin);
    JOptionPane.showMessageDialog(null, "Ahora tiempo 1 es " +  ti);
    
    int hseg = Integer.parseInt(JOptionPane.showInputDialog("Segundos a sumar a " + ti));
    ti.sumaSegs(hseg);
    JOptionPane.showMessageDialog(null, "Ahora tiempo 1 es " + ti);
  }
}
