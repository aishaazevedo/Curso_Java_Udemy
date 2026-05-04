// Usando @Deprecated

class InformaRegras{
    @Deprecated
    public void mostraRegrasParaAponsentadoria(){
        System.out.println("Regras para a aponsentadoria");
    }
    public void mostraNovasRegrasParaAponsentadoria(){
        System.out.println("Novas regras para a aponsentadoria");
    }
}
public class Previdencia {
    public static void main (String[] args){
        InformaRegras regras = new InformaRegras();

        // Uso do método obsoleto
        //regras.mostraRegrasParaAponsentadoria();

        //Uso do novo método
        regras.mostraNovasRegrasParaAponsentadoria();
    }
}
