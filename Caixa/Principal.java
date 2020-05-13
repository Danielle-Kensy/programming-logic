public class Principal {

    public static void main(String args[]) {
        
        CaixaEletronico caixaEletronico = new CaixaEletronico();
        
        caixaEletronico.contaNome = "André";
        caixaEletronico.saldo = 5000;
        caixaEletronico.depositarSaldo(40);
        caixaEletronico.sacarSaldo(2000);
        
        System.out.println("\f");
        System.out.println("-------------Caixa Eletrônico-------------");
        System.out.println("Bem vindo, usuário!"+caixaEletronico.contaNome +
        "\nSeu saldo atual é de: R$"+caixaEletronico.saldo);
        System.out.println("------------------------------------------");
    }
}