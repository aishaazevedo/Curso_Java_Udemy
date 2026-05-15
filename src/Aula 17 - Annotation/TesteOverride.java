
class Reptil{

    public void morder() {
        System.out.println("O reptil morde.");
    }
}
class Cobra extends Reptil {
    @Override
    public void morder() {
        System.out.println("A cobra morde.");
    }
}

public class TesteOverride {
    public static void main (String[] args){
        Cobra jararaca = new Cobra();
        jararaca.morder();
    }
}
