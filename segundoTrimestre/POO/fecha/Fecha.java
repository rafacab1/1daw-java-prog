package fecha;
/*
 * @author Rafael Caballero
 */

// TODO: ¿Como implementar los assert?
public class Fecha implements Comparable<Fecha> {
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
    /*
     * Función que comprueba si el año en cuestión es bisiesto.
     */
    if (anyo%400==0 || (anyo%4==0 && anyo%100!=0)) {
      return true;
    } else {
      return false;
    }
  }
  
  public Fecha suma1Dia() {
    /*
     * Función que suma un día a la fecha.
     */
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
    /*
     * Función que resta un día a la fecha.
     */
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
    /*
     * Función que suma n días (los que se le pasa por argumento) a la fecha.
     */
    Fecha tmp = this.clona(this.dia, this.mes, this.anyo);
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
    /*
     * Función que resta n días (los que se le pasa por argumento) a la fecha.
     */
    Fecha tmp = this.clona(this.dia, this.mes, this.anyo);
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
    /*
     * Función que devuelve el nombre del mes.
     */
    String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "noviembre", "diciembre"};
    return meses[this.mes-1];
  }
  
  public int diasMes(int mes, int anyo) {
    /*
     * Función que devuelve la cantidad de días de un mes.
     */
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
  
  public Fecha clona(int dia, int mes, int anyo) {
    /*
     * Devuelve una copia del objeto (this).
     * 
     */
    Fecha fechaClon = new Fecha(dia, mes, anyo);
    return fechaClon;
  }
  
  public int compareTo(Fecha otraFecha) {
    return (this).compareTo(otraFecha);
  }
  
  public boolean equals(Fecha otraFecha) {
    return (this).equals(otraFecha);
  }
}

