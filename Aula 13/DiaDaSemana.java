public class DiaDaSemana {
    public static void main(String[] args) {

        int dia = 1;
        switch(dia){
            case 1 -> System.out.print("Segunda");
            case 2 -> System.out.print("Terça");
            case 3 -> System.out.print("Quarta");
            case 4 -> System.out.print("Quinta");
            case 5 -> System.out.print("Sexta");
            case 6 -> System.out.print("Sábado");
            case 7 -> System.out.print("Domingo");
        }
        String tipoDeDia = switch (dia){
            case 1, 2, 3, 4, 5 -> " é um dia útil";
            case 6, 7 -> "é final de semana";
            default -> dia + " é um dia inválido";
        };
        System.out.println(tipoDeDia);
    }
}
