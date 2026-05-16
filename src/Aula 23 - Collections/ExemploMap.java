import java.util.*;

/*
- Map é como um dicionário
- As chaves devem ser únicas
- Seus métodos específicos são get, put e remove
- Map não é ordenado
 */
public class ExemploMap {
    public static void main (String[] args){
        Map<String, Integer> mapa= new HashMap <>();

        mapa.put("JavaScript", 12);
        mapa.put("Java", 10);
        mapa.put("C", 42);
        mapa.put("Cobol", 71);

        System.out.println("Contém java? " + mapa.containsKey("Java"));
        System.out.println("Valor associado ao java : " + mapa.get("Java"));

        //Atualizando valor de java
        mapa.put("Java", 30);

        System.out.println("Lista após atualização do java " + mapa);


    }
}
