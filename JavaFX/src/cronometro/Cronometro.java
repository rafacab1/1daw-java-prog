package cronometro;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Cronometro extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @SuppressWarnings("deprecation")
  @Override
  public void start(Stage primaryStage) throws Exception {
    Boolean corriendo = true;
    Label horas = new Label("00");
    Label minutos = new Label("00");
    Label segundos = new Label("00");
    Label centesimas = new Label("00");
    Label puntos1 = new Label(":");
    Label puntos2 = new Label(":");
    Label puntos3 = new Label(":");

    Font fuente = new Font("Consolas", 30);
    horas.setFont(fuente);
    minutos.setFont(fuente);
    segundos.setFont(fuente);
    centesimas.setFont(fuente);
    puntos1.setFont(fuente);
    puntos2.setFont(fuente);
    puntos3.setFont(fuente);

    Button iniciar = new Button("Iniciar");
    Button pausar = new Button("Pausar");
    Button reiniciar = new Button("Reiniciar");

    HBox reloj = new HBox(horas, puntos1, minutos, puntos2, segundos, puntos3, centesimas);
    reloj.setAlignment(Pos.CENTER);
    reloj.setPadding(new Insets(10));
    HBox botonera = new HBox(iniciar, pausar, reiniciar);
    botonera.setAlignment(Pos.CENTER);
    botonera.setPadding(new Insets(10));

    VBox container = new VBox(reloj, botonera);
    container.setPadding(new Insets(10));

    Thread hilo = new Thread(new Runnable() {
      @Override
      public void run() {
        while (corriendo) {

          Platform.runLater(new Runnable() {
            @Override
            public void run() {
              centesimas.setText(Integer.toString(Integer.parseInt(centesimas.getText()) + 1));
              if (centesimas.getText().equals("100")) {
                segundos.setText(Integer.toString(Integer.parseInt(segundos.getText()) + 1));
                centesimas.setText("00");
              }
              if (segundos.getText().equals("60")) {
                minutos.setText(Integer.toString(Integer.parseInt(minutos.getText()) + 1));
                segundos.setText("00");
                centesimas.setText("00");
              }
              if (minutos.getText().equals("60")) {
                horas.setText(Integer.toString(Integer.parseInt(horas.getText()) + 1));
                minutos.setText("00");
                segundos.setText("00");
                centesimas.setText("00");
              }

            }
          });

          try {
            Thread.sleep(10);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }

        }
      }
    });
    
    hilo.start();

    iniciar.setOnAction(e -> {
      hilo.resume();
    });

    pausar.setOnAction(e -> {
      hilo.suspend();
    });

    reiniciar.setOnAction(e -> {
      hilo.suspend();
      horas.setText("00");
      minutos.setText("00");
      segundos.setText("00");
      centesimas.setText("00");
    });

    Scene scene = new Scene(container);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Cronómetro");
    primaryStage.setResizable(false);
    primaryStage.show();

  }

}
