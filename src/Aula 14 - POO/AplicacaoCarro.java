public class AplicacaoCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.exibirDetalhes();

        Carro carro2 = new Carro("Toyota", "Corolla");
        carro2.exibirDetalhes();

        Carro carro3 = new Carro("Honda", "Civic", 2025);
        carro3.exibirDetalhes();
    }
}
