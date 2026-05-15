public class Funcionario2 {
    String nome;
    String cargo;
    int idade;

    Funcionario2 (String nomeInit, String cargoInit, int idadeInit){
        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;
    }

    //Construtor que simula o Default:

    Funcionario2(){

    }
    public static void main (String[] args){
       Funcionario2 funcionario1 = new Funcionario2();
       funcionario1.nome = "Ana";
    }
}
