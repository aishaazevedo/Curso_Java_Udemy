public class Livro {
  public  String titulo;
  private String autor;
  protected int anoPublicacao;
  double preco;

    Livro() {
        titulo = "Desconhecido";
        autor = "Desconhecido";
        anoPublicacao = 0;
        preco = 0.0;
    }

    Livro(String tituloInit, String autorInit) {
        titulo = tituloInit;
        autor = autorInit;
        anoPublicacao = 0;
        preco = 0.0;
    }

    Livro(String tituloInit, String autorInit, int anoPublicacaooInit, double precoInit) {
        titulo = tituloInit;
        autor = autorInit;
        anoPublicacao = anoPublicacaooInit;
        preco = precoInit;
    }
    public void exibirDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("APreço: " + preco);
        System.out.println(); // Pula uma linha conforme pedido
    }
}
