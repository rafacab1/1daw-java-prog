package tiempo;

public class Tiempo {
  // Atributos //////
  int horas;
  int minutos;
  int segundos;
  
  // Constructor //////
  public Tiempo (int horas, int minutos, int segundos) {
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }
  
  // Getters & Setters //////
  public int getHoras() {
    return horas;
  }

  public void setHoras(int horas) {
    this.horas = horas;
  }

  public int getMinutos() {
    return minutos;
  }

  public void setMinutos(int minutos) {
    this.minutos = minutos;
  }

  public int getSegundos() {
    return segundos;
  }

  public void setSegundos(int segundos) {
    this.segundos = segundos;
  }
  
  // Métodos //////
  @Override
  public String toString() {
    String str = this.horas + "h " + this.minutos + "m " + this.segundos + "s.";
    return str;
  }
  
  // Sumar y restar horas //////
  public void sumaHoras(int value) {
    // TODO: Asserts Java
    this.horas += value;
  }
  
  public void restaHoras(int value) {
    // TODO: Asserts Java
    this.horas -= value;
  }
  //TODO: Arreglar la vuelta desde los segundos.
  // Sumar y restar minutos //////
  public void sumaMinutos(int value) {
    int segundos = (this.pasaSegs(this) + (value*60));
    // TODO: Asserts Java
    this.horas = (segundos/3600);
    this.minutos = ((segundos-(this.horas*3600))/60);
    this.segundos = (segundos-(this.horas*3600)+(this.minutos*60));
  }
  
  public void restaMinutos(int value) {
    int segundos = (this.pasaSegs(this) - (value*60));
    // TODO: Asserts Java
    this.horas = (segundos/3600);
    this.minutos = ((segundos-(this.horas*3600))/60);
    this.segundos = (segundos-(this.horas*3600)+(this.minutos*60));
  }
  
  // Sumar y restar segundos ///////
  public void sumaSegs(int value) {
    int segundos = (this.pasaSegs(this) + (value));
    // TODO: Asserts Java
    this.horas = (segundos/3600);
    this.minutos = ((segundos-(this.horas*3600))/60);
    this.segundos = (segundos-(this.horas*3600)+(this.minutos*60));
  }
  
  public void restaSegs(int value) {
    int segundos = (this.pasaSegs(this) - (value));
    // TODO: Asserts Java
    this.horas = (segundos/3600);
    this.minutos = ((segundos-(this.horas*3600))/60);
    this.segundos = (segundos-(this.horas*3600)+(this.minutos*60));
  }
  
  // Sumar y restar otro objeto Tiempo //////
  public void suma(Tiempo tmp) {
    int segundos = (this.pasaSegs(this) + (tmp.pasaSegs(tmp)));
    // TODO: Asserts Java
    this.horas = (segundos/3600);
    this.minutos = ((segundos-(this.horas*3600))/60);
    this.segundos = (segundos-(this.horas*3600)+(this.minutos*60));
  }
  
  public void resta(Tiempo tmp) {
    int segundos = (this.pasaSegs(this) - (tmp.pasaSegs(tmp)));
    // TODO: Asserts Java
    this.horas = (segundos/3600);
    this.minutos = ((segundos-(this.horas*3600))/60);
    this.segundos = (segundos-(this.horas*3600)+(this.minutos*60));
  }
  
  // Otros métodos //////
  public int pasaSegs(Tiempo aSegundos) {
    return ((aSegundos.horas*3600) + (aSegundos.minutos*60) + (aSegundos.segundos));
  }
}
