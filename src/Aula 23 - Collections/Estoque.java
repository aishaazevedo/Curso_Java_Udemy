import java.util.*;

public class Estoque {
    public static void main (String[] args){

        Map<String, Integer> estoque = new HashMap<>();

        estoque.put("Leite", 123);
        estoque.put("Danone", 83);
        estoque.put("Queijo", 323);
        estoque.put("Ovos", 453);
        estoque.put("Café", 323);

        System.out.println("Produtos em estoque no dia 12:  " + estoque);

        estoque.remove("Café");
        estoque.put("Leite", 101);
        estoque.put("Danone", 10);
        estoque.put("Queijo", 223);
        estoque.put("Ovos", 253);

        System.out.println("Produtos em estoque no dia 15:  " + estoque);



    }
}
