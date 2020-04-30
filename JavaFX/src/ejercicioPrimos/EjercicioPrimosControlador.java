package ejercicioPrimos;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * 1. Implementamos Initializable
 * 2. Añadimos id y creamos atributo privado con el mismo nombre con decorador @FXML
 * 
 * @author rafacab1
 *
 */

public class EjercicioPrimosControlador implements Initializable {
  
  @FXML
  private TextField cantidad;
  
  @FXML
  private TextArea resultados;
  
  public void calcular(ActionEvent e) {
    try {
      int cantidadAMostrar = Integer.parseInt(cantidad.getText());
      // el primer primo es 2, los otros son todos impares...
      resultados.setText("1º: 2");
      int cantidadMostrados = 1;
      // ...a partir de 3
      int num = 3;
      while (cantidadMostrados < cantidadAMostrar) {
        // pienso que es primo hasta que encuentre con que dividirlo
        boolean esPrimo = true;
        // ya sabemos que es impar
        for (int divisor=3; divisor<=Math.sqrt(num) && esPrimo; divisor+=2) {
          // si la división da exacta...
          if (num%divisor==0) {
            // ...ya no es primo
            esPrimo = false;
          }
        }
        if (esPrimo) {
          cantidadMostrados++;
          resultados.setText(resultados.getText() + "\n" + cantidadMostrados + "º: " + num);
        }
        num += 2;
      }
    } catch (NumberFormatException exc) {
      resultados.setText("Debes introducir un número.");
    }
  }


  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {
    // TODO Auto-generated method stub
    
  }

}
