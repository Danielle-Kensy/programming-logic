import java.util.Scanner;
public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        Morango morango = new Morango();
        System.out.println("digite a cor do morango: ");
        morango.setCor(scanner.nextLine());
        System.out.println(morango);
        
        Banana banana = new Banana();
        System.out.println("digite a cor do banana: ");        
        banana.setCor(scanner.nextLine());
        System.out.println(banana);
        
    }
}