import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;

public class ExemploGrindPane extends Application {

    @Override
    public void start (Stage palco){
        Label rotuloNome = new Label("Nome:");
        Label rotuloEmail = new Label("Email:");

        TextField campoNome = new TextField();
        TextField campoEmail = new TextField();

        Button botaoEnviar = new Button("Enviar");

        GridPane gridpane = new GridPane();
        gridpane.setHgap(8); //espaçamento horizontal
        gridpane.setVgap(8); // vertical
        gridpane.setPadding(new Insets(5)); //espaçamento externo

        gridpane.addRow(0, rotuloNome, campoNome);
        gridpane.addRow(1, rotuloEmail, campoEmail);
        gridpane.addRow(2, botaoEnviar);

        Scene cena = new Scene(gridpane, 400,200);
        palco.setScene(cena);
        palco.show();

    }

    public static void main(String[] args){
        launch(args);

    }
}
