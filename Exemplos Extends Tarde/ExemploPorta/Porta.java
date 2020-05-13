public class Porta {
    
    public String cor;
    public String status;

    public Porta() {
        this.cor = "branca";
        this.status = "aberta";
    }
    
    public Porta(String cor, String status) {
        this.cor = cor;
        this.status = status;
    }
    
    public void trocarCor(String cor) {
        this.cor = cor;
    }
  
    public boolean abrirPorta() {
        this.status = "aberta";
        return true;
    }
    
    public boolean fecharPorta() {
        this.status = "fechada";
        return true;
    }    
    
    public String toString() {
        return "\nStatus: " + this.status
             + "\nCor: " + this.cor;
    }
    
}