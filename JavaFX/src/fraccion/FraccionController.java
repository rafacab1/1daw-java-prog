package fraccion;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class FraccionController implements Initializable {
  
  @FXML
  private TextField num1; // Numerador fracción 1
  
  @FXML
  private TextField den1; // Denominador fracción 1
  
  @FXML
  private TextField num2; // Numerador fracción 2
  
  @FXML
  private TextField den2; // Denominador fracción 2
  
  @FXML
  private TextField resnum; // Numerador resultado
  
  @FXML
  private TextField resden; // Denominador resultado
  
  @FXML
  private RadioButton rbsuma; // Suma
  
  @FXML
  private RadioButton rbresta; // Resta
  
  @FXML
  private RadioButton rbprod; // Producto
  
  @FXML
  private RadioButton rbdiv; // División
  
  int n1;
  int d1;
  int n2;
  int d2;
  int rn;
  int rd;
  
  Fraccion f1;
  Fraccion f2;
  Fraccion resultante;
  
  
  public void calcular(ActionEvent e) {
    try {
      n1 = Integer.parseInt(num1.getText());
      d1 = Integer.parseInt(den1.getText());
      n2 = Integer.parseInt(num2.getText());
      d2 = Integer.parseInt(den2.getText());
      f1 = new Fraccion(n1, d1);
      f2 = new Fraccion(n2, d2);
    } catch (NumberFormatException exc) {
      Alert alert = new Alert(AlertType.ERROR);
      alert.setTitle("Debes introducir un número");
      alert.setHeaderText("Debes introducir un número");
      alert.setContentText("Puede ser un entero o decimal");
      alert.showAndWait();
      num1.setText("");
      den1.setText("");
      num2.setText("");
      den2.setText("");
    }
    if (rbsuma.isSelected()) {
      resultante = Fraccion.sumar(f1, f2);
    } else if (rbresta.isSelected()) {
      resultante = Fraccion.restar(f1, f2);
    } else if (rbprod.isSelected()) {
      resultante = Fraccion.multiplicar(f1, f2);
    } else if (rbdiv.isSelected()) {
      resultante = Fraccion.dividir(f1, f2);
    } else {
      Alert alert = new Alert(AlertType.ERROR);
      alert.setTitle("¿Que quieres hacer?");
      alert.setHeaderText("No has seleccionado ninguna opción");
      alert.setContentText("Debes escoger una de las opciones: suma, resta, producto, división");
      alert.showAndWait();
    }
    resnum.setText(Integer.toString(resultante.getNum()));
    resden.setText(Integer.toString(resultante.getDen()));
  }

  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {
    
  }
}