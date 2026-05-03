
public class Produto {
    private String nome;
    private double preco;
    private int qtdEmEstoque;

    public static void main(String[] args) {
        Produto produto = new Produto();
       produto.nome = "leite";
        produto.preco = 10.24;
        produto.qtdEmEstoque = 897;
       System.out.println("Nome: " + produto.nome);
        System.out.println("Nome: " + produto.preco);
        System.out.println("Nome: " + produto.qtdEmEstoque);
    }
}