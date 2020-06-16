package quitacomentarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class QuitaComentariosController implements Initializable {

  private FileChooser fileChooser;
  private File fichero;
  private BufferedReader ficheroLeer;
  
  @FXML
  private TextArea caja;
  
  @FXML
  public void cargar(ActionEvent e) throws FileNotFoundException {
    fileChooser = new FileChooser();
    fichero = fileChooser.showOpenDialog(new Stage());
    ficheroLeer = new BufferedReader(new FileReader(fichero.getAbsolutePath()));
  }
  
  @FXML
  public void realizar(ActionEvent e) {
    caja.setText(quita_comentarios.quitador(ficheroLeer));
  }
  
  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {
    // TODO Auto-generated method stub
    
  }

}
