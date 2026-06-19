import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;


public class ExemploVideo extends Application {

    @Override
    public void start(Stage palcoPrincipal) {

        java.io.File arquivo = new java.io.File("C:\\Users\\azeve\\OneDrive\\Área de Trabalho\\Programação\\ADM\\meuVideo.mp4");

// Converte o arquivo para o formato de URI que o JavaFX pede
        String urlDoVideo = arquivo.toURI().toString();

        Media media = new Media (urlDoVideo);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        HBox hBox = new HBox();
        hBox.getChildren().add(mediaView);

        Scene scene = new Scene(hBox, 800, 600);
        palcoPrincipal.setTitle("meuVideo");
        palcoPrincipal.setScene(scene);
        palcoPrincipal.show();

        mediaPlayer.play();
    }
    public static void main(String[] args){
        launch(args);

    }
}
