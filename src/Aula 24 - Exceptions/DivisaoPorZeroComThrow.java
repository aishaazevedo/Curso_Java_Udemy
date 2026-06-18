public class DivisaoPorZeroComThrow {

    public static int calcularMedia(int totalNotas, int qtdAlunos) throws ArithmeticException {
        return totalNotas / qtdAlunos;
    }

    public static void main(String[] args) {
        int totalNotas = 12;
        int qtdAlunos = 7;

        try {
            int media = calcularMedia(totalNotas, qtdAlunos);
            System.out.println("A média é " + media);
        } catch (ArithmeticException ae) {
            System.out.println("Problema: Divisão por zero" + ae.getMessage());
        }
    }
}
