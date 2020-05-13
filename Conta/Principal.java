import java.util.Scanner;

public class Principal {
    
      public static void main(String args[]) {
        
      System.out.println("\f");
        
      Scanner scanner = new Scanner(System.in);
        
      ContaPoupanca contapoupanca = new ContaPoupanca();
      
      System.out.println("Digite o saldo da sua conta poupança: ");
      contapoupanca.setSaldo(scanner.nextDouble());
      contapoupanca.depositar(40);
      System.out.println("\nVocê depositou R$40,00");
      contapoupanca.sacar(500);
      System.out.println("\nVocê sacou R$500,00");
      System.out.println(contapoupanca);
  
      ContaCorrente contacorrente = new ContaCorrente();
       
      System.out.println("\nDigite o saldo da sua conta corrente: ");
      contacorrente.setSaldo(scanner.nextDouble());
      contacorrente.depositar(80);
      System.out.println("\nVocê depositou R$80,00");
      contacorrente.sacar(300);
      System.out.println("\nVocê sacou R$300,00");
      
      System.out.println(contacorrente);
  }
}