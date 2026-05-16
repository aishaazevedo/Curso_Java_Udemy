public class Cesto<T>{
    private T coisaNoCesto;

    public void guardar(T coisa) {
        this.coisaNoCesto = coisa;
    }
    public T recuperar (){
        return coisaNoCesto;
    }
    public static void main(String[] args){
Cesto<Polvo> caixaDePolvo = new Cesto<>();
caixaDePolvo.guardar(new Polvo("lula molusco", 14));

Polvo polvo = caixaDePolvo.recuperar();
        System.out.println(polvo.getNome() + polvo.getTentaculos());
    }
}
