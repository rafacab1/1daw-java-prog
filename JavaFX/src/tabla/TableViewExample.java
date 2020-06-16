/**
 * The JavaFX TableView enables you to display table views inside your JavaFX applications. 
 * 
 * The JavaFX TableView is represented by the class javafx.scene.control.TableView 
 * 
 * See more at http://tutorials.jenkov.com/javafx/tableview.html
 */

package tabla;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;

public class TableViewExample extends Application {

  public static void main(String[] args) {
    launch(args);
  }
  
  private FileChooser fileSaver;
  private File ficheroGuardar;
  private BufferedWriter ficheroGuardador;
  
  private FileChooser fileChooser;
  private File fichero;
  private BufferedReader ficheroLeer;
  private String line;

  @Override
  public void start(Stage primaryStage) {

    // In order to use a JavaFX TableView component you must first create a TableView instance
    TableView<Contact> tableView = new TableView<Contact>();

    /*
     * Having created a TableView you need to add one or more TableColumn instances to the 
     * TableView instance. 
     * 
     * A TableColumn represents a vertical column of values. 
     * 
     * Each value is displayed on its own row, and is typically extracted from the list of objects 
     * being displayed in the TableView.
     */

    TableColumn<Contact, String> column1 = new TableColumn<>("First Name");
    TableColumn<Contact, String> column2 = new TableColumn<>("Last Name");
    TableColumn<Contact, String> column3 = new TableColumn<>("Name");
    TableColumn<Contact, String> column4 = new TableColumn<>("Phone");

    /*
     * A TableColumn must have a cell value factory set on it. 
     * 
     * The cell value factory extracts the value to be displayed in each cell (on each row) in the 
     * column. 
     * 
     * The PropertyValueFactory factory can extract a property value (field value) from a Java object. 
     * 
     * The name of the property is passed as a parameter to the PropertyValueFactory constructor.
     */

    column1.setCellValueFactory(new PropertyValueFactory<>("firstName"));
    column2.setCellValueFactory(new PropertyValueFactory<>("lastName"));
    column3.setCellValueFactory(new PropertyValueFactory<>("name"));
    column4.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));

    // Add columns
    tableView.getColumns().add(column1);
    tableView.getColumns().add(column2);
    tableView.getColumns().add(column3);
    tableView.getColumns().add(column4);

    /*
     * You can set a placeholder to be displayed when the JavaFX TableView has no rows to display. 
     * 
     * The placeholder must be an instance of the JavaFX Node class, which most (if not all) JavaFX 
     * controls are. 
     */

    tableView.setPlaceholder(new Label("No rows to display"));

    /*
     * Once you have added TableColumn instances to the JavaFX TableView, you can add the data 
     * to be displayed to the TableView. 
     */

    tableView.getItems().add(new Contact("John", "Doe", "666111222"));
    tableView.getItems().add(new Contact("Jane", "Deer", "666111222"));
    tableView.getItems().add(new Contact("Mike", "Scot", "666111222"));
    tableView.getItems().add(new Contact("Lucy", "Bonn", "666111222"));
    tableView.getItems().add(new Contact("Pepe", "Bond", "666111222"));

    TextArea textArea = new TextArea();

    // To obtain a list of the row items of a JavaFX TableView, you call getItems() method. 

    Button buttonPrint = new Button("Print Table");
    buttonPrint.setOnAction(e -> {
      for (Contact contact : tableView.getItems()) {
        textArea.appendText(contact + "\n");
      }
      textArea.appendText("---\n");
    });

    /*
     * The JavaFX TableView component has an internal SelectionModel which is used to either read 
     * what rows and / or cells the user has selected, or to select rows and cells programmatically
     */

    TableViewSelectionModel<Contact> selectionModel = tableView.getSelectionModel();

    // set selection mode to only 1 row (default)
    selectionModel.setSelectionMode(SelectionMode.SINGLE);

    // You can set selection mode to multiple rows

    Button buttonSelection = new Button("Multiple Selection");
    buttonSelection.setOnAction(e -> {
      if (selectionModel.getSelectionMode().equals(SelectionMode.SINGLE)) {
        selectionModel.setSelectionMode(SelectionMode.MULTIPLE);
        buttonSelection.setText("Single Selection");
      } else {
        selectionModel.setSelectionMode(SelectionMode.SINGLE);
        buttonSelection.setText("Multiple Selection");
      }
    });

    /*
     *  To obtain a list of the selected row items of a JavaFX TableView, you call the 
     *  SelectionModel getSelectedItems() method. 
     */

    Button buttonItems = new Button("Selected Items");
    buttonItems.setOnAction(e -> {
      ObservableList<Contact> selectedItems = selectionModel.getSelectedItems();
      for (Contact contact : selectedItems) {
        textArea.appendText(contact + "\n");
      }
      textArea.appendText("---\n");
    });

    /*
     * You can also just obtain a list of the indices of the selected rows, 
     * instead of the selected items themselves. 
     */

    Button buttonIndices = new Button("Selected Indices");
    buttonIndices.setOnAction(e -> {
      ObservableList<Integer> selectedIndices = selectionModel.getSelectedIndices();
      textArea.appendText("Indices: " + selectedIndices.toString() + "\n");
      textArea.appendText("---\n");
    });

    /*
     *  You can clear all selected rows and cells using the TableViewSelectionModel clearSelection() 
     *  method.
     */

    Button buttonClear = new Button("Clear");
    buttonClear.setOnAction(e -> {
      selectionModel.clearSelection();
      textArea.clear();
    });
    
    /*
     * Nuevo elemento
     */
    
    Button buttonAnadir = new Button("Add");
    buttonAnadir.setOnAction(e -> {           
      TextField addfName = new TextField();
      TextField addlName = new TextField();
      TextField addPhone = new TextField();
      
      HBox fName = new HBox(new Label("First Name"), addfName);
      fName.setAlignment(Pos.CENTER);
      HBox.setMargin(addfName, new Insets(10, 10, 10, 10));
      HBox lName = new HBox(new Label("Last Name"), addlName);
      lName.setAlignment(Pos.CENTER);
      HBox.setMargin(addlName, new Insets(10, 10, 10, 10));
      HBox hbPhone = new HBox(new Label("Phone"), addPhone);
      hbPhone.setAlignment(Pos.CENTER);
      HBox.setMargin(addPhone, new Insets(10, 10, 10, 10));
      VBox vboxadd = new VBox(fName, lName, hbPhone);
      vboxadd.setPadding(new Insets(20, 20, 20, 20));
      
      // Botón
      StackPane spbtn = new StackPane();
      Button btnAc = new Button("Save Contact");
      spbtn.getChildren().add(btnAc);
      StackPane.setAlignment(btnAc, Pos.BOTTOM_CENTER);
      StackPane.setMargin(btnAc, new Insets(20, 20, 20, 20));
      vboxadd.getChildren().add(spbtn);
            
      Stage addContactStg = new Stage();
      addContactStg.setScene(new Scene(vboxadd));
      addContactStg.setTitle("Add Contact");
      addContactStg.setResizable(false);
      addContactStg.setAlwaysOnTop(true);
      
      btnAc.setOnAction(save -> {
        tableView.getItems().add(new Contact(addfName.getText(), addlName.getText(), addPhone.getText()));
        addContactStg.close();
      });
      
      addContactStg.show();
      
    });
    
    /*
     * Borrar elemento
     */
    Button buttonBorrar = new Button("Delete");
    buttonBorrar.setOnAction(e -> {
      tableView.getItems().removeAll(selectionModel.getSelectedItems());
    });
    
    
    /*
     * Modificar elementos
     */
    tableView.setEditable(true);    
    column1.setCellFactory(TextFieldTableCell.forTableColumn());
    column1.setOnEditCommit(
        new EventHandler<CellEditEvent<Contact, String>>() {
            @Override
            public void handle(CellEditEvent<Contact, String> t) {
                ((Contact) t.getTableView().getItems().get(
                    t.getTablePosition().getRow())
                    ).setFirstName(t.getNewValue());
            }
        }
    );
    
    column2.setCellFactory(TextFieldTableCell.forTableColumn());
    column2.setOnEditCommit(
        new EventHandler<CellEditEvent<Contact, String>>() {
            @Override
            public void handle(CellEditEvent<Contact, String> t) {
                ((Contact) t.getTableView().getItems().get(
                    t.getTablePosition().getRow())
                    ).setLastName(t.getNewValue());
            }
        }
    );
    
    column4.setCellFactory(TextFieldTableCell.forTableColumn());
    column4.setOnEditCommit(
        new EventHandler<CellEditEvent<Contact, String>>() {
            @Override
            public void handle(CellEditEvent<Contact, String> t) {
                ((Contact) t.getTableView().getItems().get(
                    t.getTablePosition().getRow())
                    ).setPhoneNumber(t.getNewValue());
            }
        }
    );
    
    /*
     * Guardar en fichero
     */
    Button buttonExportar = new Button("Export");
    buttonExportar.setOnAction(e -> {
      Gson gson = new Gson();
      String json = "{\n";
      for (Contact c : tableView.getItems()) {
        json += gson.toJson(c) + "\n";
      }
      json += "}";
      System.out.println(json);
      
      
      fileSaver = new FileChooser();
      fileSaver.setInitialFileName("contacts.json");
      fileSaver.getExtensionFilters().addAll(new ExtensionFilter("JSON File", "*.json"));
      ficheroGuardar = fileSaver.showSaveDialog(new Stage());
      try {
        ficheroGuardador = new BufferedWriter(new FileWriter(ficheroGuardar.getAbsolutePath()));
        ficheroGuardador.write(json);
        ficheroGuardador.close();
      } catch (IOException e1) {
        e1.printStackTrace();
      }
    });
    
    /*
     * Recuperar de un fichero
     */
    Button buttonImportar = new Button("Import");
    buttonImportar.setOnAction(e -> {
      fileChooser = new FileChooser();
      fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Archivos JSON", "*.json"));
      fichero = fileChooser.showOpenDialog(new Stage());
      try {
        ficheroLeer = new BufferedReader(new FileReader(fichero.getAbsolutePath()));
        Gson gson = new Gson();
        
        line = ficheroLeer.readLine();
        line = ficheroLeer.readLine();
        BufferedReader f2 = ficheroLeer;
        String l2 = f2.readLine();
        while (l2 != null) {
          tableView.getItems().add(gson.fromJson(line, Contact.class));
          line = ficheroLeer.readLine(); // Lee la siguiente línea
          l2 = f2.readLine();
        }
      } catch (IOException e1) {
        e1.printStackTrace();
      }
    });



    // It is possible to listen for selection changes in the TableViewSelectionModel

    ObservableList<Contact> selectedItems = selectionModel.getSelectedItems();

    selectedItems.addListener(new ListChangeListener<Contact>() {
      @Override
      public void onChanged(Change<? extends Contact> change) {
        System.out.println("Selection changed: " + change.getList());
      }
    });

    // Layout, scene and stage
    HBox hBox = new HBox(10, buttonPrint, buttonItems, buttonIndices, buttonSelection, buttonClear);
    HBox hBox2 = new HBox(10, buttonAnadir, buttonBorrar, buttonExportar, buttonImportar);
    hBox.setAlignment(Pos.CENTER);
    hBox2.setAlignment(Pos.CENTER);

    VBox root = new VBox(10, tableView, hBox, hBox2, textArea);
    root.setPadding(new Insets(10));

    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.setTitle("TableView Modificado");
    primaryStage.show();
    
  }

}