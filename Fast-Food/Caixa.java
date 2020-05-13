/**
 * Escreva a descrição da classe Caixa aqui.
 * 
 * @author Danizinha
 * @version 04/04/2020 17:41
 */
public class Caixa implements ICaixa{
    
    private int quantidade;

    /**
     * COnstrutor para objetos da classe Caixa
     */
    public Caixa() {
    }
    
    public int getQuantidade() {
        return this.quantidade;
    } 
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String mostrarMenu() {
        return "Escolha seu lanche:"
                         + "\n1-Sanduíche de Presunto"
                         + "\n2-Suco de Tamarindo"
                         + "\n3-Pastel com ovo"
                         + "\n4-Farroupilha"
                         + "\n0-Sair"; 
    }
    
    @Override
    public String verificarOpcao(int opcao) {
        if(opcao == 1) {
            return "\n#########Seu pedido###########" 
                  +"\nSanduíche de Presunto: "+this.quantidade
                  +"\nValor total do pedido: R$"+this.quantidade * 3.65;
        }else if(opcao == 2) {
            return "\n#########Seu pedido###########"
                  +"\nSuco de Tamarindo: " +this.quantidade
                  +"\nValor total do pedido: R$"+this.quantidade * 2.50;
        }else if(opcao == 3) {
            return "\n#########Seu pedido###########"
                  +"\nPastel com ovo: "+this.quantidade
                  +"\nValor total do pedido: R$"+this.quantidade * 3.30;
        }else if(opcao == 4) {
            return "\n#########Seu pedido###########"
                  +"\nFarroupilha: "+this.quantidade
                  +"\nValor total do pedido: R$"+this.quantidade * 4.70;
        }else if(opcao == 0) {
            System.exit(0);
        }
        return "Opção inválida!!!";
    }
}
