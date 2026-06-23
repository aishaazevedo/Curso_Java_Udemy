import java.io.*;
public class Exemplo2 {
    public static void main(String[] args) {
        try {

            FileWriter writer = new FileWriter("C:/Users/azeve/OneDrive/Área de Trabalho/Programação/ADM/meuTextinho.txt");
            writer.write("Testando...");
            writer.close();

            FileReader reader = new FileReader("C:\\Users\\azeve\\OneDrive\\Área de Trabalho\\Programação\\ADM\\meuTextinho.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);

                data = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Problemas de IO: " + e.getMessage());
        }
    }
}
