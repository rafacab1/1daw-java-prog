package fraccion;
/*
 * @author Rafael Caballero
 */

public class Fraccion {
  // Atributos //////
  int numerador = 1;
  int denominador = 1;
  
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
    /* 
     * Divide numerador entre denominador 
     */
    return this.numerador/this.denominador;
  }
  
  public Fraccion multiplicaNum(int numero) {
    /* 
     * Multiplica la fraccción por un número. 
     */
    Fraccion tmpmn = this;
    tmpmn.numerador = (this.numerador * numero);
    return tmpmn;
  }
  
  public Fraccion multiplica(Fraccion frac) {
    /*
     * Multiplica la fracción por otro objeto fracción.
     * 
     */
    Fraccion tmpM = this;
    tmpM.numerador = (this.numerador*frac.numerador);
    tmpM.denominador = (this.denominador*frac.denominador);
    return tmpM;
  }
  
  public Fraccion sumar(Fraccion frac) {
    /**
     * Suma dos fracciones.
     * 
     */
    Fraccion tmpS = this;
    if (this.denominador == frac.denominador) {
      tmpS.numerador = (this.numerador+frac.numerador);
    } else {
      tmpS.numerador = ((this.numerador*frac.denominador)+(this.denominador*frac.numerador));
    }
    return tmpS;
  }
  
  public Fraccion restar(Fraccion frac) {
    /**
     * Resta dos fracciones.
     * 
     */
    Fraccion tmpR = this;
    if (this.denominador == frac.denominador) {
      tmpR.numerador = (this.numerador-frac.numerador);
    } else {
      tmpR.numerador = ((this.numerador*frac.denominador)-(this.denominador*frac.numerador));
    }
    return tmpR;
  }
  
  public Fraccion simplifica() {
  /*
   * Algoritmo
   * En un bucle, mientras que "simplificado" sea falso, compruebo lo siguiente...
   * variable a 2
   * Si el resto del numerador entre "variable" es 0 y el resto del denominador entre "variable" también es 0
   *  Divido numerador entre "variable", y denominador también lo divido entre variable"
   *  Pongo "variable" a 2
   *    Si no, incremento variable en 1
   *    Si "variable" es mayor que 600, pongo "simplificado" como verdadero
   */
    Fraccion tmpSi = this;
    boolean simplificado = false;
    int variable = 2;
    while (!simplificado) {
      if (tmpSi.numerador%variable==0 && tmpSi.denominador%variable==0) {
        tmpSi.numerador = (tmpSi.numerador/variable);
        tmpSi.denominador = (tmpSi.denominador/variable);
        variable = 2;
      } else {
        variable++;
      }
      if (variable>600) {
        simplificado = true;
      }
    }
    return tmpSi;
  }
  
}
