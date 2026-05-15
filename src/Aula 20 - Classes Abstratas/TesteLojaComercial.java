abstract class Loja {
    private String cnpj;
    private String razaoSocial;
    protected boolean aberta;

    public Loja(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false;
    }
    public void abrir(){
        this.aberta = true;
    }
    public void fechar(){
        this.aberta = false;
    }
}
class LojaComercial extends Loja {

    public LojaComercial(String cnpj, String razaoSocial) {
        super(cnpj, razaoSocial);
    }
}

public class TesteLojaComercial {
    public static void main(String[] args) {
        LojaComercial l1 = new LojaComercial("122222", "Lojinha da Ana");

        l1.abrir();
        System.out.println("A loja está aberta? " + l1.aberta);
    }
}