import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        Calculadora calculadora = new Calculadora();
        
        int opcao = 0;
        do {
        
            try {
                System.out.println("Digite o primeiro número: ");
                calculadora.setNumero1(scanner.nextDouble());
                
                System.out.println("Digite o segundo número: ");        
                calculadora.setNumero2(scanner.nextDouble());
            
                System.out.println(calculadora.mostrarMenu());

                opcao = scanner.nextInt();
                
                System.out.println(calculadora.verificarOpcao(opcao));
            } catch(Exception exception) {
                System.out.println("erro!");
                opcao = 6;
            }

        } while(opcao != 6);
           
    }
}