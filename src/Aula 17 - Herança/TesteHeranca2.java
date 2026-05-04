class Felino {
    public String nome;

    Felino(String nome) {
        this.nome = nome;
    }
}

class Gato extends Felino {
    String cor;

    Gato(String nome, String cor) {
        super(nome);
        this.cor = cor;
    }
}

public class TesteHeranca2 {
    public static void main(String[] args) {
        Gato gato = new Gato("Mingau", "Branco");

        System.out.println("O nome é: " + gato.nome);
        System.out.println("A cor é: " + gato.cor);
    }
}