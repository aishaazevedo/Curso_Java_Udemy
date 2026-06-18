@FunctionalInterface
interface Calculadora2 {

    double calcular(double a, double b);
}

public class CalculadoraComInterfaceFuncional {

    public static void main(String[] args) {

        Calculadora2 soma = (a, b) -> a + b;
        Calculadora2 subtrair = (a, b) -> a - b;
        Calculadora2 multiplicar = (a, b) -> a * b;
        Calculadora2 dividir = (a, b) -> a / b;

        System.out.println("Soma: " + soma.calcular(10, 5));
        System.out.println("Soma: " + subtrair.calcular(10, 5));
        System.out.println("Soma: " + multiplicar.calcular(10, 5));
        System.out.println("Soma: " + dividir.calcular(10, 5));
    }
}