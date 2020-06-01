package regexpfx;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class regexpfx extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
	  primaryStage.setTitle("Buscador con expresiones regulares"); // Título
    primaryStage.setResizable(false); // Hace que no se pueda redimensionar
    FXMLLoader fxml = new FXMLLoader(this.getClass().getResource("Regexpfx.fxml")); // Cargar fxml
    GridPane root = fxml.<GridPane>load(); // Crear GridPane
    primaryStage.setScene(new Scene(root)); // Crear escena
    primaryStage.show(); // Mostrar escena
	}

	public static void main(String[] args) {
		launch(args);
	}
}
