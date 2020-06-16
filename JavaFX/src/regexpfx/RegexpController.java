package regexpfx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class RegexpController implements Initializable {
  
  // TextField //////
  @FXML
  private TextField patrontxt;
  
  // TextArea //////
  @FXML
  private TextArea cajaA;
  @FXML
  private TextArea cajaB;  
  
  // Button //////
  @FXML
  private Button btncargar;
  @FXML
  private Button buscaCoincidencias;
  
  // ComboBox //////
  @FXML
  private ComboBox<String> fontchooser;
  
  // Spinner //////
  @FXML
  private Spinner<Integer> fontsize;
  
  // Usado en initialize para recuperar el valor por defecto del TextArea
  private int initSize;
  
  // Usado para cargar el fichero
  private FileChooser fileChooser;
  private File fichero;
  private BufferedReader ficheroLeer;
  private String line;
  
  /**
   * Método para cargar el fichero, leerlo y insertar el contenido en cajaA
   * @param e
   * @throws IOException
   */
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
  
  public void buscar(ActionEvent e) throws IOException {
    cajaB.setText(Extractor.buscarRegexp(cajaA.getText(), patrontxt.getText()));
  }
  
  public void fuente(ActionEvent e) {
    cajaB.setFont(new Font(fontchooser.getValue().toString(), fontsize.getValue()));
  }
  
  public void tamanofuente(MouseEvent me) {
    cajaB.setFont(new Font(fontchooser.getValue().toString(), fontsize.getValue()));
  }
  
  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {
    // Inicializo el spinner
    initSize = (int) cajaB.getFont().getSize();
    fontsize.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 300, initSize));

    // Añado al ComboBox las fuentes disponibles
    fontchooser.getItems().addAll("Liberation Serif", "FreeMono", "Monaco", "Liberation Sans");
    fontchooser.getSelectionModel().selectFirst();
    
    // Establezco los valores, la fuente por defecto y el tamaño por defecto
    cajaB.setFont(new Font(fontchooser.getValue().toString(), fontsize.getValue()));
    
  }

}
