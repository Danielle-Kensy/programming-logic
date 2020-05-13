/**
 * Classe que interage com o usuário.
 * 
 * @author Danizinha 
 * @version 03/04/2020  17:30
 */
import java.util.Scanner;
public class Principal {
    
    public static void main(String args[]) {
        
        System.out.println("\f");
       
        Scanner scanner = new Scanner(System.in);
        
        PesoIdeal pesoIdeal = new PesoIdeal();
        
        System.out.println("Digite seu nome aqui: ");
        pesoIdeal.setNome(scanner.nextLine()); 
        System.out.println("Digite sua idade aqui: ");
        pesoIdeal.setIdade(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Digite seu sexo: ");
        pesoIdeal.setSexo(scanner.nextLine());
        System.out.println("Digite seu peso aqui: ");
        pesoIdeal.setPeso(scanner.nextDouble()); 
        System.out.println("Digite sua altura aqui: ");
        pesoIdeal.setAltura(scanner.nextDouble()); 
        
        System.out.println(pesoIdeal);
    }
}