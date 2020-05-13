public class PortaQuarto extends Porta {
    
    public String blindada;
    
    public PortaQuarto() {
        super();
        this.blindada = "nao";
    }
    
    public void blindarPorta() {
        this.blindada = "aguenta tiro de .50";
    }
    
    @Override //-> anotaçao de sobrescrita
    public String toString() {
        return "\n\n### PORTA QUARTO ###"
             + "\nStatus: " + this.status
             + "\nCor: " + this.cor
             + "\nBlindagem: " + this.blindada;
    }
    
}