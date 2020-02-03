package fecha;

// TODO: ¿Como implementar los assert?
public class Fecha {
  // Atributos //////
  int dia;
  int mes;
  int anyo;
  
  // Constructor //////
  public Fecha (int dia, int mes, int anyo) {
    this.dia = dia;
    this.mes = mes;
    this.anyo = anyo;
  }

  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }

  public int getMes() {
    return mes;
  }

  public void setMes(int mes) {
    this.mes = mes;
  }

  public int getAnyo() {
    return anyo;
  }

  public void setAnyo(int anyo) {
    this.anyo = anyo;
  }
  
  public boolean esBisiesto(int anyo) {
    if (anyo%400==0 || (anyo%4==0 && anyo%100!=0)) {
      return true;
    } else {
      return false;
    }
  }
  
  public boolean esCorrecta(int dia, int mes, int anyo) {
    // Comprobar si el año es correcto
    if (anyo<0) {
      return false;
    }
    
    // Comprobar si el mes es correcto
    if (mes<1 || mes>12) {
      return false;
    }
    
    // Comprobar si el día es correcto
    int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    if (this.esBisiesto(anyo)) {
      diasMes[1] = 29;
    }
    if (dia > 0 && dia <= diasMes[mes-1]) {
      return true;
    } else {
      return false;
    }
    
  }
  
}

