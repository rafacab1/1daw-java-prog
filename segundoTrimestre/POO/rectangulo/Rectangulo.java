package rectangulo;

/**
 * Rectangulo.java
 * 
 * @author rafacab1
 *
 */

public class Rectangulo {
  // Atributos ////////////////////////////
  double base;
  double altura;
  double ladoMaximo = 10; // Lado máximo del rectángulo
  int numCreados = 0; // Contador de rectángulos creados
  
  
  // Métodos ////////////////////////////
  
  // Constructor
  public Rectangulo (double ba, double al) {
    this.base = ba;
    this.altura = al;
    numCreados++;
  }
  
  // Getters
  public double getBase() {
    return base;
  }
  public double getAltura() {
    return altura;
  }
  
  // Setters
  /* TODO: Implementar "assert Rectangulo.es_lado_correcto(value)" */
  public void setBase(double base) {
    this.base = base;
  }
  public void setAltura(double altura) {
    this.altura = altura;
  }
  
  // Otros métodos
  public int numCreados() {
    return numCreados;
  }
  
  public boolean esLadoCorrecto(double value) {
    return (0<value) && (value<ladoMaximo);
  }
  
  public double perimetro() {
    return (2 * (this.base + this.altura));
  }
  
  public double area() {
    return (this.base * this.altura);
  }
  
  public double compara(Rectangulo otro) {
    return (this.area() - otro.area());
  }
  
  public boolean esGemelo(Rectangulo otro) {
    return (this.base == otro.base) && (this.altura == otro.altura);
  }
  
  public void muestra() {
    System.out.print(this);
  }
  
  // Métodos sobrecargados
  @Override
  public String toString(){
    String str = "";
    for (int i=0;i<=this.altura;i++) {
      for (int j=0;j<=this.base;j++) {
        str += "*";
      }
      str += "\n";
    }
    return str;
  }
  
  // TODO: Implementar sobrecarga __mul__ ; __rmul__ ; __lt__ ; __le__ ; __eq__
  // TODO: Para sobrecargar multiplicación... Podemos hacer un método que multiplique en vez de sobrecargar el existente.
  
  // Método multiplicación
  
}
