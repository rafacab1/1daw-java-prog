package ejColecciones;

public class Carta implements Comparable<Carta> {
  // Atributos
  int numero;
  String palo;
  
  // Constructor
  public Carta (int numero, String palo) {
    this.numero = numero;
    this.palo = palo;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getPalo() {
    return palo;
  }

  public void setPalo(String palo) {
    this.palo = palo;
  }
  
  @Override
  public String toString() {
    if (this.numero==1) {
      return "As de " + this.palo;
    } else if (this.numero==10) {
      return "Sota de " + this.palo;
    } else if (this.numero==11) {
      return "Caballo de " + this.palo;
    } else if (this.numero==12) {
      return "Rey de " + this.palo;
    } else {
      return Integer.toString(this.numero) + " de " + this.palo;
    }
  }
  
  public int compareTo(Carta cartas) {
    return (this.palo).compareTo(cartas.getPalo());
  }
  
  public boolean equals(Carta cartas) {
    return (this.palo).equals(cartas.getPalo());
  }
}
