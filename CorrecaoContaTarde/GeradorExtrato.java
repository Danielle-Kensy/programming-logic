public class GeradorExtrato {

    //atributos.... NAO TEM!
    
    public String geradorConta(Conta conta) {
        return "\n\n->Extrato da conta: " + conta.getSaldo();
    } 
}