package empresa.execucao; // Declara que este arquivo pertence a outro pacote

// O "import" é necessário porque Empregado está em outra pasta (pacote)
import empresa.dados.Empregado;

public class FolhaDePagamento {
    public static void main(String[] args) {
        // Agora você pode usar a classe Empregado
        Empregado emp = new Empregado("Maria", 6200.0);

        System.out.println("Nome: " + emp.nome);
        System.out.println("Salário: " + emp.salario);
    }
}