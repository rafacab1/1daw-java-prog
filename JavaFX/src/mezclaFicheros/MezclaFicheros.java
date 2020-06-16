package mezclaFicheros;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;


public class MezclaFicheros extends Application {
  @Override
  public void start(Stage primaryStage) throws IOException {
    primaryStage.setTitle("Mezcla Ficheros"); // Título
    primaryStage.setResizable(false); // Hace que no se pueda redimensionar
    FXMLLoader fxml = new FXMLLoader(this.getClass().getResource("MezclaFicheros.fxml")); // Cargar fxml
    GridPane root = fxml.<GridPane>load(); // Crear GridPane
    primaryStage.setScene(new Scene(root)); // Crear escena
    primaryStage.show(); // Mostrar escena
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}
