public class CaixaGenerica <T> {
    private T coisaNaCaixa;

    public void guardar(T coisa) {
        this.coisaNaCaixa = coisa;
    }
    public T pegar(){

        return coisaNaCaixa;
    }
    public static void main (String[] args){
        CaixaGenerica<Carrinho> caixaDeCarrinhos = new CaixaGenerica<>();
        caixaDeCarrinhos.guardar(new Carrinho ("Controle Remoto"));

        CaixaGenerica<Boneca> caixaDeBonecas = new CaixaGenerica<>();
        caixaDeBonecas.guardar(new Boneca ("Baby Alive"));

        Carrinho carrinho = caixaDeCarrinhos.pegar();
        Boneca boneca = caixaDeBonecas.pegar();

        System.out.println(carrinho.getModelo());
        System.out.println(boneca.getNome());

    }
}