public class ExercicioArrays {
    public static void main(String[] args) {

        int tamanho = 6;
        int[] meuArray = new int[tamanho];

        meuArray[0] = 2;
        meuArray[1] = 4;
        meuArray[2] = 6;
        meuArray[3] = 8;
        meuArray[4] = 10;
        meuArray[5] = 12;

        for (int i = 0; i < meuArray.length; i++) {
            System.out.print(meuArray[i] + " ");
        }
    }
}