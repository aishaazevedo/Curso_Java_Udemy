public class ExceptionDivisaoPorZero {
    public static void main (String[] args){
        int totalNotas = 12;
        int qtdAlunos= 2;

        try {
            int media = totalNotas/qtdAlunos;
        }
        catch (ArithmeticException e){
            System.out.println("Problema: Divisão por zero");
        }
        finally {
            System.out.println("O programa terminou");
        }
    }
}
