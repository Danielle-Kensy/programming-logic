public abstract class Fruta {

    private String cor;
    private boolean casca;
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public boolean getCasca() {
        return this.casca;
    }
    
    public void setCasca(boolean casca) {
        this.casca = casca;
    }    
    
    public abstract String comer();
    public abstract String descascar();
    
}