package mezclaFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class MezclaFicherosController implements Initializable {

  @FXML
  private TextArea caja;
  
  private FileChooser fileChooser1;
  private File fichero1;
  private BufferedReader ficheroLeer1;
  private String line1;
  
  private FileChooser fileChooser2;
  private File fichero2;
  private BufferedReader ficheroLeer2;
  private String line2;
  
  @FXML
  public void carga1(ActionEvent e) throws FileNotFoundException {
    fileChooser1 = new FileChooser();
    fichero1 = fileChooser1.showOpenDialog(new Stage());
    ficheroLeer1 = new BufferedReader(new FileReader(fichero1.getAbsolutePath()));
    
  }
  
  @FXML
  public void carga2(ActionEvent e) throws FileNotFoundException {
    fileChooser2 = new FileChooser();
    fichero2 = fileChooser2.showOpenDialog(new Stage());
    ficheroLeer2 = new BufferedReader(new FileReader(fichero2.getAbsolutePath()));
    
  }
  
  @FXML
  public void mezclar(ActionEvent e) throws IOException {
    boolean noheAcabado1 = true;
    boolean noheAcabado2 = true;
    
    line1 = ficheroLeer1.readLine();
    line2 = ficheroLeer2.readLine();
    
    while (noheAcabado1 && noheAcabado2) {
      if (line1 != null) {
        caja.setText(caja.getText() + line1 + "\n");
        line1 = ficheroLeer1.readLine();
      } else {
        noheAcabado1 = false;
      }
      if (line2 != null) {
        caja.setText(caja.getText() + line2 + "\n");
        line2 = ficheroLeer2.readLine();
      } else {
        noheAcabado2 = false;
      }
    }
    
  }

  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {
    // TODO Auto-generated method stub
    
  }

}
