abstract class Movel {
    abstract void acelerar();

    void freiar() {
        System.out.println("O móvel está freiando...");
    }
}

class Formula1Carro extends Movel {
    @Override
    void acelerar() {
        System.out.println("O carro de fórmula 1 está acelerando...");
    }
}

class Caminhao extends Movel {
    @Override
    void acelerar() {
        System.out.println("O caminhão está acelerando...");
    }
}

public class TesteAbstract {
    public static void main(String[] args) {
        Formula1Carro f1Carro = new Formula1Carro();
        Caminhao caminhao = new Caminhao();

        f1Carro.acelerar();
        f1Carro.freiar();

        caminhao.acelerar();
        caminhao.freiar();
    }
}