enum DiaDeSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
}
enum MesesDoAno {
    JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO, JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO
}


public class ExemploEnum {
    public static void main(String[] args) {
        DiaDeSemana dia = DiaDeSemana.SEGUNDA;
        MesesDoAno mes = MesesDoAno.JANEIRO;

        System.out.println("Hoje é " + dia);
        System.out.println("Esse mês é " + mes);
    }
}