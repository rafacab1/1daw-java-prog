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
  
  public Fecha suma1Dia() {
    int dia = this.dia +1;
    int mes = this.mes;
    int anyo = this.anyo;
    
    if (dia>this.diasMes(mes, anyo)) {
      dia = 1;
      mes++; // Paso al mes siguiente
      if (mes>12) { 
        mes = 1; // Paso al año siguiente
        anyo++;
      }
    }
    Fecha tmp = new Fecha(dia, mes, anyo);
    return tmp;
  }
  
  public Fecha resta1Dia() {
    int dia = this.dia - 1;
    int mes = this.mes;
    int anyo = this.anyo;
    if (dia==0) {
      mes--; // Paso al mes anterior
      if (mes==0) {
        mes = 12;
        anyo--;
      }
      dia = this.diasMes(mes, anyo);
    }
    Fecha tmp = new Fecha(dia, mes, anyo);
    return tmp;
  }
  
  public Fecha sumaNDias(int value) {
    Fecha tmp = this;
    if (value>0) {
      for (int i=1;i<=value;i++) {
        tmp = tmp.suma1Dia();
      }
    } else {
      for (int i=1;i<=Math.abs(value);i++) {
        tmp = tmp.suma1Dia();
      }
    }
    return tmp;
  }
  
  public Fecha restaNDias(int value) {
    Fecha tmp = this;
    if (value>0) {
      for (int i=1;i<=value;i++) {
        tmp = tmp.resta1Dia();
      }
    } else {
      for (int i=1;i<=Math.abs(value);i++) {
        tmp = tmp.resta1Dia();
      }
    }
    return tmp;
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
    if (dia > 0 && dia <= diasMes(this.mes, this.anyo)) {
      return true;
    } else {
      return false;
    } 
  }
  
  public String nombreMes() {
    String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "noviembre", "diciembre"};
    return meses[this.mes-1];
  }
  
  public int diasMes(int mes, int anyo) {
    int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    if (this.esBisiesto(anyo)) {
      diasMes[1] = 29;
    }
    return diasMes[mes-1];
  }
  
  public String toString() {
    String str = this.dia + " de " + this.nombreMes() + " de " + this.anyo;
    return str;
  }
}

