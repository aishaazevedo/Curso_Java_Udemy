import java.util.*;
public class Num {
    public static void main (String[] args){
        List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6);
        List<Integer> numPares = new ArrayList<>();

        listaNumeros.forEach((numero -> {
            if (numero % 2 == 0){
                numPares.add(numero);
            }
        }));
        System.out.println("Números pares: " + numPares);
    }
}
