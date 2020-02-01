package funciones;

/**
 * Funciones de los ejercicios 1 a 14 de la página 147 del libro "Aprende Java
 * con Ejercicios"
 * 
 * @author rafacab1
 *
 */
public class Funciones114 {

  /**
   * 1. Función que prueba si un número es capicúa.
   *
   * Algoritmo Recorre el número del revés, y lo va almacenando en una variable
   * Compara la variable con el número original, si son iguales, devuelve True, si
   * no, devuelve False.
   *
   * Variables num = Número original pasado cómo parámetro. (int) numString = num
   * pasado a String almacen = Número del revés (String)
   * 
   * @param num número a comprobar
   * @return true si es capicúa
   * @return false si no es capicúa
   */
  public static boolean esCapicua(int num) {
    String almacen = ""; // Variable almacén, para guardar el número del revés.

    String numString = Integer.toString(num); // Convierto a cadena para poder medirlo y extraer caracteres luego.
    for (int i = numString.length() - 1; i >= 0; i--) {
      almacen = almacen + Character.toString(numString.charAt(i));
    }
    if (numString.equals(almacen)) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * 2. Función que comprueba si un número es primo
   * 
   * Algoritmo Primero supongo que es primo Mientras que un número (primero 2) sea
   * menor o igual que la raíz del número a comprobar, y suponga que es primo
   * Compruebo números, es decir, si el resto del número entre n (que primero es
   * 2) da 0, no es primo y acabo porque el bucle while ya no es True. Si el resto
   * no es 0, le sumo 1 a n (ahora sería 3) y vuelvo a comprobar. Al final, el
   * bucle devuelve la variable 'primo', que es una variable booleana que indica
   * si es primo o no.
   * 
   * Variables num : Número introducido por el usuario (int) n : Número con el que
   * divido para calcular si el resto es 0 o no (int) primo: Indica si es primo o
   * no, al principio suponemos que si para que entre al bucle a comprobar
   * (boolean)
   * 
   * @param num Número a comprobar si es primo (int)
   * @return false Si el número no es primo
   * @return true Si el número es primo
   * 
   */
  public static boolean esPrimo(int num) {
    int n = 2;
    boolean primo = true;
    while (n <= Math.sqrt(num) && (primo)) {
      if (num % n == 0) {
        primo = false;
      }
      n++;
    }
    return primo;
  }

  /**
   * 3. Función que devuelve el menor primo que es mayor al número que se pasa como
   * parámetro.
   * 
   * Algoritmo Le sumo uno a 1 al número (ahora ya es el siguiente número).
   * Compruebo si es primo, si lo es devuelvo num, si no... En un bucle, compruebo
   * si el número es primo, si no lo es le sumo uno y empiezo el bucle otra vez.
   * Si es primo Salgo del bucle y devuelvo el número.
   *
   * Variables num : Número introducido (int)
   * 
   * @param num Número introducido por el usuario
   * @return Siguiente primo (número entero)
   */
  public static int siguientePrimo(int num) {
    num++;
    while (!esPrimo(num)) {
      num++;
    }
    return num;
  }

  /**
   * 4. Función que dada una base y un exponente devuelve la potencia.
   * 
   * Algoritmo Guardo la base en otra variable y hago un contador Mientras que el
   * contador no sea igual que el exponente, multiplico base que guarde por la
   * base original y lo guardo en la variable con la base nueva, y le sumo uno al
   * contador.
   *
   * Variables b1 : Variable en la que se irá guardando el resultado (int) cont :
   * Contador para llegar hasta el exponente (int) base : Base introducida por el
   * usuario (int) exp : Exponente introducido por el usuario (int)
   * 
   * @param base Base de la potencia
   * @param exp  Exponente de la potencia
   * @return b1 Resultado de la potencia
   */
  public static int potencia(int base, int exp) {
    int b1 = base;
    int cont = 1;

    // Mientras que el exponente no sea igual que el contador...
    while (exp != cont) {
      b1 = (b1 * base);
      cont++;
    }
    return b1;
  }

  /**
   * 5. Función que cuenta el número de dígitos de un número entero.
   *
   * Algortimo Si el número es menor que 9, ya sé que tiene un dígito, si tiene
   * mas, lo divido entre 10 y lo almaceno en la misma variable, y le añado 1 al
   * contador de dígitos, ahora al volver a comprobar el bucle, si sigue sin ser
   * menor que 9, vuelvo a repetir el proceso, y si no, devuelvo el contenido del
   * contador de dígitos.
   *
   * Variables num : Número introducido por el usuario (int) cuenta : Contador de
   * dígitos (int)
   * 
   * @param num Número introducido por el usuario (int)
   * @return cuenta Número de dígitos (int)
   */
  public static int digitos(int num) {
    int cuenta = 1;
    while (num > 9) {
      num = (num / 10);
      cuenta++;
    }
    return cuenta;
  }

  /**
   * 6. Función que le da la vuelta a un número
   * 
   * Algoritmo 
   * Paso el número a cadena Recorro la cadena al revés y voy guardando
   * los números en la variable almacen, la cual luego devuelvo como int.
   * 
   * Variables 
   * num : Número introducido por el usuario (int primero, luego str)
   * almacen : Guarda el número volteado (str, luego se devuelve como int)
   * 
   * @param num : Número introducido por el usuario
   * @return almacen : Número volteado
   */

  public static int voltea(int num) {
    String almacen = ""; // Variable almacén, para guardar el número del revés.

    String numString = Integer.toString(num); // Convierto a cadena para poder medirlo y extraer caracteres luego.
    for (int i = numString.length() - 1; i >= 0; i--) {
      almacen = almacen + Character.toString(numString.charAt(i));
    }
    return Integer.parseInt(almacen);
  }

  /**
   * 7. Función que devuelve el dígito que está en la posición n de un número entero.
   * Se empieza contando por el 0 y de izquierda a derecha.
   * 
   * Algoritmo 
   * Paso el número a una cadena y saco la posición indicada menos 1,
   * para que empiece a contar desde 0.
   * 
   * Variables 
   * num : Número indicado por el usuario (int)
   * numString : num como cadena (String) 
   * pos : Posición indicada por el usuario (int)
   * 
   * @param num : Número a usar introducido por el usuario (int)
   * @param pos : Posición a mirar (int)
   * @return dígito que está en esa posición (int)
   */
  public static int digitoN(int num, int pos) {
    String numString = Integer.toString(num);
    return Integer.parseInt(Character.toString(numString.charAt(pos-1)));
  }
  
  /**
   * 8. Función que da la posición de la primera ocurrencia de un dígito dentro de un
   * número entero. Si no se encuentra, devuelve -1.
   * 
   * Algoritmo 
   * Paso las variables a cadenas para poder recorrer los números con el
   * bucle for Recorro el número y lo voy comparando con el número a buscar. Si lo
   * encuentra, pongo la variable encontrado en True y devuelvo el valor de i Si
   * se acaba el bucle y no lo encuentra, compruebo que no lo he encontrado y
   * devuelvo -1
   * 
   * Variables 
   * num : Número introducido por el usuario (primero int, después str)
   * numB : Número a buscar introducido por el usuario (primero int, después str)
   * 
   * @param num Número a usar (int)
   * @param numB Número a buscar (int)
   * @return i si lo encuentra, -1 si no
   * 
   */
  public static int posicionDeDigito(int num, int numB) {
    String numString = Integer.toString(num);
    String numBString = Integer.toString(numB);
    
    for (int i= 0;i<numString.length();i++) {
      if (Character.toString(numString.charAt(i)).equals(numBString)) {
        return i;
      }
    }
    return (-1);
  }
  
  /**
   * 9. Función que le quita a un número n dígitos por detrás (por la derecha).
   * 
   * Algoritmo 
   * Paso el número a cadena y creo una variable de tipo string vacía
   * Con un bucle for, recorro el número desde la posición 0 hasta la que sea de
   * la longitud total - la cantidad de números que quiero retirar. Voy guardando
   * todos los dígitos en otra variable y al acabar devuelvo esa variable.
   * 
   * Variables 
   * num : Número introducido por el usuario (int primero, después str)
   * cantidad : Cantidad de dígitos a retirar (int) 
   * almacen : Aquí se van guardando los números que recorre el bucle (str primero, int después)
   * 
   * @param num : Número introducido por el usuario
   * @param cantidad : Cantidad de dígitos a quitar
   * @return almacen : Número resultante
   */
  public static int quitaPorDetras(int num, int cantidad) {
    String numString = Integer.toString(num);
    String almacen = "";
    
    for (int i=0;i<(numString.length()-cantidad);i++) {
      almacen = almacen + Character.toString(numString.charAt(i));
    }
    return Integer.parseInt(almacen);
  }
  
  /**
   * 10. Función que le quita a un número n dígitos por delante (por la izquierda).
   * 
   * Algoritmo 
   * Le doy la vuelta a al número con la función
   * voltea que hice antes. Ahora le quito los números de la misma manera que
   * antes (con la función anterior). Devuelvo el número volteado de nuevo para
   * volver a su posición original.
   * 
   * Variables 
   * num : Número introducido por el usuario (int primero, str después)
   * almacen : Número volteado sin cortar (str) 
   * almacen2 : Número volteado cortado (str)
   * 
   * @param num Número introducido por el usuario
   * @param cantidad : Cantidad dígitos a quitar
   * @return Número resultante
   */
  public static int quitaPorDelante(int num, int cantidad) {
    int numVolt = voltea(num);
    return voltea(quitaPorDetras(numVolt, cantidad));
  }
  
  /**
   * 11. Función que añade un dígito a un número por detrás.
   * 
   * Algoritmo 
   * Paso tanto el número como el dígito a cadena Concateno las dos
   * cadenas y las devuelvo como int
   * 
   * Variables 
   * num : Número introducido por el usuario (int primero, str después)
   * digito : Número a pegar por detrás (int primero, str después)
   * 
   * @param num Número original
   * @param digito Dígito a añadir
   * @return Número resultante pegado
   */
  public static int pegaPorDetras(int num, int digito) {
    String numS = Integer.toString(num);
    String digitoS = Integer.toString(digito);
    
    return Integer.parseInt(numS+digitoS);
  }
  
  /**
   * 12. Función que añade un dígito a un número por delante.
   * 
   * Algoritmo 
   * Paso tanto el número como el dígito a cadena 
   * Concateno las dos cadenas y las devuelvo como int
   * 
   * Variables 
   * num : Número introducido por el usuario (int primero, str después)
   * digito : Número a pegar por detrás (int primero, str después)
   * 
   * @param num Número original
   * @param digito Dígito a añadir
   * @return Número resultante pegado
   */
  public static int pegaPorDelante(int num, int digito) {
    String numS = Integer.toString(num);
    String digitoS = Integer.toString(digito);
    
    return Integer.parseInt(digitoS+numS);
  }
  
  /**
   * 13. Función que toma como parámetros las posiciones inicial y final dentro de un
   * número y devuelve el trozo correspondiente.
   * 
   * Algoritmo 
   * Paso el número a str Recorro el numero entre la posición inicial y
   * la posición final, guardo los números en una variable Devuelvo la variable
   * convertida a int
   * 
   * Variables 
   * numero: Número introducido por el usuario (int primero, str después) 
   * posI : Posición inicial indicada por el usuario (int) 
   * posF : Posición final indicada por el usuario (int) 
   * almacen : Variable en la que guardo el trozo de número (str primero, int después)
   * 
   * @param num Número introducido por el usuario
   * @param posI Posición inicial
   * @param posF Posición final
   * @return Trozo de número final
   */
  public static int trozoDeNumero(int num, int posI, int posF) {
    String numS = Integer.toString(num);
    String almacen = "";
    
    for (int i=(posI-1);i<=posF;i++) {
      almacen = almacen + Character.toString(numS.charAt(i));
    }
    
    return Integer.parseInt(almacen);
  }
  
  /**
   * 14. Función que pega dos números para formar uno.
   * 
   * Algoritmo 
   * Paso los dos números a cadena Devuelvo la concatenación de los dos
   * números pasada a int
   * 
   * Variables 
   * num1 : Número 1 introducido por el usuario (int primero, str después) 
   * num2 : Número 2 introducido por el usuario (int primero, str
   * después)
   * 
   * @param num1 Número 1 introducido por el usuario
   * @param num2 Número 2 introducido por el usuario
   * @return Número pegado (num1+num2)
   * 
   */
  public static int juntaNumeros(int num1, int num2) {
    String num1S = Integer.toString(num1);
    String num2S = Integer.toString(num2);
    
    return Integer.parseInt(num1S+num2S);
  }
}
