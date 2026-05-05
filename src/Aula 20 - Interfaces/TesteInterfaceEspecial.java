interface ExemploInterfaceEspecial{

    //Método Abstrato
    void metodoAbstrato();

    //Método Default
    default void metodoDefault(){
        System.out.println("Este é um método default na interface");
    }
    //Método Static
    static void metodoStatic(){
        System.out.println("Este é um método static na interface");
    }
}

public class TesteInterfaceEspecial implements ExemploInterfaceEspecial{
    public void metodoAbstrato(){
        System.out.println("Implementação do método abstrato");
    }
    public static void main (String[] args){
        TesteInterfaceEspecial exemplo = new TesteInterfaceEspecial();
        exemplo.metodoAbstrato();
        exemplo.metodoDefault();
        ExemploInterfaceEspecial.metodoStatic();
    }
}
