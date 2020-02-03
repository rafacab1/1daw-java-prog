package circulo;

public class TestCirculo {

  public static void main(String[] args) {
    Circulo circuloTest = new Circulo(3); // Nuevo círculo de radio tres
    System.out.println(circuloTest.toString()); // Imprime el estado del círculo
    circuloTest.crece(27); // Crece 27 veces
    circuloTest.decrece(10); // Decrece 10 veces
    System.out.println(circuloTest.toString()); // Vuelve a imprimir el estado del círculo
    
    Circulo circuloMsg = new Circulo(0); // Prueba de reacción "Soy un mísero punto sin área".
  }
}
