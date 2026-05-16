import java.util.*;
public class ExemploList {
    public static void main (String[] args){
        List<String> lista = new ArrayList<>();

        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.add("Cobol");

        System.out.println("Lista contém java? " + lista.contains("Java"));

        List<String> novaLista = Arrays.asList("JavaScript", "Ruby");
        lista.addAll(novaLista);
    //List segue a ordem de entrada
        System.out.println("Lista concatenada" + lista);

    // buscando elemento pelo índice

        String elemento = lista.get(2);
        System.out.println("Elemento no índice 2 da lista : " + elemento);

    }
}
