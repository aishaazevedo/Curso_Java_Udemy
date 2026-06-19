import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ExemploImagem extends Application {

    @Override
    public void start(Stage palco) {
        String caminhoImagem = "file:///C:/Users/azeve/OneDrive/Pictures/gato.jpg";

        Image imagem = new Image(caminhoImagem);
        ImageView imageView = new ImageView(imagem);

        imageView.setFitHeight(640);
        imageView.setFitWidth(613);
        imageView.setPreserveRatio(true);

        VBox layout = new VBox(imageView);
        Scene cena = new Scene(layout, 700, 700);

        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
