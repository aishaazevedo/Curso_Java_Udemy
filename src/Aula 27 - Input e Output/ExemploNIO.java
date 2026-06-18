import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;



public class ExemploNIO {
    public static void main(String[] args) {

        Path path = Paths.get("meuArquivo.txt");

        try {
            //Files é uma classe, write é o método static e path é o caminho
            Files.write(path, "Olá mundo!".getBytes());

            byte[] bytes = Files.readAllBytes(path);
            String content = new String(bytes);

            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Problema de IO " + e.getMessage());
        }
    }
}