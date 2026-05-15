class Gente {
    private String nome;
    private int idade;

    public Gente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

class Aluno extends Gente {
    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
}
// Inicialização via construtor:

public class TesteHeranca4 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ana", 15, 123);

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Matrícula: " + aluno1.getMatricula());
    }
}
/*
Inicialização via setters:

public class TesteHeranca4 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno ();
        aluno1.setNome("Ana");
        aluno1.setIdade(14);
        aluno1.setMatricula(123);

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Matrícula: " + aluno1.getMatricula());
    }
}
 */