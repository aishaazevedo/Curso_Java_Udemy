import java.util.*;
public class ExemploSet {
    public static void main (String[] args){

        Set<String> conjunto = new HashSet<>();

        conjunto.add("Python");
        conjunto.add("Java");
        conjunto.add("Cobol");
        conjunto.add("C");


        System.out.println("Contém java? " + conjunto.contains("Java"));

//pode adicionar mais elementos no "array"

        conjunto.add("C#");
        conjunto.add("Ruby");

        System.out.println("Lista do conjunto completo: " + conjunto);

        conjunto.remove("Python");

        System.out.println("Lista do conjunto após atualização: " + conjunto);

        //Não há dupliacação com o Set e não segue a ordem de entrada

        boolean foiDuplicado = conjunto.add("Ruby");
        System.out.println("O Ruby foi adicionado novamente ? " + foiDuplicado);

       conjunto.clear();
       System.out.println("Conjunto após limpeza: " + conjunto);

    }
}
