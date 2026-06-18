public class ExemploObjetoNulo {
    public static void main (String[] args){

        String nome = new String("Aisha");

        try {
            int tamanhoNome = nome.length(); //tentand acessar objeto nulo

            System.out.println("Tamanho do nome : " + tamanhoNome);
        }
        catch (NullPointerException e){
            System.out.println("ERRO: A variável é nula!!");
        }
        finally {
            System.out.println("Sempre execute o bloco finallly");
        }
    }
}
