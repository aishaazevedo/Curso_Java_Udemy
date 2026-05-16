class Caixa<T> {

    private T item;

    public void guardar(T item) {
        this.item = item;
    }

    public T pegar() {
        return item;
    }
}

public class TesteCaixa {

    public static void main(String[] args) {

        Caixa<String> caixaTexto = new Caixa<>();

        caixaTexto.guardar("Banana");

        String texto = caixaTexto.pegar();

        System.out.println(texto);

        Caixa<Integer> caixaNum = new Caixa<>();

        caixaNum.guardar(125);

        Integer num = caixaNum.pegar();

        System.out.println(num);
    }
}