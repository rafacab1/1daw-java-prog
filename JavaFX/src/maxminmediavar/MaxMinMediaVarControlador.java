package maxminmediavar;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class MaxMinMediaVarControlador implements Initializable {
  
  /**
   * Caja de texto donde el usuario introduce las notas
   */
  @FXML
  private TextField insertador;
  
  /**
   * TextArea donde se muestran las notas introducidas
   */
  @FXML
  private TextArea introducidas;
  
  /**
   * Caja de texto donde sale el máximo
   */
  @FXML
  private TextField nMaxResultado;
  
  /**
   * Caja de texto donde sale el mínimo
   */
  @FXML
  private TextField nMinResultado;
  
  /**
   * Caja de texto donde sale la media
   */
  @FXML
  private TextField nMedResultado;
  
  /**
   * Caja de texto donde sale la varianza
   */
  @FXML
  private TextField nVarResultado;
  
  /**
   * ArrayList con las notas
   */  
  private ArrayList<Double> notas = new ArrayList<Double>();

  public void insertaNota(ActionEvent e) {
    try {
      Double nota = Double.parseDouble(insertador.getText());
      if (nota >= 0 && nota <= 10) {
        notas.add(nota);
        insertador.setText("");
        introducidas.setText(introducidas.getText() + notas.get(notas.size() - 1) + " | ");
      } else {
        throw new NumberFormatException(); 
      }      
    } catch (NumberFormatException exc) {
      Alert alert = new Alert(AlertType.ERROR);
      alert.setTitle("Debes introducir un número");
      alert.setHeaderText("Debes introducir un número entre 0 y 10");
      alert.setContentText("Puede ser un entero o decimal");
      alert.showAndWait();
      insertador.setText("");
    }
  }
  
  public void calcular(ActionEvent e) {
    nMaxResultado.setText(Double.toString(Collections.max(notas))); // Uso colecciones para calcular el max
    nMinResultado.setText(Double.toString(Collections.min(notas))); // Uso colecciones para calcular el min
    nMedResultado.setText(Double.toString(media(notas))); // Uso la función media
    nVarResultado.setText(Double.toString(varianza(notas))); // Uso la función varianza
  }
  
  private double media(ArrayList<Double> ald) {
    double sumaTotal = 0;
    for (int i=0;i<=notas.size()-1;i++) {
      sumaTotal += ald.get(i);
    }
    return sumaTotal / notas.size();
  }
  
  private double varianza(ArrayList<Double> ald) {
    double tmpVarianza = 0;
    for (int i=0;i<=notas.size()-1;i++) {
      tmpVarianza += Math.pow(ald.get(i)-media(ald), 2);
    }
    return tmpVarianza / notas.size();
  }

  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {
    // TODO Auto-generated method stub
    
  }

}
