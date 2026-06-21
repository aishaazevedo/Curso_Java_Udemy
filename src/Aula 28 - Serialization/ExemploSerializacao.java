import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExemploSerializacao {

    private static void serializarContatos(List<Contato> listaContatos) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("agenda"))) {
            outputStream.writeObject(listaContatos);
            System.out.println("Contatos serializados e salvos");
        }
    }

    private static void deserializarContatos() throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("agenda"))) {
            List<Contato> contatosLidos = (List<Contato>) inputStream.readObject();
            for (Contato contato : contatosLidos) {
                System.out.println("Nome: " + contato.nome + ", Telefone: " + contato.telefone);
            }
        }
    }

    public static void main(String[] args) {
        Contato contato1 = new Contato("Ana", "999998562");
        Contato contato2 = new Contato("Maria", "998562562");
        Contato contato3 = new Contato("Alice", "994568562");

        List<Contato> listaContatos = new ArrayList<>();
        listaContatos.add(contato1);
        listaContatos.add(contato2);
        listaContatos.add(contato3);

        try {
            serializarContatos(listaContatos);
            deserializarContatos();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao manipular dados: " + e.getMessage());
        }
    }
}
