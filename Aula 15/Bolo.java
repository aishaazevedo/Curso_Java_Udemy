public class Bolo {

    int qtdLeite;

    public static void main (String[] args){

        Bolo boloDeChocolate = new Bolo();
        boloDeChocolate.qtdLeite = 100;

        Bolo boloDeCenoura = new Bolo();
        boloDeCenoura.qtdLeite = 120;

        System.out.println("O bolo de chocolate precisa de " + boloDeChocolate.qtdLeite + " ml de leie.");
        System.out.println("O bolo de cenoura precisa de " + boloDeCenoura.qtdLeite + " ml de leie.");
    }
}
