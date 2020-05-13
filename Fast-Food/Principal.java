/**
 * Escreva a descrição da classe Caixa aqui.
 * 
 * @author Danizinha
 * @version 04/04/2020 18:12
 */
import java.util.Scanner;
public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        Caixa caixa = new Caixa();
        
        int opcao = 0;
        do {
            System.out.println(caixa.mostrarMenu());
            opcao = scanner.nextInt();
            
            System.out.println("Digite a quantidade desejada: ");
            caixa.setQuantidade(scanner.nextInt());
            
            System.out.println(caixa.verificarOpcao(opcao));
        } while (opcao != 0);
    }
    
}
