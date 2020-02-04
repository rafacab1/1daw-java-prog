package fraccion;

public class TestFraccion {

  public static void main(String[] args) {
    Fraccion fraccion = new Fraccion(42, 68);
    Fraccion otra = new Fraccion(62, 58);
    
    System.out.println(fraccion);
    
    System.out.println("MultiplicaNum: " + fraccion.multiplicaNum(3));
    
    System.out.println("Multiplica: " + fraccion.multiplica(otra));
    
    System.out.println("Suma: " + fraccion.sumar(otra));
    
    System.out.println("Resta: " + fraccion.restar(otra));
    
    System.out.println("Simplifica: " + fraccion.simplifica());
    

  }

}
