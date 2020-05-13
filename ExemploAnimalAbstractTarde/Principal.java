import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);

        Cachorro cachorro = new Cachorro();

        cachorro.setNome("Dooley");
        cachorro.setIdade(8);
        System.out.println(cachorro);
        System.out.println(cachorro.comunicar());
        
        Gato gato = new Gato();
        gato.setNome("Fred");
        gato.setIdade(8);
        System.out.println(gato);
        System.out.println(gato.comunicar());        
    }
}