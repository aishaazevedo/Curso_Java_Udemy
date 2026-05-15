abstract class Operacao{
   public abstract double calcular(double n1, double n2);
}

class Soma extends Operacao {
    @Override
    public double calcular(double n1, double n2){
        return n1 += n2;
    }
}
class Subtracao extends Operacao{
    @Override
    public double calcular(double n1, double n2){
        return n1 -= n2;
    }

}
class Divisao extends Operacao{
    @Override
    public double calcular(double n1, double n2){
        return n1 /= n2;
    }

}
class Multiplicacao extends Operacao{
    @Override
    public double calcular(double n1, double n2){
        return n1 *= n2;
    }

}
public class Calculadora {
    public static void main(String[] args){
        Operacao soma = new Soma();
        Operacao subtracao = new Subtracao();
        Operacao divisao = new Divisao();
        Operacao multiplicacao = new Multiplicacao();

        double n1 = 8;
        double n2 = 2;
        System.out.println("Soma: " + soma.calcular(n1, n2));
        System.out.println("Subtração: " + subtracao.calcular(n1, n2));
        System.out.println("Divisao: " + divisao.calcular(n1, n2));
        System.out.println("Multiplicacao: " + multiplicacao.calcular(n1, n2));

    }
}
