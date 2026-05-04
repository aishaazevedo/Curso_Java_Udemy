class Empregado {

    private String nome;
    private double salario;

    public void addAumento(double valor) {
        salario += valor;
    }

    public double ganhoAnual() {
        return salario * 12;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

class Assistente extends Empregado {

    private int matricula;

    public double ganhoAnual() {
        return super.ganhoAnual() + 1000;
    }
}

public class TesteHeranca3 {
    public static void main(String[] args) {

        Assistente assistente = new Assistente();

        assistente.setSalario(3000);
        assistente.addAumento(500);
        assistente.setNome("João");

        System.out.println("Nome: " + assistente.getNome());
        System.out.println("Salário anual: R$ " + assistente.ganhoAnual());
    }
}