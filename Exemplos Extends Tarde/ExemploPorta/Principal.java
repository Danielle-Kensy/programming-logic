import java.util.Scanner;

public class Principal {

public static void main(String args[]) {

        System.out.println("\f");
        
        PortaQuarto portaQuarto = new PortaQuarto();
        portaQuarto.trocarCor("marrom");
        portaQuarto.fecharPorta();
        System.out.println(portaQuarto.toString());
        

        PortaSala portaSala = new PortaSala("vermelha", "aberta", "pintura especial");
        System.out.println(portaSala.toString());
        
        Porta porta = new Porta();
        System.out.println(porta.toString());
        
        
    }
}