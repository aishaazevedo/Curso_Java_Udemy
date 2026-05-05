abstract class FiguraGeometrica {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
class Retangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return base * altura;
    }
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5.0, 3.0);

        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
    }
}
