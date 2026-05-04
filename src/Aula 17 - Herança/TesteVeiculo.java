class Veiculo {
    void acelerar() {
        System.out.println("Veículo acelerando!");
    }
}
class Moto extends Veiculo {
    void acelerar() {
        System.out.println("Moto acelerando!");
        super.acelerar();
    }
}
 public class TesteVeiculo {
    public static void main(String[] args) {
        Moto v1 = new Moto();
        v1.acelerar();
    }
}
