public class Gato extends Animal {

    public int quantidadeDeVidas;
    
    public Gato() {
        super();
        this.quantidadeDeVidas = 7;
    }
    
    @Override
    public String comunicar() {
        return "miauuuuu...";
    }
    
    public String toString() {
        return "\n### classe Gato ###" 
             + "\nNome: " + this.nome
             + "\nQuantidade de vidas: " + this.quantidadeDeVidas
             + "\nComunicação: " + this.comunicar();
    }
    
}