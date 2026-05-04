class ExemploFinal{
//definição de constante
    final int CODIGO_FIXO = 10;
//Método Final
    final void meuMetodo(){
        System.out.println("Esse é um método Final.");
    }
}


public class TesteFinalKeyword {
    public static void main (String[] args){
        ExemploFinal testeFinal = new ExemploFinal();
        System.out.println("O valor da constante é : " + testeFinal.CODIGO_FIXO);
        testeFinal.meuMetodo();
    }
}
