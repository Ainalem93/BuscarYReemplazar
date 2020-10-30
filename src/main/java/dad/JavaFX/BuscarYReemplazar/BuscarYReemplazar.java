package dad.JavaFX.BuscarYReemplazar;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYReemplazar extends Application{
	
	private TextField buscarText;
	private TextField reemplazarText;
	private Label buscarLabel;
	private Label reemplazarLabel;
	private Button buscarBoton;
	private Button reemplazarBoton;
	private Button reemTodoBoton;
	private Button cerrarBoton;
	private Button ayudaBoton;
	private RadioButton maymin;
	private RadioButton expreReg;
	private RadioButton busAtras;
	private RadioButton resResul;

	@Override
	public void start(Stage primaryStage) throws Exception {
		buscarText = new TextField();
		reemplazarText = new TextField();
		
		buscarLabel = new Label("Buscar: ");
		reemplazarLabel = new Label("Reemplazar con: ");
		
		buscarBoton = new Button("Buscar");
		buscarBoton.setPrefWidth(100);
		reemplazarBoton = new Button("Reemplazar");
		reemplazarBoton.setPrefWidth(100);
		reemTodoBoton = new Button("Reemplazar todo");
		reemTodoBoton.setPrefWidth(100);
		cerrarBoton = new Button("Cerrar");
		cerrarBoton.setPrefWidth(100);
		ayudaBoton = new Button("Ayuda");
		ayudaBoton.setPrefWidth(100);
		
		maymin = new RadioButton("Mayúsculas y minúsculas");
		expreReg = new RadioButton("Expreción regular");
		busAtras = new RadioButton("Buscar hacia atrás");
		resResul = new RadioButton("Resaltar resultados");
		
		ToggleGroup botones = new ToggleGroup();
		botones.getToggles().addAll(maymin, expreReg, busAtras, resResul);
		
		GridPane botonera = new GridPane();
		botonera.addRow(0, maymin, busAtras);
		botonera.addRow(1, expreReg, resResul);
		botonera.setVgap(5);
		
		ColumnConstraints[] constraintBotonera = {new ColumnConstraints(), new ColumnConstraints()};
		constraintBotonera[0].setHgrow(Priority.ALWAYS);
		constraintBotonera[1].setHgrow(Priority.ALWAYS);
		
		botonera.getColumnConstraints().setAll(constraintBotonera);
		
		
		VBox botonesDerecha = new VBox();
		botonesDerecha.getChildren().addAll(reemTodoBoton, cerrarBoton, ayudaBoton);
		botonesDerecha.setSpacing(5);
		
		GridPane view = new GridPane();
		view.setGridLinesVisible(false);
		view.setVgap(5);
		view.setHgap(5);
		view.setAlignment(Pos.TOP_CENTER);
		view.addRow(0, buscarLabel, buscarText, buscarBoton);
		view.addRow(1, reemplazarLabel, reemplazarText, reemplazarBoton);
		view.addRow(2, new Label(""), botonera, botonesDerecha);
		
		ColumnConstraints[] constraintView = {new ColumnConstraints(), new ColumnConstraints()};
		constraintView[0].setHalignment(HPos.LEFT);
		constraintView[1].setFillWidth(true);
		constraintView[1].setHgrow(Priority.ALWAYS);
		
		
		view.getColumnConstraints().setAll(constraintView);
		
		Scene scene = new Scene(view, 480, 320);
		primaryStage.setTitle("Calculadora"); // nombre de arriba de la caja
		primaryStage.setScene(scene); // mostrar caja
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {

		launch(args);
	}

}
