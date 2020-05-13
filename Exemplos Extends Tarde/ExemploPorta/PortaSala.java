public class PortaSala extends Porta {
    
    public String decoracao;
    
    public PortaSala() {
        super();
        this.decoracao = "Nao tem ainda, calma pô!";
    }
    
    public PortaSala(String cor, String status, String decoracao) {
        super(cor, status); //Construtor da classe Porta (superclasse ou classe pai/mae)
        this.decoracao = decoracao;
    }
    
    public void trocarDecoracao(String decoracao) {
        this.decoracao = decoracao;
    }
    
    @Override //-> anotaçao de sobrescrita
    public String toString() {
        return "\n\n### PORTA SALA ###"
             + "\nStatus: " + this.status
             + "\nCor: " + this.cor
             + "\nDecoração: " + this.decoracao;
    }    

}