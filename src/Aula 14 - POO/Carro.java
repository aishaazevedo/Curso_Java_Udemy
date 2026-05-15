public class Carro {
    String marcaDoCarro;
    String modeloDoCarro;
    int anoDoCarro;

    Carro() {
        marcaDoCarro = "Desconhecida";
        modeloDoCarro = "Desconhecido";
        anoDoCarro = 0;
    }

    Carro(String marcaDoCarroInit, String modeloDoCarroInit) {
        marcaDoCarro = marcaDoCarroInit;
        modeloDoCarro = modeloDoCarroInit;
        anoDoCarro = 0;
    }

    Carro(String marcaDoCarroInit, String modeloDoCarroInit, int anoDoCarroInit) {
        marcaDoCarro = marcaDoCarroInit;
        modeloDoCarro = modeloDoCarroInit;
        anoDoCarro = anoDoCarroInit;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marcaDoCarro);
        System.out.println("Modelo: " + modeloDoCarro);
        System.out.println("Ano: " + anoDoCarro);
        System.out.println(); // Pula uma linha conforme pedido
    }
}

