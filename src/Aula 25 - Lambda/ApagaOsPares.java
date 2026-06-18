import java.util.*;
public class ApagaOsPares {
    public static void main (String[] args){
        Set<Integer> numeros = new HashSet<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
                numeros.removeIf( numero -> numero % 2 == 0);
        System.out.println("Números Ímpares: " + numeros);
    }
}
