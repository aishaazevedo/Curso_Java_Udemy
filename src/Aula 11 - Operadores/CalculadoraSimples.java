public class CalculadoraSimples {
    public static void main(String[] args) {

        int a = 2;
        int b = 7;
        int contador = 1;
        contador++;
        System.out.println("A soma de " + a + "+ " + b + " é " + (a + b));
        System.out.println("A multiplicação de " + a + " x " + b + " é " + (a *=b));
        System.out.println(contador);

    }
}
