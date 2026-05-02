public class Funcionario {

    String nome;
    String cargo;
    int idade;

    Funcionario(String nome, String cargo, int idade){
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }
    public static void main (String[] args){
     Funcionario funcionario1 = new Funcionario("João", "Desenvolvedor", 37);
     Funcionario funcionario2 = new Funcionario("Ana", "Gerente", 28);

     System.out.println("As informações de " + funcionario1.nome + " são: " + funcionario1.cargo + " é seu cargo e sua idade é " + funcionario1.idade);
     System.out.println("As informações de " + funcionario2.nome + " são: " + funcionario2.cargo + " é seu cargo e sua idade é " + funcionario2.idade);
    }
}
