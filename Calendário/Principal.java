/**
 * Classe que interage com o usuário.
 * 
 * @author Danizinha 
 * @version 02/04/2020 18:01
 */
import java.util.Scanner;
public class Principal {
    
    public static void main(String args[]) {
        
        System.out.println("\f");
       
        Scanner scanner = new Scanner(System.in);
        
        Mes mes = new Mes();
        
        System.out.println("Digite o número do mês aqui: ");
        mes.setNumeroMes(scanner.nextInt()); 
        
        System.out.println(mes);
    }
}
