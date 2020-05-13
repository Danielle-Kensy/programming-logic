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
        
        Pessoa pessoa = new Pessoa();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        pessoa.setNome(scanner.nextLine());

        System.out.println("Digite a quantidade de vezes que deseja ver o seu nome: ");
        System.out.println(pessoa.verNomeConformeQuantidade(scanner.nextInt()));
        
        //System.out.println(pessoa.toString());
        //System.out.println(pessoa.verNomeCincoVezes());
        
        //### 
        //### Exemplos de laço de repetição!
        //###
        
        /*System.out.println("Impressao com while");
        int contador = 0; //0,1,2,3,4,5,6,7,8,9
        while(contador < 10) {
            System.out.println(pessoa.toString());
            contador = contador + 1;
            //contador += 1;
            //contador++;
        }*/
        
        /*System.out.println("Impressao com DOwhile");
        int contadorr = 0; //0,1,2,3,4,5
        do {
            System.out.println(pessoa.toString());
            contadorr = contadorr + 1;
            //contador += 1;
            //contador++;
        } while(contadorr < 5);  */     
        
        /*System.out.println("Impressao com FOR");
        //0,1,2,3,4
        for(int contadorrr = 0 ; contadorrr < 5 ; contadorrr++) {
            //% resto do módulo da divisão 10%2=0  11%2=1
            if(contadorrr % 2 == 0) {
                System.out.println(contadorrr + " - " + pessoa.toString());
            }
        }*/

    }
    
}
