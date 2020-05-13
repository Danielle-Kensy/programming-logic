public class Cachorro extends Animal {

    public String raca;
    
    public Cachorro() {
        super();
        this.raca = "viralata";
    }
    
    public void modificarRaca(String raca) {
        this.raca = raca;
    }
    
    @Override
    public String comunicar() {
        return "au auuuu.....";
    }
    
    public String toString() {
        return "\n### classe Cachorro ###" 
             + "\nNome: " + this.nome
             + "\nRaça: " + this.raca
             + "\nComunicação: " + this.comunicar();
    }
    
}