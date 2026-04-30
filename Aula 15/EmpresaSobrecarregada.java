public class EmpresaSobrecarregada {
    String nome;
    String cargo;
    int idade;

    EmpresaSobrecarregada(String nomeInit, String cargoInit, int idadeInit){
        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;
    }
    EmpresaSobrecarregada(String nomeInit){
        nome = nomeInit;
    }
    EmpresaSobrecarregada(){
    }

    public static void main (String[] args){
        EmpresaSobrecarregada funcionario1 = new EmpresaSobrecarregada ("Maria");

        System.out.println("As informações de " + funcionario1.nome + " são: " + funcionario1.cargo + " é seu cargo e sua idade é " + funcionario1.idade);

    }
}
