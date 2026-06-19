import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.web.WebView;

public class ExemploStreaming extends Application {

    @Override
    public void start(Stage palco) {

        WebView webView = new WebView();

        String urlVideo = "https://www.youtube.com/watch?v=xT8HIiFQ8Y0&list=RDxT8HIiFQ8Y0&start_radio=1";

        webView.getEngine().load(urlVideo);

        Scene cena = new Scene(webView, 800, 600);
        palco.setTitle("Aquarela");
        palco.setScene(cena);
        palco.show();
    }
    public static void main(String[] args){
        launch(args);

    }
}
