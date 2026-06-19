import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import java.io.File; // Import correto do Java IO

public class ExemploFileChoose extends Application {

    @Override
    public void start(Stage palco) {
        FileChooser seletorDeArquivo = new FileChooser();
        seletorDeArquivo.setTitle("Escolha um arquivo");

        Button botaoAbrir = new Button("Abrir arquivo");

        botaoAbrir.setOnAction(e -> {

            File arquivoSelecionado = seletorDeArquivo.showOpenDialog(palco);

            if (arquivoSelecionado != null) {
                exibirImagem(arquivoSelecionado, palco);
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
        imageView.setPreserveRatio(true); // Dica: mantém a proporção da imagem sem distorcer

        // Para obter o layout atual e adicionar a imagem
        VBox layout = (VBox) palcoDoArquivoSelecionado.getScene().getRoot();
        layout.getChildren().add(imageView);

        palcoDoArquivoSelecionado.setTitle("Seletor de Arquivos - Imagem Aberta");
    }

    public static void main(String[] args) {
        launch(args);
    }
}