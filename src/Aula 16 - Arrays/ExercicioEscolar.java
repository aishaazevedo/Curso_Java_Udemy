public class ExercicioEscolar {
    public static void main(String[] args) {

        int tamanho = 5;
        double[] notas = new double[tamanho];

        notas[0] = 7.5;
        notas[1] = 8.0;
        notas[2] = 6.5;
        notas[3] = 9.0;
        notas[4] = 5.5;

        System.out.print("Notas dos alunos: ");

        for (int i = 0; i < tamanho; i++) {
            System.out.print(notas[i] + " ");
        }
    }
}
