interface MeioTransporte {
    void acelerar();
}


class Automovel implements MeioTransporte {
    public void acelerar() {
        System.out.println("O carro acelera");
    }
}


class Motocicleta implements MeioTransporte {
    public void acelerar() {
        System.out.println("A moto acelera");
    }
}


public class Aceleracao {
    public static void main(String[] args) {

        MeioTransporte automovel = new Automovel();
        MeioTransporte motocicleta = new Motocicleta();

        motocicleta.acelerar();
        automovel.acelerar();
    }
}