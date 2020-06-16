package rectangulo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculaRectangulos extends Application {
  public static void main(String[] args) {
    launch(args);
  }
  
  @Override
  public void start(Stage primaryStage) throws Exception {
    TextField altura = new TextField();
    TextField anchura = new TextField();
    Label laltura = new Label("Altura");
    Label lanchura = new Label("Anchura");
    
    Button calcular = new Button("Calcular");
    
    TextArea resultado = new TextArea();
    
    HBox hbAltura = new HBox(laltura, altura);
    HBox hbAnchura = new HBox(lanchura, anchura);
    HBox.setMargin(altura, new Insets(10));
    HBox.setMargin(laltura, new Insets(10));
    HBox.setMargin(anchura, new Insets(10));
    HBox.setMargin(lanchura, new Insets(10));
    hbAltura.setPadding(new Insets(10));
    hbAnchura.setPadding(new Insets(10));
    
    VBox container = new VBox(hbAltura, hbAnchura, calcular, resultado);
    container.setPadding(new Insets(10));
    
    calcular.setOnAction(e -> {
      double perimetro = (Double.parseDouble(altura.getText()) * 2) + (Double.parseDouble(anchura.getText()) * 2);
      double area = (Double.parseDouble(altura.getText()) * Double.parseDouble(anchura.getText()));
      resultado.setText("Perímetro -> " + Double.toString(perimetro) + "\n"
          + "Área -> " + Double.toString(area));
    });
    
    primaryStage.setScene(new Scene(container));
    primaryStage.setTitle("Calcula Rectángulos");
    primaryStage.setResizable(false);
    primaryStage.show();
    
    
  }

}
