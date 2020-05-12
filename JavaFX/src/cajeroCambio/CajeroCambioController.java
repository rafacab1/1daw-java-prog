package cajeroCambio;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class CajeroCambioController implements Initializable {
	
  @FXML
  private TextField cantidad; // Cantidad de euros introducida por el usuario
  
  /**
   * Billetes
   */
  @FXML
  private TextField quinientos;
  
  @FXML
  private TextField doscientos;
  
  @FXML
  private TextField cien;
  
  @FXML
  private TextField cincuenta;
  
  @FXML
  private TextField veinte;
  
  @FXML
  private TextField diez;
  
  @FXML
  private TextField cinco;
  
  /**
   * Monedas
   */
  
  @FXML
  private TextField dos;
  
  @FXML
  private TextField uno;
  
  @FXML
  private TextField cincuentaCent;
  
  @FXML
  private TextField veinteCent;
  
  @FXML
  private TextField diezCent;
  
  @FXML
  private TextField cincoCent;
  
  @FXML
  private TextField dosCent;
  
  @FXML
  private TextField unCent;
  
  public void cambia(ActionEvent e) {
    try {
      
      Integer billete500 = 0;
      Integer billete200 = 0;
      Integer billete100 = 0;
      Integer billete50 = 0;
      Integer billete20 = 0;
      Integer billete10 = 0;
      Integer billete5 = 0;
      Integer moneda2E = 0;
      Integer moneda1E = 0;
      Integer moneda50 = 0;
      Integer moneda20 = 0;
      Integer moneda10 = 0;
      Integer moneda5 = 0;
      Integer moneda2 = 0;
      Integer moneda1 = 0;
      
      
      float euros = Float.parseFloat(cantidad.getText());
      
      while (euros>=500) {
        billete500++;
        euros -= 500;
      }
      
      while (euros>=200) {
        billete200++;
        euros -= 200;
      }
      
      while (euros>=100) {
        billete100++;
        euros -= 100;
      }
      
      while (euros>=50) {
        billete50++;
        euros -= 50;
      }
      
      while (euros>=20) {
        billete20++;
        euros -= 20;
      }
      
      while (euros>=10) {
        billete10++;
        euros -= 10;
      }
      
      while (euros>=5) {
        billete5++;
        euros -= 5;
      }
      
      while (euros>=2) {
        moneda2E++;
        euros -= 2;
      }
      
      while (euros>=1) {
        moneda1E++;
        euros -= 1;
      }
      
      while (euros>=0.50) {
        moneda50++;
        euros -= 0.50;
      }
      
      while (euros>=0.20) {
        moneda20++;
        euros -= 0.20;
      }
      
      while (euros>=0.10) {
        moneda10++;
        euros -= 0.10;
      }
      
      while (euros>=0.05) {
        moneda5++;
        euros -= 0.05;
      }
      
      while (euros>=0.02) {
        moneda2++;
        euros -= 0.02;
      }
      
      while (euros>=0.01) {
        moneda1++;
        euros -= 0.01;
      }
      
      quinientos.setText(Integer.toString(billete500));
      doscientos.setText(Integer.toString(billete200));
      cien.setText(Integer.toString(billete100));
      cincuenta.setText(Integer.toString(billete50));
      veinte.setText(Integer.toString(billete20));
      diez.setText(Integer.toString(billete10));
      cinco.setText(Integer.toString(billete5));
      dos.setText(Integer.toString(moneda2E));
      uno.setText(Integer.toString(moneda1E));
      cincuentaCent.setText(Integer.toString(moneda50));
      veinteCent.setText(Integer.toString(moneda20));
      diezCent.setText(Integer.toString(moneda10));
      cincoCent.setText(Integer.toString(moneda5));
      dosCent.setText(Integer.toString(moneda2));
      unCent.setText(Integer.toString(moneda1));
      
      
    } catch (NumberFormatException exc) {
      Alert alert = new Alert(AlertType.ERROR);
      alert.setTitle("Debes introducir un número");
      alert.setHeaderText("Debes introducir un número.");
      alert.setContentText("Puede ser un entero o decimal.");
      alert.showAndWait();
      cantidad.setText("");
    }
  }
  
  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {
    
  }

}