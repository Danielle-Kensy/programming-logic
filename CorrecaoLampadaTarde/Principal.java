import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a marca: ");
        String marca = scanner.nextLine();
        LampadaLED lampadaLED = new LampadaLED(marca);
        lampadaLED.on();
        System.out.println(lampadaLED);
        
        LampadaIncandescente lampadaIncandescente = new LampadaIncandescente();
        System.out.println("Digite a marca: ");
        lampadaIncandescente.setMarca(scanner.nextLine());
        System.out.println(lampadaIncandescente);
        
    
    }
    
}