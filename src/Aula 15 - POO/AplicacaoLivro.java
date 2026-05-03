public class AplicacaoLivro {
    public static void main (String[] agrs){
        Livro l1 = new Livro();
        l1.exibirDetalhes();

        Livro l2 = new Livro ("A hora da Estrela", "Clarice Lispector");
        l2.exibirDetalhes();

        Livro l3 = new Livro ("O Cortiço", "Aluísio de Azevedo", 1890, 12.56);
        l3.exibirDetalhes();
    }
}
