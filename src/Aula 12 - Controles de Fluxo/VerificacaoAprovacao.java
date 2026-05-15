public class VerificacaoAprovacao {
    public static void main(String[] args) {
        int nota1 = 10;
        int nota2 = 6;
        int frequencia = 70;
        double media = (nota1 + nota2) / 2.0;
        boolean aprovado = media >= 7 && frequencia >= 75;

        if (aprovado) {
            System.out.println("Aluno Aprovado!");
            return;
        }
            System.out.println("Aluno Reprovado!");
        }
}
