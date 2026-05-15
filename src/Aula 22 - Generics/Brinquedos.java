class Boneca{
private String nome;

public Boneca (String nome){
    this.nome = nome;
}
public String getNome(){
    return nome;
}
        }

class Carrinho{
private String modelo;

public Carrinho (String modelo){
    this.modelo = modelo;
}

public String getModelo(){
return modelo;
 }
}


public class Brinquedos {
    public static void main (String[] args){
   Carrinho c = new Carrinho ("Hot Wheels");
   Boneca b = new Boneca ("Barbie");
   Boneca p = new Boneca ("Polly");

        System.out.println("Meu carrinho é um " + c.getModelo());
        System.out.println("Minha boneca é uma " + b.getNome() + " e uma " + p.getNome());

    }
}
