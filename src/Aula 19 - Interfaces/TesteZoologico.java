interface SerVivo {
   void respirar();
}

interface Aves extends SerVivo{
    void fazerSom();
}

class Peru implements Aves {
    public void respirar(){
        System.out.println("O peru está respirando");
    }
    public void fazerSom() {
        System.out.println("O peru faz: Pru pru");
    }
}

class Galinha implements Aves {
    public void respirar(){
        System.out.println("A galinha está respirando");
    }
    public void fazerSom() {
        System.out.println("A galinha faz: Cocoricó");
    }
}

public class TesteZoologico {
    public static void main(String[] args) {
        Aves peru = new Peru();
        peru.fazerSom();
        peru.respirar();

        Aves galinha = new Galinha();
        galinha.fazerSom();
        galinha.respirar();
    }
}