package fraccion;

public class Fraccion {
  // Atributos //////
  int numerador;
  int denominador;
  
  public Fraccion (int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }

  // Getters & Setters
  public int getNumerador() {
    return numerador;
  }

  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  public int getDenominador() {
    return denominador;
  }

  public void setDenominador(int denominador) {
    if (denominador == 0) {
      System.out.println("Error: El denominador no puede ser 0.");
    } else {
      this.denominador = denominador;
    }
  }
  
  // Métodos //////
  @Override
  public String toString() {
    String str = "El numerador es " + this.numerador + " y el denominador es " + this.denominador + ".";
    return str;
  }
  
  public double resultado() {
    /* Divide numerador entre denominador */
    return this.numerador/this.denominador;
  }
  
  public int multiplicaNum(int numero) {
    /* Multiplica la fraccción por un número. */
    this.numerador = (this.numerador * numero);
    return this.numerador, this.denominador;
    // TODO: ¿Como devuelvo numerador y denominador conjuntamente?
  }
  
  
}
