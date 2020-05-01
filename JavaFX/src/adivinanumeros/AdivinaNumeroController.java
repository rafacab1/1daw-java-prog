package adivinanumeros;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AdivinaNumeroController implements Initializable {
  
  @FXML
  private TextField nIntroducido;
  
  @FXML
  private TextArea resultados;
  
  @FXML
  private TextField nFinal;
  
  // Genero el número
  int num = (int) (Math.random() * 100 ) + 1;
  // Intentos restantes
  private int iRestantes = 10;
  
  // Cuando se pulse el botón
  public void intento(ActionEvent e) {
    // Leo el número
    try {
      int numeroIntroducido = Integer.parseInt(nIntroducido.getText());
    // Compruebo
    // Si no me quedan intentos
    if (iRestantes <= 0) {
      resultados.setText(resultados.getText() + "\nNo te quedan mas intentos...");
      nFinal.setText(Integer.toString(num));
    }
    
    // Si el número introducido es mayor
    if (numeroIntroducido > num && iRestantes > 0) {
      resultados.setText(resultados.getText() + "\n" + numeroIntroducido + " es mayor que el número en el que estoy pensando.");
    }
    
    // Si el número introducido es menor
    if (numeroIntroducido < num && iRestantes > 0) {
      resultados.setText(resultados.getText() + "\n" + numeroIntroducido + " es menor que el número en el que estoy pensando.");
    }
    
    // Si el número es el mismo que tiene que adivinar
    if (numeroIntroducido == num && iRestantes > 0) {
      resultados.setText(resultados.getText() + "\nHas adivinado el número, ¡enhorabuena!");
      nFinal.setText(Integer.toString(num));
    }
    
    nIntroducido.setText(""); // Limpio el cuadro nIntroducido
    iRestantes--; // Resto un intento
    
    } catch (NumberFormatException exc) {
      resultados.setText(resultados.getText() + "\nDebes introducir un número...");
    }
  }

  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {
    
  }
}
