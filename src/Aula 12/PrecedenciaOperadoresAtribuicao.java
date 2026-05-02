public class PrecedenciaOperadoresAtribuicao {
    public static void main(String[] args) {
        int numero = 5;
// Pré-incremento
        System.out.println("Pré-incremento (++numero): " + (++numero)); //
// Pós-incremento
        System.out.println("Pós-incremento (numero++): " + (numero++)); //
        System.out.println("Valor após o pós-incremento: " + numero); // v
// Pré-decremento
        System.out.println("Pré-decremento (--numero): " + (--numero)); //
// Pós-decremento
        System.out.println("Pós-decremento (numero--): " + (numero--)); //
        System.out.println("Valor após o pós-decremento: " + numero); // v
    }
}