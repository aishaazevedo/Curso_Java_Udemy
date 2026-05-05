abstract class Profissao{
    abstract public void consulta();
}

class Medica extends Profissao{
    public void consulta (){
        System.out.println("A médica consulta o paciente na clínica");
    }
}
class Enfermeira extends Profissao{
    public void consulta(){
        System.out.println("A enfermeira consulta o paciente na enfermaria");
    }
}

public class TesteConsulta {
    public static void main (String[] args){
        Profissao medica = new Medica();
        Profissao enfermeira = new Enfermeira();

        medica.consulta();
        enfermeira.consulta();
    }
}
