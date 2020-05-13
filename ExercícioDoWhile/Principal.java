import java.util.Scanner;

/**
 * Write a description of class Principal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Principal {
    
    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Numero numero = new Numero();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(numero.verNumeros());

    }
}
