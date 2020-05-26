package cesar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;

public class DesencriptaCesarController implements Initializable {
  @FXML
  private TextArea cajaA;
  
  @FXML
  private TextArea cajaB;
  
  @FXML
  private TextField clave;
  
  @FXML
  private Slider slider;
  
  private FileChooser fileChooser;
  private File fichero;
  private BufferedReader ficheroLeer;
  private String line;
  
  private FileChooser fileSaver;
  private File ficheroGuardar;
  private BufferedWriter ficheroGuardador;
  
  public void cargar(ActionEvent e) throws IOException {
    fileChooser = new FileChooser();
    fichero = fileChooser.showOpenDialog(new Stage());
    ficheroLeer = new BufferedReader(new FileReader(fichero.getAbsolutePath()));
    
    line = ficheroLeer.readLine();
    while (line != null) {
      cajaA.setText(cajaA.getText() + line + "\n");
      line = ficheroLeer.readLine(); // Lee la siguiente línea
    }
  }
  
  public void aumentarC(ActionEvent e) {
    try {
      int tmp = Integer.parseInt(clave.getText());
      tmp++;
      clave.setText(Integer.toString(tmp));      
    } catch (NumberFormatException exc) {
      alertas();
    }
  }
  
  public void disminuirC(ActionEvent e) {
    try {
      int tmp = Integer.parseInt(clave.getText());
      tmp--;
      clave.setText(Integer.toString(tmp));      
    } catch (NumberFormatException exc) {
      alertas();
    }
  }
  
  public void desencripta(ActionEvent e) throws IOException {
    try {
    ficheroLeer = new BufferedReader(new FileReader(fichero.getAbsolutePath()));
    line = ficheroLeer.readLine();
    while (line != null) {
      cajaB.setText(cajaB.getText() + Desencripta.desencripta(line, Integer.parseInt(clave.getText())) + "\n"); // Desencripta
      line = ficheroLeer.readLine(); // Lee la siguiente línea
    }
    } catch (NumberFormatException exc) {
      alertas();
    }
  }
  
  public void guarda(ActionEvent e) throws IOException {
    fileSaver = new FileChooser();
    ficheroGuardar = fileSaver.showSaveDialog(new Stage());
    ficheroGuardador = new BufferedWriter(new FileWriter(ficheroGuardar.getAbsolutePath()));
    ficheroGuardador.write(cajaB.getText());
    ficheroGuardador.close();
  }
  
  private void alertas() {
    Alert alert = new Alert(AlertType.ERROR);
    alert.setTitle("Clave incorrecta");
    alert.setHeaderText("Clave incorrecta");
    alert.setContentText("La clave debe ser un entero");
    alert.showAndWait();
  }

  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {
    slider.valueProperty().addListener((observable, oldValue, newValue) -> {
      clave.setText(Integer.toString(observable.getValue().intValue()));
    });
  }
}