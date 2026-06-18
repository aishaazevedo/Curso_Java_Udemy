public class TestArrayException {
    public static void main (String[] args){

        try {
            int [] numeros = {1, 2, 3, 4, 5};
            System.out.println(numeros[1]);
        }

        // pode deixar : "catch (Exception e )", caso não saiba o erro específico que pode ser causado
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("ERRO: " + e.getMessage());
        }
        finally {
            System.out.println("Programa finalizado!");
        }
    }
}
