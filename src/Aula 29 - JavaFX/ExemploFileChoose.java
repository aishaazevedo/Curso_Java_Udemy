import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class ExemploFileChoose extends Application {

    @Override
    public void start(Stage palco) {
        FileChooser seletorDeArquivo = new FileChooser();
        seletorDeArquivo.setTitle("Escolha um arquivo");

        Button botaoAbrir = new Button("Abrir arquivo");

        botaoAbrir.setOnAction(e -> {

            File arquivoSelecionado = seletorDeArquivo.showOpenDialog(palco);

            if (arquivoSelecionado != null) {
                String nome = arquivoSelecionado.getName().toLowerCase();
                if (nome.endsWith(".png") || nome.endsWith(".jpg") || nome.endsWith(".jpeg")) {
                    exibirImagem(arquivoSelecionado, palco);
                } else if (nome.endsWith(".mp4") || nome.endsWith(".m4v") || nome.endsWith(".mov")) {
                    exibirVideo(arquivoSelecionado, palco);
                }
            }
        });

        VBox layout = new VBox(botaoAbrir);

        Scene cena = new Scene(layout, 800, 600);
        palco.setTitle("Testando FileChooser");
        palco.setScene(cena);
        palco.show();
    }

    private void exibirImagem(File arquivo, Stage palcoDoArquivoSelecionado) {
        Image imagem = new Image(arquivo.toURI().toString());
        ImageView imageView = new ImageView(imagem);

        imageView.setFitWidth(500);
        imageView.setFitHeight(500);
        imageView.setPreserveRatio(true); // Mantém a proporção da imagem sem distorcer

        VBox layout = (VBox) palcoDoArquivoSelecionado.getScene().getRoot();
        layout.getChildren().add(imageView);

        palcoDoArquivoSelecionado.setTitle("Seletor de Arquivos - Imagem Aberta");
    }
    private void exibirVideo(File arquivo, Stage palcoDoArquivoSelecionado) {
        Media media = new Media(arquivo.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        mediaView.setFitWidth(500);
        mediaView.setFitHeight(500);
        mediaView.setPreserveRatio(true);

        VBox layout = (VBox) palcoDoArquivoSelecionado.getScene().getRoot();
        layout.getChildren().add(mediaView);

        palcoDoArquivoSelecionado.setTitle("Seletor de Arquivos - Vídeo Aberto");
        mediaPlayer.play();
    }


    public static void main(String[] args) {
        launch(args);
    }
}