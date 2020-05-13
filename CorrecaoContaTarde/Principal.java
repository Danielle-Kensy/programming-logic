import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        GeradorExtrato geradorExtrato = new GeradorExtrato();
      
        ContaCorrente contaCorrente = new ContaCorrente();
        System.out.println("Digite o valor para saldo inicial: ");        
        contaCorrente.setSaldo(scanner.nextDouble());

        System.out.println("Digite o valor depósito: ");
        contaCorrente.depositar(scanner.nextDouble());
        
        System.out.println("Digite o valor para saque: ");
        contaCorrente.sacar(scanner.nextDouble());
        
        System.out.println(contaCorrente);
        
        System.out.println(geradorExtrato.geradorConta(contaCorrente));
        
        
        
        
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        System.out.println("Digite o valor para saldo inicial: ");        

        System.out.println("Digite o valor depósito: ");
        contaPoupanca.depositar(scanner.nextDouble());
        
        System.out.println(contaPoupanca);        
        System.out.printf("%.2f", contaPoupanca.getSaldo());
        
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");  
        System.out.printf("\n" + decimalFormat.format(contaPoupanca.getSaldo()));
        
        System.out.println(geradorExtrato.geradorConta(contaPoupanca));
    }
}