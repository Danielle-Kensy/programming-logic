import java.util.Scanner;

public class Principal {
    
    public static void main(String args[]) {
            
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        Computador computador = new Computador();
        
        System.out.println("Digite a marca do seu computador: ");
        computador.setMarcaComputador(scanner.nextLine());
        System.out.println("Digite o modelo do seu computador: ");
        computador.setModeloComputador(scanner.nextLine());
        System.out.println("Digite o tipo do seu computador: ");
        computador.setTipo(scanner.nextLine());
        System.out.println("Digite a quantidade de memória: ");
        computador.setQuantidadeMemoria(scanner.nextLine());
        System.out.println("Digite a marca da sua memória: ");
        computador.setMarcaMemoria(scanner.nextLine());
        System.out.println("Digite o tipo da placa mãe: ");
        computador.setTipoPlacaMae(scanner.nextLine());
        System.out.println("Digite o fabricante da placa mãe: ");
        computador.setPlacaMaeFabricante(scanner.nextLine());
        System.out.println("Digite a quantidade de controladores sata: ");
        computador.setQuantidadeControladorasSata(scanner.nextInt());
        System.out.println("Digite a quantidade de USBs: ");
        computador.setQuantidadeUSBs(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Digite a velocidade do processador: ");
        computador.setVelocidade(scanner.nextLine());
        System.out.println("Digite a marca do processador: ");
        computador.setMarcaProcessador(scanner.nextLine());
        System.out.println("Digite a velocidade do processador: ");
        computador.setModeloProcessador(scanner.nextLine());
        System.out.println("Digite a geração do processador: ");
        computador.setGeracao(scanner.nextLine());
        
        computador.on();
        computador.ativarRaid();
        
        System.out.println(computador);
        
    }
}  