package circulo;
import java.lang.Math;
import javax.swing.JOptionPane;

public class Circulo {
  // Atributos //////////
  double radio;
  
  // Constructor /////////
  public Circulo (double radio) {
    this.radio = radio;
    if (radio==0.0) {
      JOptionPane.showMessageDialog(null, "Soy un mísero punto sin área.");
    }
  }

  // Getters ////////
  public double getRadio() {
    return radio;
  }

  // Setters ////////
  public void setRadio(double radio) {
    this.radio = radio;
    if (radio==0.0) {
      JOptionPane.showMessageDialog(null, "Soy un mísero punto sin área.");
    }
  }
  
  // Métodos ////////
  public void crece(double value) {
    radio = (radio*value);
  }
  
  public void decrece(double value) {
    radio = (radio/value);
  }
  
  public double area() {
    return Math.PI * Math.pow(radio, 2);
  }
  
  @Override
  public String toString() {
    String str = "Soy un círculo de radio " + radio + " metros. Ocupo un área de " + area() + " metros cuadrados.";
    return str;
  }
}
