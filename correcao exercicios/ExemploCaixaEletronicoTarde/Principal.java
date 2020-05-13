import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
    
        CaixaEletronico caixaEletronico = new CaixaEletronico();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\f");
        
        //Entrada de dados
        System.out.println("digite o saldo inicial");
        caixaEletronico.saldo = scanner.nextDouble();
        /* nextDouble(), nextInt(), next() ou nextLine() String nextFloat()
           nextShort(), nextByte(), nextLong() */
        
        System.out.println(caixaEletronico.saldo);
        
        caixaEletronico.depositar(150.00);
        
        System.out.println(caixaEletronico.saldo);
        
        caixaEletronico.sacar(500.00);
        caixaEletronico.sacar(500.00);
        caixaEletronico.sacar(500.00);
        caixaEletronico.sacar(500.00);
        
        //Saida de dados
        System.out.println(caixaEletronico.toString());
    }
}