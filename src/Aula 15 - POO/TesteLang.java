public class TesteLang {
    public static void main(String[] args) {

        System.out.println("--- Testando java.lang ---");

        String curso = "Desenvolvimento de Sistemas";
        System.out.println("Tamanho da string: " + curso.length());


        double raiz = Math.sqrt(64);
        System.out.println("Raiz quadrada de 64 é: " + raiz);

        TesteLang objeto = new TesteLang();
        System.out.println("Hash Code do objeto: " + objeto.hashCode());
    }
}