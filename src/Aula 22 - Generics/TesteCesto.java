/*

Crie a classe genérica Cesto:

Defina a classe Cesto com um atributo genérico conteudo.

Implemente métodos guardar e pegar para armazenar e recuperar objetos do cesto.

Teste a funcionalidade:

No método main, crie instâncias de Cesto para Peixe e Polvo.

Guarde instâncias de Peixe e Polvo nos respectivos cestos.

Recupere e imprima os objetos armazenados.
 */

class Peixe{
   private String nome;
   private int tamanho;

    public Peixe (String nome, int tamanho){
        this.nome = nome;
        this.tamanho = tamanho;
    }
    public String getNome(){
        return nome;
    }
    public int getTamanho(){
        return tamanho;
    }
}

class Polvo{
    private String nome;
    private int tentaculos;

    public Polvo (String nome, int tentaculos){
        this.nome = nome;
        this.tentaculos = tentaculos;
    }
    public String getNome(){
        return nome;
    }
    public int getTentaculos(){
        return tentaculos;
    }
}

public class TesteCesto {
    public static void main (String[] args){
 Polvo polvo = new Polvo("Lula Molusco", 12);
 Peixe peixe = new Peixe ("Nemo", 4);

        System.out.println("O polvo é : " + polvo.getNome() );
        System.out.println("O peixe é : " + peixe.getNome());

    }
}
