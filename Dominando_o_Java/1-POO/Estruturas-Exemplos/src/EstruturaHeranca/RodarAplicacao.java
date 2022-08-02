package EstruturaHeranca;

public class RodarAplicacao {
    public static void main(String[] args) {

        Ex2_Funcionario funcionario = new Ex2_Funcionario();

        //realizando upcast
        Ex2_Funcionario gerente = new  Ex2_Gerente();
        Ex2_Funcionario vendedor  = new Ex2_Vendedor();
        Ex2_Funcionario faxineiro = new Ex2_Faxineiro();

        //realizando downcast
//        Ex2_Vendedor vendedor_ = (Ex2_Vendedor) new Ex2_Funcionario();
    }
}
