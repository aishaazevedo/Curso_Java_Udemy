abstract class Instrumentos{
    abstract void tocar();
}


class Violao extends Instrumentos{
public void tocar(){
    System.out.println("Tocando violao");
}
}
class Piano extends Instrumentos{
    public void tocar(){
        System.out.println("Tocando piano");
    }

}

public class TesteInstrumentos {
    public static void main(String[] args){
        Object piano = new Piano();
        ((Piano) piano).tocar();

        Object violao = new Violao();
        ((Violao) violao).tocar();
    }
}
