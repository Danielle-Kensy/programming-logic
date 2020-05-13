import java.util.Scanner;

public class principal {
    public static void main(String args[]) {
        
        Retangulo retangulo = new Retangulo();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\f");
        
        System.out.println("Digite a altura do seu retângulo: ");
        retangulo.altura = scanner.nextDouble();
        
        System.out.println("Digite a Largura do seu retângulo: ");
        retangulo.largura = scanner.nextDouble();
        
        System.out.println("\n---------------Resultados---------------" 
                           +retangulo.toString()
                           +"\n---------------------------------------" );
    }
}