import java.util.*;
public class LambdaComCollection {
    public static void main (String[] args){
        List<Integer> listaDeNumeros = Arrays.asList(1, 2 ,3 ,4, 3,5 );

       /* for (Integer elementos : listaDeNumeros){
            System.out.println(elementos);
        }

        */

         listaDeNumeros.forEach ((numero) -> System.out.println(numero));
    }
}
