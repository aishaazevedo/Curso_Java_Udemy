import java.io.*;
public class ExemploIO {
    public static void main (String [] args){

        try{

            FileWriter writer = new FileWriter("meuArquivo.txt");

            writer.write("Olá, mundo!");//grava os dados
            writer.close();
            FileReader reader = new FileReader("meuArquivo.txt");

            int data = reader.read();

            while(data != -1){
                System.out.println((char) data);
                data = reader.read();
            }
            reader.close();
        }catch (IOException e){
        System.out.println("Problema de IO: " + e.getMessage());
        }
    }
}
