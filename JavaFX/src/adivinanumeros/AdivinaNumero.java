package adivinanumeros;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

public class AdivinaNumero extends Application {

  @Override
  public void start(Stage primaryStage) throws IOException {
    primaryStage.setTitle("Adivina el número"); // Título
    primaryStage.setResizable(false); // Bloque el redimensionamiento
    FXMLLoader fxml = new FXMLLoader(this.getClass().getResource("AdivinaNumero.fxml"));
    GridPane root = fxml.<GridPane>load(); // Creo el GridPane
    primaryStage.setScene(new Scene(root)); // Crea la escena
    primaryStage.show(); // Muestra la escena
  }
  
  public static void main(String[] args) {
    launch(args);

  }

}
